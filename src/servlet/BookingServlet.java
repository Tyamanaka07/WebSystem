package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Pet;
import Model.PetDAO;
import Model.Type;
import Model.TypeDAO;
import Model.User;
import Model.UserDAO;

/**
 * Servlet implementation class BookingServlet
 */
@WebServlet("/booking")
public class BookingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public BookingServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			request.setCharacterEncoding("UTF-8");

			String pidStr = request.getParameter("pid");
			String uidStr = request.getParameter("uid");
			String tidStr = request.getParameter("tid");

			int pid = Integer.parseInt(pidStr);
			int uid = Integer.parseInt(uidStr);
			int tid = Integer.parseInt(tidStr);

			PetDAO pdao = new PetDAO();
			UserDAO udao = new UserDAO();
			TypeDAO tdao = new TypeDAO();

			Pet pet = pdao.findByPid(pid);
			User user = udao.findByUid(uid);
			Type type = tdao.findByTid(tid);

			request.setAttribute("pet", pet);
			request.setAttribute("user", user);
			request.setAttribute("type", type);

			RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/booking.jsp");
			dispatcher.forward(request, response);

		}catch(ServletException e) {
			e.getMessage();

		}catch(IOException ex) {
			ex.getMessage();
		}
		catch(NumberFormatException e) {
			e.getMessage();
		}
	}

}

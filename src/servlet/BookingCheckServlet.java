//作成者 中川伶丞

package servlet;

import java.io.IOException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Booking;
import Model.BookingDAO;
import Model.Pet;
import Model.PetDAO;
import Model.Type;
import Model.TypeDAO;
import Model.User;
import Model.UserDAO;


/**
 * Servlet implementation class BookingCheckServlet
 */
@WebServlet("/bookingCheck")
public class BookingCheckServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public BookingCheckServlet() {
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
		try{
			request.setCharacterEncoding("UTF-8");

			String bookingDateStr = request.getParameter("bookingDateStr");
			String pidStr =  request.getParameter("pid");
			String tidStr =  request.getParameter("tid");
			String uidStr =  request.getParameter("uid");
			String telNum = request.getParameter("telNum");

			int pid = Integer.parseInt(pidStr);
			int tid = Integer.parseInt(tidStr);
			int uid = Integer.parseInt(uidStr);

			PetDAO pdao = new PetDAO();
			TypeDAO tdao = new TypeDAO();
			UserDAO udao = new UserDAO();


			Pet pet = pdao.findByPid(pid);
			Type type = tdao.findByTid(tid);
			User user = udao.findByUid(uid);

			Timestamp bookingDate = new Timestamp

					(new SimpleDateFormat("yyyy-MM-dd'T'hh:mm").parse
							(bookingDateStr).getTime());



			BookingDAO dao = new BookingDAO();
			Booking b = new Booking(0, bookingDate, telNum, pet, type, user);
			dao.insert(b);

		}catch (Exception e) {
			e.getMessage();
		}
		response.sendRedirect("bookinglist");

	}

}

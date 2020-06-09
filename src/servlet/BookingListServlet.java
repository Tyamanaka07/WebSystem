package servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Model.Booking;
import Model.BookingDAO;
import Model.User;


/**
 * @author
 */

/**
 * Servlet implementation class BookingListServlet
 */
@WebServlet("/bookinglist")
public class BookingListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public BookingListServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		HttpSession session = request.getSession();

		User u = (User) session.getAttribute("user");

		if ( u == null) {
			response.sendRedirect("login");
			return;
		}

		BookingDAO bdao = new BookingDAO();

		if(u.getUid()!=1) {
			Booking b = bdao.findByUid(u.getUid());
			request.setAttribute("blist", b);
			RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/bookinglist.jsp");
			dispatcher.forward(request, response);
		}else {
			ArrayList<Booking> blist = bdao.findAll();
			request.setAttribute("blist", blist);
			RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/bookinglistAdmin.jsp");
			dispatcher.forward(request, response);
		}


	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

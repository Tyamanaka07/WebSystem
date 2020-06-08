package servlet;

import java.io.IOException;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Booking;
import Model.BookingDAO;
import Model.Pet;
import Model.PetDAO;

/**
 * Servlet implementation class BookingCheckServlet
 */
@WebServlet("/BookingCheck")
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
		String pidStr = request.getParameter("pid");
		int pid = Integer.parseInt(pidStr);

		PetDAO dao = new PetDAO();
		Pet p = dao.findByPid(pid);

		request.setAttribute("pet", p);

		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/booking.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");

		String bidStr = request.getParameter("bid");
		String uidStr = request.getParameter("uid");
//		String bookingDateStr = request.getParameter("bookingDateStr");
		String telNum = request.getParameter("telNum");

		int bid = Integer.parseInt(bidStr);
		int uid = Integer.parseInt(uidStr);

		try {
			Timestamp bookingDate = new Timestamp(new SimpleDateFormat("yyyy/MM/dd").parse(request.getParameter("bookingDateStr")).getTime());

			BookingDAO dao = new BookingDAO();
			dao.insert(new Booking(bid, uid, bookingDate, telNum));

		} catch (ParseException e) {
			e.printStackTrace();
		}




	}

}

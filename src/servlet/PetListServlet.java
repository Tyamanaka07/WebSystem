package servlet;

import java.io.IOException;
import java.util.ArrayList;

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

/**
 * @author 山中健裕
 * Servlet implementation class PetListServlet
 */
@WebServlet("/petlist")
public class PetListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public PetListServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");

		String tidStr = request.getParameter("tid");
		int tid = Integer.parseInt(tidStr);

		PetDAO pdao = new PetDAO();
		TypeDAO tdao = new TypeDAO();

		ArrayList<Pet> plist = new ArrayList<Pet>();
		Type t = new Type();

		plist = pdao.findByTid(tid);
		t = tdao.findByTid(tid);

		request.setAttribute("plist", plist);
		request.setAttribute("type", t);

		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/petlist.jsp");
		dispatcher.forward(request, response);


	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

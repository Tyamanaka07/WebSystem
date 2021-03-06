//作成者 山中健裕

package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Model.User;
import Model.UserDAO;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			HttpSession session = request.getSession();
			String error = (String)session.getAttribute("error");
			if(error != null) {
				request.setAttribute("mes", error);
				session.removeAttribute("error");
			}
			RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/login.jsp");
			dispatcher.forward(request, response);

		}catch(ServletException e) {
			e.getMessage();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try{
			request.setCharacterEncoding("UTF-8");

			String name = request.getParameter("name");
			String pass = request.getParameter("pass");

			UserDAO udao = new UserDAO();
			User u = udao.login(name,pass);
			
			if(u != null) {
				HttpSession session = request.getSession();
				session.setAttribute("user",u);
				response.sendRedirect("topDiagram");
			}
			else {
				HttpSession session = request.getSession();
				session.setAttribute("error", "パスワードが違います。");
				response.sendRedirect("login");
			}

			if(u != null) {
				HttpSession session = request.getSession();
				session.setAttribute("user",u);
				response.sendRedirect("topDiagram");
			}
			else {
				HttpSession session = request.getSession();
				session.setAttribute("error", "ユーザー名かパスワードが違います。");
				response.sendRedirect("login");
			}
		}catch(Exception e) {
			e.getMessage();
		}

	}
}

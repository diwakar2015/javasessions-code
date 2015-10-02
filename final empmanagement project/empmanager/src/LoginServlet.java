

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.employeemanagement.dao.UserDAO;
import com.employeemanagement.model.User;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginServlet() {}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		
		HttpSession session = request.getSession();
		
		System.out.println("From Servlet : User Name: "+ userName + "Passowrd : "+ password + " inside doPost method");


		UserDAO userDao = new UserDAO();
		User user = userDao.getUserbyUserName(userName);
		if(user != null)
		{

			if(userName.equalsIgnoreCase(user.getUserName()) && password.equalsIgnoreCase(user.getPassword()))
			{
				
			
				session.setAttribute("user", user);
				
				
				response.sendRedirect("home.jsp");
			}
			else
			{
				response.sendRedirect("index.jsp?status=incorrect");
			}
		}
		else{

			response.sendRedirect("index.jsp?status=incorrect");
		}


	}

}



import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.employeemanagement.dao.EmployeeDAO;
import com.employeemanagement.model.Employee;

/**
 * Servlet implementation class UserAction
 */
@WebServlet("/UserAction")
public class UserAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserAction() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String action = request.getParameter("action");
		String empAsString = request.getParameter("empid");
		int empid = Integer.parseInt(empAsString);
		
		System.out.println("Action received from UI : "+ action + " empId = "+ empid);
		
		if(action.equals("delete"))
		{
			EmployeeDAO empDAO = new EmployeeDAO();
			boolean isDeleted = empDAO.deleteEmployee(empid);
			if(isDeleted)
			{
				response.sendRedirect("home.jsp?status=success");
			}
			else
			{
				response.sendRedirect("home.jsp?status=error");
			}
			
			
		}
		if(action.equals("edit"))
		{
			EmployeeDAO empDAO = new EmployeeDAO();
			boolean isDeleted = empDAO.deleteEmployee(empid);
			if(isDeleted)
			{
				response.sendRedirect("home.jsp?status=success");
			}
			else
			{
				response.sendRedirect("home.jsp?status=error");
			}
			
			
		}
		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		
		String empid = request.getParameter("empid");
		String name = request.getParameter("name");
		String salary = request.getParameter("salary");
		String dept = request.getParameter("dept");
		
		
		Employee newEmployee = new Employee(Integer.parseInt(empid), name, Integer.parseInt(salary), dept);
		
		EmployeeDAO dao = new EmployeeDAO();
		boolean isInserted = dao.addEmployee(newEmployee);
		
		if(isInserted)
		{
			System.out.println("Inserted successfully!!");
			response.sendRedirect("add.jsp?status=true");
			
		}
		
		
		else
		{
			response.sendRedirect("add.jsp?status=false");
		}
		
		
		
	}

}

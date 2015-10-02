

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.employeemanagement.dao.EmployeeDAO;
import com.employeemanagement.model.Employee;

/**
 * Servlet implementation class EditServlet
 */
@WebServlet("/EditServlet")
public class EditServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

				String empid = request.getParameter("empid");
				String name = request.getParameter("name");
				String salary = request.getParameter("salary");
				String dept = request.getParameter("dept");
				
				Employee emp = new Employee(Integer.parseInt(empid), name, Integer.parseInt(salary), dept);
				
				EmployeeDAO dao = new EmployeeDAO();
				boolean updated = dao.updateEmployee(emp);
				
				if(updated)
				{
					System.out.println("updated successfully!!");
					response.sendRedirect("home.jsp?status=true");
					
				}
				
				
				else
				{
					response.sendRedirect("add.jsp?status=false");
				}
				
		
	}

}

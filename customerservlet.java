//this is the servlet.
package appservlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import jakarta.websocket.Session;

import java.io.IOException;
import java.sql.ResultSet;

import appcode.Customer;

/**
 * Servlet implementation class CustomerServlet
 */
public class customerservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public customerservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String customerName = request.getParameter("name");
		String name = request.getParameter("username");
		String address = request.getParameter("address");
		String phoneno = request.getParameter("mobileno");
		String email = request.getParameter("email");
		Customer cust =new Customer();
		int result=cust.insertOpr(name, address, phoneno, email);
		
		ResultSet rs=cust.searchOpr(customerName);
		
		
		HttpSession session = request.getSession();
		session.setAttribute("resultSet", rs);
		response.sendRedirect("customerdisplay.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
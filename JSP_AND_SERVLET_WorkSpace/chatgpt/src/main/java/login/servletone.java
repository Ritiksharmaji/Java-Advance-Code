package login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class servletone
 */
@WebServlet("/servletone")
public class servletone extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//	response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	 protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	        
		 response.setContentType("text/html");
		 PrintWriter out=response.getWriter();
		 
		    String userType = request.getParameter("userType");
	        String userId = request.getParameter("userId");
	        String password = request.getParameter("password");
	        
	        // Perform your user authentication logic here
	        // For simplicity, let's assume valid credentials are: userType=admin, userId=admin123, password=admin123
	        
	        if (userType.equals("admin") && userId.equals("admin123") && password.equals("admin123")) {
	            response.getWriter().write("Login successful for Admin!");
	        } else if (userType.equals("user") && userId.equals("user123") && password.equals("user123")) {
	            response.getWriter().write("Login successful for User!");
	        } else {
	            response.getWriter().write("Invalid credentials. Please try again.");
	        }
	    }
}





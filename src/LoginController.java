import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String username = request.getParameter("username");
    	String password = request.getParameter("pass");
    	User user = new User();
    	int flag=0;
    	user.setUserName(username);
    	user.setPassword(password);
    	
			Dao db;
			try {
				db = new Dao();
				ResultSet rs;
				rs=db.getInfo();
				while(rs.next()) {
					String usere = user.getUserName();
					String passwdd = user.getPassword();
		    		if(usere.equals(rs.getString(2)) && passwdd.equals(rs.getString(3)))
		    		{
		    			flag = 1;
		    			response.sendRedirect("Registration.jsp");
		    		}
		    	}
				if(flag==0)
				{
					out.print("Invalid user!");
				}
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		

	}
}

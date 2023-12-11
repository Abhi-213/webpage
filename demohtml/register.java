import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/registerServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
		
	public RegisterServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		// We can able to get the form data by means of the below ways.
		// Form arguments should be matched and then only they are recognised
		String userName = request.getParameter("user");
		String yourPassword = request.getParameter("Pass");
		System.out.println("username.." + username);
        System.out.println("username.." + yourPassword);
		
		
		}
	}
}

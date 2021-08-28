

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		RequestDispatcher rd =null;
		if(request.getParameter("btn").equals("Addition")) {
			rd=request.getRequestDispatcher("/Addition");
		}
		
		else if(request.getParameter("btn").equals("Subtraction")){
			rd=request.getRequestDispatcher("Subtraction");
		}
		
		else if(request.getParameter("btn").equals("multiply")){
			rd=request.getRequestDispatcher("Multiplication");
		}
		
		else {
			
			rd=request.getRequestDispatcher("Division");
		}
		rd.forward(request, response);
		
	}

}

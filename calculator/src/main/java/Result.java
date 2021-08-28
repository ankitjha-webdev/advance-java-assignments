

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Result")
public class Result extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter write= response.getWriter();
		if(request.getAttribute("Addition")!=null) {
			RequestDispatcher rd =request.getRequestDispatcher("index.html");
			rd.include(request, response);
			
			write.println("Addition = "+ "  "+request.getAttribute("Addition"));
			 
		} else if(request.getAttribute("Subtraction")!=null) {
			
			RequestDispatcher rd =request.getRequestDispatcher("index.html");
			rd.include(request, response);
			write.println("Subtraction = "+ "  "+ request.getAttribute("Subtraction"));
		} else if(request.getAttribute("Multiplication")!=null) {
			
			RequestDispatcher rd =request.getRequestDispatcher("index.html");
			rd.include(request, response);
			write.println("Multiplication = "+ "  "+ request.getAttribute("Multiplication"));
		} else {
			RequestDispatcher rd =request.getRequestDispatcher("index.html");
			rd.include(request, response);
			write.println("Division = "+ "  "+ request.getAttribute("Division"));
		}
	}


}

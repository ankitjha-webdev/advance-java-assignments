

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Division")
public class Division extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter writer = response.getWriter();
		try {
			int num1=Integer.parseInt(request.getParameter("n1"));
			int num2=Integer.parseInt(request.getParameter("n2"));
			
			int devide=num1/num2;
			request.setAttribute("Division", devide);
			RequestDispatcher rd = request.getRequestDispatcher("Result");
			rd.forward(request, response);
		} catch (Exception e) {
			RequestDispatcher rd=request.getRequestDispatcher("/index.html");  
		    rd.include(request, response); 	
		    writer.print("<h4>");
			 writer.println("Error : "+ " "+e+"</br>");
			 writer.println("You Can't devide it by zero </br>");
			 writer.print("<a href=https://facingissuesonit.com/2018/05/01/java-lang-arithmeticexception-by-zero-in-java/ target=_blank>know more!</a>");
			 writer.print("</h4>");
			
		}
	}

}

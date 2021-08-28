

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Multiplication")
public class Multiplication extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter show = response.getWriter();
		try {
			int num1=Integer.parseInt(request.getParameter("n1"));
			int num2=Integer.parseInt(request.getParameter("n2"));
			
			int multiply=num1*num2;
			request.setAttribute("Multiplication", multiply);
			RequestDispatcher rd = request.getRequestDispatcher("Result");
			rd.forward(request, response);
		} catch (Exception e) {
			RequestDispatcher rd=request.getRequestDispatcher("/index.html");  
		    rd.include(request, response); 	
		    show.print("<h4>");
		    show.println("Error : "+ " "+e+"</br>");
		    show.println("Please give some input</br> The input is empty </br>");
		    show.print("<a href=https://javarevisited.blogspot.com/2016/08/javalangnumberformatexception-for-input-string-null-java.html target=_blank>know more!</a>");
		    show.print("</h4>");
		}
	}

}

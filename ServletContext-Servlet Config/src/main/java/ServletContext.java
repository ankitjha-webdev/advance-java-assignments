

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/ServletContext")
public class ServletContext extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter shoWriter= response.getWriter();
		
		javax.servlet.ServletContext context = getServletContext();
		javax.servlet.ServletConfig config = getServletConfig();
		String CollegeName = context.getInitParameter("CollegeName");
		String cemail = context.getInitParameter("cemail");
		String StudentName = config.getInitParameter("StudentName");
		String Regd = config.getInitParameter("Regd");
		String Email = config.getInitParameter("Email");
		shoWriter.print("<html> <head> <link rel=\"Stylesheet\" src=\"webapp/style.css\"/> <title> Servlet context</title> </head> <body>");
		shoWriter.print("<b><i> <center> ");
		shoWriter.print("College Name  : " + CollegeName +"<br>");
		shoWriter.print("College Email  : " +cemail +"<br>");
		shoWriter.print("Student Name  : " +StudentName +"<br>");
		shoWriter.print("Student Registration  : " +Regd +"<br>");
		shoWriter.print("Student Email  : " + Email +"<br>");
		shoWriter.print("</b></i> </center> ");
		shoWriter.print("</body></html>");
		RequestDispatcher rd=request.getRequestDispatcher("/index.html");  
	    rd.include(request, response); 
		
	}

}

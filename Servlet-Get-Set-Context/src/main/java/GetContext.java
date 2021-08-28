
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;



@WebServlet("/GetContext")


public class GetContext extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {

		res.setContentType("text/html");
		PrintWriter out = res.getWriter();

		ServletContext context = getServletContext();
		context.setAttribute("name", "Ankit Kumar");
		context.setAttribute("year", "3rd");
		context.setAttribute("college", "Centurion University of Technology and Management");
		out.println(
				"<center><h1>10. Write a Servlet program to demonstrate the use of Set and Get attributes in ServletContext </h1> </center>");
		out.println(
				"<center>This is GetContext Page </br> to get your SetContext Value Please Click on Get here! </center>");
		out.println("<center><a href='SetContext'>Get</a></center>");
		RequestDispatcher rd=req.getRequestDispatcher("/index.html");  
        rd.include(req, res);

		out.close();

	}
}
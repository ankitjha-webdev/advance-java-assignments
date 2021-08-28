

import java.io.*;  
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*; 


@WebServlet("/SetContext")
public class SetContext extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
			response.setContentType("text/html");
			PrintWriter show= response.getWriter(); 
			 ServletContext context = getServletContext();
			 String college = (String)context.getAttribute("college");
			 String name = (String)context.getAttribute("name");
			 String year = (String)context.getAttribute("year");
			 show.print("<center><h3>");
			 show.println("Welcome to " +" "+ college +"</br>");
			 show.println("Your Name : " + name + "</br> ");
			 show.println("Your Year of study : " +year +"</br>");
			 show.print("</center></h3>");
			 RequestDispatcher rd=request.getRequestDispatcher("/index.html");  
		        rd.include(request,  response);  
	
	}

}

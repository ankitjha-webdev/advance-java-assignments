
import java.io.*;


import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*; 

@WebServlet("/ServletConfig")
public class ServletConfig extends HttpServlet {  
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public void doGet(HttpServletRequest request, HttpServletResponse response)  
    throws ServletException, IOException {  
		
    response.setContentType("text/html");  
    PrintWriter show = response.getWriter();  
      
    javax.servlet.ServletConfig config= getServletConfig();  
    String UserName=config.getInitParameter("UserName");
    String linkedin = config.getInitParameter("linkedin");
    javax.servlet.ServletContext context=getServletContext();
    String cname = context.getInitParameter("CollegeName");
    RequestDispatcher rd=request.getRequestDispatcher("/index.html");  
    rd.include(request, response); 
    show.print("<center> <h3>");    
    show.println("User Name is: "+UserName +"<br>"); 
    show.print("My linkedin id "+linkedin+ "<a href=\"https://www.linkedin.com/in/ankitkumarcse\"><br>Connect with me </a>"+"<br>");
    show.print("College Name" + " "+ cname+"<br>");
    show.print("<a href=\"ServletContext\"> Go for Servelt Context</a>");
    show.print("</center> </h3>"); 
  
    
    }  

  
}
  


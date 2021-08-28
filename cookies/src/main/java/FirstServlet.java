import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;  
  
  
public class FirstServlet extends HttpServlet {  
  
  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public void doPost(HttpServletRequest request, HttpServletResponse response){  
    try{  
  
    response.setContentType("text/html");  
    PrintWriter out = response.getWriter();  
          
    String n=request.getParameter("userName");
    String p=request.getParameter("password");
    out.print("Welcome "+n);  
  
    Cookie ck=new Cookie("uname",n);
    
    response.addCookie(ck);//adding cookie in the response  
  
    //creating submit button  
    out.print("<form method=\"post\" action='servlet2'>");  
    out.print("<input type='submit' value='go'>");  
    out.print("</form>");  
          
    out.close();  
  
        }catch(Exception e){System.out.println(e);}  
  }  
}  
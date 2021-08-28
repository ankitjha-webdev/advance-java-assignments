

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ClientInfo
 */
@WebServlet("/ClientInfo")
public class ClientInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	   response.setContentType("text/html");
	   PrintWriter out = response.getWriter();
	   out.print("<html> <head> <title> Write a servlet program to retrieve Client's hostname, protocol type, server name and port number. </title> <style>body{background-color:#000000; color:#FFFF00} </style> </head><body> ");
	   out.print("<center><h3> Client Browser: " +request.getHeader("User-Agent")+"</h3></center> <hr>");
	   out.print("<center><h3> Client Browser Header Name: " +request.getHeaderNames()+"</h3></center> <hr>");
	   out.print("<center><h3> Client Browser path info: " +request.getPathInfo()+"</h3></center> <hr>");
	   out.print("<center><h3> Client Browser path info: " +request.getRequestURI()+"</h3></center> <hr>");
	   out.print("<center><h3> Client Ip Address: "+request.getRemoteAddr()+"</h3></center> <hr>");
	   out.print("<center><h3> Client Host Address: "+request.getRemoteHost()+"</h3></center> <hr>");
	   out.print("<center><h3> Client Port Number: "+request.getRemotePort()+"</h3></center> <hr>");
	   out.print("<center><h3> Client Remote Address: "+request.getRemoteUser()+"</h3></center> <hr>");
	   
	   out.print("<center><h3> Client Server Port Number: "+request.getServerPort()+"</h3></center> <hr>");
	   out.print("<center><h3> Client Local Port Number: "+request.getLocalPort()+"</h3></center> <hr>");
	   out.print("<center><h3> Method used by Client : "+request.getMethod()+"</h3></center> <hr>");
	   
	   out.print("<center><h3> Query String name & values : "+request.getQueryString()+"</h3></center> <hr>");
	   
	   out.print("<center><h3> Client Requested URL : "+request.getRequestURL()+"</h3></center> <hr>");
	   out.print("<center><h3> Client Servlet Path : "+request.getServletPath()+"</h3></center> <hr>");
	   out.print("<center><h3> Client Requested Session : "+request.getSession()+"</h3></center> <hr>");
	   out.print("<body> </html>");
	}

}

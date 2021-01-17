package mypack;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.*;

@WebServlet("/wel")
public class WelcomeServlet extends HttpServlet
{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
	{
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		String uname = req.getParameter("uname");
		String upass = req.getParameter("upass");
		
		out.println("<h1> Welcome:" + uname + "</h1>");
		out.println("<h1> Welcome:" + upass + "</h1>");
	}
}

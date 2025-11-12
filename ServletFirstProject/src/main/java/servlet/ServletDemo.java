package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//this is normal class to make servlet class extend HttpServlet or GenericServlet
//or implement Servlet
public class ServletDemo extends HttpServlet{//this class object creation done by container(program)
	 @Override
	public void init() throws ServletException {//initialization, when server is started it is called
		System.out.println("Init method called");
	}
	 
	 @Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {//both parameters are interface
		 //1. Get the information
		 String name = req.getParameter("username");
		 String email = req.getParameter("email");
		 String password = req.getParameter("password");
		 
		 //2. Prepare the response
		 resp.setContentType("text/html");
		 
		 //3. Response back
		 PrintWriter out = resp.getWriter();
		 out.print("<html>");
		    out.print("<head><title>Form Response</title></head>");
		    out.print("<body style='font-family: Arial; background-color: #f9f9f9; text-align: center;'>");

		    out.print("<h2 style='color: green;'>Form Submitted Successfully!</h2>");

		    out.print("<div style='background: #fff; display: inline-block; padding: 20px 40px; "
		            + "border-radius: 10px; box-shadow: 0 2px 8px rgba(0,0,0,0.2);'>");

		    out.print("<p><b>Name:</b> " + name + "</p>");
		    out.print("<p><b>Email:</b> " + email + "</p>");
		    out.print("<p><b>Password:</b> " + password + "</p>");

		    out.print("</div>");

		    out.print("<br><br><a href='First.html' "
		            + "style='text-decoration: none; color: white; background: #007bff; "
		            + "padding: 10px 20px; border-radius: 5px;'>Go Back</a>");

		    out.print("</body>");
		    out.print("</html>");
	}
	 
	 @Override
	public void destroy() {
		// TODO Auto-generated method stub
		super.destroy();
	}
	
	
//	//life cycle of Servlet
//	@Override
//	public void init(ServletConfig config) throws ServletException {
//		// TODO Auto-generated method stub
//	}
//	
//	@Override
//	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//	}
//	
//	@Override
//	public void destroy() {
//		// TODO Auto-generated method stub
//	}

}

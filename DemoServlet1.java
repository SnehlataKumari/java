import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
public class DemoServlet1 implements Servlet{
	public void init( ServletConfig con){
		
	}
	public void service( ServletRequest req,ServletResponse res) throws ServletException,IOException{
		res.setContentType("text/html");
		PrintWriter obj=res.getWriter();
		obj.println("<html><body>");
		obj.println("hello servlet im on.");
		obj.println("<br>");
		obj.println("Reference Id="+this);
		obj.println("<br>");
		obj.println("Thread name="+Thread.currentThread().getName());
		try{
		Thread.sleep(1000);
		
		}
		catch(Exception e){}
		obj.println("</html></body>");
		
	}
	public void destroy(){
	}
	public String getServletInfo(){
	return null;
	
	}
	public ServletConfig getServletConfig(){
	return null;
	}
}
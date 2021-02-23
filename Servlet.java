import javax.servlet.*;
import javax.servlet.http.*;
interface Servlet{
public void init(ServletConfig config){}
public void service(ServletRequest req,ServletResponse ros){}
public void destroy(){}
public String getServletInfo(){}
public servletConfig getServletConfig(){}

}
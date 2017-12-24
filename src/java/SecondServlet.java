import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author kunal
 */
public class SecondServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        Cookie cookies[]=request.getCookies();
        String str=null;
        
        for(Cookie cookie:cookies)
        {
            System.out.println(cookie.getValue());
            if(cookie.getName().equals("t1"))
            {
                str=cookie.getValue();
            }
        }
        
        PrintWriter out = response.getWriter();
        out.println(" <html><b>Welcome</b></html> "+str);
    }

}

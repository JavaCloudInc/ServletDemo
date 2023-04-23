import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DispNum extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse res)
     throws ServletException, IOException {
        int num = Integer.parseInt(req.getParameter("num"));
        PrintWriter out = res.getWriter();
        out.println("Your number is: " + num);
    }
    
}

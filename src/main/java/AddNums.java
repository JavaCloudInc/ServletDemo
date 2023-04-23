import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddNums extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse res)
     throws ServletException, IOException {
        int num1 = Integer.parseInt(req.getParameter("num1"));
        int num2 = Integer.parseInt(req.getParameter("num2"));
        int sum = num1 + num2;
        PrintWriter out = res.getWriter();
        out.println("The sum of " + num1 + " + " + num2 + " is: " + sum);
    }
    
}

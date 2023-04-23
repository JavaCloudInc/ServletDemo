import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RunJSON extends  HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse res)
     throws ServletException, IOException {
        String jsonObj = "{ 'name': 'John', 'age': 22 }";
        res.setContentType("application/json");
        res.getWriter().write(jsonObj);
    }

}

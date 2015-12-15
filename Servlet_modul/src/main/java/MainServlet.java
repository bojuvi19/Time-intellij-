/**
 * Created by Юля on 09.12.2015.
 */
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "MainServlet", urlPatterns = {"/current", "/"})
public class MainServlet extends HttpServlet {

    @EJB
    private Ejb_modBean newSessionBean;


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        request.setAttribute("123", new SimpleDateFormat("HH:mm").format(newSessionBean.get_time()));

        RequestDispatcher dispatcher = request.getRequestDispatcher("/Static_time.jsp");
        dispatcher.forward(request, response);
    }
}

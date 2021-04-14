package Task1_Linus_Citation;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "linusServlet", value = "/linus-servlet")
public class LinusServlet extends HttpServlet {
    private String message;

    public void init(){
        message = "Bad programmers worry about the code. Good programmers\n" +
                "worry about data structures and their relationships";
    }
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
    }
}

package Task2Task3_mathFrom3;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

@WebServlet(name = "max3Servlet", value = "/max3-servlet")
public class MathFrom3_Servlet extends HttpServlet {

    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("Init method");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String first = req.getParameter("first");
        String second = req.getParameter("second");
        String third = req.getParameter("third");

        PrintWriter writer = resp.getWriter();

        resp.setContentType("text/html");
        writer.println("<html><body>");
        writer.println("<pre>");
        writer.println("first = " + first);
        writer.println("second = " + second);
        writer.println("third = " + third);
        int[] arr = new int[]{Integer.parseInt(first), Integer.parseInt(second), Integer.parseInt(third)};

        String math = req.getParameter("math");
        if (math.equals("max")) {
            int max = Arrays.stream(arr).max().getAsInt();
            writer.println("<b>Max number = " + max + "</b>");
        } else if (math.equals("min")) {
            int min = Arrays.stream(arr).min().getAsInt();
            writer.println("<b>Min number = " + min + "</b>");
        } else {
            double average = Arrays.stream(arr).average().getAsDouble();
            writer.println("<b>Average number = " + average + "</b>");
        }
        writer.println("</pre>");
        writer.println("</body></html>");

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();
        writer.println("Hello from hw 12 task 2");
    }
}

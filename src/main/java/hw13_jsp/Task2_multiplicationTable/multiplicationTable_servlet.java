package hw13_jsp.Task2_multiplicationTable;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "multiplicationTable_servlet", value = "/multiplicationTable")
public class multiplicationTable_servlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String numReq = req.getParameter("num");
        if (numReq != null) {
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("views/task2Show.jsp");
            requestDispatcher.forward(req, resp);
        }
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("views/task2.jsp");
        requestDispatcher.forward(req, resp);
    }
}

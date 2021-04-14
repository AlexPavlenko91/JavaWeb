package Task5_Calculator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(name = "calculatorServlet", value = "/calculator-servlet")
public class Calculator_Servlet extends HttpServlet {
    // private final Character[] signs = new Character[]{'+', '-', '*', '/', '%', '^'};

    public double getRes(double a, double b, char c) {
        switch (c) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                return a / b;
            case '%':
                return (a / 100) * b;
            case '^':
                return Math.pow(a, b);
            default: break;
        }
        double res = 0;

        return 0;
    }

    @Override
    public void init() throws ServletException {
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();
        String firstNum = req.getParameter("firstNum");
        String secondNum = req.getParameter("secondNum");
        double first = Double.parseDouble(firstNum);
        double second = Double.parseDouble(secondNum);
        char sign = req.getParameter("sign").charAt(0);
        writer.println("res = " + getRes(first, second, sign));
    }
}

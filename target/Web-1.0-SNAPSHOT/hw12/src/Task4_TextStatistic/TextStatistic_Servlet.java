package Task4_TextStatistic;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

@WebServlet(name = "textStatServlet", value = "/textStat-servlet")
public class TextStatistic_Servlet extends HttpServlet {

    public String getListCh(String regex, String string) {
        StringBuilder charList = new StringBuilder();
        final Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        final Matcher matcher = pattern.matcher(string);
        while (matcher.find()) {
            charList.append(matcher.toMatchResult().group());
        }
        return charList.toString();
    }


    @Override
    public void init() throws ServletException {
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();
        String textStat = req.getParameter("textStat");

        String vowelsList, consonantsList, punctuationsList;
        String vowels = "[aeiou]", consonants = "[b-df-hj-np-tv-z]", punctuation_marks = "[!?.:;,-]";

        vowelsList = getListCh(vowels, textStat);
        consonantsList = getListCh(consonants, textStat);
        punctuationsList = getListCh(punctuation_marks, textStat);
        writer.println("<pre>Vowels list = " + vowelsList + "\n\tNumber of vowels = " + vowelsList.length());
        writer.println("\nConsonants list = " + consonantsList + "\n\tNumber of consonants = " + vowelsList.length());
        writer.println("\nPunctuation marks list = " + punctuationsList +
                "\n\tNumber of punctuation marks = " + punctuationsList.length() + "</pre>") ;

    }
}

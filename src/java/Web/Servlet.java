package Web;

import jakarta.servlet.ServletConfig;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.PrintWriter;
import java.util.Date;

public class Servlet extends HttpServlet {

    private int count = 0;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        System.out.println("Initial Run");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Date d = new Date();
        int time = d.getHours();
        count++;

        String name = request.getParameter("name");
        Person user = new Person();
        user.setName(name);
        getServletContext().setAttribute("user", user);

        HttpSession session = request.getSession();
        Person suser = new Person();
        suser.setName("Sayed");
        session.setAttribute("name", suser);
        String age = null;

        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("age")) {
                    age = cookie.getValue();
                }
            }
        }

        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.print("<html><head>");
            out.print("<title>Web Component</title>");
            out.print("</head><body>");
            out.print("<h1>Hello Servlet</h1>");
            out.print("<br>");
            out.print(request.getLocale());
            out.print("<br>");
            out.print("Hour: " + time);
            out.print("<br>");
            if (count == 10) {
                out.print("Mabruk");
                out.print("<br>");
            }
            if (name != null) {
                out.print(name);
                out.print("<br>");
            }
            out.print("Number of visits: " + count);
            out.print("<br>");
            out.print("Value of age: " + (age != null ? age : "Age not found"));
            out.print("<br>");
            out.print("<a href='/EEApplication/Context'>Go to Context</a>");
            out.print("</body></html>");
        }
    }
}

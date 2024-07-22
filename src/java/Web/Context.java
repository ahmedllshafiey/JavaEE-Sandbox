package Web;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class Context extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        Person user = (Person) getServletContext().getAttribute("user");
        HttpSession session = request.getSession();
        Person suser = (Person) session.getAttribute("name");

        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Context</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("Servlet Config: " + getServletConfig().getInitParameter("Email") + "<br>");
            out.println("Servlet Context: " + getServletContext().getInitParameter("Name") + "<br>");
            out.println("Servlet Attribute: " + (user != null ? user.getName() : "User not found") + "<br>");
            out.println("Servlet Session: " + (suser != null ? suser.getName() : "User not found") + "<br>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
}

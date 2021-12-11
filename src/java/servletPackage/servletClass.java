package servletPackage;

import java.io.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

public class servletClass extends HttpServlet {

    public boolean isValidPassword(String password) {
        boolean isValid = true;
        if (password.length() > 15 || password.length() < 8) {
            isValid = false;
        }
        String upperCaseChars = "(.*[A-Z].*)";
        if (!password.matches(upperCaseChars)) {
            isValid = false;
        }
        String lowerCaseChars = "(.*[a-z].*)";
        if (!password.matches(lowerCaseChars)) {
            isValid = false;
        }
        String numbers = "(.*[0-9].*)";
        if (!password.matches(numbers)) {
            isValid = false;
        }
        String specialChars = "(.*[@,#,$,%].*$)";
        if (!password.matches(specialChars)) {
            isValid = false;
        }
        return isValid;
    }

    public boolean isValidUserName(String userName) {
        boolean isValid = true;
        if (userName.length() > 15 || userName.length() < 8) {
            isValid = false;
        }
        String upperCaseChars = "(.*[A-Z].*)";
        if (!userName.matches(upperCaseChars)) {
            isValid = false;
        }
        String lowerCaseChars = "(.*[a-z].*)";
        if (!userName.matches(lowerCaseChars)) {
            isValid = false;
        }
        String numbers = "(.*[0-9].*)";
        if (!userName.matches(numbers)) {
            isValid = false;
        }
        String specialChars = "(.*[@,#,$,%].*$)";
        if (userName.matches(specialChars)) {
            isValid = false;
        }
        return isValid;
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            resp.setContentType("text/html");
            PrintWriter out = resp.getWriter();
            out.print("<h1>hello world............</h1>");
            String name = req.getParameter("user_name");
            String email = req.getParameter("email");
            String password = req.getParameter("password");
            String Gender = req.getParameter("gender");
            String course = req.getParameter("course");

            String term = req.getParameter("term");

            if (name.equals("") || email.equals("") || password.equals("") || Gender.equals("") || course.equals("")) {
                out.println("<h2>please give full details.....</h2>");
                RequestDispatcher rd = req.getRequestDispatcher("index.html");
                rd.include(req, resp);

            } else {
                if (!isValidPassword(password)) {
                    out.println("<h2>please Enter Strong Password.....</h2>");
                    RequestDispatcher rd = req.getRequestDispatcher("index.html");
                        rd.include(req, resp);
                } else {
                    if (term == null || !term.equals("checked")) {
                        out.println("<h2>please Accept the term and Condition.....</h2>");
                        RequestDispatcher rd = req.getRequestDispatcher("index.html");
                        rd.include(req, resp);
                    } else {
                        out.println("<h2>name = " + name + "</h2>");
                        out.println("<h2>Date = " + email + "</h2>");
                        out.println("<h2>password = " + password + "</h2>");
                        out.println("<h2>Gender = " + Gender + "</h2>");
                        out.print("<h2>Course = " + course + "</h2>");
                        RequestDispatcher rd = req.getRequestDispatcher("successServlet");
                        rd.forward(req, resp);
                    }
                }
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }

}

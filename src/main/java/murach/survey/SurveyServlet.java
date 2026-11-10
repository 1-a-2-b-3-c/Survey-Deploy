package murach.survey;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

import murach.business.User;
import murach.business.Survey;

public class SurveyServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String url = "/index.html";

        // Get current action.
        String action = request.getParameter("action");
        if (action == null) {
            action = "join"; // Default action.
        }

        // Perform action and set URL to appropriate page.
        if (action.equals("join")) {
            // The "join" page.
        } else if (action.equals("add")) {
            // Get parameters from the request.
            String firstName = request.getParameter("firstName");
            String lastName = request.getParameter("lastName");
            String email = request.getParameter("email");
            String dateOfBirth = request.getParameter("dateOfBirth");
            String method = request.getParameter("method");
            String [] yes = request.getParameterValues("yes");
            String contact = request.getParameter("contact");

            User user = new User(firstName, lastName, email, dateOfBirth);
            Survey survey = new Survey(method, yes, contact);

            request.setAttribute("user", user);
            request.setAttribute("survey", survey);
            url = "/thanks.jsp";   // The "thanks" page.
        }

        getServletContext()
                .getRequestDispatcher(url)
                .forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }
}

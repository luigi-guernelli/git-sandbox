package org.luigi.controller;


import org.luigi.dao.UserDAO;
import org.luigi.model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

/**
 * Servlet che gestisce la registrazione di un nuovo utente.
 */
@WebServlet("/register")
public class RegisterServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;
    private UserDAO userDAO;

    @Override
    public void init() {
        userDAO = new UserDAO();
    }

    /**
     * Gestisce la richiesta POST dal form di registrazione.
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Recupera i dati dal form
        String username = request.getParameter("username");
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        // Crea l'oggetto User
        User user = new User();
        user.setUsername(username);
        user.setEmail(email);
        user.setPassword(password); // NB: password in chiaro

        // Tenta la registrazione nel database
        boolean success = userDAO.registerUser(user);

        if (success) {
            response.sendRedirect("registrazione-successo.jsp");
        } else {
            response.sendRedirect("registrazione-errore.jsp");
        }
    }
}

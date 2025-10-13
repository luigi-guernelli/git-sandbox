package org.luigi;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String nome = request.getParameter("nomeUtente");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1>Ciao, " + nome + "! Benvenuto nel mondo JSP + Servlet!</h1>");
    }
}

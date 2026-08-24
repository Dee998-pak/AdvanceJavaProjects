package com.emp.demo; // Add your package if you have one

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/Login")
public class Hello extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        // Set the response content type
        resp.setContentType("text/html");

        // Print message to browser
        PrintWriter out = resp.getWriter();
        out.println("<h1>Hello World from Servlet!</h1>");
    }
}
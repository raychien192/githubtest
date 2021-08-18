package com.example.web;

import com.example.model.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;
import java.util.*;


public class BeerSelect extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.println("Beer Selection Advice<br>");
            String c = request.getParameter("color");

            // Now we get beer advice, right?
            BeerExpert myexpert = new BeerExpert();
            
            List myAdvice = myexpert.getBrands(c);

            // Different ways to do it... but learn the Iterator
            //Iterator it = myAdvice.iterator();
            //while(it.hasNext())
            //{ out.println("<br>Try: " + it.next()); }

            // Use the MVC format
            request.setAttribute("styles", myAdvice);

            RequestDispatcher view = request.getRequestDispatcher("result.jsp");

            // Use the request dispatcher to ask the Container to crank up the JSP
            view.forward(request, response);

            
        }
}
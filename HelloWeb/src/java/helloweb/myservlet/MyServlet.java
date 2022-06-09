package helloweb.myservlet;

import java.io.*;
import java.lang.ClassNotFoundException;
import javax.servlet.*;
import javax.servlet.http.*;

// Extend HttpServlet class
public class MyServlet extends HttpServlet {
 
    /**
     *
     * @param req
     * @param res
     */
    @Override
   public void service( HttpServletRequest req, HttpServletResponse res ) {
       String inputValue = req.getParameter("number");
       System.out.println("You input" +  inputValue);
   }


//   @Override
//   public void doPost(HttpServletRequest request, HttpServletResponse response)  throws ServletException, IOException {
//      
//      // Set response content type
//      response.setContentType("text/html");
//
//      // Actual logic goes here.
//      PrintWriter out = response.getWriter();
//      
//       String input = request.getParameter("number");
//       System.out.println(input);
//       
//      out.close();
//   }

   @Override
   public void destroy() {
      // do nothing.
   }
}
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class BMWHidden extends HttpServlet {
public void doPost(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException {
PrintWriter out = response.getWriter();
out.println("<html><head>");
out.println("<link rel='stylesheet' href='style.css' /> <title>BMW Hidden
Form Fields</title></head>");
out.println("<body class='flex-col'><h1>BMW Hidden Form Fields</h1>");
out.println("<form action='restorebmwhidden' method='post'>");
out.println("<input type='hidden' name='model' value='" +
request.getParameter("model") + "' />");
out.println("<input type='hidden' name='price' value='" +
request.getParameter("price") + "' />");
out.println("<input type='submit' value='Restore' />");
out.println("</form></body></html>");
}
}
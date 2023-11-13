import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class BMWURL extends HttpServlet {
public void doPost(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException {
PrintWriter out = response.getWriter();
out.println("<html><head>");
out.println("<link rel='stylesheet' href='style.css' /> <title>BMW URL
Rewriting</title></head>");
out.println("<body class='flex-col'><h1>BMW URL Rewriting</h1>");
String model = request.getParameter("model");
String price = request.getParameter("price");
response.sendRedirect("restorebmwurl?model=" + model + "&price=" +
price);
out.println("</body></html>");
}
}

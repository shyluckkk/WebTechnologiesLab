import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class RestoreBMWURL extends HttpServlet {
public void doGet(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException {
PrintWriter out = response.getWriter();
out.println("<html><head>");
out.println("<link rel='stylesheet' href='style.css' /> <title>Restore
BMW URL Rewriting</title></head>");
out.println("<body class='flex-col'><h1>Restore BMW URL Rewriting</h1>");
String model = request.getParameter("model");
String price = request.getParameter("price");
out.println("<h2>Model: " + model + "</h2>");
out.println("<h2>Price: $" + price + "</h2>");
out.println("</body></html>");
}
}
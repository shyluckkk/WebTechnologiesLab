import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class RestoreBMWHidden extends HttpServlet {
public void doPost(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException {
PrintWriter out = response.getWriter();
out.println("<html><head>");
out.println("<link rel='stylesheet' href='style.css' /> <title>Restore
BMW Hidden Form Fields</title></head>");
out.println("<body class='flex-col'><h1>Restore BMW Hidden Form
Fields</h1>");
out.println("<h2>Model: " + request.getParameter("model") + "</h2>");
out.println("<h2>Price: $" + request.getParameter("price") + "</h2>");
out.println("</body></html>");
}
}
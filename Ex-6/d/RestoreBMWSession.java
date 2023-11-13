import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class RestoreBMWSession extends HttpServlet {
public void doGet(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException {
HttpSession session = request.getSession(false);
PrintWriter out = response.getWriter();
out.println("<html><head>");
out.println("<link rel='stylesheet' href='style.css' /> <title>Restore
BMW Session</title></head>");
out.println("<body class='flex-col'><h1>Session Restored</h1>");
if (session != null) {
out.println("<h2>Model: " + session.getAttribute("model") + "</h2>");
} else {
out.println("<h2>No session data available</h2>");
}
out.println("</body></html>");
}
}
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class BMWSession extends HttpServlet {
public void doPost(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException {
HttpSession session = request.getSession();
session.setAttribute("model", request.getParameter("model"));
PrintWriter out = response.getWriter();
out.println("<html><head>");
out.println("<link rel='stylesheet' href='style.css' /> <title>BMW
Session</title></head>");
out.println("<body class='flex-col'><h1>Session Created</h1>");
out.println("<a href='restorebmwsession'>Click here to see the
session</a>");
out.println("</body></html>");
}
}
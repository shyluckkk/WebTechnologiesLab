import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class LoginExam extends HttpServlet {
protected void doPost(HttpServletRequest request, HttpServletResponse
response) throws ServletException, IOException {
String username = request.getParameter("username");
String password = request.getParameter("password");
if (username.equals("example") && password.equals("password")) {
HttpSession session = request.getSession();
session.setAttribute("username", username);
response.sendRedirect("accessexam");
} else {
response.setContentType("text/html");
PrintWriter out = response.getWriter();
out.println("<html><head>");
out.println("<link rel='stylesheet' href='style.css' /> <title>Login
Exam</title></head>");
out.println("<body class='flex-col'><h2>Login Failed. Please try
again.</h2>");
out.println("<a href='login.html'>Back to Login</a>");
out.println("</body></html>");
}
}
}

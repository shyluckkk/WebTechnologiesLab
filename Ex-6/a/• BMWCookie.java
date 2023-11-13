import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class BMWCookie extends HttpServlet {
public void doPost(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException {
Cookie modelCookie = new Cookie("BMW Model",
request.getParameter("model"));
Cookie priceCookie = new Cookie("Price", request.getParameter("price"));
modelCookie.setMaxAge(60*60*24);
priceCookie.setMaxAge(60*60*24);
response.addCookie(modelCookie);
response.addCookie(priceCookie);
PrintWriter out = response.getWriter();
out.println("<html><head>");
out.println("<link rel='stylesheet' href='style.css' /> <title>BMW
Cookie</title></head>");
out.println("<body class='flex-col'><h1>BMW Cookie</h1>");
out.println("<a href='restorebmwcookie'>Click here to see the BMW
details</a>");
out.println("</body></html>");
}
}
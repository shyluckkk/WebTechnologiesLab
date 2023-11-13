import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class BMWServlet extends HttpServlet {
 public void doGet(HttpServletRequest request, HttpServletResponse
response) throws ServletException, IOException {
 PrintWriter out = response.getWriter();
 out.println("<html><head>");
 out.println("<link rel='stylesheet' href='style.css' /> <title>BMW
Servlet</title></head>");
 out.println("<body class='flex-col'><h1>BMW Servlet</h1>");
 out.println("<table><tr><th>Planet</th><th>Distance</th></tr>");
 out.println("<tr><td>Mercury</td><td>57,910,000</td></tr>");
 out.println("</table></body></html>");
 }


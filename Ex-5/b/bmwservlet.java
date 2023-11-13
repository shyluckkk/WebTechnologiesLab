import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class BMWServlet extends HttpServlet {
public void doGet(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException {
PrintWriter out = response.getWriter();
out.println("<html><head>");
out.println("<link rel='stylesheet' href='style.css' /> <title>BMW
M8</title></head>");
out.println("<body class='flex-col'><h1>BMW M8</h1>");
out.println("<img src='bmw_m8.jpg' alt='BMW M8' />");
out.println("<p>The BMW M8 is a high-performance sports car that combines
luxury and power. Experience the thrill of driving with BMW's latest
masterpiece.</p>");
out.println("<table><tr><th>Specifications</th><th>Details</th></tr>");
out.println("<tr><td>Engine</td><td>4.4L Twin-Turbo V8</td></tr>");
out.println("<tr><td>Horsepower</td><td>617 HP</td></tr>");
out.println("<tr><td>0-60 MPH</td><td>3.1 seconds</td></tr>");
out.println("</table></body></html>");
}
}
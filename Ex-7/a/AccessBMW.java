import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
public class AccessBMWDetails extends HttpServlet {
public void doGet(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException {
try {
PrintWriter out = response.getWriter();
out.println("<html><head>");
out.println("<link rel='stylesheet' href='style.css' /> <title>Access
BMW Details</title></head>");
out.println("<body class='flex-col'><h1>BMW Details Database</h1>");
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con =
DriverManager.getConnection("jdbc:mysql://172.18.0.2:3306/BMWDetailsDB","root","p
assword");
Statement stmt = con.createStatement();
ResultSet rs = stmt.executeQuery("select * from BMWDetails");
out.println("<table><tr><th>Model</th><th>Year</th></tr>");
while(rs.next()) {
out.println("<tr><td>" + rs.getString(1) + "</td><td>" +
rs.getString(2) + "</td></tr>");
}
out.println("</table>");
out.println("</body></html>");
} catch (Exception e) {
System.err.println(e);
}
}
}
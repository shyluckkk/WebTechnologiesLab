import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
public class StoreBMWDetails extends HttpServlet {
public void doPost(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException {
try {
String model = request.getParameter("model");
String year = request.getParameter("year");
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con =
DriverManager.getConnection("jdbc:mysql://172.18.0.2:3306/BMWDetailsDB","root","p
assword");
Statement stmt = con.createStatement();
stmt.executeUpdate("insert into BMWDetails values('" + model + "','"
+ year + "')");
stmt.close();
con.close();
PrintWriter out = response.getWriter();
out.println("<html><head>");
out.println("<link rel='stylesheet' href='style.css' /> <title>Store
BMW Details</title></head>");
out.println("<body class='flex-col'><h1>BMW Details Database</h1>");
out.println("<h2>BMW details added successfully</h2>");
out.println("<a href='accessBMWDetails'>Click here to see the BMW
details database</a>");
out.println("</body></html>");
} catch(Exception e) {
System.out.println(e);
}
}
}

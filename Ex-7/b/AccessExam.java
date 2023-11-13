import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class AccessExam extends HttpServlet {
protected void doGet(HttpServletRequest request, HttpServletResponse
response) throws ServletException, IOException {
HttpSession session = request.getSession();
String username = (String) session.getAttribute("username");
if (username == null) {
response.sendRedirect("login.html");
} else {
response.setContentType("text/html");
PrintWriter out = response.getWriter();
out.println("<html><head>");
out.println("<link rel='stylesheet' href='style.css' /> <title>Access
Exam</title></head>");
out.println("<body class='flex-col'><h2>Welcome to the BMW Cars
Exam!</h2>");
out.println("<form class='flex-col' action='evaluationexam'
method='post'>");
out.println("Question 1: What year was BMW founded?");
out.println("<input type='text' name='answer1'>");
out.println("Question 2: Which BMW model is known as the 'Ultimate
Driving Machine'?");
out.println("<input type='text' name='answer2'>");
out.println("Question 3: What does 'BMW' stand for?");
out.println("<input type='text' name='answer3'>");
out.println("Question 4: In what country is BMW headquartered?");
out.println("<input type='text' name='answer4'>");
out.println("Question 5: What is the top speed of the BMW M5
Competition?");
out.println("<input type='text' name='answer5'>");
out.println("<input type='submit' value='Evaluate'>");
out.println("</form>");
out.println("</body></html>");
}
}
}
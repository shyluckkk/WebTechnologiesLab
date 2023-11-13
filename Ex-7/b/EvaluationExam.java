import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class EvaluationExam extends HttpServlet {
protected void doPost(HttpServletRequest request, HttpServletResponse
response) throws ServletException, IOException {
String answer1 = request.getParameter("answer1");
String answer2 = request.getParameter("answer2");
String answer3 = request.getParameter("answer3");
String answer4 = request.getParameter("answer4");
String answer5 = request.getParameter("answer5");
String correctAnswer1 = "1916";
String correctAnswer2 = "BMW 3 Series";
String correctAnswer3 = "Bayerische Motoren Werke";
String correctAnswer4 = "Germany";
String correctAnswer5 = "190 mph";
int score = 0;
if(answer1.equals(correctAnswer1)) {
score+=20;
}
if(answer2.equals(correctAnswer2)) {
score+=20;
}
if(answer3.equals(correctAnswer3)) {
score+=20;
}
if(answer4.equals(correctAnswer4)) {
score+=20;
}
if(answer5.equals(correctAnswer5)) {
score+=20;
}
// Store the score in the session for display
HttpSession session = request.getSession();
session.setAttribute("score", score);
// Display the score
response.setContentType("text/html");
PrintWriter out = response.getWriter();
out.println("<html><head>");
out.println("<link rel='stylesheet' href='style.css' /> <title>Exam
Evaluation</title></head>");
out.println("<body class='flex-col'><h1>BMW Cars Exam
Results</h1><h2>Your Score: " + score + "</h2>");
out.println("</body></html>");
}
}
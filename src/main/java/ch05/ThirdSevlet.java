package ch05;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ThirdSevlet
 */
@WebServlet("/ch05/third")
public class ThirdSevlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		out.print("<!DOCTYPE html>\r\n");
		out.print("<html>\r\n");
		out.print("<head>\r\n");
		out.print("	<meta charset=\"UTF-8\">\r\n");
		out.print("	<title>Insert title here</title>\r\n");
		out.print("</head>\r\n");
		out.print("<body>\r\n");
		out.print("	<h1>안녕하세요?</h1>\r\n");
		out.print("	<h1>Hello World!!!</h1>\r\n");
		out.print("</body>\r\n");
		out.print("</html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

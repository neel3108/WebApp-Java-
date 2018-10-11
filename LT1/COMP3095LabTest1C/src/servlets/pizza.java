// COMP3095
//Neel Patel - 101093829
package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import helper.RegularExpressionValidator;

@WebServlet("/pizza")
public class pizza extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public pizza() {
		super();

	}

	@SuppressWarnings("static-access")
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		RegularExpressionValidator r = new RegularExpressionValidator();
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		pw.println("<h1>");
		pw.println("Order Confirmation.");
		pw.println("</h1>");
		pw.println("<br>");
		pw.println("Order Confirmation Number is " + r.getRandomNumberString());
		pw.println("<br>");
		pw.println("Your order has been successfully placed.");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}

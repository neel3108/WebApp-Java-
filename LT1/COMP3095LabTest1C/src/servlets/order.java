// COMP3095
//Neel Patel - 101093829
package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import helper.RegularExpressionValidator;

@WebServlet("/order")
public class order extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public order() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	@SuppressWarnings("static-access")
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RegularExpressionValidator regex = new RegularExpressionValidator();
		String email = request.getParameter("email");
		String address = request.getParameter("address");
		String pCode = request.getParameter("postalCode");
		String size = request.getParameter("size");
		String type = request.getParameter("type");
		if (email.isEmpty() || address.isEmpty() || pCode.isEmpty() || !(regex.isEmail(email))
				|| !(regex.isValidPostalCode(pCode))) {
			response.sendRedirect("./failed.html");
		} else {
			response.sendRedirect("pizza");
		}
	}

}

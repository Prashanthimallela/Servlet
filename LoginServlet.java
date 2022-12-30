package com.training.web;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet1")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	String userName=request.getParameter("uname");
	String password=request.getParameter("pwd");
	String Email=request.getParameter("Email");
	response.setContentType("text/html");
	PrintWriter out=response.getWriter();
	if(userName.equals("")||password.equals("")||Email.equals("")){
		out.print(" <h2>**please enter username, password and Email**<h2><br></br>");
		RequestDispatcher rd=request.getRequestDispatcher("/index1.html");
		rd.include(request, response);
	}
	else if(userName.equals("prashanthi") && password.equals("1234")) {
	
		request.setAttribute("user", userName);
		request.setAttribute("password", password);
		request.setAttribute("Email", Email);
		RequestDispatcher rd = request.getRequestDispatcher("WelcomeServlet");
		rd.forward(request, response);
	
	}
	
	else {
		out.print(" <h2>**please enter username ,password,Email**<h2><br></br>");
		RequestDispatcher rd = request.getRequestDispatcher("/index1.html");
		rd.include(request, response);
	}

	}
	
	
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

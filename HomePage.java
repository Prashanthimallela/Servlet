package com.training.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HomePage
 */
@WebServlet("/welcome")
public class HomePage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	String msg;
	String msg1;
	String msg2;
	String msg3;
	String msg4;
	String msg5;
	String msg6;

    public HomePage() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    public void init() {
    	msg="hello";
    	msg1="Severlet strutcture ";
    	msg2=" core java";
    	msg3="SQL";
    	msg4="html,css";
    	msg5="javaScript";
    	msg6="jdbc";
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<h1> "+msg+" </h1>");
		out.println("<li> "+msg1+" </li>");
		out.println("<li> "+msg2+" </li>");
		out.println("<li> "+msg3+" </li>");
		out.println("<li> "+msg4+" </li>");
		out.println("<li> "+msg5+" </li>");
		out.println("<li> "+msg6+" </li>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}


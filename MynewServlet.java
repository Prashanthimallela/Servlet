package com.training.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MynewServlet
 */
@WebServlet("/MynewServlet1")
public class MynewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	
    public MynewServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    public void init() {
 
    }
    

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ServletConfig config=getServletConfig();
		ServletContext context=getServletConfig().getServletContext();
		String Name=context.getInitParameter("value1");
		String username=context.getInitParameter("username");
		String password=context.getInitParameter("userpassword");
		response.setContentType("text/html");
		 PrintWriter out= response.getWriter();
	    String str=request.getParameter("user");
	    String str1=request.getParameter("pass");
	   
	    if(username.equalsIgnoreCase(str)) {
	    	out.println("company name is :"+Name);
	    	out.println("user name is :"+username);
	    	
	    }
	    else {
	    	out.print("wrong credentials");
	    }
	    
	    
	    
	   
	    out.println("<h1> "+Name+ "</h1>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

package com.assignment.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import comm.assignment.web.model.Product;

/**
 * Servlet implementation class InsertData
 */
@WebServlet("/InsertData")
public class InsertData extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertData() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		 try {
			 
			 
			 Class.forName("com.mysql.cj.jdbc.Driver");
		     //Scanner sc = new Scanner(System.in);
		     String url = "jdbc:mysql://localhost:3306/infinite";
		     String user = "root";
		     String pass = "root@123";
		     Connection con  = DriverManager.getConnection(url,user,pass);
		     //Statement stmt = con.createStatement();
		     
	             PreparedStatement st = con
	                   .prepareStatement("insert into product values(?, ?,?,?)");
	  
	           
	            st.setInt(1, Integer.valueOf(request.getParameter("id")));
	            st.setString(2, request.getParameter("pname"));
	            st.setString(3, request.getParameter("pdesc"));
	            st.setString(4, request.getParameter("pric"));
	            
	            st.executeUpdate();
	  
	           
	            st.close();
	            con.close();
	  
	           
	            PrintWriter out = response.getWriter();
	            out.println("<html>");
	            out.println("<head>");
	            out.println("<style>");  
		           
	            out.println("h1 {");       
	            out.println("color:blue;");
	           
	            out.println("}");  
	            out.println("* {");       
	            out.println("background-color:#f1f1f1;");
	           
	            out.println("}");  
	           
	            out.println("</style>");  
	            
	            out.println("<html><body><b><h1>Successfully Inserted Product</h1>"
	            		
	                        + "</b></body></html>");
	            
//	            out.print("<br><a href='FridayServletTest/welcomeServlet'>Add Product</a><br><br>");
	        }
	        catch (Exception e) {
	            e.printStackTrace();
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
package com.assignment.web;

import java.io.IOException;

import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import comm.assignment.web.model.Product;

/**
 * Servlet implementation class PdWelcomeServlet
 */
@WebServlet("/PdWelcomeServlet")
public class PdWelcomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String prdDesc;
	

       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PdWelcomeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String prdName = (String)request.getAttribute("PrdName");
		Integer prdId = (Integer)request.getAttribute("prdId");
		String PrdDesc = (String)request.getAttribute("PrdDesc");
		Integer prdPrice = (Integer)request.getAttribute("prdPrice");
		
		List<Product> productList = (List<Product>)request.getAttribute("ProductList");
		
		HttpSession session = request.getSession();
		
		session.setAttribute("ProductList", productList);
		
		out.print("<h1>Welcome "+prdName+"! You are successfully logged in </h1>");
		out.println("<table border='1'> ");
		out.println("<tr> <th>");
		out.println("<th>prdName </th>");
		out.println("<th> prdId </th>");
		out.println("<th>prdDesc </th>");
		out.println("<th> prdPrice </th>");
		for(Product product:productList) {
			out.println("<tr><td>" +product.getPrdName() +"</td>");
			out.println("<td>" +product.getPrdId() +"</td> ");
			out.println("<td>" +product.getPrdDesc() +"</td>");
			out.println("<tr><td>" +product.getPrdPrice() +"</td> </tr>");
			}
	
		
		
		// URL ReWriting
		out.println("<h3> Click on the below link to see username and password</h3><br/>");
		out.println("<a href='GetUrlParamServlet?prdName="+prdName+"prdId="+prdId+" prdDesc="+prdDesc+" prdPrice"+prdPrice+"'>Click here</a>");
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

package com.assignment.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;

import com.training.web.service.LoginService;
import com.training.web.service.LoginServiceImpl;

import comm.assignment.web.model.Product;
import comm.assignment.web.service.PdLoginService;
import comm.assignment.web.service.PdLoginServiceImpl;

/**
 * Servlet Filter implementation class PdLoginFilter
 */
@WebFilter("/PdWelcomeServlet")
public class PdLoginFilter implements Filter {
       
    /**
     * @see HttpFilter#HttpFilter()
     */
    public PdLoginFilter() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here

		// pass the request along the filter chain
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String prdName = request.getParameter("prdName");
		Integer prdId = Integer.parseInt(request.getParameter("prdId"));
		String PrdDesc = request.getParameter("prdDesc");
		Integer prdPrice = Integer.parseInt(request.getParameter("prdPrice"));
		PdLoginService service = new PdLoginServiceImpl();
				
		if(prdName.equalsIgnoreCase("") || prdId.toString().equals("")||PrdDesc.equalsIgnoreCase("")||prdPrice.toString().equals("")) {
			out.print("<h2>**Please enter prdName,prdId,prdDesc,prdPrice**<h2>");
			
			RequestDispatcher rd = request.getRequestDispatcher("Login.jsp");
			rd.include(request, response);
		}
		 
		else if(service.isValidProduct(prdName, prdId,PrdDesc,prdPrice)) {
			
			List<Product>productList = service.getProduct();
			request.setAttribute("PrdName", prdName);
			request.setAttribute("prdId", prdId);
			request.setAttribute("PrdDesc", PrdDesc);
			request.setAttribute("prdPrice", prdPrice);
			
			request.setAttribute("ProductList", productList);
			chain.doFilter(request, response);
		}
	
		else {
			out.print("<h2>Incorrect login credential!!<h2>");
			RequestDispatcher rd = request.getRequestDispatcher("Login.jsp");
			rd.include(request, response);
		}
	
	}

		
	

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}

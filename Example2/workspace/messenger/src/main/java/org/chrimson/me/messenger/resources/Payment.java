package org.chrimson.me.messenger.resources;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet (urlPatterns= {"/Payment"})
	public class Payment extends HttpServlet {
	
	  // public static final String msg;


	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
	String user=req.getParameter("uname");
	 String amount=req.getParameter("amount");

	PrintWriter out = res.getWriter();
	out.println("\nYour Payment Successfully For the user : "+ user +" Amount Payed : "+amount);
	
	//////////////////////////////////////////////////////////////
	
	
	
	
	
	}
	  



	}
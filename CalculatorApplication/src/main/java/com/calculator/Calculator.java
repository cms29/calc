  package com.calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;


public class Calculator extends HttpServlet {
	private static final long serialVersionUID = 1L;

  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String val=request.getParameter("theURL");
		String replaceVal=val.replace('.','/');
		out.println(replaceVal);

		int a1 = Integer.parseInt(request.getParameter("n1"));

		int a2 = Integer.parseInt(request.getParameter("n2"));
		if (request.getParameter("add") != null) {
			out.println("<h1>Addition of "+a1+" and "+ a2 +" = " + (a1 + a2)+"</h1>");
		} else if (request.getParameter("sub") != null) {
			out.println("<h1>Substraction of "+a1+" and "+ a2 +" = " + (a1 - a2)+"</h1>");
		} else if (request.getParameter("mul") != null) {
			out.println("<h1>Multiplication of "+a1+" and "+ a2 +" = " + (a1 * a2)+"</h1>");
		} else if (request.getParameter("div") != null) {
			out.println("<h1>Division of "+a1+" and "+ a2 +" = " + (a1 / a2)+"</h1>");
			
		}
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(request.getInputStream()));
			String line = null;
			StringBuilder sb = new StringBuilder();
			while ((line = br.readLine()) != null) {
			sb.append(line);
			}

			JSONObject jsonObj = new JSONObject(sb.toString());
			JSONObject jsonData = jsonObj.getJSONObject("data");
			if (jsonData != null) {

			int num1 = Integer.parseInt(jsonData.getString("firstNo"));
			int num2 = Integer.parseInt(jsonData.getString("secondNo"));
			String action = jsonData.getString("action");
			String res = "";
			if (Constants.ADD_OPE.equalsIgnoreCase(action)) {
			res = "Addition of " + num1 + " and " + num2 + " = " + (num1 + num2);
			} else if (Constants.SUB_OPE.equalsIgnoreCase(action)) {
			res = "Substraction of " + num1 + " and " + num2 + " = " + (num1 - num2);
			} else if (Constants.MUL_OPE.equalsIgnoreCase(action)) {
			res = "Multiplication of " + num1 + " and " + num2 + " = " + (num1 * num2);
			}
			if (Constants.DIV_OPE.equalsIgnoreCase(action)) {
				if (num2 == 0) {
					throw new ArithmeticException(
							"num2 can not be zero, it's not allowed to perform the div operation..!");
				}
			res = "Division of " + num1 + " and " + num2 + " = " + (num1 / num2);
			}

			response.setContentType("application/json");
			response.setCharacterEncoding("UTF-8");

			JSONObject jsonObject = new JSONObject("{\"result\":\"" + res + "\"}");
			response.getWriter().write(jsonObject.toString());
			response.setStatus(response.SC_OK);

			} else {
			response.setStatus(response.SC_NO_CONTENT);
			System.err.println("No input data found with the given object..!");
			response.getWriter().write("No input data found with the given object..!");
			}

			}catch (ArithmeticException e) {
				response.setStatus(response.SC_EXPECTATION_FAILED);
				System.err.println("ArithmeticException occured, " + e.getMessage());
				response.getWriter().write("ArithmeticException occured, " + e.getMessage());
//				e.printStackTrace();
			} catch (Exception e) {
				response.setStatus(response.SC_INTERNAL_SERVER_ERROR);
				System.err.println("Exception occured, " + e.getMessage());
				response.getWriter().write("Exception occured, " + e.getMessage());
				e.printStackTrace();
			}
		


	}

}

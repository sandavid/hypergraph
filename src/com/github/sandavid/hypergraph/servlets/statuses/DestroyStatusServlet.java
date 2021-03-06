package com.github.sandavid.hypergraph.servlets.statuses;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;

import com.github.sandavid.hypergraph.services.StatusesServices;



/**
 * Servlet implementation class DestroyStatusServlet
 */

public class DestroyStatusServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/plain");
		PrintWriter out = response.getWriter();
		String token = request.getParameter("token");
		String id = request.getParameter("id");
		JSONObject json = StatusesServices.DestroyStatus(token, id);
		out.print(json);
	}

}

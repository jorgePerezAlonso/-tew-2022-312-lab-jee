package com.tew.Servlets.HolaMundoVistaServlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Vector;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HolaMundoVista
 */
@WebServlet(name = "HolaMundoVista", urlPatterns = { "/HolaMundoVista" })
public class HolaMundoVista extends HttpServlet {
	private static final long serialVersionUID = 2L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HolaMundoVista() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		
		String nombre = (String) request.getParameter("NombreUsuario");
		if ( nombre != null ){
			 out.println("<br>Hola "+nombre+"<br>");
			 
			}
		
		out.println("<br>");
		out.println("Contigo, hoy me han visitado:<br>");
		
		
		@SuppressWarnings("unchecked")
		Vector <String> listado = (Vector <String>)request.getSession().getAttribute("listado");
		for ( int i = 0 ; i < listado.size() ; i++ ){
			out.println("<br>"+(String)listado.elementAt(i));
		 
		}
		out.println("<a href=\"index.html\">volver</a>");
		Integer contador=(Integer)request.getServletContext().getAttribute("contador");
		out.println("<br><br>" + contador +" visitas");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

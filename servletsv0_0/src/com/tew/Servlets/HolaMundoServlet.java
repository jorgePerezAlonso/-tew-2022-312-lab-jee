package com.tew.Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//askodalksdnaskdhasdmasd
/**
 * Servlet implementation class HolaMundoServlet
 */
@WebServlet(name = "HolaMundo", urlPatterns = { "/HolaMundoCordial" })
public class HolaMundoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HolaMundoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//Primera version
		/*	 response.setCharacterEncoding("UTF-8");
			 response.setContentType("text/html");
			 PrintWriter out = response.getWriter();
			 out.println("<HTML>");
			 out.println("<HEAD><TITLE>Hola Mundo!</TITLE></HEAD>");
			 out.println("<BODY>");
			 out.println("Bienvenido a mi primera p�gina web!");
			 out.println("</BODY></HTML>");
			}
	*/
		 String nombre = (String) request.getParameter("NombreUsuario");
		 response.setCharacterEncoding("UTF-8");
		 response.setContentType("text/html");
		 PrintWriter out = response.getWriter();
		 out.println("<HTML>");
		 out.println("<HEAD><TITLE>Hola Mundo!</TITLE></HEAD>");
		 out.println("<BODY>");

		 if ( nombre != null ){
		 out.println("<br>Hola "+nombre+"<br>");
		 }
		 out.println("Bienvenido a mi primera p�gina Web!");
		 out.println("</BODY></HTML>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

package com.tew.Servlets.tienda.CarritoCompraServlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/CarritoCompraVista")
public class CarritoCompraVistaServlet extends HttpServlet {
	private static final long serialVersionUID=4L;
	
	public CarritoCompraVistaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		out.println("	<h1>Tienda Virtual</h1>\r\n" + "	<br>\r\n"
				+ "	<form action=\"CarritoCompra\" method=\"post\">\r\n" + "		<br>\r\n" + "		<table>\r\n"
				+ "			<tr>\r\n" + "				<td>escoja el artículo que desea:</td>\r\n"
				+ "			</tr>\r\n" + "			<tr>\r\n"
				+ "				<td><select name=\"producto\" size=\"1\">\r\n"
				+ "						<option value=\"010\">smartwatch</option>\r\n"
				+ "						<option value=\"020\">bicicleta</option>\r\n"
				+ "						<option value=\"030\">coche</option>\r\n"
				+ "						<option value=\"040\">zapatillas</option>\r\n"
				+ "						<option value=\"050\">chaleco</option>\r\n"
				+ "						<option value=\"060\">camara</option>\r\n"
				+ "						<option value=\"070\">camiseta</option>\r\n"
				+ "						<option value=\"080\">mascarilla</option>\r\n"
				+ "						<option value=\"090\">sudadera</option>\r\n"
				+ "						<option value=\"011\">pantalon</option>\r\n"
				+ "				</select></td>\r\n" + "			</tr>\r\n" + "			<tr>\r\n"
				+ "				<td><input type=\"submit\" value=\"añadir al carrito...\">\r\n"
				+ "				</td>\r\n" + "			</tr>\r\n" + "		</table>\r\n" + "	</form>");

		// Comprobamos si existe el objeto "carrito" en sesión.
		// Si no existe, lo creamos vacío. Será de tipo HashMap

		@SuppressWarnings("unchecked")
		HashMap<String, Integer> carrito = (HashMap<String, Integer>) request.getSession().getAttribute("carrito");

		out.println("	</br></br><H2>Carrito de la compra</h2>\r\n" + "	<br>\r\n" + "	<ul>\r\n");
		Set<String> claves = carrito.keySet();
		Iterator<String> itr = claves.iterator();
		while (itr.hasNext()) {
			String key = itr.next();
			out.println("<li>" + "Producto: " + key + "\t Cantidad: " + carrito.get(key) + "</li>");
		}
		out.println("	</ul>\r\n" + "	</br>");
	}

	
	

/**
 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
 *      response)
 */
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

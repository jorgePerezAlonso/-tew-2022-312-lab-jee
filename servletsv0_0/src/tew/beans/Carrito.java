package tew.beans;

import java.util.HashMap;

public class Carrito {
	private HashMap carrito;
	
	public Carrito() {
		carrito = new HashMap<String, Integer>();
	}
	
	public void anadirAlCarrito(String producto) {
		
		if (producto != null) {
			Integer cantidad = (Integer) carrito.get(producto);
			if (cantidad == null)
				cantidad = new Integer(1);
			else
				cantidad = new Integer(cantidad.intValue() + 1);
			// Y añadimos el producto al carrito
			carrito.put(producto, cantidad);
		}
	}
	
	public HashMap getVerCarrito() {
		return carrito;
	}

}

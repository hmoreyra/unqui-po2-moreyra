package supermercado;

import java.util.List;
import java.util.ArrayList;

public class Supermercado {
	String nombre;
	String direccion;
	List<Producto> productos;
	
	public Supermercado(String nombre, String direccion) {
		this.nombre = nombre;
		this.direccion = direccion;
		productos = new ArrayList<Producto>();
	}

	public int getCantidadDeProductos() {
		return productos.size();
	}

	public void agregarProducto(Producto p) {
		productos.add(p);
	}

	public double getPrecioTotal() {
		double suma = 0;
		for (Producto producto:productos) {
			suma += producto.getPrecio();
		}
		return suma;
	}
}

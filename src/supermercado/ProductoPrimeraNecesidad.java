package supermercado;

public class ProductoPrimeraNecesidad extends Producto {
	
	private int descuento;
	
	public ProductoPrimeraNecesidad(String nombre, double precio, boolean esPrecioCuidado) {
		super(nombre, precio, esPrecioCuidado);
		this.descuento = 10;
	}
	
	public ProductoPrimeraNecesidad(String nombre, double precio) {
		super(nombre, precio);
		this.descuento = 10;
	}
	
	public ProductoPrimeraNecesidad(String nombre, double precio, boolean esPrecioCuidado, int descuento) {
		super(nombre, precio, esPrecioCuidado);
		this.descuento = descuento;
	}
	
	public ProductoPrimeraNecesidad(String nombre, double precio, int descuento) {
		super(nombre, precio);
		this.descuento = descuento;
	}
	
	@Override
	public double getPrecio() {
		return this.precio - (this.precio * this.descuento) / 100;
	}
}
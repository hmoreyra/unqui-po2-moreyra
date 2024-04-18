package supermercado;

import java.util.ArrayList;
import java.util.List;

public class Trabajador {
	
	private List<Ingreso> ingresos;
	
	public Trabajador() {
		ingresos = new ArrayList<Ingreso>();
	}
	
	public double getTotalPercibido() {
		double total = 0;
		for (Ingreso ingreso:ingresos) {
			total += ingreso.montoPercibido(); 
		}
		return total - this.getImpuestoAPagar();
	}
	
	public double getMontoImponible() {
		double monto = 0;
		for (Ingreso ingreso:ingresos) {
			monto += ingreso.montoImponible(); 
		}
		return monto;
	}
	
	public double getImpuestoAPagar() {
		return 0.02 * this.getMontoImponible();
	}
	
	public void agregarIngreso(Ingreso i) {
		this.ingresos.add(i);
	}
}

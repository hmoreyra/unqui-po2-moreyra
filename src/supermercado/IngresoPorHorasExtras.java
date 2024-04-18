package supermercado;

import java.time.Month;

public class IngresoPorHorasExtras extends Ingreso{
	
	public IngresoPorHorasExtras(Month mesDePercepcion, String concepto, double montoPercibido) {
		super(mesDePercepcion, concepto, montoPercibido);
	}

	@Override
	public double montoImponible() {
		return 0;
	}
}

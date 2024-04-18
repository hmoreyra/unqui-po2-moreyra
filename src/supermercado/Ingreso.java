package supermercado;

import java.time.Month;

public class Ingreso {
	
	protected Month mesDePercepcion;
	protected String concepto;
	protected double montoPercibido;
	
	public Ingreso(Month mesDePercepcion, String concepto, double montoPercibido) {
		this.mesDePercepcion = mesDePercepcion;
		this.concepto = concepto;
		this.montoPercibido = montoPercibido;
	}
	
	
    //getters
	public Month getMesDePercepcion() {
		return mesDePercepcion;
	}

	public String getConcepto() {
		return concepto;
	}
	//
	
	public double montoImponible() {
		return montoPercibido;
	}
	
	public double montoPercibido() {
		return montoPercibido;
	}
}

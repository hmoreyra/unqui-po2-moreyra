package supermercado;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.time.Month;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TrabajadorTestCase {
	Ingreso ingreso1;
	Ingreso ingreso2;
	IngresoPorHorasExtras ingreso3;
	Ingreso ingreso4;
	Trabajador pepe;
	
	@BeforeEach
	void setUp() throws Exception {	
		//					       mes   concepto monto
		ingreso1 = new Ingreso(Month.APRIL, "4",   8);
		ingreso2 = new Ingreso(Month.MAY, "5", 10);
		ingreso3 = new IngresoPorHorasExtras(Month.JUNE,"6" ,12);
		ingreso4 = new Ingreso(Month.JULY, "7", 14);
		pepe = new Trabajador();
		pepe.agregarIngreso(ingreso1);
		pepe.agregarIngreso(ingreso2);
		pepe.agregarIngreso(ingreso3);
		pepe.agregarIngreso(ingreso4);
	}

	@Test
	void testImpuestoAPagar() {
		assertEquals(0.64, pepe.getImpuestoAPagar());
	}
	
	@Test
	void testMontoImponible() {
		assertEquals(32, pepe.getMontoImponible());
	}
	
	@Test
	void testTotalPercibido() {
		assertEquals(43.36, pepe.getTotalPercibido());
	}
}

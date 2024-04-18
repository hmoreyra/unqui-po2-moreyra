package tp3;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import ar.edu.unq.po2.tp3.*;

import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Test;

class MultioperadorTestCase {
	
	private Multioperador multioperador = new Multioperador();
	
	@BeforeEach
	void set() {
		ArrayList<Integer> enteros = new ArrayList<Integer>();
		enteros.add(1);
		enteros.add(2);
		enteros.add(3);
		enteros.add(4);
		enteros.add(5);
		enteros.add(6);
		multioperador.setEnteros(enteros);
	}
	
	@Test
	void testSumatoria() {
		int cantidad = multioperador.sumarEnteros();
		assertEquals(cantidad, 21);
	}
	
	@Test
	void testResta() {
		int cantidad = multioperador.restarEnteros();
		assertEquals(cantidad, -19);
	}
	
	@Test
	void testMultiplicacion() {
		int cantidad = multioperador.multEnteros();
		assertEquals(cantidad, 720);
	}
}

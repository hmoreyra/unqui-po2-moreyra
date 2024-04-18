package tp3;

import static org.junit.jupiter.api.Assertions.*;

import ar.edu.unq.po2.tp3.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CuadradoTestCase {
	Cuadrado cuadrado;

	@BeforeEach
	void setUp() throws Exception {
		cuadrado = new Cuadrado(0, 0, 5);
	}

	@Test
	void testEsHorizontal() {
		assertFalse(cuadrado.esHorizontal());
	}
	
	@Test
	void testEsVertical() {
		assertFalse(cuadrado.esVertical());
	}
	
	@Test
	void testEsCuadrado() {
		assertTrue(cuadrado.esCuadrado());
	}
	
	@Test
	void testArea() {
		assertEquals(cuadrado.area(), 25);
	}
	
	@Test
	void testPerimetro() {
		assertEquals(cuadrado.perimetro(), 20);
	}
}

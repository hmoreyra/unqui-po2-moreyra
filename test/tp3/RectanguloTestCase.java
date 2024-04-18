package tp3;

import static org.junit.jupiter.api.Assertions.*;

import ar.edu.unq.po2.tp3.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RectanguloTestCase {
	Rectangulo rec;

	@BeforeEach
	void setUp() throws Exception {
		rec = new Rectangulo(0, 0, 4, 5);
	}

	@Test
	void testEsHorizontal() {
		assertFalse(rec.esHorizontal());
	}
	
	@Test
	void testEsVertical() {
		assertTrue(rec.esVertical());
	}
	
	@Test
	void testArea() {
		assertEquals(rec.area(), 20);
	}
	
	@Test
	void testPerimetro() {
		assertEquals(rec.perimetro(), 18);
	}

}

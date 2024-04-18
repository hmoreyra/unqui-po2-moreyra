package tp3;

import ar.edu.unq.po2.tp3.*;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonaTestCase {
	
	Persona pedro;
	LocalDate fecha;
	
	@BeforeEach
	void setUp() throws Exception {
		fecha = LocalDate.of(2000, 1, 5);
		pedro = new Persona("Pedro", fecha);
	}

	@Test
	void testEdad() {
		assertEquals(pedro.edad(), 24);
	}

}

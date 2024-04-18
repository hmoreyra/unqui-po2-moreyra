package tp3;

import ar.edu.unq.po2.tp3.Counter;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.BeforeEach;

public class CounterTestCase {
	private Counter counter;
	/**
	* Crea un escenario de test básico, que consiste en un contador
	* con 10 enteros
	*
	* @throws Exception
	*/
	@BeforeEach
	public void setUp() throws Exception {
		//Se crea el contador
		counter = new Counter();
		//Se agregan los numeros. 4 pares y 6 impares
		counter.addNumber(1);
		counter.addNumber(3);
		counter.addNumber(5);
		counter.addNumber(7);
		counter.addNumber(9);
		counter.addNumber(2);
		counter.addNumber(1);
		counter.addNumber(12);
		counter.addNumber(8);
		counter.addNumber(4);
	}

	/**
	* Verifica la cantidad de pares
	*/
	@Test
	public void testEvenNumbers() {
		// Getting the even occurrences
		int amount = counter.cantidadDePares();
		// I check the amount is the expected one
		assertEquals(amount, 4);
	}
	
	@Test
	public void testOddNumbers() {
		// Getting the odd occurrences
		int amount = counter.cantidadDeImpares();
		// I check the amount is the expected one
		assertEquals(amount, 6);
	}
	
	@Test
	public void testMultiples() {
		// Getting the multiples of a number
		int amount = counter.cantidadDeMultiplosDe(2);
		// I check the amount is the expected one
		assertEquals(amount, 4);
	}
	
	@Test
	public void testNumeroConMasDigitosPares() {
		ArrayList<Integer> numeros = new ArrayList<>();
		numeros.add(4);
		numeros.add(12);
		numeros.add(24);
		numeros.add(468);
		numeros.add(2);
		numeros.add(3333);
		
		int num = counter.numeroConMasDigitosPares(numeros);
		// I check the amount is the expected one
		assertEquals(num, 468);
	}
	
	@Test
	public void testMultiploMasGrandeEntreCeroYMil() {
		
		int num = counter.multiploMasGrandeEntreCeroYMilDe(43,52);
		// I check the amount is the expected one
		assertEquals(num, -1);
	}
}

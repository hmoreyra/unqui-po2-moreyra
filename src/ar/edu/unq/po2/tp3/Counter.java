package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class Counter {
	
		private ArrayList<Integer> numeros;

		public Counter() {
			this.numeros = new ArrayList<>();
		}

		public void addNumber(int n) {
			this.numeros.add(n);
		}
		
		public int cantidadDePares() {
			int pares = 0;
			for (int numero:numeros) {
				if (numero % 2 == 0){
					pares++;
				}
			}
			return pares;
		}
		
		public int cantidadDeImpares() {
			int impares = 0;
			for (int numero:numeros) {
				if (numero % 2 == 1){
					impares++;
				}
			}
			return impares;
		}
		
		public int cantidadDeMultiplosDe(int n) {
			int multiplos = 0;
			for (int numero:numeros) {
				if (numero % n == 0){
					multiplos++;
				}
			}
			return multiplos;
		}
		
		public int numeroConMasDigitosPares(ArrayList<Integer> numeros) {
			int mejorNumero = 0;
			int mayorCantDigitosPares = 0;
			for (int numero:numeros) {
				int cantDigitosParesNumeroActual = cantidadDeDigitosParesDe(numero);
				
				if (cantDigitosParesNumeroActual > mayorCantDigitosPares){
					 mejorNumero = numero;
					 mayorCantDigitosPares = cantDigitosParesNumeroActual;
				}
			}
			return mejorNumero;
		}
		
		public int cantidadDeDigitosParesDe(int n) {
			int cantDigitosPares = 0;
			int numeroARecorrer = n;
			
			if (n == 0) {
				cantDigitosPares = 1;
			}
			
			while (numeroARecorrer != 0){ // si tiene 1 digito
				if (numeroARecorrer % 10 % 2 == 0) { //compruebo si el ultimo digito es par
					cantDigitosPares++;
				}
				numeroARecorrer = numeroARecorrer / 10;
			}
			return cantDigitosPares;
		}
		
		/*
		 Realice una función que reciba dos valores X e Y, y devuelva el número 
		 más alto entre 0 y 1000, que sea múltiplo simultáneamente de X e Y.
		 Si no existe, devolver -1. Por ejemplo si se ingresa 3 y 9, la función debe
		 devolver 999.
		 */
		public int multiploMasGrandeEntreCeroYMilDe(int x, int y) {
			int multiplo = -1;
			int i = 999;
			while (i > 0 && multiplo == -1) {
				if  (i % x == 0 && i % y == 0) {
					multiplo = i;
				}
				i--;
			}
			return multiplo;
		}
		
}


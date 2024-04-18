package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class Multioperador {
/*Programe la clase Multioperador, que permite aplicar las operaciones de suma,
resta y multiplicación sobre ArrayLists de enteros. 
Es decir, poder sumar todos los números que contiene, poder restar todos los
números que contiene y poder multiplicar a todos los números que contiene entré si.*/
	private ArrayList<Integer> enteros;

	public ArrayList<Integer> getEnteros() {
		return enteros;
	}

	public void setEnteros(ArrayList<Integer> enteros) {
		this.enteros = enteros;
	} 
	
	public int sumarEnteros() {
		int suma = 0;
		for (int entero:this.enteros) {
			suma += entero;
		}
		return suma;
	}
	
	public int restarEnteros() {
		int resta = 0;
		int arraySize = this.enteros.size();
		if (arraySize != 0){
			resta = this.enteros.get(0);
			for (int i = 1; i < arraySize; i++) {
				resta -= this.enteros.get(i);
			}
		}
		return resta;
	}
	
	public int multEnteros() {
		int mult = 1;
		for (int entero:this.enteros) {
			mult *= entero;
		}
		return mult;
	}
	
}

package ar.edu.unq.po2.tp3;
import java.time.LocalDate;

public class Persona {
	String nombre;
	LocalDate fechaDeNacimiento;
	
	public Persona(String nombre, LocalDate fechaDeNacimiento){
		this.nombre = nombre;
		this.fechaDeNacimiento = fechaDeNacimiento;
	}
	
	public int edad(){
		LocalDate fechaActual = LocalDate.now();
        int edad = fechaActual.getYear() - fechaDeNacimiento.getYear();
        if (fechaActual.getDayOfYear() < fechaDeNacimiento.getDayOfYear()) { 
        	edad--;
        }
        return edad;
	}
	
}

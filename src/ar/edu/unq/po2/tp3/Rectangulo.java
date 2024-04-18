package ar.edu.unq.po2.tp3;

public class Rectangulo {
	/*
		Los rectángulos deben tener el siguiente comportamiento:
 		1. Crearse en forma apropiada y asegurando su consistencia.
 		2. Obtener el área
 		3. Obtener el perímetro.
 		4. Determinar si son horizontales o verticales.
	*/
	
	private Point verticeInferiorIzquierdo;
	private int anchura;
	private int altura;
	
	public Rectangulo(int x, int y, int w, int h){
		this.verticeInferiorIzquierdo = new Point(x,y);
		this.anchura = w;
		this.altura = h;
	}
	
	//setters
	/*public void setVerticeInferiorIzquierdo(Point verticeInferiorIzquierdo) {
		this.verticeInferiorIzquierdo = verticeInferiorIzquierdo;
	}

	public void setAnchura(int anchura) {
		this.anchura = anchura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}*/
	//
	
	public boolean esHorizontal() {
		return anchura > altura;
	}
	
	public boolean esVertical() {
		return altura > anchura;
	}
	
	public boolean esCuadrado() {
		return altura == anchura;
	}
	
	public int area() {
		return this.anchura * this.altura;
	}
	
	public int perimetro() {
		return 2 * (this.anchura + this.altura);
	}

}

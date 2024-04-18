package ar.edu.unq.po2.tp3;

public class Point {
	/*
	1. Debe ser posible crearse indicando como referencia los valores x e y
	
	2. También debe ser posible crear un punto directamente sin enviarles parámetros, en este caso el punto
	debe crearse en las coordenadas (0,0).
	
	3. Debe ser posible mover un punto a otra posición.
	
	4. Sumarse con otro punto y como resultado obtener un nuevo punto con las valores de x e y sumados.
	*/
	
	private int x;
	private int y;
	
	public Point(){
		this.x = 0;
		this.y = 0;
	}
	
	public Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
	public void moverPuntoAPosicion(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Point sumarPuntosCon(Point p) {
		return new Point(this.getX() + p.getX(), this.getY() + p.getY());
	}
}

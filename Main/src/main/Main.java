package main;

public class Main
{
	public static void main(String[] args) {
                Circunferencia circulo = new Circunferencia(new Coord());
                
		// Defina y asigne dos objetos, un Cadrado y una Circunferencia
		// Solicite al usuario ingresar el valor de un vector de traslación 
		// Aplique el vector de traslación anterior a cada uno de los objetos referidos
		// Muestre las posiciones originales y finales de cada uno de los objetos referidos
		
	}
}

class Coord {
    private int x, y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    
}

class Cuadrado {
    private Coord c;
    private int lado;
    public Cuadrado(Coord c, int lado) {
        this.c = c;
        this.lado = lado;
    }
    public void Traslacion(Coord t) {  // Complete los parámetros requeridos
        c.setX(t.getX()+c.getX());
        c.setY(t.getY()+c.getY());
    }
    public void Escalado(int s) {  // Complete los parámetros requeridos
        lado = (int)(lado*(1+s/100.0f));
    }
    public void Rotacion(Coord r, angle) {  // Complete los parámetros requeridos
        c.setX();
        c.setY();
    }
}

class Circunferencia {
    Coord c;
    float radio;
    public Circunferencia(Coord c, int radio) {
        this.c = c;
        this.radio = radio;
    }
    // Implementar los métodos Traslacion, Escalado y Rotacion para ésta clase
}
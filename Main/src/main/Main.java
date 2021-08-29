package main;

import static java.lang.Math.*;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
                Scanner leer = new Scanner(System.in);
                int x = leer.nextInt();
                Cuadrado cuadradito = new Cuadrado(new Coord (5,3),5);
                cuadradito.Traslacion(new Coord(x,2));
                
               // double cuadrado;
                
                
                //Circunferencia circulo = new Circun
		// Defina y asigne dos objetos, un Cadrado y una Circunferferencia(new Coord());
                
		// Defina y asigne dos objetos, un Cadrado y una Circunferencia
		// Solicite al usuario ingresar el valor de un vector de traslación 
		// Aplique el vector de traslación anterior a cada uno de los objetos referidos
		// Muestre las posiciones originales y finales de cada uno de los objetos referidos
		
	}
}

class Coord {
    private int x, y;

    public Coord(int x, int y) {
        this.x = x;
        this.y = y;
    }

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

    //public Cuadrado() {
  //  }
    
    public void Traslacion(Coord t) {  // Complete los parámetros requeridos
        c.setX(t.getX()+c.getX());
        c.setY(t.getY()+c.getY());
    }
    public void Escalado(int s) {  // Complete los parámetros requeridos
        lado = (int)(lado*(1+s/100.0f));
    }
    public void Rotacion(Coord r, float angle) {  // Complete los parámetros requeridos
        double d = sqrt(pow(r.getX()-0,2)+pow(r.getY()-0,2));
        
        int x = (int) (d*cos(angle));
        int y = (int) (d*sin(angle));
        
        c.setX(x);
        c.setY(y);
        
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
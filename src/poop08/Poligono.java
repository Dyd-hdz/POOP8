/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop08;

/**
 * Clase abstracta, contiene los metodos para ser utilizados por Triangulo y Cuadrilatero
 * @author Luis Hdz
 */
public abstract class Poligono extends Object {//con abstract el poligono se hace un a clase abstracta

    /**
     * Constructor vacio
     */
    public Poligono() {
    }
    
    /**
     * Metodo abstracto, por tanto no regresa nada
     * @return
     */
    public  abstract int area();
    
    /**
     * Metodo abstracto, por tanto no regresa nada
     * @return 
     */
    public abstract int perimetro();

    /**
     * Metodo sobreescrito toString()
     * @return 
     */
    @Override
    public String toString() {
        return "Poligono{" + '}';
    }
}

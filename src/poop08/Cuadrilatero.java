/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop08;

/**
 * Clase que hereda de la clase abstracta Poligono, contiene los metodo y atributos de un Cuadrilatero
 * @author Luis Hdz
 */
public class Cuadrilatero extends Poligono {
    private int alpha, beta, gamma;
    private int a,b;
    private int base, altura;

    /**
     * Constructor vacio
     */
    public Cuadrilatero() {
    }

    /**
     * Cosntructor lleno
     * @param alpha angulo alpha del cuadrilatero
     * @param beta angulo beta del cuadrilatero
     * @param gamma angulo gamma del cuadrilatero
     * @param a longitud del lado a del cuadrilatero
     * @param b longitud del lado b del cuadrilatero
     * @param base longitud de la base del cuadrilatero
     * @param altura longitud de la altura del cuadrilatero
     */
    public Cuadrilatero(int alpha, int beta, int gamma, int a, int b, int base, int altura) {
        this.alpha = alpha;
        this.beta = beta;
        this.gamma = gamma;
        this.a = a;
        this.b = b;
        this.base = base;
        this.altura = altura;
    }

    /**
     * Metodo get, devuelve el angulo alpha del cuadrilatero
     * @return alpha
     */
    public int getAlpha() {
        return alpha;
    }

    /**
     * Metodo set, modifica el angulo alpha del cuadrilatero
     * @param alpha 
     */
    public void setAlpha(int alpha) {
        this.alpha = alpha;
    }

    /**
     * Metodo get, devuelve el angulo beta del cuadrilatero
     * @return beta
     */
    public int getBeta() {
        return beta;
    }

    /**
     * Metodo set, modifica el angulo beta del cuadrilatero
     * @param beta 
     */
    public void setBeta(int beta) {
        this.beta = beta;
    }

    /**
     * Metodo get, devuelve el angulo gamma del cuadrilatero
     * @return gamma
     */
    public int getGamma() {
        return gamma;
    }

    /**
     * Metodo set, modifica el angulo gamma del cuadrilatero
     * @param gamma 
     */
    public void setGamma(int gamma) {
        this.gamma = gamma;
    }

    /**
     * Metodo get, devuelve el lado a del cuadrilatero
     * @return a
     */
    public int getA() {
        return a;
    }

    /**
     * Metodo set, modifica el lado a del cuadrilatero
     * @param a 
     */
    public void setA(int a) {
        this.a = a;
    }

    /**
     * Metodo get, devuelve el lado b del cuadrilatero
     * @return b
     */
    public int getB() {
        return b;
    }

    /**
     * Metodo set, modifica el lado b del cuadrilatero
     * @param b 
     */
    public void setB(int b) {
        this.b = b;
    }

    /**
     * Metodo get, devuelve la base del cuadrilatero
     * @return base
     */
    public int getBase() {
        return base;
    }

    /**
     * Metodo set, modifica la base del cruadrilatero
     * @param base 
     */
    public void setBase(int base) {
        this.base = base;
    }

    /**
     * Metodo get, devuelve la altura del cuadrilatero
     * @return altura
     */
    public int getAltura() {
        return altura;
    }

    /**
     * Metodo set, modifica la altura del cuadrilatero
     * @param altura 
     */
    public void setAltura(int altura) {
        this.altura = altura;
    }

    /*@Override EStos tambien funciona pero toma en cuenta el metodo de la superclase
    public int perimetro() {
        return super.perimetro(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public int area() {
        return super.area(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }*/
    
    /**
     * Metodo sobreescrito area(), metodo de la clase abstracta Poligono
     * @return base*altura en int
     */
    @Override//calculo del area del cuadrilatero
    public int area(){
      return(int)(base*altura);  
    }
    
    /**
     * Metodo sobreescrito perimetro, metodo de la clase abstracta Poligono
     * @return 2a+2b
     */
    @Override
    public int perimetro(){
        return (int)(2*a+2*b);
    }

    /**
     * Metodo sobreescrito toString()
     * @return 
     */
    @Override
    public String toString() {
        return super.toString()+"Cuadrilatero{" + "alpha=" + alpha + ", beta=" + beta + ", gamma=" + gamma + ", a=" + a + ", b=" + b + ", base=" + base + ", altura=" + altura + '}';
    }
}

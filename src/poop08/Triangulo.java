/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop08;

/**
 * Clase que hereda de la clase abstracta Poligono, contiene los metodo y atributos de un Triangulo
 * @author Luis Hdz
 */
public class Triangulo extends Poligono {
    private int alpha, beta, gamma;
    private float a,b,c;
    private float base, altura;

    /**
     * Constructor vacio
     */
    public Triangulo() {
    }

    /**
     * Constructor lleno
     * @param alpha angulo alpha del triangulo
     * @param beta angulo beta del triangulo
     * @param gamma angulo gamma del triangulo
     * @param a longitud del lado a del trinagulo
     * @param b longitud del lado b del trinagulo
     * @param c longitud del lado c del trinagulo
     * @param base longitud de la base del triangulo
     * @param altura longitud de la altura del triangulo
     */
    //el constructor del triangulo no llega el super debido a que la clase padre no contiene atributos
    public Triangulo(int alpha, int beta, int gamma, float a, float b, float c, float base, float altura) {
        this.alpha = alpha;
        this.beta = beta;
        this.gamma = gamma;
        this.a = a;
        this.b = b;
        this.c = c;
        this.base = base;
        this.altura = altura;
    }

    /**
     * Metodo get, devuelve el angulo alpha del triangulo
     * @return alpha
     */
    public int getAlpha() {
        return alpha;
    }

    /**
     * Metodo set, modifica el angulo alpha del triangulo
     * @param alpha 
     */
    public void setAlpha(int alpha) {
        this.alpha = alpha;
    }

    /**
     * Metodo get, devuelve el angulo beta del triangulo
     * @return beta
     */
    public int getBeta() {
        return beta;
    }

    /**
     * Metodo set, modifica el angulo beta del triangulo
     * @param beta 
     */
    public void setBeta(int beta) {
        this.beta = beta;
    }

    /**
     * Metodo get, devuelve el angulo gamma del triangulo
     * @return gamma
     */
    public int getGamma() {
        return gamma;
    }

    /**
     * Metodo set, modifica el angulo gamma del triangulo
     * @param gamma 
     */
    public void setGamma(int gamma) {
        this.gamma = gamma;
    }

    /**
     * Metodo get, devuelve el lado a del triangulo
     * @return a
     */
    public float getA() {
        return a;
    }

    /**
     * Metodo set, modifica el lado a del triangulo
     * @param a 
     */
    public void setA(float a) {
        this.a = a;
    }

    /**
     * Metodo get, devuelve el lado b del triangulo
     * @return b
     */
    public float getB() {
        return b;
    }

    /**
     * Metodo set, modifica el lado b del triangulo
     * @param b 
     */
    public void setB(float b) {
        this.b = b;
    }

    /**
     * Metodo get, devuelve el lado c del triangulo
     * @return c
     */
    public float getC() {
        return c;
    }

    /**
     * Metodo set, modifica el lado c del triangulo
     * @param c 
     */
    public void setC(float c) {
        this.c = c;
    }

    /**
     * Metodo get, devuelve la base del triangulo
     * @return base
     */
    public float getBase() {
        return base;
    }

    /**
     * Metodo set, modifica la base del triangulo
     * @param base 
     */
    public void setBase(float base) {
        this.base = base;
    }

    /**
     * Metodo get, devuelve la altura del triangulo
     * @return altura
     */
    public float getAltura() {
        return altura;
    }

    /**
     * Metodo set, modifica la altura del triangulo
     * @param altura 
     */
    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    /**
     * Metodo sobreescrito area(), metodo de la clase abstracta Poligono
     * @return base*altura/2 en int
     */
    @Override
    public int area(){
        return (int)(base*altura)/2;//utilizacion del casteo para truncar el valor
    }
    
    /**
     * Metodo sobreescrito perimetro, metodo de la clase abstracta Poligono
     * @return a+b+c
     */
    @Override
    public int perimetro(){
        return (int)(a+b+c);//aqui igual se usa el casteo
    }
    
    /**
     * Metodo sobreescrito toString()
     * @return 
     */
    @Override//siempre que se hereda es necesario agragar sus atributos, el super.toString() aunque no contenga atributos la clase padre
    public String toString() {
        return super.toString()+"Triangulo{" + "alpha=" + alpha + ", beta=" + beta + ", gamma=" + gamma + ", a=" + a + ", b=" + b + ", c=" + c + ", base=" + base + ", altura=" + altura + '}';
    }
}

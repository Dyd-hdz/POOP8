/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop08;

/**
 * Superclase con implemento de la Interface InstrumentoMusical
 * @author Luis Hdz
 */
public class InstrumentoViento extends Object implements InstrumentoMusical {//la herencia solo puede haber un padre, y las interfaces pueden ser muchos
    //todos los metodos abstractos de la interfaces deben de contener la clase a la que esta asociada dicha interface
    /**
     * Constructor vacio
     */
    public InstrumentoViento() {//constructor vacio
    }

    /**
     * Metodo sobreescrito de la Interface InstrumentoMusical, devuelve una cadena
     * @return cadena "Instrumento de viento"
     */
    @Override
    public String tipoInstrumento(){
        return "Instrumento de viento";
    }
    
    /**
     * Metodo sobreescrito de la Interface InstrumentoMusical, devuelve un mensaje
     */
    @Override
    public void tocar() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        System.out.println("Tocar instrumento de viento");
    }

    /**
     * Metodo sobreescrito de la Interface InstrumentoMusical, devuelve un mensaje
     */
    @Override
    public void afinar() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        System.out.println("Afinar instrumetno de viento");
    }

    /**
     * Metodo sobreescrito toString()
     * @return 
     */
    @Override
    public String toString() {
        return "InstrumentoViento{" + '}';
    }
}

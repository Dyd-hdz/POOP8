/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop08;

/**
 * Subclase de InstrumentoViento
 * @author Luis Hdz
 */
public class Flauta extends InstrumentoViento {
    
    /**
     * Metodo sobreescrito de la Interface InstrumentoMusical, devuelve una cadena
     * @return cadena "Flauta"
     */
    @Override
    public String tipoInstrumento(){
        return "Flauta";
    }
}

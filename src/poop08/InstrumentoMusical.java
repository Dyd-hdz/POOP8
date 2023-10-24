/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package poop08;

/**
 * Interface o clase abstracta pura
 * @author Luis Hdz
 */
public interface InstrumentoMusical {//es una interface o contrato, las interfaces son clases abstractas puras, sus metodos son todos abstract
    /**
     * Metodo abstracto, por tanto no regresa nada
     * @return
     */
    void tocar();//en las insterfaces no es necesario especificar el public
    
    /**
     * Metodo abstracto, por tanto no regresa nada
     * @return
     */
    void afinar();
    
    /**
     * Metodo abstracto, por tanto no regresa nada
     * @return
     */
    String tipoInstrumento();
}

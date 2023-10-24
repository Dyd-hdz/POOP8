/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop08;

/**
 * Archivo principal, controladora
 * @author Luis Hdz
 */
public class POOP08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Poligono poligono;//Poligono pol=new Poligono();//clase poligono, al ser una clase abstracta no se puede instanciar
        Triangulo tri= new Triangulo();//clase triangulo
        Cuadrilatero cuadri=new Cuadrilatero();//clase cuadrilatero
        
        tri.setBase(5);//inicializacion de datos del triangulo
        tri.setAltura(3);
        
        cuadri.setBase(4);//inicializacion de datos del cuadrilatero
        cuadri.setAltura(6);
        
        //System.out.println(pol);//como no es un objeto no se puede imprimir
        System.out.println(tri);
        System.out.println(cuadri);
        System.out.println(tri.area());
        System.out.println(cuadri.area());
        System.out.println("");
        
        poligono=new Triangulo();//podemos tener un triangulo dentro de un poligono, debido a que triangulo es un poligono, en poligono se guarda los parametros del triangulo
        System.out.println(poligono);//aqui imprimimos indirectamente el triangulo por medio del poligono
        //System.out.println(poligono.getBase());//el poligono solo puede almacenar o referenciar a lo que conoce, por tanto los metodos no los puede ejecutar
        getPoligono(poligono);//se compara con el metodo static getpoligono, se compara si el poligono almacena a un triangulo o rectangulo
        System.out.println("");
        
        poligono=new Cuadrilatero();//ahora aqui se esta almacenando a un cuadrilatero dentro del poligono
        getPoligono(poligono);//se compara con el metodo static getpoligono, se compara si el poligono almacena a un triangulo o rectangulo//se compara con el metodo static getpoligono, se compara si el poligono almacena a un triangulo o rectangulo
        System.out.println("");
        
        Flauta flauta=new Flauta();
        System.out.println(flauta.tipoInstrumento());//tipo de instrumento es un metodo sobreescrito viene de la interface InstrumentoMusical y tambien en InstrumetnoViento, que se heredan en Flauta
        System.out.println("");
        
        System.out.println(Math.PI);
        System.out.println("");
        
        System.out.println(Meses.NOMBRE_MESES[Meses.UNO]);//se ocupa una interface para los meses que es una arreglo y el indice es un entero, ambos deben de ser en mayusculas para que sea un dato final
        System.out.println(Meses.NOMBRE_MESES[Meses.SIETE]);
    }

    private static void getPoligono(Poligono poligono) {//metodo static para la comparacion de clases
        if(poligono instanceof Triangulo){//comparacion de clases, poligono con Triangulo, instanceof permite identificar de que tipo de clase se trata
            System.out.println("Es un triangulo");//como un triangulo se guardo en el poligono entonces es correcto que sea un triangulo
        }else if(poligono instanceof Cuadrilatero){//comparacion de clases, poligono con cuadrilatero
            System.out.println("Es un cuadrilatero");//como un cuadrilatero se guardo en el poligono entonces es correcto que sea un cuadrilatero
        }else{//si el poligono no es ni triangulo ni cuadrilatero entonces
            System.out.println("Es un poligono");
        }
    }    
}

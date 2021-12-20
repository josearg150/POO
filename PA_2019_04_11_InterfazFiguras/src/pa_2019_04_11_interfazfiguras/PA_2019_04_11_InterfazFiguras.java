/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa_2019_04_11_interfazfiguras;

/**
 *
 * @author aa517
 */
public class PA_2019_04_11_InterfazFiguras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circulo vicioso = new Circulo(12);
        Rectangulo puerta = new Rectangulo(90,210);
        Triangulo amoroso = new Triangulo(8, 12, 15);
        
        System.out.println("vicioso ->"+vicioso.area()+"   "+vicioso.perimetro());
        System.out.println("Puerta ->"+puerta.area()+"   "+puerta.perimetro());
        System.out.println("Amoroso ->"+amoroso.area()+"   "+amoroso.perimetro());
        System.out.println("///////////////////////////////////////////");
        mostrar(vicioso);
        mostrar(puerta);
        mostrar(amoroso);
        
        IFiguraPlana fuentes = new Triangulo(3,4,5);
        
    }
     
    public static void mostrar(IFiguraPlana fig){
           System.out.println("Area = "+fig.area());  
           System.out.println("Perimetro = "+fig.perimetro());
    }
}    


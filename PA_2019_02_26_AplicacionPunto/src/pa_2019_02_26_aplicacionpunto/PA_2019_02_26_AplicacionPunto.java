/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa_2019_02_26_aplicacionpunto;

import pa_2019_27_aplicaciontriangulo.Punto;

/**
 *
 * @author aa506
 */
public class PA_2019_02_26_AplicacionPunto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Punto a = new Punto(3,5);
        
        
        Punto b = new Punto();
        b.setX(-4);
        b.setY(-2);
    
        Punto c = a.medio(b);
        
        Punto d = new Punto(a);
        Punto e = a;
        System.out.println("Distancia de a: "+a.distancia(b));
        System.out.println("Distancia de b: "+b.distancia(a));
        
        System.out.println("Punto medio de a y b: "+a.medio(b));
        System.out.println("Punto medio de c y a"+c.medio(a));
        System.out.println("D" +d);
        System.out.println("E"+e);
    }
    
}

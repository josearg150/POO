/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa_2019_04_10_numerocompuesto;

/**
 *
 * @author aa517
 */
public class PA_2019_04_10_NumeroCompuesto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      //  NumeroCompuesto nc = new NumeroCompuesto(2,5);
        Punto p  = new Punto(-4,9);
        Fraccion f = new Fraccion(7,5);
        Complejo c = new Complejo(-3,2);
        NumeroCompuesto c2 = new Complejo(8,-3);
        
      //System.out.println(nc.desplegar());
        System.out.println(p.desplegar());
        System.out.println(f.desplegar());
        System.out.println(c.desplegar());
        System.out.println(c2.desplegar());
        System.out.println();
        System.out.println(p.mostrar());
        System.out.println(f.mostrar());
        System.out.println(c.mostrar());
        System.out.println(c2.mostrar());
        
        NumeroCompuesto []numeros = new NumeroCompuesto[4];
        numeros[0] = c2;
        numeros[1] = c;
        numeros[2] = f;
        numeros[3] = p;
        
        System.out.println();
        
        for(NumeroCompuesto n:numeros)
            System.out.println(n.mostrar()+"       "+n.desplegar());
    }
    
}

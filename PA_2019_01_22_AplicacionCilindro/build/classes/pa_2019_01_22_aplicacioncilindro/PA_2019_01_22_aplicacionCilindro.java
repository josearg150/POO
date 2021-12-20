/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa_2019_01_22_aplicacioncilindro;

import java.util.Scanner;

/**
 *
 * @author aa529
 */
public class PA_2019_01_22_aplicacionCilindro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radio, altura , area, volumen;
        System.out.print("Ingrese el radio del cilindro: ");
        radio = sc.nextDouble();
        System.out.print("Ingrese la altura: ");
        altura = sc.nextDouble();
           
        volumen = Math.PI * Math.pow(radio, 2) * altura;
        area = 2 * Math.PI * radio * (radio+altura);
        
        System.out.println("El volumen del cilindro es: "+String.format("%.2f", volumen));
        System.out.println("El área del cilindro es: "+String.format("%.2f", area));
    }
    
}

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
public class AplicacionFuncion {
     
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double radio, altura , area, volumen;
        System.out.print("Ingrese el radio de la lata: ");
        radio = sc.nextDouble();
        System.out.print("Ingrese la altura de la lata: ");
        altura = sc.nextDouble();
        
        volumen = volumenCilindro(radio, altura);
        area = areaCilindro(radio, altura);
        
        System.out.println("El volumen de la lata es: "+String.format("%.2f", volumen));
        System.out.println("El área de la lata es: "+String.format("%.2f", area));
        
        System.out.println("Ingrese el radio del bote de pintura: ");
        double radioLitro = sc.nextDouble();
        System.out.println("Ingrese la altura de bote de pintura: ");
        double alturaLitro = sc.nextDouble();
        
        System.out.println("Volumen litro de pintura: "+volumenCilindro(radioLitro, alturaLitro));
        
        System.out.println();
        System.out.println("Volumen del tanque: "+volumenCilindro(30, 71));
        
     }
    public static double volumenCilindro(double radio, double altura){
        double volumen=0;
        volumen = Math.PI * Math.pow(radio, 2) * altura;
        return volumen;
    }
    public static double areaCilindro(double radio, double altura){
        return 2 * Math.PI * radio * (radio+altura);
    }
}

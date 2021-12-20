 /* To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa_2019_01_24_aplicacionarreglo;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author aa514
 */
public class PA_2019_01_24_AplicacionArreglo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el número de elementos: "); 
        int n = sc.nextInt();
        int []datos = new int[n];
        
        Random azar = new Random();
        int i = 0;
        //Salida///////////////////////////////
        for (i = 0; i < datos.length; i++) {
            datos[i] = azar.nextInt(1000);
            System.out.println((i+1)+" -> "+datos[i]);
        }
        //Suma////////////////////////////////////////
        int suma=0;
        for(i = 0; i < datos.length; i++)
            suma += datos[i];
        
        double promedio = suma/(datos.length*1.0);
        
        System.out.println("Suma: "+suma);
        System.out.println("Promedio: "+promedio);
        
        /////Posicion//////////////////////
        int mayor = datos[0];
        int menor = datos[0];
        int posicionMayor = 0;
        int posicionMenor = 0;
        
        for(i = 1; i < datos.length; i++){
            if(datos[i] > mayor){
                mayor = datos[i];
                posicionMayor = i;
            }
            if(datos[i] < menor){
                menor = datos[i];
                posicionMenor = i;
            }
        }
        
        System.out.println("Mayor: "+mayor);
        System.out.println("Menor: "+menor);
        
        for (i = 0; i < datos.length; i++){
            System.out.print((i+1)+" -> "+datos[i]);
            if(i == posicionMayor)
                System.out.println(" <- Mayor");
            else 
                if(i == posicionMenor)
                    System.out.println(" <- Menor");
                else
                    System.out.println();
                            
        }
        //Ordenamiento con salida//
        Arrays.sort(datos);
        
        System.out.println("\nDatos ordenados ascendente:\n");
        for (i = 0; i < datos.length; i++) 
            System.out.println((i+1)+" -> "+datos[i]);
        
        System.out.println("\nDatos ordenados descendente:\n");
        for (i = datos.length-1; i >= 0; i--) 
            System.out.println((i+1)+" -> "+datos[i]);
    }
    
}

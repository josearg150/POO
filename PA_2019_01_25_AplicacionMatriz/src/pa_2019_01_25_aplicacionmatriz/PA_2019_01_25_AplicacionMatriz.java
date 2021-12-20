/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa_2019_01_25_aplicacionmatriz;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author aa510
 */
public class PA_2019_01_25_AplicacionMatriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random azar = new Random();
        
        System.out.print("Número de renglones: ");
        int ren = sc.nextInt();
        System.out.print("Número de columnas: ");
        int col = sc.nextInt();
        
        int  [][]datos = new int[ren][col];
        
        int r,c;
        for(r=0; r< datos.length; r++){
            for(c=0; c< datos[0].length; c++){
                datos[r][c] = 10+azar.nextInt(90);
            }
        }
        
        mostrarMatriz(datos);
        /*for(r=0; r< datos.length; r++){
            for(c=0; c< datos[0].length; c++){
                System.out.print(" "+datos[r][c]+" |");
                    
            }
            System.out.println();
        }
        */
        ////Arreglo bidimensional a unidimensional
        int []copia = new int[datos.length*datos[0].length];
        
        int i=0;
        for(r=0; r< datos.length; r++){
            for(c=0; c< datos[0].length; c++){
                copia[i] = datos[r][c];
                i++;
            }
        }
        Arrays.sort(copia);
        
        i=0;
        for(r=0; r< datos.length; r++){
            for(c=0; c< datos[0].length; c++){
                datos[r][c] = copia[i];
                i++;
            }
        }
            
        //ORDENAMIENTO/////////
        System.out.println("\nDatos ordenados\n");
        
        for(r=0; r< datos.length; r++){
            for(c=0; c< datos[0].length; c++){
                System.out.print(" "+datos[r][c]+" |");
                    
            }
            System.out.println();
        }
        
            
        
    }
    
    public static void mostrarMatriz(int [][]arreglo){
        for(int r=0; r< arreglo.length; r++){
            for(int c=0; c< arreglo[0].length; c++){
                System.out.print(" "+arreglo[r][c]+" |");
                    
            }
            System.out.println();
        }
}
 
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa_2019_05_07_aplicacionarchivotexto;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aa526
 */
public class LecturaArchivo {
    public static void main(String []args){
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("¿Cuál es el nombre del archivo?");
        String archivo = teclado.next();
        
        try {
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);
            String nombre = br.readLine();
            System.out.print("Alumno: "+nombre+"\n");
            
            int n = Integer.parseInt( br.readLine() );
            
            double suma = 0;
            int calif;
            for (int i = 1; i <= n; i++) {
                calif = Integer.parseInt( br.readLine() );
                System.out.println(calif);
                suma += calif;
            }
            double prom = suma / n;
            
            System.out.println("\nPromedio = "+prom);
            
            br.close();
            fr.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LecturaArchivo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(LecturaArchivo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

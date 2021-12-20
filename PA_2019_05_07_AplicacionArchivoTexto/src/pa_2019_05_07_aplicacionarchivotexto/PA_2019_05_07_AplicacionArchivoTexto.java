package pa_2019_05_07_aplicacionarchivotexto;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aa526
 */
public class PA_2019_05_07_AplicacionArchivoTexto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("¿Como se va a llamar el archivo?");
        String archivo = teclado.nextLine();
        
        teclado = new Scanner(System.in);
        
        System.out.print("¿Como se llama el alumno?");
        String nombre = teclado.nextLine();
        
        System.out.print("¿Cuantas calificaciones va a tener el alumno?");
        int n = teclado.nextInt();
        
        int[]calif = new int[n];
        
        for (int i = 0; i < calif.length; i++) {
            System.out.print("Calificación "+(i+1)+":");
            calif[i] = teclado.nextInt();
        }
        
        try {
            //Se crean los flujos para grabar (se abren los archivos)
            FileWriter fw = new FileWriter(archivo);
            PrintWriter pw = new PrintWriter(fw);
            
            pw.println(nombre);
            pw.println(n);
            
            for (int i = 0; i < calif.length; i++) {
                pw.println(calif[i]);
            }
            //Cerramos el flujo( cerramos el archivo)
            pw.close();
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(PA_2019_05_07_AplicacionArchivoTexto.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        
    }
    
}

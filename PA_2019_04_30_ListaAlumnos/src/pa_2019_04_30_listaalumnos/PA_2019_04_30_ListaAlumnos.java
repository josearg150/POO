/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa_2019_04_30_listaalumnos;

import java.util.Arrays;

/**
 *
 * @author aa530
 */
public class PA_2019_04_30_ListaAlumnos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Alumno  []grupo = {
                           new Alumno("Juan", 21, 68.5),
                           new Alumno("María", 18, 87.3),
                           new Alumno("Laura", 20, 91.4),
                           new Alumno("Pedro", 21, 59.6),
                           new Alumno("Adrian", 17, 71.0),
                           new Alumno("Luis", 23, 85.9),
                           new Alumno("Diana", 22, 90.2)
                           };
        
        Arrays.sort(grupo);
        
        for(Alumno x:grupo)
            System.out.println(x);
        

    }
    
}

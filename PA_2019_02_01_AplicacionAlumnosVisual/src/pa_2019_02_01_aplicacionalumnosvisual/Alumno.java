/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa_2019_02_01_aplicacionalumnosvisual;

/**
 *
 * @author aa512
 */
public class Alumno {
    //Atributos
    private String nombre;
    private int asistencias;
    private int tareas;
    private int proyectos;
    private int examen;
    
  
    //Constructores
    public Alumno(){
        asistencias = 0;
        tareas = 0;
        proyectos = 0;
        examen = 0;
        nombre = "NO-ID";
    }
    public Alumno(String nom, int asist, int tar, int proy, int exam){
        nombre = nom;
        asistencias = asist;
        tareas = tar;
        proyectos = proy;
        examen = exam;
        
    }
    public Alumno(Alumno a){//Constructor para copiar
        nombre = a.nombre;
        asistencias = a.asistencias;
        tareas = a.tareas;
        proyectos = a.proyectos;
        examen = a.examen;   
    }
    
    //get/set
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nom){
        nombre = nom;
    }
    
    public int getAsistencias(){
        return asistencias;
    }
    public void setAsistencias(int asis){
        if (asis < 0)
            asistencias = asis*(-1);
        else
             asistencias = asis;
    }
    
    public int getTareas(){
        return tareas;
    }
    public void setTareas(int tar){
        tareas = Math.abs(tar);
    }
    
    public int getProyectos(){
        return proyectos;
    }
    public void setProyectos(int proy){
        proyectos = Math.abs(proy);
    }
    
    public int getExamen(){
        return examen;
    }
    public void setExamen(int exam){
        examen = Math.abs(exam);
    }
    
    @Override
    public String toString(){
        return nombre+ " " +
                " Asist: "+asistencias+
                " Tareas: "+tareas+
                " Proyectos: "+proyectos+
                " Examen: "+examen;
    }
    
    //Metodos de proceso 
    public double calificacion(){
        return asistencias * 0.06 + tareas * 0.12 + proyectos * 0.22 +
                examen * .60;
    }
    
}

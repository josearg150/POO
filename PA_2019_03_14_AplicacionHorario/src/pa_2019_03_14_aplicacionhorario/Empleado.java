/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa_2019_03_14_aplicacionhorario;

/**
 *
 * @author aa530
 */
public class Empleado {
    private String nombre;
    private Horario entrada;
    private Horario salida;
    
    public Empleado(){
        nombre="Noid";
        entrada = new Horario();
        salida = new Horario();
    }
    public Empleado(String nom, Horario ent, Horario sal){
        nombre = nom;
        entrada = new Horario(ent);
        salida = new Horario(sal);
    }
    
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nom){
        nombre = nom;
    }
    
    public Horario getEntrada(){
        return entrada;
    }
    public void setEntrada(Horario ent){
        entrada = new Horario(ent);
    }
    
    public Horario getSalida(){
        return salida;
    }
    public void setSalida(Horario sal){
        salida = new Horario(sal);
    }
    
    public Horario tiempoTrabajado(){
        return salida.resta(entrada);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa_2019_02_18_aplicacionnomina;

/**
 *
 * @author aa514
 */
public class Empleado {
    private String nombre;
    private int diasTrabajados;
    private double sueldoDiario;
    private int horasExtra;
    private double porcentajeImpuesto;
    //Constructores
    public Empleado(){
        nombre = "Noid";
        diasTrabajados = 0;
        sueldoDiario = 0;
        horasExtra = 0;
        porcentajeImpuesto = 0;
    }
    public Empleado(String nom, int diasTrab, double sueDia, int horExt, double porcImp){
        nombre = nom;
        diasTrabajados = diasTrab;
        sueldoDiario = sueDia;
        horasExtra = horExt;
        porcentajeImpuesto = porcImp;
    }
    //Metodos get/set
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nom){
        nombre = nom;
    }
    
    public int getDiasTrabajados(){
        return diasTrabajados;
    }
    public void setDiasTrabajados(int diasTrab){
        diasTrabajados = diasTrab;
    }
    
    public double getSueldoDiario(){
        return sueldoDiario;
    }
    public void setSueldoDiario(double sueDia){
        sueldoDiario = sueDia;
    }
    
    public int getHorasExtra(){
        return horasExtra;
    }
    public void setHorasExtra(int horExt){
        horasExtra = horExt;
    }
    
    public double getPorcentajeImpuesto(){
        return porcentajeImpuesto;
    }
    public void setPorcentajeImpuesto(double porcImp){
        porcentajeImpuesto = porcImp;
    }
    
    public String toString(){
        return nombre + 
                " \nDias Trabajados: "+diasTrabajados+
                " \nSueldo Diario: "+sueldoDiario+
                " \nHoras Extra: "+horasExtra+
                " \n%Impuesto: "+porcentajeImpuesto;
    }
    
    //Metodos de proceso
    public double sueldoParcial(){
        return diasTrabajados * sueldoDiario;
    } 
    public double importeHorasExtras(){
        return sueldoDiario / 8 * horasExtra * 2;
    }
    public double sueldoBruto(){
        return sueldoParcial() + importeHorasExtras();
    }
    public double importeImpuesto(){
        return sueldoBruto() * porcentajeImpuesto/100;
    }
    public double sueldoNeto(){
        return sueldoBruto() - importeImpuesto();
    }
    public double sueldo(){
        return sueldoBruto() - importeImpuesto();
       
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa_2019_03_14_aplicacionhorario;

/**
 *
 * @author aa524
 */
public class Horario {
    private int horas;
    private int minutos;
    private int segundos;
    
    public Horario(){
        horas = 0;
        minutos = 0;
        segundos = 0;
    }
    public Horario(int h, int m, int s){
        horas = h;
        minutos = m;
        segundos = s;
    }
    public Horario(Horario h){
        horas = h.horas;
        minutos = h.minutos;
        segundos = h.segundos;
    }
    public int getHoras(){
        return horas;
    }
    public void setHoras(int h){
        horas = h;
    }
    public int getMinutos(){
        return minutos;
    }
    public void setMinutos(int m){
        minutos = m;
    }
    public int getSegundos(){
        return segundos;
    }
    public void setSegundos(int s){
        segundos = s;
    }
    
    public String toString(){
        return horas + "h:"+minutos+"m:"+segundos+"s";
    }
    
    public int segundosTotales(){
        return horas * 3600 + minutos * 60 + segundos;
    }
    public Horario suma(Horario h){
        int segTot = segundosTotales() + h.segundosTotales();
        
        int hor = segTot / 3600; //Div
        int restoSeg = segTot % 3600;//Mod 
        int min = restoSeg / 60;//Div
        int seg = restoSeg % 60;
        
        return new Horario(hor,min,seg);
    }
    
    public Horario resta(Horario h){
        int segTot = segundosTotales() - h.segundosTotales();
        
        int hor = segTot / 3600; //Div
        int restoSeg = segTot % 3600;//Mod 
        int min = restoSeg / 60;//Div
        int seg = restoSeg % 60;
        
        return new Horario(hor,min,seg);
    }
    public boolean mayor(Horario h){
        return segundosTotales() > h.segundosTotales();
    }
}

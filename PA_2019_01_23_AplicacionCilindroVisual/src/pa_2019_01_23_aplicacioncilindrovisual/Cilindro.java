/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa_2019_01_23_aplicacioncilindrovisual;

/**
 *
 * @author aa527
 */
public class Cilindro {
   //Atributos
    private double radio;
    private double altura;
   
   //Constructores
    public Cilindro(){
        radio = 0;
        altura = 0;
    }
    public Cilindro(double r, double h){
        radio = r;
        altura = h;
    }
    
    //Constructor de copia 
    public Cilindro(Cilindro c){
        radio = c.radio;
        altura = c.altura;
    }
    
   //Metodos get/set
    public double getRadio(){
        return radio;
    }
    public void setRadio(double r){
        radio = r;
    }
    
    public double getAltura(){
        return altura;
    }
    public void setAltura(double h){
        altura = h;
    }
    
    @Override 
    public String toString(){
        return "Radio:"+radio+" Altura:"+altura;
    }
   //Metodos de proceso o cálculo
    public double volumen(){
        return Math.PI * Math.pow(radio,2) * altura;
    }
    public double area(){
    return 2 * Math.PI * radio * (radio + altura);
    }
}

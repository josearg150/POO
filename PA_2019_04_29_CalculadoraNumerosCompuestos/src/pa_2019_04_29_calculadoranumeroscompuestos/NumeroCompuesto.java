/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa_2019_04_29_calculadoranumeroscompuestos;

/**
 *
 * @author aa517
 */
public abstract class NumeroCompuesto{
    private int valor1;
    private int valor2;
    
    public NumeroCompuesto(){
    valor1 = 0;
    valor2 = 0;
}
    public NumeroCompuesto(int val1, int val2){
        valor1 = val1;
        valor2 = val2;
    }

    protected int getValor1() {
        return valor1;
    }

    protected void setValor1(int valor1) {
        this.valor1 = valor1;
    }

    protected int getValor2() {
        return valor2;
    }

    protected void setValor2(int valor2) {
        this.valor2 = valor2;
    }
    
    public String desplegar(){
        return "{"+valor1+","+valor2+"}";
    }
    
    public abstract String mostrar();
        
    
    
}

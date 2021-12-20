/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa_2019_05_03_aplicacionpila;

/**
 *
 * @author aa525
 */
public class PilaGenerica <T> {//T significa template
    private T []datos;
    private int tope;

    public PilaGenerica() {
        datos = (T[])new Object[10];
        tope = -1; //Pila vacía 
    }

    public PilaGenerica(int n) {
       if(n < 1 )
           n = 10;
       
       datos = (T[])new Object[n];
       tope = -1;
    }
   
    public boolean estaVacia(){
       return tope == -1;
    } 
    
    public boolean estaLlena(){
        return tope == datos.length -1;
    }
    
    public void poner(T x){
        if(!estaLlena()){
            tope++;
            datos[tope] = x;
        }      
    }
    
    public T quitar(){
        if(!estaVacia()){
            tope--;
            return datos[tope+1];
        }
        else
            return null;           
    }
    
    public int getCapacidad(){
        return datos.length;
    }
    
    @Override
    public String toString(){
        String cad = "{";
        
        for (int i = 0; i <= tope; i++) {
            cad += datos[i];
            if(i < tope)
                cad += ",";
        }
        cad += "}";
        
        return cad;
    }
}

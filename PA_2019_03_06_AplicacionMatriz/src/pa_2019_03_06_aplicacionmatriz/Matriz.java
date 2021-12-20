/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa_2019_03_06_aplicacionmatriz;

/**
 *
 * @author aa535
 */
public class Matriz {
    //Atributos
    private double [][] datos;
    //constructores
    //por defecto
    public Matriz(){
        datos = new double[1][1];
    }
    //dimension definida por usuario
    public Matriz(int ren, int col){
        if(ren > 0 && col >0)
        datos = new double[ren][col];
        else
            datos = new double[1][1];
    }
    //dimension definida por otro arreglo
    public Matriz(double [][]d){
        datos = new double[d.length][d[0].length];
        for(int r = 0; r < d.length ; r++)
            for(int c = 0; c < d[0].length; c++)
                    datos[r][c] = d[r][c];
    }
    
    //métodos get/set
    public int getRenglones(){
        return datos.length;
    }
    public int getColumnas(){
        return datos[0].length;
    }
    public void setValor(double valor, int ren, int col){
        if(ren >=0 && ren < getRenglones() /**/ && col >= 0 && col < getColumnas() )
            datos[ren][col] = valor;
    }
    public double getValor(int ren, int col){
        if(ren >=0 && ren < getRenglones() /**/ && col >= 0 && col < getColumnas() ) 
           return datos[ren][col];
        
        return 0;
    }
    public void mostrar(){
       for(int r = 0; r < getRenglones() ; r++) 
       {           
            for(int c = 0; c < getColumnas(); c++)
                    System.out.print(datos[r][c]+" |");
            
            System.out.println();
       }  
        System.out.println();
    }
    public Matriz suma(Matriz m){
        //Este metodo involucra 3 objetos de la clase matriz
        //1.-El que manda llamar al metodo (this)
        //2.-El que llega como parametro 
        //3.-El que se regresa como resultado de sumar this m
        
        if(getRenglones() != m.getRenglones() || getColumnas() != m.getColumnas()) 
            return new Matriz();
        
        //Si se pueden sumar las matrices 
        Matriz resultante = new Matriz(getRenglones(),getColumnas());
        
   
        for(int r = 0 ; r < getRenglones() ; r++)
            for(int c = 0; c < getColumnas() ; c++)
                resultante.setValor(this.getValor(r, c) + m.getValor(r, c), r, c);
            
        return resultante;
    }
    
    public Matriz multiplicacion(double escalar){
        Matriz resultante = new Matriz(getRenglones(),getColumnas());
        
        for(int r = 0 ; r < getRenglones() ; r++)
            for(int c = 0; c < getColumnas() ; c++)
                resultante.setValor(getValor(r, c) * escalar, r, c);
        return resultante;
    }

    public Matriz resta(Matriz m){
        //Este metodo involucra 3 objetos de la clase matriz
        //1.-El que manda llamar al metodo (this)
        //2.-El que llega como parametro 
        //3.-El que se regresa como resultado de restar this m
       
      return suma(m.multiplicacion(-1));
    }       
    public Matriz multiplicacion(Matriz m){
        //Este metodo involucra 3 objetos de la clase matriz
        //1.-El que manda llamar al metodo (this)
        //2.-El que llega como parametro 
        //3.-El que se regresa como resultado de multiplicar this m        
        if(getColumnas() != m.getRenglones() )
            return new Matriz();
        
        Matriz resultante = new Matriz(getRenglones(),m.getColumnas());
        double suma;
        for(int r = 0 ; r < resultante.getRenglones(); r++)
            for(int c = 0 ; c < resultante.getColumnas(); c++){
                suma = 0;
                for(int k = 0; k < getColumnas() ; k++)
                    suma += getValor(r, k) * m.getValor(k, c); 
                resultante.setValor(suma, r, c);
            }        
        return resultante;
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa_2019_05_03_aplicacionpila;

/**
 *
 * @author aa527
 */
public class Automovil {
    String marca;
    int modelo;

    public Automovil(String marca, int modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
    
    
    @Override
   public String toString(){
       return marca+" "+modelo;
   }
}

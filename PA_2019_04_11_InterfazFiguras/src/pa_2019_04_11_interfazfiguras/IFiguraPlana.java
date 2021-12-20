/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa_2019_04_11_interfazfiguras;

/**
 *
 * @author aa517
 */
public interface IFiguraPlana {
    public static final double PI = 3.141592654; //un atributo será public, static y final (constante)
    public abstract double area();//En una interfaz todos los métodos son 
    double perimetro();//publicos y abstractos, aunque no se declaren asi
  
    
}

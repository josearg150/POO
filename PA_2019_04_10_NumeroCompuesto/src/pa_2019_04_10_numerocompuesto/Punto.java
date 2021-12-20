/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa_2019_04_10_numerocompuesto;

/**
 *
 * @author aa517
 */
public class Punto extends NumeroCompuesto {
    public Punto(){
        super();
    }
    public Punto(int x,int y){
        super(x,y);
    }
    public int getX(){
       return super.getValor1();
    }
    public int getY(){
        return super.getValor2();
    }
    public void setX(int x){
        setValor1(x);
    }
    public void setY(int y){
        setValor2(y);
    }

    @Override
    public String mostrar() {
        return "("+getX()+","+getY()+")";
    }
    
}

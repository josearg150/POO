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
public class Fraccion extends NumeroCompuesto{
    public Fraccion(){
        super();
    }
    public Fraccion(int num,int den){
        super(num,den);
    }
    public int getNum(){
        return getValor1();
    }
    public int getDen(){
        return getValor2();
    }
    public void setNum(int num){
        setValor1(num);
    }
    public void setDen(int den){
        setValor2(den);
    }
    public String desplegar(){
        return "[["+getNum()+","+getDen()+"]]";
    }

    @Override
    public String mostrar() {
        return getNum()+" / "+getDen();
    }
    
}

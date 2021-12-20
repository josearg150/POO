/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa_2019_02_07_aplicacionproducto;

/**
 *
 * @author aa527
 */
public class Producto {
    //Atributos
    private String descripcion;
    private double costo;
    private double margenUtilidad;
    private double porcDescuento;
    private double porcImpuesto;
    
    //Constructores
    public Producto(){
        descripcion = "NA";
        costo = 0;
        margenUtilidad = 0;
        porcDescuento = 0;
        porcImpuesto = 0;
    }
    public Producto(String desc, double costo, double margUt, double porcDesc, double porcImp){
       descripcion = desc;
       this.costo = costo;
       margenUtilidad = margUt;
       porcDescuento = porcDesc;
       porcImpuesto = porcImp;
    }
    public Producto(Producto p){
       descripcion = p.descripcion;
       costo = p.costo;
       margenUtilidad = p.margenUtilidad;
       porcDescuento = p.porcDescuento;
       porcImpuesto = p.porcImpuesto; 
    }
    
    //Metodos set/get
    public void setDescripcion(String desc){
         descripcion = desc;
    }
    public String getDescripcion(){
        return descripcion;
    }
    
    public void setCosto(double costo){
        this.costo = costo;
    }
    public double getCosto(){
        return costo;
    }
    
    public void setMargenUtilidad(double margUt){
        margenUtilidad = margUt;
    }
    public double getMargenUtilidad(){
        return margenUtilidad;
    }
    
    public void setPorcDescuento(double porcDesc){
        porcDescuento = porcDesc;
    }
    public double getPorcDescuento(){
        return porcDescuento;
    }
    
    public void setPorcImpuesto(double porcImp){
        porcImpuesto = porcImp; 
    }
    public double getPorcImpuesto(){
        return porcImpuesto;
    }
    
    @Override
    public String toString(){
        return descripcion +" \nCosto:"+costo+
                            " \nMargUt:"+margenUtilidad+"%"+
                            " \nPorc.Desc:"+porcDescuento+"%"+
                            " \nPorc.Impuesto:"+porcImpuesto+"%";
    }
    
    //Metodos de proceso
    public double importeUtilidad(){
        return costo * margenUtilidad/100;
    }
    public double subTotal1(){
        return costo + importeUtilidad();
    }
    public double importeDescuento(){
        return subTotal1() * porcDescuento/100;
    }
    public double subTotal2(){
        return subTotal1() - importeDescuento();
    }
    public double importeImpuesto(){
        return subTotal2() * porcImpuesto/100;
    }
    public double precio(){
        return subTotal2() + importeImpuesto();
    }
    
    /*public double precio(){
     * double importeUtilidad = costo * margenUtilidad /100;
       double subTot1 = costo + importeUtilidad;
       double importeDescuento = subTot1 * porcDescuento/100;
       double subTot2 = subTot1 - importeDescuento;
       double importeImpuesto = subTot2 * porcImpuesto /100;
       double precioFinal = subTot2 + importeImpuesto;
       
       return precioFinal;
    }
    */
}

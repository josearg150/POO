/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa_2019_05_02_listaproductos;

import java.util.Arrays;

/**
 *
 * @author aa525
 */
public class PA_2019_05_02_ListaProductos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Producto []inventario = {
                                new Producto("Coca", 54, 13.5),
                                new Producto("Leche", 12, 20),
                                new Producto("Pan bimbo", 8, 30),
                                new Producto("Galletas", 25, 40),
                                new Producto("Nieve", 32, 50),
                                new Producto("Papas", 48, 15),
                                new Producto("Café", 34, 19)
                                };
        
        mostrar(inventario, "Sin ordenar");
        Producto.setTipoOrdenamiento(0);
        Arrays.sort(inventario);
        mostrar(inventario, "Ordenado por existencia");
        
        Producto.setTipoOrdenamiento(1);
        Arrays.sort(inventario);
        mostrar(inventario, "Ordenado por precio");
        
        Producto.setTipoOrdenamiento(2);
        Arrays.sort(inventario);
        mostrar(inventario, "Ordenado por descripción");        
        
    }
    public static void mostrar(Producto []inv, String mensaje){
        System.out.println(mensaje+"\n");
        
        for (Producto p : inv) {
                System.out.println(p);
        }
        
        System.out.println();
    }
    
}

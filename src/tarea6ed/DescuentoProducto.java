/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea6ed;

/**
 *
 * @author ROCIO
 */
public class DescuentoProducto {
    public void aplicarDescuento(double precioProducto, int numProductos){     
        double Total;
        double DESCUENTOMINIMO=0.95;
        double DESCUENTOMAYOR=0.8;
        if(numProductos>3) 
            precioProducto-=5;
        
        if (numProductos!=0){
            Total = precioProducto*DESCUENTOMAYOR;
            mostrarTotalAPagar (Total);
        }
        else {
            Total = precioProducto*DESCUENTOMINIMO;
            mostrarTotalAPagar (Total);
        }
        
    } 
    private void mostrarTotalAPagar (double Total){
        System.out.println("El total a pagar es:"+Total);
        System.out.println("Enviado");
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea6edclase;

/**
 *
 * @author USER
 */
public class EDTarea6 {

    public void aplicarDescuento(double precioProducto, int numProductos) {
        double total;
        if (numProductos > LIMITE_DESCUENTO) {
            precioProducto -= 5;
        }
        if (numProductos > 50) {
            total = precioProducto * DESCUENTO_PREMIUM;
            mostrarTotal(total);
        } else {
            total = precioProducto * DESCUENTO_BASICO;
            mostrarTotal(total);
        }

    }
    private static final int LIMITE_DESCUENTO = 3;
    private static final double DESCUENTO_BASICO = 0.95;
    private static final double DESCUENTO_PREMIUM = 0.8;

    private void mostrarTotal(double total) {
        System.out.println("El total a pagar es:" + total);
        System.out.println("Enviado");
    }

}

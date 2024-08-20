/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facturacion;

/**
 *
 * @author Robinson Mosquera
 */
public class Visa extends Tarjeta {
    public Visa(String numCuenta, double valorApertura, String mes){
        super(numCuenta, valorApertura, mes);
    }

    @Override
    public double cuotaDeManejo() {
        Descuento descuento = Descuento.tipoDescuento("Diamante");
        double resultado = descuento.ejecutar(this.cuotaDeManejo());
        return resultado;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package facturacion;

/**
 *
 * @author Robinson Mosquera
 */
public enum Descuento {
    Basico{
        @Override
        public double ejecutar(double valor) {
            double descuento = valor - (valor*0.11);
            return descuento;
        }
    },
    Platino{
        @Override
        public double ejecutar(double valor) {
            double descuento = valor - (valor*0.15);
            return descuento;
        }
    },
    Diamante{
        @Override
        public double ejecutar(double valor) {
            double descuento = valor - (valor*0.18);
            return descuento;
        }
    };   
    public abstract double ejecutar(double valor);
    public static Descuento tipoDescuento(String tipo){
        switch(tipo){
            case "Basico":
                return Basico;
            case "Platino":
                return Platino;
            case "Diamante":
                return Diamante;
            default:
                throw new IllegalArgumentException("Tipo de operacion no valida");
        }
    }
    
}

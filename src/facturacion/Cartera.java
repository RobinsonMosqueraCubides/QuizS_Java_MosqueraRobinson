/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facturacion;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 *
 * @author Robinson Mosquera
 */
public class Cartera implements PatronCartera{
    private String anho;
    private List<Tarjeta> tarjetas;

    public Cartera(String anho) {
        this.anho = anho;
    }

    public String getAnho() {
        return anho;
    }

    public List<Tarjeta> getTarjetas() {
        return tarjetas;
    }

    public void setAnho(String anho) {
        this.anho = anho;
    }

    public void setTarjetas(List<Tarjeta> tarjetas) {
        this.tarjetas = tarjetas;
    }
    
    @Override
    public void imprimirListaDeTarjetas() {
        System.out.println(tarjetas);
    }

    @Override
    public void agregarTarjeta(Tarjeta t) {
        tarjetas.add(t);
    }
    
}

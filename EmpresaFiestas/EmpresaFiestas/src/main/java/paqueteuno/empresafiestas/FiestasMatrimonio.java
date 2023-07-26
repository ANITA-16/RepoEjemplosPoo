/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteuno.empresafiestas;

/**
 *
 * @author busta
 */
public class FiestasMatrimonio extends TiposEventos {

    private double costodesonido;
    private double costodelaiglesia;
    private double costodelpastel;
    private int numerodepersonasasistentes;
    private double valorunitariodelplatoprincipal;
    private double costototal;

    public FiestasMatrimonio(double costodesoni, double costodelaigle,
            double costodelpas, int numerodepersonasasis,
            double valorunitariodelplatoprin,
            int dia_, String mes_, int anio_, String tipoeve) {
        super(dia_, mes_, anio_, tipoeve);
        costodesonido = costodesoni;
        costodelaiglesia = costodelaigle;
        costodelpastel = costodelpas;
        numerodepersonasasistentes = numerodepersonasasis;
        valorunitariodelplatoprincipal = valorunitariodelplatoprin;
    }

    public double obtenerCostototal() {
        return costototal;
    }

    public void establecerCostototal() {
        if (numerodepersonasasistentes >= 200) {
            double total = costodelaiglesia + costodelpastel
                    + costodesonido + valorunitariodelplatoprincipal;
            double descuento = total * 0.15;
            costototal = total - descuento;
        }
    }

    public double obtenerCostodesonido() {
        return costodesonido;
    }

    public void establecerCostodesonido(double x) {
        costodesonido = x;
    }

    public double obtenerCostodelaiglesia() {
        return costodelaiglesia;
    }

    public void establecerCostodelaiglesia(double x) {
        costodelaiglesia = x;
    }

    public double obtenerCostodelpastel() {
        return costodelpastel;
    }

    public void establecerCostodelpastel(double x) {
        costodelpastel = x;
    }

    public int obtenerNumerodepersonasasistentes() {
        return numerodepersonasasistentes;
    }

    public void establecerNumerodepersonasasistentes(int x) {
        numerodepersonasasistentes = x;
    }

    public double obtenerValorunitariodelplatoprincipal() {
        return valorunitariodelplatoprincipal;
    }

    public void establecerValorunitariodelplatoprincipal() {
        valorunitariodelplatoprincipal = valorunitariodelplatoprincipal * numerodepersonasasistentes;
    }

    @Override
    public void calcularPagoTotal() {
        total = costototal;
    }

}

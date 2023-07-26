/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteuno.empresafiestas;

/**
 *
 * @author busta
 */
public class FiestasInfantiles extends TiposEventos {

    private double costoAnimacion;
    private double costototalPicadas;
    private double costoDiscoMovil;
    private int edaddelninio;

    public FiestasInfantiles(double costoAni, double costototalPi,
            double costoDiscoMo, int edaddelni, int dia_,
            String mes_, int anio_, String tipoeve) {
        super(dia_, mes_, anio_, tipoeve);
        costoAnimacion = costoAni;
        costototalPicadas = costototalPi;
        costoDiscoMovil = costoDiscoMo;
        edaddelninio = edaddelni;
    }

    public double obtenerCostoAnimacion() {
        return costoAnimacion;
    }

    public void establecerCostoAnimacion() {
        if (edaddelninio <= 5) {
            costoAnimacion = (costoAnimacion * 0.30) - costoAnimacion;
        }
    }

    public double obtenerCostototalPicadas() {
        return costototalPicadas;
    }

    public void establecerCostototalPicadas() {
        if (edaddelninio <= 5) {
            costototalPicadas = (costototalPicadas * 0.40) - costototalPicadas;
        }
        
    }

    public double obtenerCostoDiscoMovil() {
        return costoDiscoMovil;
    }

    public void establecerCostoDiscoMovil(double x) {
        costoDiscoMovil = x;
    }

    public int obtenerEdaddelninio() {
        return edaddelninio;
    }

    public void establecerEdaddelninio(int x) {
        edaddelninio = x;
    }

    @Override
    public void calcularPagoTotal() {
        total = costoAnimacion+costoDiscoMovil+costototalPicadas;
   }

}

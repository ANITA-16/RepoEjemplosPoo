/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteuno.empresafiestas;

/**
 *
 * @author busta
 */
public abstract class  TiposEventos {
    protected String tipoevento;
    protected int dia;
    protected String mes;
    protected int anio;
    protected double total;

    public TiposEventos(int dia_, String mes_, int anio_, String tipoeve) {
        dia = dia_;
        mes = mes_;
        anio = anio_;
        tipoevento = tipoeve;
    }

    public int obtenerDia() {
        return dia;
    }

    public void establecerDia(int x) {
        dia = x;
    }

    public String obtenerMes() {
        return mes;
    }

    public void establecerMes(String x) {
        mes = x;
    }

    public int obtenerAnio() {
        return anio;
    }

    public void establecerAnio(int x) {
        anio = x;
    }

    public String getTipoevento() {
        return tipoevento;
    }

    public void setTipoevento(String x) {
        tipoevento = x;
    }
    
    public abstract void calcularPagoTotal();

    @Override
    public String toString() {
        String x = String.format("evento %s\n"
                + "dia: %s\n"
                + "mes: %s\n"
                + "año: %s\n"
                + "total a pagar: %.2f",tipoevento,
                dia,mes,anio,total );
        return x;
    }
    
}

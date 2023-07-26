/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteuno.empresafiestas;

/**
 *
 * @author busta
 */
public class FiestasGraduacion extends TiposEventos {

    private double valorcadacopadevino;
    private double valordecadarecuerdo;
    private double valordeplatoprincipal;
    private int numerodeasistentes;

    public FiestasGraduacion(double valorcadacopadevi, double valordecadarecuer,
            double valordeplatoprin, int numerodeasis, int dia_, String mes_,
            int anio_, String tipoeve) {
        super(dia_, mes_, anio_, tipoeve);
        valorcadacopadevino = valorcadacopadevi;
        valordecadarecuerdo = valordecadarecuer;
        valordeplatoprincipal = valordeplatoprin;
        numerodeasistentes = numerodeasis;
    }

    public double obtenerValorcadacopadevino() {
        return valorcadacopadevino;
    }

    public void establecerValorcadacopadevino() {
        if (obtenerMes() == "enero") {
            valorcadacopadevino = (valorcadacopadevino * 0.1) + valorcadacopadevino;
        } else {
            if (obtenerMes() == "marzo") {
                valorcadacopadevino = (valorcadacopadevino * 0.1) + valorcadacopadevino;
            } else {
                if (obtenerMes() == "agosto") {
                    valorcadacopadevino = (valorcadacopadevino * 0.1) + valorcadacopadevino;
                } else {
                    if (obtenerMes() == "diciembre") {
                        valorcadacopadevino = (valorcadacopadevino * 0.1) + valorcadacopadevino;
                    }
                }
            }
        }
    }

    public double obtenerValordecadarecuerdo() {
        return valordecadarecuerdo;
    }

    public void establecerValordecadarecuerdo() {
        if (obtenerMes() == "enero") {
            total = (valordecadarecuerdo * 0.30) - valordecadarecuerdo;
            valordecadarecuerdo = total * numerodeasistentes;
        } else {
            if (obtenerMes() == "marzo") {
                total = (valordecadarecuerdo * 0.30) - valordecadarecuerdo;
                valordecadarecuerdo = total * numerodeasistentes;
            } else {
                if (obtenerMes() == "agosto") {
                    total = (valordecadarecuerdo * 0.30) - valordecadarecuerdo;
                    valordecadarecuerdo = total * numerodeasistentes;
                } else {
                    if (obtenerMes() == "diciembre") {
                        total = (valordecadarecuerdo * 0.30) - valordecadarecuerdo;
                        valordecadarecuerdo = total * numerodeasistentes;
                    }
                }
            }
        }
    }

    public double obtenerValordeplatoprincipal() {
        return valordeplatoprincipal;
    }

    public void establecerValordeplatoprincipal() {
        valordeplatoprincipal = valordeplatoprincipal * numerodeasistentes;
    }

    public int obtenerNumerodeasistentes() {
        return numerodeasistentes;
    }

    public void establecerNumerodeasistentes(int x) {
        numerodeasistentes = x;
    }

    @Override
    public void calcularPagoTotal() {
        total = valorcadacopadevino + valordecadarecuerdo + valordeplatoprincipal;
    }

}

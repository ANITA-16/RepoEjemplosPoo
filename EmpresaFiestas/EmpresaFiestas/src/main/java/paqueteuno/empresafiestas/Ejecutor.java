/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteuno.empresafiestas;

/**
 *
 * @author busta
 */
public class Ejecutor {
    
    
    public static void main(String[] args) {
    FiestasInfantiles infantil = new FiestasInfantiles(1500, 500, 
            600, 6, 18, "enero", 2023,
            "Evento de tipo infantil");
        System.out.println("Tipos de eventos");
        infantil.establecerCostototalPicadas();
        infantil.establecerCostoAnimacion();
        infantil.calcularPagoTotal();
        System.out.println(infantil);
    FiestasMatrimonio matri = new FiestasMatrimonio(15, 700,
            900, 300, 8, 25,
            "agosto", 2023, "evento de tipo boda");
        matri.establecerCostototal();
        matri.establecerValorunitariodelplatoprincipal();
        matri.calcularPagoTotal();
        System.out.println(matri);
    FiestasGraduacion graduacion = new FiestasGraduacion(5,
            15, 7, 600,
            10, "agosto", 2023, "evento de Graduacion");
        graduacion.establecerValorcadacopadevino();
        graduacion.establecerValordecadarecuerdo();
        graduacion.establecerValordeplatoprincipal();
        graduacion.calcularPagoTotal();
        System.out.println(graduacion);
        
    }
    
    
    
}

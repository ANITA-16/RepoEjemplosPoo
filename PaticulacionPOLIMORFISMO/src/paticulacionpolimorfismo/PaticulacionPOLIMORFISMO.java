/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paticulacionpolimorfismo;


import java.util.ArrayList;
import java.util.Arrays;

abstract class Estudiante{
    public String nombre;
    public String materias[];
    public double costoMtricula;

    public Estudiante() {}
    public Estudiante(String nombre, String[] materias) {
        this.nombre = nombre;
        this.materias = materias;}
    
    public abstract void calcularCostoMtricula();

    @Override
    public String toString() {
        return "Estudiante{" + "nombre=" + nombre + ", materias=" + Arrays.toString(materias) + ", costoMtricula=" + costoMtricula + '}';
    }

}



class EstudiantePresencial extends Estudiante{
    public int creditoMateria;
    public double costoCredito;
    public double beca;

    public EstudiantePresencial() {
    }

    public EstudiantePresencial(int creditoMateria, double costoCredito, double beca, String nombre, String[] materias) {
        super(nombre, materias);
        this.creditoMateria = creditoMateria;
        this.costoCredito = costoCredito;
        this.beca = beca;
    }
    public void calcularCostoMtricula(){
        this.creditoMateria = (this.creditoMateria * this.materias.length);
        this.costoMtricula = (this.creditoMateria * this.costoCredito) - 
                (this.creditoMateria * this.costoCredito)*(this.beca/100) ;
    }

    @Override
    public String toString() {
        return super.toString() + "EstudiantePresencial{" + "creditoMateria=" + creditoMateria + ", costoCredito=" + costoCredito + ", beca=" + beca + '}';
    }
    
}



class EstudianteAbierta extends Estudiante{
    public double costoMateria, descuento;
    public String tipoPago;

    public EstudianteAbierta() {
    }

    public EstudianteAbierta(double costoMateria, String tipoPago, String nombre, String[] materias) {
        super(nombre, materias);
        this.costoMateria = costoMateria;
        this.tipoPago = tipoPago;
    }
    
    public void calcularCostoMtricula() {
        this.costoMtricula = (this.costoMateria * this.materias.length);
        this.descuento = (this.costoMateria * this.materias.length) * 0.05;
        if (this.tipoPago.equals("Contado")) {
            this.costoMtricula= ((this.costoMateria * this.materias.length) - this.descuento);
        }
    }

    @Override
    public String toString() {
        return super.toString() + "EstudianteAbierta{" + "costoMateria=" + costoMateria + ", descuento=" + descuento + ", tipoPago=" + tipoPago + '}';
    }
    
}


public class PaticulacionPOLIMORFISMO{
    public static void main(String[] args) {
        ArrayList <Estudiante> estudiante = new ArrayList<Estudiante>();
        Estudiante estudiante1 = new EstudiantePresencial(2,100,10,"Crlos",new String[] {"POO","Estructuras"});
        Estudiante estudiante2 = new EstudianteAbierta(150,"creditos", "David",new String[] {"POO","Estructuras"} );
        
        estudiante.add(estudiante1);
        estudiante.add(estudiante2);
        for (Estudiante est: estudiante){
            System.out.println(est);
        }

    }
    
}
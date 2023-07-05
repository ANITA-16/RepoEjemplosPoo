//solid=>SRP
package Paq_SRP;
import java.util.ArrayList;
import java.util.List;
class Persona{
    public String nombre;
    public int edad;
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    public double calcularPromedioEdades(ArrayList<Persona> listaPersonas) {
        double sumatoria = 0;
        for (Persona persona : listaPersonas) {
            sumatoria += persona.edad;
        }
        return sumatoria / listaPersonas.size();
    }
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
               '}';
    }
}
public class TestPersona_SP {
    public static void main(String[] args) {
        ArrayList<Persona> listaPersona=new ArrayList<>(List.of(new Persona("Isaac",23),
                                                                new Persona("Paul",24),
                                                                new Persona("david",21)));
        for (Persona persona: listaPersona)
            System.out.println(persona);

        System.out.println(listaPersona.get(2).nombre);
        System.out.println(listaPersona.get(1).calcularPromedioEdades(listaPersona));
        System.out.println(listaPersona.get(2).calcularPromedioEdades(listaPersona));
    }
}

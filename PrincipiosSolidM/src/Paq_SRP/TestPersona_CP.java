package Paq_SRP;

import java.util.ArrayList;
import java.util.List;
class PersonaCP {
    public String nombre;
    public int edad;

    public PersonaCP(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "PersonaCP{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
}
class calculoPromedioEdad{
    public double calcularPromedioEdades(ArrayList<PersonaCP> listaPersonas) {
        double sumatoria = 0;
        for (PersonaCP persona : listaPersonas) {
            sumatoria += persona.edad;
        }
        return sumatoria / listaPersonas.size();
    }
}


public class TestPersona_CP {
    public static void main(String[] args) {
        ArrayList<PersonaCP> listaPersona=new ArrayList<>(List.of(new PersonaCP("Isaac",23),
                new PersonaCP("Paul",24),
                new PersonaCP("david",21)));
        for (PersonaCP persona: listaPersona)
            System.out.println(persona);
        System.out.println((new calculoPromedioEdad()).calcularPromedioEdades(listaPersona));

    }
}

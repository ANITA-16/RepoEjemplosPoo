
package herencia;
/*

class Empleado {
    public String nombres;
    private double sueldo;
    public double horas;
    public double costoHoras;
    
    public Empleado() { }

    public Empleado(String nombres, double horas, double costoHoras) {
        this.nombres = nombres;
        this.horas = horas;
        this.costoHoras = costoHoras;
    }
    
    public void calcularSueldo(){
        this.sueldo = this.horas * this.costoHoras;
    }
    public void setSueldo(double sueldo){
        this.sueldo = sueldo;
    }
    public double getSueldo() {
        return sueldo;
    }
}

class Gerente extends Empleado {
    public String departamento;
    public String secretaria;
    public Gerente() { }
    public Gerente(String departamento, String secretaria) {
        this.departamento = departamento;
        this.secretaria = secretaria;
    }
    public Gerente(String departamento, String secretaria,
                   String nombres, double sueldo) {
        super(nombres, sueldo);
        this.departamento = departamento;
        this.secretaria = secretaria;
    }
    @Override
    public String toString(){
        return String.format("Nombres: %s \nSueldo: %.2f \n"
                        + "Depatamento: %s \nSecretaria: %s"
                ,this.nombres, this.getSueldo(),
                this.departamento, this.secretaria);
    }
}

class Operario extends Empleado {
    public Operario() { }
    public Operario(double horasLaboradas, String nombres,
                    double horas, double costoHoras) {
        super(nombres, horas, costoHoras);
        this.horasLaboradas = horasLaboradas;
    }
    public void setSueldo(double horasLaboradas, double costoHora){
        this.horasLaboradas = horasLaboradas;
        this.costoHora = costoHora;
        this.setSueldo(this.horasLaboradas * this.costoHora);
    }
    
    public void calcularSueldo(){
    }
    
    
    @Override
    public String toString(){
        return String.format("Nombres: %s \nSueldo: %.2f \n"
                        + "Horas Laboradas: %.2f \n"
                        + "Costo por hora: %.2f"
                ,this.nombres, this.getSueldo(),
                this.horasLaboradas,
                this.costoHora);
    }
}

public class TestEmpleadoGerentOperar{
    public static void main(String[] args) {
        //Valida si el sueldo es mayor a cero para inicializar la variable.a
        Gerente gerente1 = new Gerente("Comput. y Elect.",
                "Laydi Sanmartin", "Juan Carrion" ,100);
        Operario operario1 = new Operario(46.50,
                "Maria Vilareal" ,200);
        operario1.setSueldo(80, 20);
        System.out.println("GERENTE 1\n=========\n"+gerente1);
        System.out.println("\nOPERARIO 1\n==========\n"+operario1);

    }
}
*/
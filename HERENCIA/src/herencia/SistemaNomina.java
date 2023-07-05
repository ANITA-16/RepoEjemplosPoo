
package herencia;

public class SistemaNomina {  
    public static void main(String[] args) {
        Empleado.setJornada(8);
        Empleado.setValorExtra(3);
        
        Gerente gerente1 = new Gerente("Cris","cota","agusto",4,7);
        Operario operario1 = new Operario("David",10,3);
        
        gerente1.calcularSueldo();
        operario1.calcularSueldo();
        System.out.println(gerente1);
        System.out.println(operario1);
                
    }
}


class Empleado{
    public String nombreEmp;
    private double sueldo;
    public double horas, costoHoras;
    static double jornada;
     static double valorExtra;

    public Empleado() {}

    public Empleado(String nombreEmp, double horas, double costoHoras) {
        this.nombreEmp = nombreEmp;
        this.horas = horas;
        this.costoHoras = costoHoras;
    }
    
    public void calcularSueldo(){
        this.sueldo = this.horas * this.costoHoras;
    }

    public static void setJornada(double jornada) {
        Empleado.jornada = jornada;
    }

    public static void setValorExtra(double valorExtra) {
        Empleado.valorExtra = valorExtra;
    }
    
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
    
    @Override
    public String toString() {
        return "Empleado{" + "nombreEmp=" + nombreEmp + ", sueldo=" + sueldo + ", horas=" + horas + ", costoHoras=" + costoHoras + '}';
    }
}

class Gerente extends Empleado{
    public String secrretaria,departamento;

    public Gerente() {}
    public Gerente(String secrretaria, String departamento, String nombreEmp, double horas, double costoHoras) {
        super(nombreEmp, horas, costoHoras);
        this.secrretaria = secrretaria;
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Empleado{" +super.toString()+ '}' +
                "Empleado{\" +super.toString()+ '}Gerente{" + "secrretaria=" + secrretaria + ", departamento=" + departamento + '}';
    }
    
    
    
}


class Operario extends Empleado{
    public double horasExtras;
    
    public Operario() {}
    public Operario(String nombreEmp, double horas, double costoHoras) {
        super(nombreEmp, horas, costoHoras);
    }

    @Override
    public String toString() {
        return "Operario{" + super.toString() + '}';
    }
    
    @Override
    public void calcularSueldo(){
        if(this.horas > jornada){
            this.horasExtras = this.horas - jornada;
            this.setSueldo((this.horas*this.costoHoras)+(this.horasExtras *(valorExtra*this.costoHoras)));     
        }else{
            super.calcularSueldo();
        }
    }
    
}
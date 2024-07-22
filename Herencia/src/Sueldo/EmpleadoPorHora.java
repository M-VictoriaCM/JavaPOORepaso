package Sueldo;

public class EmpleadoPorHora extends Empleado{
    private double extra;
    private int horas;
    public EmpleadoPorHora(int numeroEmpleado, String nombre, String apellido, double sueldo) {
        super(numeroEmpleado, nombre, apellido, sueldo);
        this.extra = extra;
        this.horas = horas;
    }

    public EmpleadoPorHora(int numeroEmpleado, String nombre, String apellido, double sueldo, double extra, int horas) {
        super(numeroEmpleado, nombre, apellido, sueldo);
        this.extra = extra;
        this.horas = horas;
    }

    public double getExtra() {
        return extra;
    }

    public void setExtra(double extra) {
        this.extra = extra;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }
    public double montoExtra(){
        return this.getExtra()*this.getHoras();
    }

    @Override
    public double getSueldo() {
        return super.getSueldo() + this.montoExtra();
    }

    @Override
    public String toString() {
        return super.toString()+"\n"+
                "Extra: "+this.getExtra()+"\n"+
                "Horas: "+this.getHoras()+"\n"+
                "Monto extra: "+this.montoExtra();
    }
}

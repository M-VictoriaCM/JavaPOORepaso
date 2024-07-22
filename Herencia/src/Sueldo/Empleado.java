package Sueldo;

public class Empleado {
    private int numeroEmpleado;
    private String nombre;
    private String apellido;
    private double sueldo;

    public Empleado(int numeroEmpleado, String nombre, String apellido, double sueldo) {
        this.numeroEmpleado = numeroEmpleado;
        this.nombre = nombre;
        this.apellido = apellido;
        this.sueldo = sueldo;
    }

    public int getNumeroEmpleado() {
        return numeroEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String toString(){
        return "Empleado:["+"\n"+
                "N°: "+this.getNumeroEmpleado()+"\n"+
                "Apellido: "+this.getApellido()+"\n"+
                "Nombre: "+ this.getNombre()+"\n"+
                "Sueldo Semanal: "+ this.getSueldo()+"\n"+"]";
    }
}

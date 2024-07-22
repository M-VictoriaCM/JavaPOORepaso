package FacturacionDeEmplados;

public class Empleado {
    private String nombre;
    private String apellido;
    private int dni;
    private double sueldoMensual;

    public Empleado(String nombre, String apellido, int dni, double sueldoMensual) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.sueldoMensual = sueldoMensual;
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

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public double getSueldoMensual() {
        return sueldoMensual;
    }

    public void setSueldoMensual(double sueldoMensual) {
        this.sueldoMensual = sueldoMensual;
    }

    public String toString(){
        return "Empleado"+"\n"+
                "Nombre: "+this.getNombre()+"\n"+
                "Apellido: "+ this.getApellido()+"\n"+
                "DNI: "+this.getDni()+"\n"+
                "Sueldo Mensual: "+this.getSueldoMensual()+"\n";
    }
}

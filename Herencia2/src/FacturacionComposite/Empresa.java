package FacturacionComposite;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private  String nombre;
    private List<Empleado>empleados;

    public Empresa(String nombre) {
        this.nombre = nombre;
        this.empleados= new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void addEmpleado(Empleado nuevo){
        empleados.add(nuevo);
    }
    public int sumaTotal(){
        int total = 0;
        for(Empleado e: empleados){
            total += e.getSueldoMensual();
        }
        return total;
    }
}

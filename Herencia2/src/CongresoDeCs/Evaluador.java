package CongresoDeCs;

import java.util.ArrayList;
import java.util.List;

public class Evaluador {
    private String nombre;
    private List<String> conocimientos;
    private List<Trabajo>trabajoAsignados;

    public Evaluador(String nombre) {
        this.nombre = nombre;
        this.conocimientos = new ArrayList<>();
        this.trabajoAsignados = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public boolean tieneConocimientos(String conocimiento){
        return conocimientos.contains(conocimiento);
    }
    public void addConocimiento(String nuevo){
        if(!tieneConocimientos(nuevo)){
            this.conocimientos.add(nuevo);
        }
    }
    public void deleteConocimiento(String nuevo){
        this.conocimientos.remove(nuevo);
    }

    public boolean esApto(Trabajo trabajo) {
        return trabajo.puedeEvaluarlo(this);
    }
    public void addTrabajo(Trabajo trabajo){
        if(esApto(trabajo)){
            this.trabajoAsignados.add(trabajo);
        }
    }
    public int cantidadDeTrabajosAsignados(){
        return trabajoAsignados.size();
    }
}

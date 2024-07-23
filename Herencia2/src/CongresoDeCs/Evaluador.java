package CongresoDeCs;

import java.util.ArrayList;
import java.util.List;

public class Evaluador {
    private String nombre;
    private List<String> conocimientos;
    private Trabajo trabajo;

    public Evaluador(String nombre) {
        this.nombre = nombre;
        this.conocimientos = new ArrayList<>();
        this.trabajo = trabajo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Trabajo getTrabajo() {
        return trabajo;
    }

    public void setTrabajo(Trabajo trabajo) {
        this.trabajo = trabajo;
    }

    public boolean tieneConocimiento(String conocimiento) {
        return conocimientos.contains(conocimiento);
    }

    public void addConocimiento(String nuevo) {
        if (!tieneConocimiento(nuevo)) {
            conocimientos.add(nuevo);
        }
    }

    public boolean esApto(Trabajo trabajo) {
        if(trabajo.getCategoria().equalsIgnoreCase("Poster")) {
            for (String palabras : this.conocimientos) {
                if (trabajo.tienePalabraClave(palabras)) {
                    return true;
                }
            }
            return  false;
        }else{
            for (String palabras : this.conocimientos) {
                if (!trabajo.tienePalabraClave(palabras)) {
                    return false;
                }
            }
            return  true;
        }
    }
    public boolean trabajoAsignado(){
        return this.getTrabajo() !=null;
    }

}
package SombreroSeleccionador;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Casa {
    private String nombre;
    private int cantidadMaximaAlumno;
    private List<String> cualidadesRequeridas;
    private List<Alumno>alumnos;

    public Casa(String nombre, int cantidadMaximaAlumno) {
        this.nombre = nombre;
        this.cantidadMaximaAlumno = cantidadMaximaAlumno;
        this.cualidadesRequeridas= new ArrayList<>();
        this.alumnos= new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadMaximaAlumno() {
        return cantidadMaximaAlumno;
    }
    public void setCantidadMaximaAlumno(int cantidadMaximaAlumno) {
        this.cantidadMaximaAlumno = cantidadMaximaAlumno;
    }

    public boolean tieneCualidadRequerida(String cualidad){
        return cualidadesRequeridas.contains(cualidad);
    }
    public void addACualidadesRequeridas(String cualidadNueva){
        if(!tieneCualidadRequerida(cualidadNueva)){
            cualidadesRequeridas.add(cualidadNueva);
        }
    }
    public int cantidadDeAlumnos(){
        return alumnos.size();
    }
    public boolean tieneAlumno(Alumno nuevo){
        return alumnos.contains(nuevo);
    }
    public boolean hayLugar(){
        return cantidadDeAlumnos()<= this.cantidadMaximaAlumno;
    }
    public boolean poseeTodasLasCualidades(Alumno alumno){
        for(String cualidad: this.cualidadesRequeridas){
            if(!alumno.tieneCualidades(cualidad)){
                return false;
            }
        }
        return true;
    }
    public boolean esAdmitido(Alumno a){
        if(hayLugar() && poseeTodasLasCualidades(a) && !(a.tieneCasa())) {
            return true;
        }
        return false;
    }
    public void addAlumnosNuevos(Alumno nuevo){
        if(esAdmitido(nuevo)){
            alumnos.add(nuevo);
            nuevo.setCasa(this);
        }
    }
    public boolean equals(Object obj){
        try{
            Casa otra =(Casa)obj;
            return this.getNombre().equals(otra.getNombre()) &&
                    this.getCantidadMaximaAlumno() == otra.getCantidadMaximaAlumno();
        }catch (Exception err){
            System.out.println(err);
        }
        return false;
    }

}

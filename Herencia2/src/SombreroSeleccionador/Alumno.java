package SombreroSeleccionador;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Alumno {
    private int idAlumno;
    private String nombre;
    private Casa casa;
    private List<String> cualidadesPoseidas;
    private List<Alumno> familiaresQueAsisten;

    public Alumno(int idAlumno,String nombre) {
        this.idAlumno = idAlumno;
        this.nombre = nombre;
        this.casa=casa;
        this.cualidadesPoseidas= new ArrayList<>();
        this.familiaresQueAsisten= new ArrayList<>();
    }

    public int getIdAlumno() {
        return idAlumno;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Casa getCasa() {
        return casa;
    }
    public void setCasa(Casa casa) {
        this.casa = casa;
    }

    public void addCualidades(String nueva){
        cualidadesPoseidas.add(nueva);
    }
    public boolean tieneFamiliar(Alumno familiar){
        return familiaresQueAsisten.contains(familiar);
    }
    public void addFamiliares(Alumno nuevo){
        if(!tieneFamiliar(nuevo)){
            familiaresQueAsisten.add(nuevo);
        }
    }
    public boolean familiarEnCasa(CasaLinajePuro casaFamiliar){
        for(Alumno familiar : this.familiaresQueAsisten){
            if(familiar.tieneCasa() && familiar.getCasa().equals(casaFamiliar)) {
               return true;
            }
        }
        return false;
    }
    public boolean tieneCasa(){
        return this.getCasa() !=null;
    }

    public boolean tieneCualidades(String cualidad) {
        return this.cualidadesPoseidas.contains(cualidad.toLowerCase());
    }
}

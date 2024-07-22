package SombreroSeleccionador;

import java.util.Vector;

public class CasaEnemiga extends Casa{
    private Vector<Casa>casaEnemigas;
    public CasaEnemiga(String nombre, int cantidadMaximaAlumno) {
        super(nombre, cantidadMaximaAlumno);
        this.casaEnemigas = new Vector<>();
    }
    public void addCasaEnemigas(Casa nueva){
        this.casaEnemigas.add(nueva);
    }
    public boolean controlDeAdmision(Alumno a){
        for(Casa casaEn: casaEnemigas){
            if(casaEn.esAdmitido(a)){
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean esAdmitido(Alumno a) {
        return super.esAdmitido(a) && controlDeAdmision(a);
    }
}

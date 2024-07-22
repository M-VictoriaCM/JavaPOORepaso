package SombreroSeleccionador;

import java.util.Vector;

public class CasaLinajePuro extends Casa{

    public CasaLinajePuro(String nombre, int cantidadMaximaAlumno) {
        super(nombre, cantidadMaximaAlumno);

    }

    @Override
    public boolean esAdmitido(Alumno a) {
        return a.familiarEnCasa(this) && super.esAdmitido(a);
    }
}

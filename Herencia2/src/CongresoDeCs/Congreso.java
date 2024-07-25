package CongresoDeCs;

import java.util.ArrayList;
import java.util.List;

public class Congreso {
    private List<Evaluador>evaluadores;
    private List<Trabajo>trabajos;
    private List<String>temasEspecificos;

    public Congreso() {
        this.evaluadores = new ArrayList<>();
        this.trabajos = new ArrayList<>();
        this.temasEspecificos= new ArrayList<>();
    }
    public void addEvaluadores(Evaluador evaluador){
        this.evaluadores.add(evaluador);
    }
    public void addTrabajos(Trabajo trabajo){
        this.trabajos.add(trabajo);
    }
    //1)Que evaluador puede asignarse a un determinado trabajo
    public List<Evaluador>asignadoA(Trabajo trabajo){
        List<Evaluador>aux= new ArrayList<>();
        for(Evaluador evaluador: evaluadores){
            if(evaluador.esApto(trabajo)){

            }
        }
        return aux;
    }
    //2)Que trabajo pueden asignarse un evaluador particular
    public List<Trabajo>evaluadoPor(Evaluador evaluador){
        List<Trabajo>aux= new ArrayList<>();
        for(Trabajo trabajo: trabajos){
            trabajo.puedeEvaluarlo(evaluador);
            aux.add(trabajo);
        }
        return aux;
    }
    //Determinar si un evaluador dado es general o experto
    public boolean esExperto(Evaluador evaluador){
        for(String palabra: this.temasEspecificos){
            if(evaluador.tieneConocimientos(palabra)){
                return true;
            }
        }
        return false;
    }
    public int cantidadDeTrabajos(Evaluador e){
        int total=0;
        for(Evaluador evaluador : evaluadores){
            if(e.equals(evaluador)) {
                total += evaluador.cantidadDeTrabajosAsignados();
            }
        }
        return total;
    }
}

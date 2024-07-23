package CongresoDeCs;

import java.util.ArrayList;
import java.util.List;

public class Comite {
    private List<Evaluador> evaluadores;
    private List<Trabajo>trabajos;
    private List<String>temasEspecificos;

    public Comite() {
        this.evaluadores= new ArrayList<>();
        this.trabajos = new ArrayList<>();
        this.temasEspecificos =new ArrayList<>();
    }
    public void addEvaluadores(Evaluador nuevo){
        evaluadores.add(nuevo);
    }
    public void addTrabajo(Trabajo nuevo){
        trabajos.add(nuevo);
    }
    //1)Que evaluador puede asignarse a un determinado trabajo
    public List<Evaluador>getEvaluadores(Trabajo trabajo){
        List<Evaluador>aux = new ArrayList<>();
        for(Evaluador evaluador:evaluadores){
            if(evaluador.esApto(trabajo)) {
                aux.add(evaluador);
            }
        }
        return aux;
    }

    //2) Que trabajo puede asignarse a un evaluador particular
    public List<Trabajo>getTrabajos(Evaluador evaluador) {
        List<Trabajo> aux = new ArrayList<>();
        for(Trabajo trabajo : trabajos){
            if(trabajo.puedeAsignarse(evaluador)) {
                evaluador.setTrabajo(trabajo);
                aux.add(trabajo);
            }
        }
        System.out.println(aux.size());
        return aux;

    }
    //3)¿Cuantos trabajos tiene un evaluador determinado
    public int cantidadDetrabajos(Evaluador e){
        return getTrabajos(e).size();
    }
}

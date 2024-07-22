package PilaDeElementos;

import java.util.Vector;

public class PilaDeElemento {
    private Vector<Object> pilas;

    public PilaDeElemento() {
        this.pilas= new Vector<>();
    }
    public void push(Object nuevo){
        pilas.add(nuevo);
    }
    public int size(){
        return pilas.size();
    }
    public boolean estaVacia(){
        return pilas.isEmpty();
    }
    public Object top(){
        if(!estaVacia()){
            return pilas.lastElement();
        }else {
            return null;
        }
    }
    public Object pop(){
        if(!estaVacia()){
            return pilas.removeLast();
        }else {
            return null;
        }

    }
    public PilaDeElemento copy(){
        PilaDeElemento aux=new PilaDeElemento();
        if (estaVacia()){
            return null;
        }else{
            for (int i=0; i<size(); i++){
                aux.push(pilas.get(i));
            }
        }
        return aux;
    }
    public PilaDeElemento reverse(){
        PilaDeElemento aux=new PilaDeElemento();
        if (!estaVacia()){
            for (int i=size()-1; i>=0; i--){
                aux.push(pilas.get(i));
            }
        }
        return aux;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");
        for (int i = 0; i < size(); i++) {
            result.append(pilas.get(i));
            if (i < size() - 1) {
                result.append(", ");
            }
        }
        result.append("]");
        return result.toString();
    }


}

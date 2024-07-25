package CongresoDeCs;

import java.util.ArrayList;
import java.util.List;

public class Trabajo {
    private String categoria;
    private List<String>palabrasClaves;

    public Trabajo(String categoria) {
        this.categoria = categoria;
        this.palabrasClaves = new ArrayList<>();
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public boolean tienePalabra(String palabra){
        return this.palabrasClaves.contains(palabra);
    }
    public void addPalabra(String nueva){
        this.palabrasClaves.add(nueva);
    }

    public boolean puedeEvaluarlo(Evaluador evaluador) {
        for (String palabra: palabrasClaves){
            if(!evaluador.tieneConocimientos(palabra)){
                return false;
            }
        }
        return true;
    }

}

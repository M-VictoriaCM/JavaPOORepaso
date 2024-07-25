package CongresoDeCs;

import java.util.ArrayList;
import java.util.List;

public class Poster extends Trabajo{
    private List<String>palabrasClaves;

    public Poster(String categoria) {
        super(categoria);
        this.palabrasClaves=new ArrayList<>();
    }

    @Override
    public void addPalabra(String nueva) {
        super.addPalabra(nueva);
    }

    @Override
    public boolean puedeEvaluarlo(Evaluador evaluador) {
        for(String palabra: this.palabrasClaves){
            if(evaluador.tieneConocimientos(palabra)){
                return true;
            }
        }
        return false;
    }
}

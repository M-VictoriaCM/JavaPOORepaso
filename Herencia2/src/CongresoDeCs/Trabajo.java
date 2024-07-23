package CongresoDeCs;

import java.util.ArrayList;
import java.util.List;

public class Trabajo {
    private String categoria;
    private List<String> palabrasClaves;

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

    public boolean tienePalabraClave(String palabra) {
        return this.palabrasClaves.contains(palabra.toLowerCase());
    }

    public void addPalabrasClaves(String nueva) {
        if (!tienePalabraClave(nueva.toLowerCase())) {
            palabrasClaves.add(nueva.toLowerCase());
        }
    }

    public void delete(String palabra) {
        palabrasClaves.remove(palabra.toLowerCase());
    }

    public boolean puedeAsignarse(Evaluador evaluador) {
        return evaluador.esApto(this);
    }
}

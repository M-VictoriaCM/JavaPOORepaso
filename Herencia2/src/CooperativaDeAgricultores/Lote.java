package CooperativaDeAgricultores;

import java.util.ArrayList;
import java.util.List;

public class Lote {
    private int numero;
    private double superficie;
    private List<String>mineralesContenido;

    public Lote(int numero, double superficie) {
        this.numero = numero;
        this.superficie = superficie;
        this.mineralesContenido= new ArrayList<>();
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }
    public boolean contieneMinerales(String mineral){
        return this.mineralesContenido.contains(mineral.toUpperCase());
    }
    public void addMinerales(String nuevo){
        if(!contieneMinerales(nuevo)){
            this.mineralesContenido.add(nuevo.toUpperCase());
        }
    }

    public boolean puedoSembrar(Cereal cereal) {
        return cereal.sirve(this);
    }
}

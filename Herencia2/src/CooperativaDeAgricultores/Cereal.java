package CooperativaDeAgricultores;

import java.util.ArrayList;
import java.util.List;

public class Cereal {
    private String tipo;
    private String clasificacion;
    private List<String>mineralesRequeridos;

    public Cereal(String tipo, String clasificacion) {
        this.tipo = tipo;
        this.clasificacion = clasificacion;
        this.mineralesRequeridos = new ArrayList<>();
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }
    public boolean contieneMineralesRequeridos(String mineral){
        return this.mineralesRequeridos.contains(mineral.toLowerCase());
    }
    public void addMinerales(String nuevo){
        if(!contieneMineralesRequeridos(nuevo)){
            this.mineralesRequeridos.add(nuevo.toLowerCase());
        }
    }
    public void deleteMinerales(String mineral){
        this.mineralesRequeridos.remove(mineral.toLowerCase());
    }

    public boolean sirve(Lote lote){//Controlo que tenga todos los minerales, sino lo tiene devuelvo falso
        for(String mineral: this.mineralesRequeridos){
            if(!lote.contieneMinerales(mineral)){
                return false;
            }
        }
        return true;
    }


}

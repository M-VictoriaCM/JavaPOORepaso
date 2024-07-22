package CooperativaDeAgricultores;

import java.util.ArrayList;
import java.util.List;

public class Cooperativa {
    private List<Lote> listadoDeLotes;
    private List<Cereal>cereales;
    private List<String>MineralesPrimarios;

    public Cooperativa() {
        this.cereales = new ArrayList<>();
        this.listadoDeLotes = new ArrayList<>();
        this.MineralesPrimarios = new ArrayList<>();
    }
    public void addLotes(Lote nuevo){
        this.listadoDeLotes.add(nuevo);
    }
    public void addCereales(Cereal nuevo){
        this.cereales.add(nuevo);
    }
    //1)Que cereales puede sembrarse en un determinado lote
    public List<Cereal>getCereales(Lote lote){
        List<Cereal>salida=new ArrayList<>();
        for(Cereal cereal: cereales){
            if(cereal.sirve(lote)){
                salida.add(cereal);
            }
        }
        return salida;
    }
    //2)En que lotes se puede sembrar un determinado cereal
    public List<Lote>getLotes(Cereal cereal){
        List<Lote>salida= new ArrayList<>();
        for(Lote lote: listadoDeLotes){
            lote.puedoSembrar(cereal);
            salida.add(lote);
        }
        return salida;
    }
    //3)determinar si un lote es especial o comun
    public boolean esEspecial(Lote lote){
        for(String mineral: this.MineralesPrimarios){
            if(lote.contieneMinerales(mineral)){
                return true;
            }
        }
        return false;
    }

}

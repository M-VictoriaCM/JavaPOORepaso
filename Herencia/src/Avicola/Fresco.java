package Avicola;

import java.time.LocalDate;

public class Fresco extends Producto{
    private LocalDate fechaDeEnvasado;
    private String granjaDeOrige;

    public Fresco(LocalDate fechaDeVencimiento, int lote, LocalDate fechaDeEnvasado, String granjaDeOrige) {
        super(fechaDeVencimiento, lote);
        this.fechaDeEnvasado = fechaDeEnvasado;
        this.granjaDeOrige = granjaDeOrige;
    }

    public LocalDate getFechaDeEnvasado() {
        return fechaDeEnvasado;
    }

    public void setFechaDeEnvasado(LocalDate fechaDeEnvasado) {
        this.fechaDeEnvasado = fechaDeEnvasado;
    }

    public String getGranjaDeOrige() {
        return granjaDeOrige;
    }

    public void setGranjaDeOrige(String granjaDeOrige) {
        this.granjaDeOrige = granjaDeOrige;
    }

    @Override
    public String toString() {
        return super.toString()+"\n"+
                "Fecha de envansado: "+this.getFechaDeEnvasado()+"\n"+
                "Granja de origen: "+this.getGranjaDeOrige()+"\n";
    }
}

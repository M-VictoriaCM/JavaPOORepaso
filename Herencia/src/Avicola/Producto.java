package Avicola;

import java.time.LocalDate;

public class Producto {
    private LocalDate fechaDeVencimiento;
    private int lote;

    public Producto(LocalDate fechaDeVencimiento, int lote) {
        this.fechaDeVencimiento = fechaDeVencimiento;
        this.lote = lote;
    }

    public LocalDate getFechaDeVencimiento() {
        return fechaDeVencimiento;
    }

    public void setFechaDeVencimiento(LocalDate fechaDeVencimiento) {
        this.fechaDeVencimiento = fechaDeVencimiento;
    }

    public int getLote() {
        return lote;
    }

    public void setLote(int lote) {
        this.lote = lote;
    }
    public String toString(){
        return "Productos: "+"\n"+
                "Fecha de vencimiento: "+this.getFechaDeVencimiento()+"\n"+
                "Lote: "+this.getLote()+"\n";
    }
}

package CooperativaDeAgricultores;

public class Pastura extends Cereal{
    private double superficieRequerida;
    public Pastura(String tipo, String clasificacion) {
        super(tipo, clasificacion);
        this.superficieRequerida= superficieRequerida;
    }

    public double getSuperficieRequerida() {
        return superficieRequerida;
    }

    public void setSuperficieRequerida(double superficieRequerida) {
        this.superficieRequerida = superficieRequerida;
    }

    @Override
    public boolean sirve(Lote lote) {
        if(lote.getSuperficie() >this.getSuperficieRequerida()) {
            return super.sirve(lote);
        }
        return false;
    }
}

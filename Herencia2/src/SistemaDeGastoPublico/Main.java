package SistemaDeGastoPublico;

public class Main {
    public static void main(String[] args) {
        Pais p = new Pais("Argentina");
        Ciudad c = new Ciudad("Buenos Aires");

        Contribuyente c1 = new Contribuyente(12, "comerciante", 10000);
        ContribuyenteVenta c2 = new ContribuyenteVenta(13, "Programador", 150000, 50, 100000, 3);

        p.addCiudades(c);
        c.addContribuyentes(c1);
        c.addContribuyentes(c2);

        System.out.println(c1);
        System.out.println(c2);
    }
}

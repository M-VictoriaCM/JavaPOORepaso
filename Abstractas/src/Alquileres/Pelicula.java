package Alquileres;

public class Pelicula extends Item {
    private String nombre;
    private int añoEstreno;
    private String genero;
    private int cantidadDeCopias;

    public Pelicula(String nombre, int añoEstreno, int cantidadDeCopias, String genero) {
        this.nombre = nombre;
        this.añoEstreno = añoEstreno;
        this.cantidadDeCopias = cantidadDeCopias;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAñoEstreno() {
        return añoEstreno;
    }

    public void setAñoEstreno(int añoEstreno) {
        this.añoEstreno = añoEstreno;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getCantidadDeCopias() {
        return cantidadDeCopias;
    }

    public void setCantidadDeCopias(int cantidadDeCopias) {
        this.cantidadDeCopias = cantidadDeCopias;
    }

    @Override
    public boolean alquilar() {
        if(estaDisponible()){
            setCantidadDeCopias(cantidadDeCopias-1);
            return true;
        }
        return false;
    }

    @Override
    public void devolver() {
        setCantidadDeCopias(cantidadDeCopias+1);
    }

    @Override
    public boolean estaDisponible() {
        return this.getCantidadDeCopias() > 0;
    }
    public boolean equals(Object obj){
        try{
            Pelicula otra = (Pelicula) obj;
            return this.getNombre().equals(otra.getNombre()) &&
                    this.getGenero().equals(otra.getGenero()) &&
                    this.getAñoEstreno() == otra.getAñoEstreno() &&
                    this.getCantidadDeCopias() == otra.getCantidadDeCopias();
        }catch (Exception err){
            System.out.println(err);
        }
        return false;
    }
    public String toString(){
        return "Pelicula: "+"\n"+
                "Nombre: "+this.getNombre()+"\n"+
                "Genero: "+this.getGenero()+"\n"+
                "Año de estreno: "+this.getAñoEstreno()+
                "copias: "+this.getCantidadDeCopias();
    }
}

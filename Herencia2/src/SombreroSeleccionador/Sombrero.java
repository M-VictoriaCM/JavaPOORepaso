package SombreroSeleccionador;

public class Sombrero {
    public static void main(String[] args) {
        // Creación de alumnos
        Alumno harry = new Alumno(1, "Harry Potter");
        harry.addCualidades("Valentia");
        harry.addCualidades("Lealtad");

        Alumno hermione = new Alumno(2, "Hermione Granger");
        hermione.addCualidades("Inteligencia");
        hermione.addCualidades("Valentía");

        Alumno draco = new Alumno(3, "Draco Malfoy");
        draco.addCualidades("Ambición");
        draco.addCualidades("Astucia");

        // Creación de casas
        Casa gryffindor = new Casa("Gryffindor", 2);
        gryffindor.addACualidadesRequeridas("Valentia");
        gryffindor.addACualidadesRequeridas("Valentía");
        gryffindor.addACualidadesRequeridas("Lealtad");

        Casa slytherin = new CasaLinajePuro("Slytherin", 2);
        slytherin.addACualidadesRequeridas("Ambición");
        slytherin.addACualidadesRequeridas("Astucia");

        Casa ravenclaw = new Casa("Ravenclaw", 2);
        ravenclaw.addACualidadesRequeridas("Inteligencia");

        Casa hufflepuff = new Casa("Hufflepuff", 2);
        hufflepuff.addACualidadesRequeridas("Lealtad");

        // Añadir familiares para probar linaje puro
        Alumno lucius = new Alumno(4, "Lucius Malfoy");
        lucius.addCualidades("Ambición");
        lucius.addCualidades("Astucia");
        slytherin.addAlumnosNuevos(lucius);
        draco.addFamiliares(lucius);

        // Añadir enemistades
        CasaEnemiga gryffindorEnemiga = new CasaEnemiga("Gryffindor", 2);
        gryffindorEnemiga.addACualidadesRequeridas("Valentía");
        gryffindorEnemiga.addACualidadesRequeridas("Lealtad");
        gryffindorEnemiga.addCasaEnemigas(slytherin);

        CasaEnemiga slytherinEnemiga = new CasaEnemiga("Slytherin", 2);
        slytherinEnemiga.addACualidadesRequeridas("Ambición");
        slytherinEnemiga.addACualidadesRequeridas("Astucia");
        slytherinEnemiga.addCasaEnemigas(gryffindor);
        // Asignar alumnos a casas
        if (gryffindor.esAdmitido(harry)) {
            gryffindor.addAlumnosNuevos(harry);
        }

        if (ravenclaw.esAdmitido(hermione)) {
            ravenclaw.addAlumnosNuevos(hermione);
        }

        if (slytherin.esAdmitido(draco)) {
            slytherin.addAlumnosNuevos(draco);
        }

        // Verificar asignaciones
        if (harry.getCasa() != null) {
            System.out.println(harry.getNombre() + " ha sido asignado a " + harry.getCasa().getNombre());
        } else {
            System.out.println(harry.getNombre() + " no ha sido asignado a ninguna casa.");
        }

        if (hermione.getCasa() != null) {
            System.out.println(hermione.getNombre() + " ha sido asignado a " + hermione.getCasa().getNombre());
        } else {
            System.out.println(hermione.getNombre() + " no ha sido asignado a ninguna casa.");
        }

        if (draco.getCasa() != null) {
            System.out.println(draco.getNombre() + " ha sido asignado a " + draco.getCasa().getNombre());
        } else {
            System.out.println(draco.getNombre() + " no ha sido asignado a ninguna casa.");
        }
    }
}

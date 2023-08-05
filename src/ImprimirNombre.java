public class ImprimirNombre {
    public static void imprimir(String nombre){
        String nombreMayusculas = nombre.toUpperCase();
        String nombreMinusculas = nombre.toLowerCase();

        System.out.println("Nombre en mayúsculas: " + nombreMayusculas);
        System.out.println("Nombre en minúsculas: " + nombreMinusculas);
    }
}

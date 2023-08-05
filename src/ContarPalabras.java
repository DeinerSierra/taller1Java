public class ContarPalabras {
    public static void contar(String oracion){
        String[] palabras = oracion.split("\\s+");
        int cantidadPalabras = palabras.length;

        System.out.println("La oración contiene " + cantidadPalabras + " palabras.");
    }
}

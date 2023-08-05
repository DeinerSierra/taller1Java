public class SepararPalabras {
    public static void separar(String frase){
        String[] palabras = frase.split("\\s+");

        System.out.println("Palabras de la frase:");
        for (String palabra : palabras) {
            System.out.println(palabra);
        }
    }
}

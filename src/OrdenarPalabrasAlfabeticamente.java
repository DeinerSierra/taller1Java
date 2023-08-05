import java.util.Arrays;

public class OrdenarPalabrasAlfabeticamente {
    public static void ordenar(String frase){
        String[] palabras = frase.split("\\s+");
        Arrays.sort(palabras);

        System.out.println("Palabras ordenadas alfabéticamente:");
        for (String palabra : palabras) {
            System.out.println(palabra);
        }
    }
}

public class Palindromo {
    public static void palindromo(String frase){
        String fraseSinEspacios = frase.replaceAll("\\s", "").toLowerCase();
        String fraseInvertida = new StringBuilder(fraseSinEspacios).reverse().toString();

        if (fraseSinEspacios.equals(fraseInvertida)) {
            System.out.println("La frase es un palíndromo.");
        } else {
            System.out.println("La frase NO es un palíndromo.");
        }
    }
}

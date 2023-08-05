public class ContarLetra {
    public static void contar(String cadena,char letra){
        int contador = 0;
        for (char c : cadena.toCharArray()) {
            if (Character.toLowerCase(c) == Character.toLowerCase(letra)) {
                contador++;
            }
        }

        System.out.println("La letra '" + letra + "' aparece " + contador + " veces en la cadena.");
    }
}

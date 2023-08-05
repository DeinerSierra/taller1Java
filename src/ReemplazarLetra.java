public class ReemplazarLetra {
    public static void reemplazar(String cadena,char letraAnterior,char letraNueva){
        String nuevaCadena = cadena.replace(letraAnterior, letraNueva);

        System.out.println("La nueva cadena es: " + nuevaCadena);
    }
}

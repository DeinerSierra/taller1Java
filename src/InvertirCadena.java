public class InvertirCadena {
    public static String invertir(String cadena){
        StringBuilder sb = new StringBuilder(cadena);
        sb.reverse();
        return sb.toString();
    }
}

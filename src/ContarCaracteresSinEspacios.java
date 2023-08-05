public class ContarCaracteresSinEspacios {
    public static void contar(String cadena){
        int cantidadCaracteres = cadena.replaceAll("\\s", "").length();

        System.out.println("La cadena tiene " + cantidadCaracteres + " caracteres sin contar los espacios.");
    }
}

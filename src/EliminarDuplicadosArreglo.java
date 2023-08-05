import java.util.Arrays;

public class EliminarDuplicadosArreglo {
    public static void eliminar(int[] arreglo){
        int[] arregloSinDuplicados = Arrays.stream(arreglo).distinct().toArray();

        System.out.println("Arreglo original: " + Arrays.toString(arreglo));
        System.out.println("Arreglo sin duplicados: " + Arrays.toString(arregloSinDuplicados));
    }
}

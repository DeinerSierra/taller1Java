import java.util.HashMap;
import java.util.Map;

public class FrecuenciaElementosArreglo {
    public static void frecuencia(int[] arreglo){
        Map<Integer, Integer> frecuencia = new HashMap<>();
        for (int elemento : arreglo) {
            frecuencia.put(elemento, frecuencia.getOrDefault(elemento, 0) + 1);
        }

        System.out.println("Frecuencia de elementos:");
        for (Map.Entry<Integer, Integer> entry : frecuencia.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue() + " veces");
        }
    }
}

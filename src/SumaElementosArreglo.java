

public class SumaElementosArreglo {
    public static void sumar(int[] arreglo){
        int suma = 0;
        for (int elemento : arreglo) {
            suma += elemento;
        }

        System.out.println("La suma de los elementos del arreglo es: " + suma);
    }
}

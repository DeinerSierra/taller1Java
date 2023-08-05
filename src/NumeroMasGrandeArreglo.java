public class NumeroMasGrandeArreglo {
    public static void mayor(int[] arreglo){
        int maximo = arreglo[0];
        for (int i = 1; i < arreglo.length; i++) {
            if (arreglo[i] > maximo) {
                maximo = arreglo[i];
            }
        }

        System.out.println("El número más grande en el arreglo es: " + maximo);
    }
}

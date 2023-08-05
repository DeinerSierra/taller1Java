public class NumerosPrimosEnRango {
    public static void primos(int inicio, int fin){
        System.out.println("Números primos en el rango [" + inicio + ", " + fin + "]:");
        for (int numero = inicio; numero <= fin; numero++) {
            if (esPrimo(numero)) {
                System.out.print(numero + " ");
            }
        }
    }
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}

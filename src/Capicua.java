public class Capicua {
    public static void comprobarCapicua(int numero){
        int numeroOriginal = numero;
        int numeroInvertido = 0;

        while (numero > 0) {
            int digito = numero % 10;
            numeroInvertido = numeroInvertido * 10 + digito;
            numero /= 10;
        }

        if (numeroOriginal == numeroInvertido) {
            System.out.println(numeroOriginal + " es un número capicúa.");
        } else {
            System.out.println(numeroOriginal + " NO es un número capicúa.");
        }
    }
}

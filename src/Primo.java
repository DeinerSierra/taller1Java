public class Primo {
    public static void primo(int num){
        boolean esPrimo = true;
        if (num <= 1) {
            esPrimo = false;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
        }
        if (esPrimo) {
            System.out.println(num+" Es un numero primo");
        } else {
            System.out.println(num+" No es un numero primo");
        }
    }
}

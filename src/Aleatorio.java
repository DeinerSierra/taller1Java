import java.util.Random;
import java.util.Scanner;

public class Aleatorio {
    public static void aleatorio(int num){
        Random random = new Random();
        int numrandom = random.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        while (num != numrandom) {
            System.out.print("Adivina el número ingresándolo aquí: ");
            num = scanner.nextInt(); // Actualizar el valor de 'num' con el nuevo número ingresado
    
            if (num > numrandom) {
                System.out.println("El número ingresado es mayor al número a adivinar.");
            } else if (num < numrandom) {
                System.out.println("El número ingresado es menor al número a adivinar.");
            }
        }
        System.out.println("¡Adivinaste el número! Felicitaciones, el número era: " + numrandom);
    }
}

public class Fibo {
    public static void fibo(int num){
        int a = 0;
        int b = 1;

        System.out.print("Serie de Fibonacci hasta " + num + ": " + a + " " + b + " ");

        while (a + b <= num) {
            int temp = a + b;
            System.out.print(temp + " ");
            a = b;
            b = temp;
        }
    }
}

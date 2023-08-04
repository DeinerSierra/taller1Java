public class Fibonacci {
    public static void fibo(){
        int[] series = new int[20];
        series[0] = 0;
        series[1] = 1;
        for (int i = 2; i <= series.length-1; i++) {
            series[i] = series[i - 1] + series[i - 2];
        }
        for (int i = 0; i < series.length; i++) {
            System.out.println(series[i]);
        }
    }
}

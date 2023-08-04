public class Factorial {
    public static int factorial(int num){
        int res = 1;
        if (num > 0) {
            
            for (int i = 1; i <= num; i++) {
                res *=i;
            }
            return res;
        } else {
            System.out.println("El numero ingresado no es valido");
            return res;
        }

        
        
        
    }
}

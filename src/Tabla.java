public class Tabla {
    public static void multiplicar(int num){
        if (num > 0) {
            for (int i = 0; i < 10; i++) {
                System.out.println(i+" X "+num+" = "+ i*num); 
            }
        } else {
            System.out.println("El numero ingresado debe ser positivo");
        }

    }
}

public class Redondear {
    public static void redondear(double nundecimal, int decimales){
        double redondeado = Math.round(nundecimal * Math.pow(10, decimales))/ Math.pow(10, decimales);
        System.out.println("El numero reondeado es: "+redondeado);
    }
}

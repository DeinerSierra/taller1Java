public class AreaTriangulo {
    public static void calcular(double lado1, double lado2, double lado3){
        double suma = (lado1+ lado2 + lado3)/2.0;
        double area = Math.sqrt(suma*(suma-lado1)*(suma-lado2)*(suma-lado3));
        System.out.println("El area del triangulo es: "+area);
    }
}

public class PerimetroArea {
    public static double[] calcular(double radio){
        double area = Math.PI * Math.pow(radio, 2);
        double permimetro = 2 * Math.PI *radio;
        double[] resultados = {area,permimetro};
        return resultados;
    }
}

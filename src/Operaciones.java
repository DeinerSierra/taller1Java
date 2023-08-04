public class Operaciones {
    public static double[] operar(int num1, int num2){
        double suma = num1 + num2;
        double resta = num1 - num2;
        double multi = num1 * num2;
        double divisional = (double)num1 / num2; 
        double[] resultados = {suma, resta, multi, divisional};
        return resultados;
    }
}

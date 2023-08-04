import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //Punto 1 del ejercicio
        Scanner scanner = new Scanner(System.in);
        /*System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();
        double[] resultados = Operaciones.operar(num1, num2);
        System.out.println("La suma es: "+resultados[0]);
        System.out.println("La resta es: "+resultados[1]);
        System.out.println("La multiplicacion es: "+resultados[2]);
        System.out.println("La divicion es: "+resultados[3]);
        //Punto 2 del ejercicio
        System.out.print("Ingrese un número: ");
        int num1 = scanner.nextInt();
        ParImpar.parImpar(num1);
        //Punto 3 del ejercicio
        System.out.print("Ingrese el radio del círculo: ");
        double radio = scanner.nextDouble();
        double[] resultados = PerimetroArea.calcular(radio);
        System.out.println("El area del circulo es: "+resultados[0]+" Y el perimetro del circulo es: "+resultados[1]);
        //Punto 4 del ejercicio
        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();
        String resultados = MayorMenor.esMayorDeEdad(edad);
        System.out.println(resultados);
        //Punto 5 del ejercicio
        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();
        String resultados = MayorMenor.numMayor(num1, num2);
        System.out.println(resultados);
        //Punto 6 del ejercicio
        System.out.print("Ingrese el número: ");
        int num1 = scanner.nextInt();
        String resultados = MayorMenor.verificarNum(num1);
        System.out.println(resultados);
        //Punto 7 del ejercicio
        System.out.print("Ingrese el número: ");
        int num = scanner.nextInt();
        Tabla.multiplicar(num);
        //Punto 8 del ejercicio
        Aleatorio.aleatorio(2);
        //Punto 9 del ejercicio
        System.out.print("Ingrese el número: ");
        int num = scanner.nextInt();
        System.out.println(Factorial.factorial(num));
        //Punto 10 del ejercicio
        Fibonacci.fibo();
        //Punto 11 del ejercicio
        System.out.print("Ingrese la longitud del lado 1: ");
        double lado1 = scanner.nextDouble();
        System.out.print("Ingrese la longitud del lado 2: ");
        double lado2 = scanner.nextDouble();
        System.out.print("Ingrese la longitud del lado 3: ");
        double lado3 = scanner.nextDouble();
        AreaTriangulo.calcular(lado1, lado2, lado3);
        //Punto 12 del ejercicio*/
        System.out.print("Ingrese el número: ");
        int num = scanner.nextInt();
        Primo.primo(num);
    }
}

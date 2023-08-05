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
        //Punto 12 del ejercicio
        System.out.print("Ingrese el número: ");
        int num = scanner.nextInt();
        Primo.primo(num);
        //Punto 13 del ejercicio
        System.out.print("Ingrese el número decimal: ");
        double numDecimal = scanner.nextDouble();
        System.out.print("Ingrese el número de decimales a redondear: ");
        int numDecimales = scanner.nextInt();
        Redondear.redondear(numDecimal, numDecimales);
        //Punto 14 del ejercicio
        System.out.print("Ingresa un número entero: ");
        int numero = scanner.nextInt();
        Capicua.comprobarCapicua(numero);
        //Punto 15 del ejercicio
        System.out.print("Ingresa un número para calcular la serie de Fibonacci: ");
        int numero = scanner.nextInt();
        Fibo.fibo(numero);
        //Punto 16 del ejercicio
        System.out.print("Ingresa el número inicial del rango: ");
        int inicio = scanner.nextInt();

        System.out.print("Ingresa el número final del rango: ");
        int fin = scanner.nextInt();
        NumerosPrimosEnRango.primos(inicio, fin);
        //Punto 17 del ejercicio
        String contrasena = GenerarContrasenaAleatoria.generarContrasena();
        System.out.println("Contraseña aleatoria: " + contrasena);
        //Punto 18 del ejercicio
        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.nextLine();
        ImprimirNombre.imprimir(nombre);
        //Punto 20 del ejercicio
        System.out.print("Ingresa una cadena: ");
        String cadena = scanner.nextLine();

        String cadenaInvertida = InvertirCadena.invertir(cadena);
        System.out.println("Cadena invertida: " + cadenaInvertida);
        //Punto 21 del ejercicio
        System.out.print("Ingresa una cadena: ");
        String cadena = scanner.nextLine();

        System.out.print("Ingresa la letra que quieres contar: ");
        char letra = scanner.nextLine().charAt(0);
        ContarLetra.contar(cadena, letra);
        //Punto 22 del ejercicio
        System.out.print("Ingresa una frase: ");
        String frase = scanner.nextLine();
        Palindromo.palindromo(frase);
        //Punto 23 del ejercicio
        System.out.print("Ingresa una oración: ");
        String oracion = scanner.nextLine();
        ContarPalabras.contar(oracion);
        //Punto 24 del ejercicio
        System.out.print("Ingresa una cadena: ");
        String cadena = scanner.nextLine();

        System.out.print("Ingresa la letra que deseas reemplazar: ");
        char letraAnterior = scanner.nextLine().charAt(0);

        System.out.print("Ingresa la nueva letra: ");
        char letraNueva = scanner.nextLine().charAt(0);
        ReemplazarLetra.reemplazar(cadena, letraAnterior, letraNueva);
        //Punto 25 del ejercicio
        System.out.print("Ingresa una frase: ");
        String frase = scanner.nextLine();
        SepararPalabras.separar(frase);
        //Punto 26 del ejercicio
        System.out.print("Ingresa una cadena: ");
        String cadena = scanner.nextLine();
        ContarCaracteresSinEspacios.contar(cadena);
        //Punto 27 del ejercicio
        System.out.print("Ingresa una frase: ");
        String frase = scanner.nextLine();
        OrdenarPalabrasAlfabeticamente.ordenar(frase);
        //Punto 28 del ejercicio
        int[] arreglo = {1, 2, 3, 4, 5};
        SumaElementosArreglo.sumar(arreglo);
        //Punto 29 del ejercicio
        int[] arreglo = {10, 5, 8, 15, 3};
        NumeroMasGrandeArreglo.mayor(arreglo);
        //Punto 30 del ejercicio
        int[] arreglo = {1, 2, 2, 3, 4, 4, 5};
        EliminarDuplicadosArreglo.eliminar(arreglo);
        //Punto 31 del ejercicio
        int[] arreglo = {5, 2, 9, 1, 5, 6};
        OrdenamientoBurbuja.ordenar(arreglo);
        //Punto 32 del ejercicio
        int[] arreglo = {10, 5, 8, 15, 3};

        int numeroBuscado = 8;
        BuscarElementoArreglo.buscar(arreglo, numeroBuscado);
        //Punto 33 del ejercicio*/
        int[] arreglo = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4};
        FrecuenciaElementosArreglo.frecuencia(arreglo);
    }
}

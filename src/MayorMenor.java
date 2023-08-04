public class MayorMenor {
    public static String esMayorDeEdad(int edad) {
        if (edad >= 18) {
            return "Es mayor de edad";
        } else {
            return "No es mayor de edad";
        }
    }
    public static String numMayor(int num1, int num2){
        if (num1>num2) {
            return "El numero mayor es "+ num1;
        } else {
            return "El número mayor es " + num2;
        }
    }
    public static String verificarNum(int num1){
        if (num1>0) {
            return "El numero es positivo "+ num1;
        } else if(num1 < 0) {
            return "El número es negativo " + num1;
        } else{
            return "El número es: " + num1;
        }
    }
}

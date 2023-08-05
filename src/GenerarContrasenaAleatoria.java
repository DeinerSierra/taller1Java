import java.util.Random;

public class GenerarContrasenaAleatoria {
    public static String generarContrasena() {
        String letrasMayusculas = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String letrasMinusculas = "abcdefghijklmnopqrstuvwxyz";
        String digitos = "0123456789";
        String caracteres = letrasMayusculas + letrasMinusculas + digitos;

        Random random = new Random();
        StringBuilder sb = new StringBuilder(8);
        for (int i = 0; i < 8; i++) {
            int index = random.nextInt(caracteres.length());
            sb.append(caracteres.charAt(index));
        }

        return sb.toString();
    }
}

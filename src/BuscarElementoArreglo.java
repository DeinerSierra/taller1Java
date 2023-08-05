public class BuscarElementoArreglo {
    public static void buscar(int[] arreglo,int numeroBuscado){
        int indiceEncontrado = -1;

        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == numeroBuscado) {
                indiceEncontrado = i;
                break;
            }
        }

        if (indiceEncontrado != -1) {
            System.out.println("El número " + numeroBuscado + " se encuentra en el índice " + indiceEncontrado);
        } else {
            System.out.println("El número " + numeroBuscado + " no se encuentra en el arreglo.");
        }
    
    }
}

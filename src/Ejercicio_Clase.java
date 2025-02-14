
import java.util.Scanner;

public class Ejercicio_Clase {

    public static void main(String[] args) {
        int A[] = new int[10];
        int sum = 0;
        boolean rev[] = new boolean[10]; // Nuevo arreglo auxiliar para controlar los numeros ya contados
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el numero " + (i + 1) + ": ");
            A[i] = leer.nextInt(); // Se almacenan los 10 numeros dentro del array
            sum += A[i];    // La suma sera igual a los numeros que contenga el array
            rev[i] = false; // Ningun numero se ha contado aun
        }

        double prom = sum / 10; // Se halla el promedio dividiendo la suma total entre la cantidad total de datos dentro del array

        for (int i = 0; i < 10; i++) {
            if (!rev[i]) { // Si el número no se ha contado aún
                int c = 0;
                for (int h = 0; h < 10; h++) {
                    if (A[i] == A[h]) {
                        c++;
                    }
                }
                System.out.println("El numero " + A[i] + " Se repite " + c + " veces");
                // Marcar todas las ocurrencias de este número como contadas
                for (int j = 0; j < 10; j++) {
                    if (A[j] == A[i]) {
                        rev[j] = true;
                    }
                }
            }
        }

        System.out.println("La suma es " + sum);
        System.out.println("El promedio es " + prom);

    }
}

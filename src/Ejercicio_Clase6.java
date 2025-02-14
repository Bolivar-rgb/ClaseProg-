
import java.util.Scanner;

public class Ejercicio_Clase6 {

    public static void main(String[] args) {
        double A[] = new double[10];
        double mayor = A[0], menor = 5;
        int indice = 0, indice2 = 0;
        double SN = 0;
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese las notas de los estudiantes: ");
            System.out.println("Nota " + (i + 1));
            A[i] = leer.nextDouble();
            SN += A[i];
            if (A[i] > mayor) {
                mayor = A[i];
                indice2 = i;
            }
            if (A[i] < menor) {
                menor = A[i];
                indice = i; 
            }

        }
        System.out.println("La nota mas baja es de: " + menor+ " y se encuentra en la posicion "+ indice);
        System.out.println("La nota mas alta es de: " + mayor+ " y se encuentra en la posicion "+ indice2);
        int cont = 0;
        for (int m = 0; m < 10; m++) {
            if (A[m] > 3.0) {
                cont++;
            }
        }
        double por = (cont * 100) / 10;
        double prom = SN / 10;
        System.out.println("El porcentaje de estudiantes que aprobaron el parcial fue de: " + por + " %");
        System.out.println("El promedio de las notas de los estudiantes es: " + prom);
    }
}

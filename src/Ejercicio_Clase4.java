
import java.util.Scanner;

public class Ejercicio_Clase4 {

    public static void main(String[] args) {
        int A[] = new int[10];
        int con0 = 0, contP = 0, contN = 0;

        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingresa el numero en la posicion " + (i + 1));
            A[i] = leer.nextInt();
        }
        for (int m = 0; m < 10; m++) {
            if (A[m] == 0) {
                con0++;
            } else if (A[m] > 0) {
                contP++;
            } else {
                contN++;
            }
        }

        System.out.println("Los numeros positivos son " + contP);
        System.out.println("Los numeros negativos son " + contN);
        System.out.println("Los numeros igual a 0 son " + con0);
    }
}

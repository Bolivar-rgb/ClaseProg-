
import java.util.Scanner;

public class Ejercicio_Clase5 {

    public static void main(String[] args) {
        int añoP, añoA, edad, centinela;
        do {
            Scanner leer = new Scanner(System.in);

            System.out.print("Ingrese el año en el que nacio: ");
            añoP = leer.nextInt();
            System.out.print("Ingrese el año actual: ");
            añoA = leer.nextInt();
            edad = añoA - añoP;
            if (edad >= 18) {
                System.out.println("Usted puede votar, su edad es: " + edad);
            } else {
                System.out.println("Usted no puede votar, su edad es: " + edad);
            }
            System.out.println("Desea saber si otra persona puede votar? ");
            System.out.println("Si = 1 o No = 0");
            centinela = leer.nextInt();
        } while (centinela == 1);

    }
}


import java.util.Scanner;

// Crear un programa que solicite un numero y con ese numero(multiplicador) realice la tabla de 
//multiplicar, debe imprimir el resultado de la multiplicación mostrando el multiplicando, el multiplicador y el resultdo
public class Ejercicio_Clase3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int des;
        
        do {
            
            System.out.print("Ingrese el numero del cual desea conocer la tabla de multiplicar: ");
            System.out.print(" ");
            int numero = leer.nextInt();
            for (int i = 1; i < 11; i++) {
                int resul = numero * (i);
                System.out.println("El resultado de multiplicar " + numero + " x " + (i) + " es = " + resul);
                System.out.println(" ");
            }
            System.out.println("Quieres conocer otra tabla de multiplicar?");
            System.out.println("Si = 1 o No = 0");

            des = leer.nextInt();
            
        } while (des == 1);
    }
}

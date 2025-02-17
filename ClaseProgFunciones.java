
import java.util.Scanner;

public class ClaseProgFunciones {

    public static void main(String[] args) {
        int cent = 0;

        Scanner leer = new Scanner(System.in);
        System.out.println("----------------------------------");
        System.out.println("Bienvenido, que deseas calcular");
        System.out.println("----------------------------------");
        do {
            System.out.println("1. Circulo");
            System.out.println("2. Triangulo");
            System.out.println("3. Cuadrado");
            System.out.println("----------------------------------");
            System.out.print("Ingresa el valor correspondiente a cada opcion: ");
            int caso = leer.nextInt();
            switch (caso) {
                case 1:
                    System.out.println("Seleccionaste CIRCULO");
                    System.out.print("Ingresa el radio del circulo: ");
                    double rd = leer.nextDouble();
                    double rd2 = Circulo(rd);
                    System.out.println("El radio del circulo es: " + rd2);
                    break;
                case 2:
                    System.out.println("Seleccionaste TRIANGULO");
                    System.out.print("Ingresa la base: ");
                    double bs = leer.nextDouble();
                    System.out.print("Ingresa la altura: ");
                    double alt = leer.nextDouble();
                    double et = Triangulo(bs, alt);
                    System.out.println("El area del triangulo es: " + et);
                    break;
                case 3:
                    System.out.println("Seleccionaste CUADRADO");
                    System.out.print("Ingresa un lado: ");
                    double ld = leer.nextDouble();
                    double sac = Cuadrado(ld);
                    System.out.println("El area del cuadrado es: " + sac);
                    break;
            }
            System.out.println("Desea continuar con el programa? ");
            System.out.println("1 = si o 0 = no");
            System.out.println("----------------------------------");
            cent = leer.nextInt();
        } while (cent == 1);
    }

    public static double Circulo(double rd) {
        double srd = (rd * rd) * 3.1416;
        return srd;
    }

    public static double Triangulo(double bs, double alt) {
        double at = (bs * alt) / 2;
        return at;
    }

    public static double Cuadrado(double ld) {
        double ac = ld * ld;
        return ac;
    }
}

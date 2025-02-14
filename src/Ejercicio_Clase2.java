// En un vector multidimensional de 5 filas(alumnos)y 4 columnas(notas) se guardan las notas 
// de 5 alumnos de programación con su respectivo promedio. En las tres primeras posiciones 
// van las notas y en la última posición va el promedio de cada uno. Finalizado los cálculos se 
// debe mostrar las notas por fila de cada alumno con su  promedio correspondiente. 

import java.util.Scanner;

public class Ejercicio_Clase2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        // Se crea la matriz NA que tendra 5 filas para alumnos y 4 columnas
        double[][] NA = new double[5][4];
        System.out.println("Ingrese las notas de los estudiantes");
        // Se usa un bucle for para recorrer cada estudiante por fila
        for (int i = 0; i < 5; i++) {
            System.out.println("Estudiante " + (i + 1));
            // Se hace uso de otro bucle for para recorrer las 3 notas de cada estudiante que estarian almcenadas en las primeras 3 columnas 
            // 0, 1 y 2
            for (int m = 0; m < 3; m++) {
                System.out.print("Ingrese la " + (m + 1) + " nota del estudiante  ");
                // Se lee la nota que ingresa el usuario ingresada en valores decimales y se almacena en la posicion correspondiente
                // de la matriz
                NA[i][m] = leer.nextDouble();
            }
        }
        // Se hace nuevamente uso de un bucle for para recorrer cada estudiante por fila
        for (int i = 0; i < 5; i++) {
            // Se define la variable SN como double para realizar la suma de notas 
            double SN = 0;
            // Se hace uso de otro bucle for para recorrer las notas de cada uno de los estudiantes
            for (int m = 0; m < 3; m++) {
                // La variable SN sera igual a la sumatoria de cada una de las notas de los estudiantes
                SN += NA[i][m];
            }
            // Se calcula el promedio de cada estudiante dividiendo la suma de las notas entre 3 
            // Y se van a almacenar en la 3 columna de la matriz donde estara almacenado el promedio de cada estudiante
            NA[i][3] = SN / 3;
        }
        // Se muestran las notas de cada uno de los estudiantes en este apartado
        System.out.println("Notas de los estudiantes ");
        // Se hace uso nuevamente de un bucle for para recorrer a cada uno de los estudiantes 
        for (int i = 0; i < 5; i++) {
            // Aqui imprimimos en la terminal el estudiante
            System.out.println("Estudiante " + (i + 1) + ": ");
            // Se usa nuevamente un bucle for para recorrer cada una de las notas de dichos estudiantes
            for (int m = 0; m < 3; m++) {
                // Se imprime en la terminal cuales fueron las notas de los estudiantes 
                System.out.println(NA[i][m]);
            }
            // Por ultimo se imprime el promedio de cada estudiante
            System.out.println("El promedio del estudiante es: " + NA[i][3]);
        }

    }
}

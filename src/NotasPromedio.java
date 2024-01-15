
import java.util.Scanner;

public class NotasPromedio {
    public static void main (String[] arg){

                Scanner scanner = new Scanner(System.in);

                System.out.println("\n\t\t Ingrese las 5 notas del estudiante (entre 0.0 y 5.0):");

                double sumaNotas = 0.0;

                for (int i = 1; i <= 5; i++) {
                    System.out.print("Nota N° " + i + ": ");
                    double nota = scanner.nextDouble();


                    if (nota < 0.0 || nota > 5.0) {
                        System.out.println("La nota ingresada no está en el rango permitido. Intente de nuevo.");
                        i--; // Decrementar el índice para repetir la misma nota.
                    } else {
                        sumaNotas += nota;
                    }
                }

                // Calcular el promedio de las notas
                double promedio = sumaNotas / 5;

                System.out.printf("El promedio de las notas del estudiante es: " + promedio);

            }
        }





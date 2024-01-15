
import java.util.Scanner;

public class Inversion {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("\n\t\t\tPorcentaje de inversión ");
            double inversionPersona1, inversionPersona2, inversionPersona3;


            do {
                System.out.print("Ingrese la cantidad invertida por la primera persona ($100,000 - $1,000,000): ");
                inversionPersona1 = scanner.nextDouble();
                if (inversionPersona1 < 100000 || inversionPersona1 > 1000000) {
                    System.out.println("\t\tLa cantidad ingresada no está dentro del rango permitido. Intente de nuevo.");
                }
            } while (inversionPersona1 < 100000 || inversionPersona1 > 1000000);

            do {
                System.out.print("Ingrese la cantidad invertida por la segunda persona ($100,000 - $1,000,000): ");
                inversionPersona2 = scanner.nextDouble();
                if (inversionPersona2 < 100000 || inversionPersona2 > 1000000) {
                    System.out.println("\t\tLa cantidad ingresada no está dentro del rango permitido. Intente de nuevo.");
                }
            } while (inversionPersona2 < 100000 || inversionPersona2 > 1000000);

            do {
                System.out.print("Ingrese la cantidad invertida por la tercera persona ($100,000 - $1,000,000): ");
                inversionPersona3 = scanner.nextDouble();
                if (inversionPersona3 < 100000 || inversionPersona3 > 1000000) {
                    System.out.println("\t\tLa cantidad ingresada no está dentro del rango permitido. Intente de nuevo.");
                }
            } while (inversionPersona3 < 100000 || inversionPersona3 > 1000000);

            // Calcular el porcentaje de inversión de cada persona
            double totalInversion = inversionPersona1 + inversionPersona2 + inversionPersona3;

            double porcentajePersona1 = (inversionPersona1 / totalInversion) * 100;
            double porcentajePersona2 = (inversionPersona2 / totalInversion) * 100;
            double porcentajePersona3 = (inversionPersona3 / totalInversion) * 100;


            System.out.println("\n\t\tPorcentaje de inversión\n");
            System.out.println("Persona 1: " + porcentajePersona1 + " %");
            System.out.println("Persona 2: " + porcentajePersona2 + " %");
            System.out.println("Persona 3: " + porcentajePersona3 + " %");


        }
    }

/*Dados los coeficientes de una ecuación cuadrática:
ax + bx + c = 0 (Los coeficientes son a, b y c)
Realice un programa para determinar sus raíces, sabiendo que:
x = ( -b +/- RAIZ ( b^2 – ( 4 * a * c) ) / ( 2 * a )

Pista: Deben usar las funciones "pow" y "sqrt" que están inmersas en una librería llamada...
y sirven para...*/

import java.util.Scanner;

public class Cuadratica {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("\n\t\t CUADRATICA");

        System.out.print("Ingrese el coeficiente a: ");
        double a = scanner.nextDouble();

        System.out.print("Ingrese el coeficiente b: ");
        double b = scanner.nextDouble();

        System.out.print("Ingrese el coeficiente c: ");
        double c = scanner.nextDouble();

        // Calcular el discriminante
        double discriminante = Math.pow(b, 2) - (4 * a * c);

        // Verificar el valor del discriminante
        if (discriminante >= 0) {

            // Dos raíces reales
            double raiz1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double raiz2 = (-b - Math.sqrt(discriminante)) / (2 * a);

            System.out.println("\nLas raíces son reales:");
            System.out.println("Raíz 1: " + raiz1);
            System.out.println("Raíz 2: " + raiz2);

        } else {

            // Raíces complejas
            double parteReal = -b / (2 * a);
            double parteImaginaria = Math.sqrt(Math.abs(discriminante)) / (2 * a);

            System.out.println("Las raíces son complejas:");
            System.out.println("Raíz 1: " + parteReal + " + " + parteImaginaria + "i");
            System.out.println("Raíz 2: " + parteReal + " - " + parteImaginaria + "i");
        }


    }

}
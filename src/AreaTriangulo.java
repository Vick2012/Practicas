
/* Realice un programa que permita calcular el área de un triángulo conociendo su base y su
altura.*/

import java.util.Scanner;

public class AreaTriangulo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("\n\t\t Formula para hallar Area de Triangulo At = ( b * h ) / 2 \n");

        System.out.print("Ingrese la base del triángulo: ");
        double base = sc.nextDouble();

        System.out.print("Ingrese la altura del triángulo: ");
        double altura = sc.nextDouble();

        double Resultado = (base * altura)/2;

        System.out.println("El área del triángulo con base " + base + " y altura " + altura + " es: " + Resultado);
    }

    }


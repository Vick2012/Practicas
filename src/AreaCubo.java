
/*Realice un programa que permita calcular el volumen de un cubo conociendo la longitud de
sus tres lados (no tienen que ser iguales).*/

import java.util.Scanner;

public class AreaCubo {

    public static void main (String [] args ) {

        Scanner sc = new Scanner(System.in);
        System.out.println("\n\t\t Formula para hallar volumen de cubo Vc = L * L * L ");

        System.out.print("Ingrese lado N° 1: " );
        float Lado1 = sc.nextFloat();

        System.out.print("Ingrese lado N° 2: " );
        float Lado2 = sc.nextFloat();

        System.out.print("Ingrese lado N° 3: " );
        float Lado3 = sc.nextFloat();

        System.out.print("El area del cubo es: " + + (Lado1 * Lado2 * Lado3));

    }

}


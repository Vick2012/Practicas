
/*Realice un programa que permita calcular la altura de un cono conociendo el volumen y el
 radio de su base.*/

import java.util.Scanner;


public class Cono {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el volumen del cono: ");
        double volumen = scanner.nextDouble();

        System.out.print("Ingrese el radio de la base del cono: ");
        double radio = scanner.nextDouble();

        //Despejar formula para altura del cono  h = ( 3 * Vcono ) / ( PI * r^2 )
        double altura = (3 * volumen) / (Math.PI * Math.pow (radio, 2));

        System.out.println("La altura del cono con volumen " + volumen + " y radio de base " + radio + " es: " + altura);

    }
}

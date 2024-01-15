
import java.util.Scanner;

public class EdadesPromedio {
    public static void main (String[] arg){

        Scanner sc = new Scanner (System.in);

        System.out.println("\n\t\t Edad Promedio entre tres Individuos");
        System.out.print("Ingrese edad N° 1: " );
        int Individuo1 = sc.nextInt();

        System.out.print("Ingrese edad N° 2: " );
        int Individuo2 = sc.nextInt();

        System.out.print("Ingrese edad N° 3: " );
        int Individuo3 = sc.nextInt();

        int Promedio = (Individuo1 + Individuo2 + Individuo3) / 3;

        System.out.println("La edad promedio es: " + Promedio);

    }
}

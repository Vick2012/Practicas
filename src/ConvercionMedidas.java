
import java.util.Scanner;

public class ConvercionMedidas {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.println("\n\t\t Converción de medidas");

            System.out.print("Ingrese la cantidad en metros: ");
            double metros = sc.nextDouble();

            // Convertir a centímetros, kilómetros, pies y pulgadas
            double centimetros = metros * 100;
            double kilometros = metros / 1000;
            double pies = metros * 3.281;
            double pulgadas = metros * 39.37;


            System.out.println("En metros son:" + metros);
            System.out.println("En centímetros son: " + centimetros);
            System.out.println("En kilómetros son: " + kilometros);
            System.out.println("En pies son: " + pies);
            System.out.println("En pulgadas son: " + pulgadas);

        }
    }

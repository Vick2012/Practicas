
import java.util.Scanner;

public class ConvertirTemperatura {
    public static void main (String[] arg){
        Scanner sc = new Scanner (System.in);

                Scanner scanner = new Scanner(System.in);

        System.out.println("\n\t\tTemperatura de Celsius a Fahrenheit\n");

                System.out.print("Ingrese la temperatura en grados Celsius: ");
                double Celsius = scanner.nextDouble();

                double Fahrenheit = (Celsius * 9/5) + 32;

                System.out.println("La temperatura en grados Fahrenheit es: " + Fahrenheit + " F");


            }
        }



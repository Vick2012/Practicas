
import java.util.Scanner;

public class TasaDeCambio {
    public static void main (String[] arg){
        Scanner sc = new Scanner (System.in);

                Scanner scanner = new Scanner(System.in);
                System.out.println("\n\t\t Conversor de monedas");

                System.out.print("\nIngrese el valor en pesos: ");
                double valorEnPesos = scanner.nextDouble();


                double tasaDolar = 2500.0;
                double tasaEuro = 3000.0;
                double tasaBolivar = 0.52;


                double valorEnDolares = valorEnPesos / tasaDolar;
                double valorEnEuros = valorEnPesos / tasaEuro;
                double valorEnBolivares = valorEnPesos * tasaBolivar;

                System.out.println();
                System.out.println("En pesos Colombianos :" + valorEnPesos);
                System.out.println("En Dólares $: " + valorEnDolares);
                System.out.println("En Euros € : " + valorEnEuros);
                System.out.println("En Bolívares Bs: " + valorEnBolivares);


            }
        }





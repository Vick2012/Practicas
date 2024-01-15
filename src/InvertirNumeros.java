
import java.util.Scanner;

public class InvertirNumeros {

    public static void main (String[] arg){

                Scanner scanner = new Scanner(System.in);

                System.out.print("Ingrese un número de 3 cifras: ");
                int numero = scanner.nextInt();

                if (numero >= 100 && numero <= 999) {

                    int digito1 = numero % 10; // Obtener la última cifra
                    int digito2 = (numero / 10) % 10; // Obtener la cifra del medio
                    int digito3 = numero / 100; // Obtener la primera cifra

                    int numeroInvertido = digito1 * 100 + digito2 * 10 + digito3;

                    System.out.println("Número invertido: " + numeroInvertido);
                } else {
                    System.out.println("El número ingresado no tiene 3 cifras.");
                }

            }
        }





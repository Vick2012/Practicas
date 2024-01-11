import java.util.Scanner;

public class PedirNumero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número del 1 al 10: ");
        int numero = scanner.nextInt();

        if (numero >= 1 && numero <= 10) {
            String numeroEnLetras = convertirNumeroEnLetras(numero);
            System.out.println("Número en letras: " + numeroEnLetras);
        } else {
            System.out.println("Por favor, ingrese un número válido del 1 al 10.");
        }

        //scanner.close();
    }

    public static String convertirNumeroEnLetras(int numero) {
        return switch (numero) {
            case 1 -> "Uno";
            case 2 -> "Dos";
            case 3 -> "Tres";
            case 4 -> "Cuatro";
            case 5 -> "Cinco";
            case 6 -> "Seis";
            case 7 -> "Siete";
            case 8 -> "Ocho";
            case 9 -> "Nueve";
            case 10 -> "Diez";
            default -> "Número no válido";
        };
    }
}
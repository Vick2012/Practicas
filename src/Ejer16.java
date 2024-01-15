import java.util.Scanner;

public class Ejer16 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la longitud del lado a: ");
        double ladoA = sc.nextDouble();

        System.out.print("Ingrese la longitud del lado b: ");
        double ladoB = sc.nextDouble();

        System.out.print("Ingrese la longitud del lado c: ");
        double ladoC = sc.nextDouble();

        // Calcular p
        double semiperimetro = (ladoA + ladoB + ladoC) / 2;

        // Calcular el área
        double area = Math.sqrt(semiperimetro * (semiperimetro - ladoA) * (semiperimetro - ladoB) * (semiperimetro - ladoC));

        // Mostrar el resultado
        System.out.println("El área del triángulo es: " + area);


    }
}

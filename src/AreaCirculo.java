
import java.util.Scanner;

public class AreaCirculo {
    public static void main (String[] arg){

        Scanner sc = new Scanner (System.in);


                System.out.print("Ingrese el perímetro del círculo: ");
                double perimetro = sc.nextDouble();

                // Calcular el radio usando la fórmula del perímetro
                double radio = perimetro / (2 * Math.PI);

                // Calcular el área usando la fórmula del área
                double area = Math.PI * Math.pow(radio, 2);


                System.out.println("El área del círculo con perímetro " + perimetro + " es: " + area);


            }
        }




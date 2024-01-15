/*En un hospital existen tres áreas: Ginecología, Pediatría, Traumatología. El presupuesto
anual (o monto) del hospital se reparte conforme a lo siguiente: Ginecología 40%, Pediatría
35% y Traumatología 25% del presupuesto. Calcular la cantidad de dinero que recibirá cada
área, para cualquier monto presupuestal.*/


import java.util.Scanner;

public class Hospital {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n\t\tPresupuesto para Hospital");
        System.out.print("Ingrese el monto presupuestal total del hospital: ");
        double montoTotal = sc.nextDouble();

        // Calcular la cantidad de dinero para cada área
        double ginecologia = 0.4 * montoTotal;
        double pediatria = 0.35 * montoTotal;
        double traumatologia = 0.25 * montoTotal;


        System.out.println("\n\t\tDistribución del presupuesto anual del hospital");

        System.out.println("Ginecología:      $ " + ginecologia + "   40%");
        System.out.println("Pediatría:        $ " + pediatria + "   35%");
        System.out.println("Traumatología:    $ " + traumatologia + "   25%");


    }
}

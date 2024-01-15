
import java.util.Scanner;

public class SimuladorEncuesta {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n\t\t SIMULADOR DE ENCUESTA ");
        System.out.print("Ingrese la cantidad de personas a encuestar: ");
        int cantidadEncuestados = sc.nextInt();

        // Variables para almacenar los resultados
        int hombres = 0;
        int mujeres = 0;
        int consumenComidaChatarra = 0;
        int noConsumenComidaChatarra = 0;
        String[] opcionesComidaChatarra = {"Hamburguesa", "Pizza", "Picada"};
        String[] opcionesNoComidaChatarra = {"Frutas", "Jugos", "Suplementos"};
        int[] preferenciasComidaChatarra = new int[3];
        int[] preferenciasNoComidaChatarra = new int[3];

        // Realizar la encuesta para cada persona
        for (int i = 0; i < cantidadEncuestados; i++) {
            System.out.println("Encuesta para la persona " + (i + 1) + ":");

            // Pregunta 1:
            int sexo;
            do {
                System.out.print("Ingrese su tipo de sexo (1.HOMBRE / 2.MUJER): ");
                sexo = sc.nextInt();
                if (sexo != 1 && sexo != 2) {
                    System.out.println("OPCION INCORRECTA. Por favor, ingrese 1 o 2.");
                }
            } while (sexo != 1 && sexo != 2);

            if (sexo == 1) {
                hombres++;
            } else {
                mujeres++;
            }

            // Pregunta 2:
            int consumeComidaChatarra;
            do {
                System.out.print("Usted consume comida chatarra (1. Si /2. No): ");
                consumeComidaChatarra = sc.nextInt();
                if (consumeComidaChatarra != 1 && consumeComidaChatarra != 2) {
                    System.out.println("OPCION INCORRECTA. Por favor, ingrese 1 o 2.");
                }
            } while (consumeComidaChatarra != 1 && consumeComidaChatarra != 2);

            if (consumeComidaChatarra == 1) {
                consumenComidaChatarra++;
                // Pregunta 3:
                int preferencia;
                do {
                    System.out.print("Que prefiere 1.Hamburguesa, 2.Pizza, 3.Picada: ");
                    preferencia = sc.nextInt();
                    if (preferencia < 1 || preferencia > 3) {
                        System.out.println("OPCION INCORRECTA. Por favor, ingrese 1, 2 o 3.");
                    }
                } while (preferencia < 1 || preferencia > 3);

                preferenciasComidaChatarra[preferencia - 1]++;
            } else {
                noConsumenComidaChatarra++;
                // Pregunta 4:
                int preferencia;
                do {
                    System.out.print("Que prefiere 1.Frutas, 2.Jugos, 3.Suplementos: ");
                    preferencia = sc.nextInt();
                    if (preferencia < 1 || preferencia > 3) {
                        System.out.println("OPCION INCORRECTA. Por favor, ingrese 1, 2 o 3.");
                    }
                } while (preferencia < 1 || preferencia > 3);

                preferenciasNoComidaChatarra[preferencia - 1]++;
            }
        }


        System.out.println("\n\t\tResultados de la Encuesta:");
        System.out.println("Cantidad de Hombres encuestados: " + hombres);
        System.out.println("Cantidad de Mujeres encuestadas: " + mujeres);
        System.out.println("Cantidad de personas que consumen comida chatarra: " + consumenComidaChatarra);
        System.out.println("Cantidad de personas que no consumen comida chatarra: " + noConsumenComidaChatarra);

        // Encontrar la comida chatarra que más consumen
        if (consumenComidaChatarra > 0) {
            int maxPreferenciaComidaChatarra = 0;
            for (int i = 1; i < preferenciasComidaChatarra.length; i++) {
                if (preferenciasComidaChatarra[i] > preferenciasComidaChatarra[maxPreferenciaComidaChatarra]) {
                    maxPreferenciaComidaChatarra = i;
                }
            }
            System.out.println("La comida chatarra que más consumen es: " + opcionesComidaChatarra[maxPreferenciaComidaChatarra]);
        } else {
            System.out.println("Nadie consume comida chatarra.");
        }

        // Encontrar lo que menos gusta a quienes no consumen comida chatarra
        if (noConsumenComidaChatarra > 0) {
            int minPreferenciaNoComidaChatarra = 0;
            for (int i = 1; i < preferenciasNoComidaChatarra.length; i++) {
                if (preferenciasNoComidaChatarra[i] < preferenciasNoComidaChatarra[minPreferenciaNoComidaChatarra]) {
                    minPreferenciaNoComidaChatarra = i;
                }
            }
            System.out.println("Lo que menos gusta a quienes no consumen comida chatarra es: " + opcionesNoComidaChatarra[minPreferenciaNoComidaChatarra]);
        } else {
            System.out.println("Todos consumen comida chatarra.");
        }


    }
}

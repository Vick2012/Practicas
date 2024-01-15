/*Un alumno desea saber cuál será su calificación final en la materia de Fundamentos de
Programación. Dicha calificación final se compone de los siguientes porcentajes:

60% Del promedio de sus 5 calificaciones parciales.
25% Nota de la exposición
15% Taller.*/

import java.util.Scanner;

public class CalificacionFinal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("\n\t\t Nota final");
        double sumaCalificaciones = 0;
        for (int i = 1; i <= 2; i++) {
            double calificacionParcial;
            do {
                System.out.print("Ingrese la calificación parcial " + i + " (de 0 a 5): ");
                calificacionParcial = scanner.nextDouble();

                if (calificacionParcial < 0 || calificacionParcial > 5) {
                    System.out.println("\t\tLa cantidad ingresada no está dentro del rango permitido. Intente de nuevo.");
                }

                 }while (calificacionParcial < 0 || calificacionParcial > 5) ;

                sumaCalificaciones += calificacionParcial;
                }

                // Calcular el promedio de las calificaciones parciales
                double promedioParciales = sumaCalificaciones / 2;

                // Solicitar al usuario ingresar la nota de la exposición
                double notaExposicion;
                do {
                    System.out.print("Ingrese la calificación de la exposición (de 0 a 5): ");
                    notaExposicion = scanner.nextDouble();
                } while (notaExposicion < 0 || notaExposicion > 5);

                // Solicitar al usuario ingresar la calificación del taller
                double calificacionTaller;
                do {
                    System.out.print("Ingrese la calificación del taller (de 0 a 5): ");
                    calificacionTaller = scanner.nextDouble();
                } while (calificacionTaller < 0 || calificacionTaller > 5);

                // Calcular la calificación final según los porcentajes dados
                double calificacionFinal = (promedioParciales * 0.6) + (notaExposicion * 0.25) + (calificacionTaller * 0.15);


                System.out.println("\nLa calificación final en Fundamentos de Programación es: " + calificacionFinal);


            }
        }


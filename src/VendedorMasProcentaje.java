/*. Un vendedor recibe un sueldo base, más un 20% extra por comisión de sus ventas (Es decir,
20% de las ventas de más que hace el vendedor) El vendedor desea saber cuánto dinero
obtendrá por concepto de comisiones por las 3 ventas que realiza en el mes y el total que
recibirá en el mes tomando en cuenta su sueldo base y sus comisiones. (El usuario ingresa
el sueldo base y el valor de las 3 ventas por comisiones).*/

import java.util.Scanner;

public class VendedorMasProcentaje {
    public static void main (String[] arg){
        Scanner sc = new Scanner (System.in);

                System.out.println("\n\t\t Sueldo más % de comisión\n");
                System.out.print("Ingrese el sueldo base del vendedor: ");
                double sueldoBase = sc.nextDouble();

                double ventas1, ventas2, ventas3;
                System.out.print("Ingrese el valor de la primera venta: ");
                ventas1 = sc.nextDouble();
                System.out.print("Ingrese el valor de la segunda venta: ");
                ventas2 = sc.nextDouble();
                System.out.print("Ingrese el valor de la tercera venta: ");
                ventas3 = sc.nextDouble();

                double comisiones = 0.2 * (ventas1 + ventas2 + ventas3);

                double totalMes = sueldoBase + comisiones;

                System.out.println("El monto total por comisiones es: " + comisiones);
                System.out.println("El total que recibirá el vendedor en el mes es: " + totalMes);


            }
        }



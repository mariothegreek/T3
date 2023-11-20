package EjerciciosSwitch;

import java.util.Scanner;

public class EstacionesAño {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Introduce número del 1 al 12");
        int numero = scanner.nextInt();

        // Enero 31 días
        // Febrero 28
        //Marzo 31
        //Abril 30
        //Mayo 31
        //Junio 30
        //Julio 31
        //Agosto 31
        //Sep 30
        //Oct 31
        //Nov 30
        //Dic 31

        switch (numero){

            case 11,12,1,2:
                System.out.println("Invierno");
                break;

            case 3,4,5:
                System.out.println("Primavera");
                break;

            case 6,7,8:
                System.out.println("Verano");
                break;

            case 9,10:
                System.out.println("Otoño");

            default:
                System.out.println("Mes no existente");

        }
        System.out.println("Programa termina");
    }
}
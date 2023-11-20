package EjerciciosSwitch;

import java.util.Scanner;

public class DiasMes {
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

            case 1,3,5,7,8,10,12:
                System.out.println("el mes tiene 31 días");
                break;

            case 4,6,9,11:
                System.out.println("El mes tiene 30 días");
                break;

            case 2:
                System.out.println("El mes tiene 28 días");
                break;

            default:
                System.out.println("Número no válido");

        }
    }
}

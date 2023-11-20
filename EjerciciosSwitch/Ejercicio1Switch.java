package EjerciciosSwitch;

import java.util.Scanner;

public class Ejercicio1Switch {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce numero del 1 al 7");
        int numero = scanner.nextInt();
        switch (numero) {

            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Número introducido no válido");
        }
        System.out.println("Programa finaliza");
    }
}

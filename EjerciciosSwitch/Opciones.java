package EjerciciosSwitch;

import java.security.DrbgParameters;
import java.util.Scanner;

public class Opciones {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce numero del 1 al 4");
        int numero = scanner.nextInt();

        switch (numero) {

            case 1:
                System.out.println("Opción 1 seleccionada");
                break;
            case 2:
                System.out.println("Opción 2 seleccionada");
                break;
            case 3:
                System.out.println("Opción 3 seleccionada");
                break;
            case 4:
                System.out.println("Opción 4 seleccionada");
                break;
            default:
                System.out.println("Numero no válido");
        }
        System.out.println("Programa finaliza");
    }
}

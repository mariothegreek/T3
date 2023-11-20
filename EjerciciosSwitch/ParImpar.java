package EjerciciosSwitch;

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("introduce número");
        int numero = scanner.nextInt();

        String result= "";

        switch(numero%2){

            case 0:
                System.out.println("Par");
                break;

            default:
                System.out.println("Impar");

        }
        }
    }

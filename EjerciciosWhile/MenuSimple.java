package EjerciciosWhile;

import java.util.Scanner;

public class MenuSimple {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Inicio");
            System.out.println("Opcion 1");
            System.out.println("Opcion 2");
            System.out.println("Opcion 3");
            System.out.println("Opcion 4");
            System.out.println("Opcion 5 - Salir");
            System.out.println("¿Qué quieres hacer?");
            opcion= scanner.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("Opcion 1 seleccionada");
                    break;
                case 2:
                    System.out.println("Opcion 2 seleccionada");
                    break;
                case 3:
                    System.out.println("Opcion 3 seleccionada");
                    break;
                case 4:
                    System.out.println("Opcion 4 seleccionada");
                    break;
            }
            System.out.println("Programa termina");
        }while (opcion==5);
    }
}

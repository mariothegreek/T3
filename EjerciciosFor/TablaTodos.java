package EjerciciosFor;

import java.util.Scanner;

public class TablaTodos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un número. ");
        int numero= scanner.nextInt();

            for (int i = 0; i <11; i++) {
                System.out.printf("%d X %d = %d\n",numero,i,numero*i);
            }
            System.out.println("Programa termina");
          }
        }

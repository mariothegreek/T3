package EjerciciosFor;

import java.util.Scanner;

public class Dado {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Cuántas veces quieres tirar el dado? ");
        int veces= scanner.nextInt();
        if (veces<0){

            veces=100;}

            for (int i = 0; i < veces; i++) {

                int aleatorio = (int) (Math.random()*7);

                System.out.println(aleatorio);
        }
        System.out.println("Programa termina");
    }
}

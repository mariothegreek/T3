package EjerciciosFor;

import java.util.Scanner;

public class Adivinacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int aleatorio = (int) (Math.random()*31);
        System.out.println("Introduce número, e intenta adivinar!");
        System.out.println(aleatorio);

        int intentos=0;

        for (int i = 0; i < 10; i++) {
            int numero= scanner.nextInt();

            if (numero==aleatorio){
                intentos++;
                System.out.printf("¡Lo has adivinado en %d intentos!",intentos);
            }else{
                intentos++;
                System.out.println("Has fallado...inténtalo de nuevo");}

        }

    }
}

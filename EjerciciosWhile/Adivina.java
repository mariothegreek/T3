package EjerciciosWhile;

import java.util.Scanner;

public class Adivina {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        int numero=0;
        int contador=1;


        System.out.println("Se está generando un numero aleatorio...");
        int numeroAleatorio= (int) (Math.random()*21);
        System.out.println(numeroAleatorio);
        System.out.println("Introduce un numero, a ver si lo adivinas...");

        do {
            numero= scanner.nextInt();
            if (numero!=numeroAleatorio){
                System.out.println("Lo siento, inténtalo de nuevo");
                contador++;
            }
        }while (numero!=numeroAleatorio);{}

        System.out.printf("Enhorabuena, has acertado el numero en %d intentos",contador);
    }
}

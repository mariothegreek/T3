package EjerciciosWhile;

import java.util.Scanner;

public class Sumarpositivos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sumaEnteros=0;
        int numero=1;

        System.out.println("Inicio de programa");

        while (numero!=0){
            System.out.println("Introduce un número entero");
            numero= scanner.nextInt();

            if (numero>0){
            sumaEnteros=sumaEnteros+numero;}
        }
        System.out.println("La suma de todos los números positivos introducidos es: "+sumaEnteros);

    }
}

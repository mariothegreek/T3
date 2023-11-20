package EjerciciosFor;

import java.util.Scanner;

public class TabladeMultiplicar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce numero del 1 al 10. ");
        int numero= scanner.nextInt();

        if (numero>0 && numero<=10){
            for (int i = 0; i <11; i++) {
                System.out.printf("%d X %d = %d\n",numero,i,numero*i);
            }
            System.out.println("Programa termina");
        }else{
            System.out.println("El numero no está entre el rango");
        }

    }
}

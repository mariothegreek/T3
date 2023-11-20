package EjerciciosFor;

import java.util.Scanner;

public class Sueldos {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);


        System.out.println("Cuántos sueldos quieres calcular");
        int veces= scanner.nextInt();
        int suma=0;
        int media=0;
        int sueldo=0;
        int sueldosmasmil=0;

        for (int i = 0; i <veces ; i++) {

            System.out.println("Introduce sueldo");
            sueldo= scanner.nextInt();
            suma=suma+sueldo;
            media=suma/veces;

            if (sueldo>1000){
                sueldosmasmil++;}

        }System.out.println(suma);
        System.out.println(media);
        System.out.println(sueldosmasmil);
    }
}

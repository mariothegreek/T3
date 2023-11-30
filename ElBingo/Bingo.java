package ElBingo;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Bingo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroGenerado;
        int numeroGenerado1;
        int userApuesta;
        int userIntentos;
        int aciertos;
        int intentosContador = 1;
        int aciertosContador = 1;
        int intentos=1;
        boolean bingo = false;


        System.out.println("Haz tu apuesta");
        userApuesta = scanner.nextInt();
        System.out.println("¿En cuántos intentos crees que acertarás?");
        userIntentos= scanner.nextInt();

        int[] carton = new int[10];
        int[] numerosBingo = new int[99];

        System.out.print("Este es tu carton: ");

        for (int i = 0; i < carton.length; i++) {
            boolean repetido;
            do {
                repetido = false;
                numeroGenerado = (int) (Math.random() *10)+1;

                for (int j = 0; j < carton.length; j++) {

                    if (carton[j] == numeroGenerado) {
                        repetido = true;
                    }
                }
            } while (repetido);

            carton[i] = numeroGenerado;

            System.out.print(carton[i] + " ");
        }
        System.out.println();
        System.out.println("¡Empieza el bingo!");



        for (int i = 0; i < numerosBingo.length; i++) {
            boolean repetido;
            do {
                repetido = false;
                numeroGenerado1 = (int) (Math.random() * 99)+1;

                for (int j = 0; j < numerosBingo.length; j++) {

                    if (numeroGenerado1==numerosBingo[j]) {
                        repetido = true;
                    }
                }
            } while (repetido);

            numerosBingo[i] = numeroGenerado1;
            System.out.println(numerosBingo[i]);
            intentosContador++;

            for (int j = 0; j < carton.length; j++) {

                if (numerosBingo[i]==carton[j]){
                    aciertosContador++;

                    if (aciertosContador==6){
                        System.out.println("Linea");
                    }

                    if (aciertosContador==11){
                        System.out.println("Bingo");
                        bingo=true;
                        break;
                    }
                }
            }
            if (bingo){
                break;
            }
        }
        if (userIntentos==intentosContador){
            userApuesta=userApuesta*10;
            System.out.println("¡Enhorabuena, has acertado el número de intentos!"+" Has ganado: "+userApuesta);
        }
        System.out.println(aciertosContador);
        System.out.println(intentosContador);
    }
}

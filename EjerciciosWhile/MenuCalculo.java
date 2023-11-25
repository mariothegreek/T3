package EjerciciosWhile;

import java.util.Scanner;

public class MenuCalculo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int opcion;
        int numero;
        int numero1;
        int suma;
        int resta;
        int multiplicacion;
        double division;

        do {
            System.out.println("Bienvenido a la aplicacion de calculos");
            System.out.println("Por favor, introduce primer numero");
            numero= scanner.nextInt();
            System.out.println("Por favor, introduce segundo numero");
            numero1= scanner.nextInt();
            System.out.println("¿Qué quieres hacer?");

            System.out.println("1- Sumar");
            System.out.println("2- Restar");
            System.out.println("3- Multiplicar");
            System.out.println("4- Dividir");
            System.out.println("Opcion 5 - Salir");

            opcion= scanner.nextInt();

            switch (opcion){
                case 1:
                    suma=numero+numero1;
                    System.out.println("El resultado de la suma es "+suma);
                    break;
                case 2:
                    resta=numero-numero1;
                    System.out.println("El resultado de la resta es "+resta);
                    break;
                case 3:
                    multiplicacion=numero*numero1;
                    System.out.println("El resultado de la multiplicacion es "+multiplicacion);
                    break;
                case 4:
                    division= (double) numero/numero1;
                    System.out.println("El resultado de la division es "+division);
                    break;
            }
            System.out.println("Programa termina");
        }while (opcion==5);
    }
}

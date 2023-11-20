package EjerciciosSwitch;

import java.util.Scanner;

public class OperacionMat {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Introduce operación que quieras realizar");
        char simbolo= reader.next().charAt(0);

        int digito1=0, digito2=0;
        double resultado= 0.0;

        if (simbolo==42||simbolo==43||simbolo==45||simbolo==47){

            System.out.println("Introduce primer digito");
            digito1= reader.nextInt();

            System.out.println("Introduce segundo dígito");
            digito2=reader.nextInt();

        } else System.out.println("El símbolo no es válido");


        switch(simbolo){

            case '+':
                resultado = digito1+digito2;
                System.out.println("El resultado es " + resultado);
                break;
            case '-':
                resultado = digito1-digito2;
                System.out.println("El resultado es " + resultado);
                break;
            case '*':
                resultado = digito1*digito2;
                System.out.println("El resultado es " + resultado);
                break;
            case '/':
                resultado = (double) digito1 / digito2;
                System.out.println("El resultado es " + resultado);
                break;
        }
        System.out.println("Programa termina");
    }
}
package EjerciciosFor;

import java.util.Scanner;

public class BaseExponente {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int resultado=1;

        System.out.println("Introduce base desde 1 a 5: ");
        int base= scanner.nextInt();

        if (base<=0 || base>5){
            System.out.println("Rango no válido");
        }else{

        System.out.println("Introduce exponente");
        int exponente= scanner.nextInt();

        if (exponente<=0 || exponente>5){
            System.out.println("Rango no válido");
        }else{

        for (int i = 1; i <=exponente; i++) {
            resultado= resultado* base;

        }System.out.println("El resultado de "+base+" elevado a "+exponente+" es "+resultado);
        }

        }
    }
}

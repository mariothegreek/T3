package EjerciciosFor;

import java.util.Scanner;

public class TemperaturasIntroducidas {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Introduce cuantas temperaturas quieres calcular. ");
        double numeroTemp = scanner.nextDouble();

        double resultadoSuma=0;
        double resultadoMedia=0;

        if (numeroTemp<=0){
            numeroTemp=10;
        }


        for (int i = 0; i <numeroTemp; i++) {
            System.out.println("Introduzca temperatura");
            double temp= scanner.nextDouble();

            resultadoSuma=resultadoSuma+temp;
            resultadoMedia=resultadoSuma/numeroTemp;
        }
        System.out.println("La media es "+resultadoMedia);
    }
}

package EjerciciosFor;

import java.util.Scanner;

public class NotasTipos {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Introduce 6 notas");

        int aprobado=0;
        int condicionado=0;
        int suspenso=0;


        for (int i = 0; i <6 ; i++) {
            int nota= scanner.nextInt();
            if (nota>4){
                aprobado++;
            }
            if (nota==4){
                condicionado++;
            }
            if (nota<4){
                suspenso++;
            }
        }
        System.out.printf("El número de aprobados es %d el número de condicionados es %d y el número de suspensos es %d ",aprobado,condicionado,suspenso);
    }
}

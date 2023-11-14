import java.util.Scanner;

public class notas1al5 {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Escribe tu nota del 1 al 5: ");

        int nota = reader.nextInt();

        switch (nota){

            case 1:
                System.out.println("Suspenso");
                break;
            case 2:
                System.out.println("Suspenso");
                break;
            case 3:
                System.out.println("Aprobado");
            case 4:
                System.out.println("Notable");
                break;
            case 5:
                System.out.println("Sobresalliente");
                break;

            default:
                System.out.println("Número introducido no válido");

        }
        System.out.println("Programa termina");
    }
}

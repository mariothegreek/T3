import java.util.Scanner;

public class VocalConsonante {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce letra:");

        String letra = scanner.next();
        switch(letra.toUpperCase()){
            case"A", "E", "I","O","U":
                System.out.println("Vocal");
                break;
            default:
                System.out.println("Consonante");
        }
        System.out.println("Programa termina");
    }
}

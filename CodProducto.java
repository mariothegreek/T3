import java.util.Scanner;

public class CodProducto {
    public static void main(String[] args) {
        Scanner reader= new Scanner(System.in);

        System.out.println("Introduce códifo de producto:");
        String codigo = reader.next();

        double precio= 0.0;
        String nombre;

        switch (codigo){
            case "A001":
                System.out.println("Almohadilla de escritorio");
                precio = 5.80;
                System.out.println(precio);
                break;
            case "A002":
                System.out.println("Soporte para DualShock 5");
                precio=10.25;
                System.out.println(precio);
                break;
            case"B001":System.out.println("Altavoces inalámbricos");
                precio=12.95;
                System.out.println(precio);
                break;
            case"B002":
                System.out.println("Cable USB");
                precio=3.00;
                System.out.println(precio);
                break;
            default:
                System.out.println("El códifo no está registrado");
        }
        System.out.println("Programa termina");
    }
}

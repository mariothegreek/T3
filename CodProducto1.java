import java.util.Scanner;

public class CodProducto1 {
    public static void main(String[] args) {
        Scanner reader= new Scanner(System.in);

        System.out.println("Introduce códifo de producto:");
        String codigo = reader.next();

        String nombre;
        double precio= 0.0;

        switch (codigo){
            case "A001":
                nombre="Almohadilla de escritorio";
                precio = 5.80;
                break;
            case "A002":
                nombre="Soporte para DualShock 5";
                precio=10.25;
                break;
            case"B001":
                nombre="Altavoces inalámbricos";
                precio=12.95;
                break;
            case"B002":
                nombre="Cable USB";
                precio=3.00;
                break;
            default:
                nombre="El cófido del producto no existe";
        }
        System.out.println(nombre);
        if (precio !=0.0){
            System.out.println(precio);
        }
    }
}
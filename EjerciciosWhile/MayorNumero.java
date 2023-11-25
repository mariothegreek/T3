package EjerciciosWhile;

public class MayorNumero {
    public static void main(String[] args) {
        int numeroAleatorio=0;
        int numeroMayor=0;

        do {
            numeroAleatorio= (int) (Math.random()*101);
            System.out.println(numeroAleatorio);

            if (numeroAleatorio>numeroMayor){
                numeroMayor=numeroAleatorio;
            }
        }while (numeroAleatorio!=0);{
            System.out.println("El programa termina, el numero más grande ha sido el: "+numeroMayor);
        }
    }
}

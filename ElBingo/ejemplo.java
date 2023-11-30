package ElBingo;

public class ejemplo {

    public static void main(String[] args) {
        int[] carton = new int[10];



        for (int i = 0; i < 10; i++) {

            int numero;
            boolean comprobacion = false;

            do {
                numero = (int) (Math.random() * 20) + 1;
                if (numero % 2 == 0) {
                    comprobacion = true;
                    carton[i] = numero;
                } else {
                    comprobacion = false;
                }

            } while (comprobacion);
            System.out.println(carton[i]);

        }

    }

}

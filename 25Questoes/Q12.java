import java.util.Scanner;

public class ContarPrimos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int quantidadePrimos = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o número " + i + ": ");
            int num = entrada.nextInt();

            if (num > 1) {
                boolean primo = true;
                for (int j = 2; j <= Math.sqrt(num); j++) {
                    if (num % j == 0) {
                        primo = false;
                        break;
                    }
                }
                if (primo) quantidadePrimos++;
            }
        }

        System.out.println("\nQuantidade de números primos: " + quantidadePrimos);
        entrada.close();
    }
}

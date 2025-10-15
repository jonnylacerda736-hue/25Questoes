import java.util.Scanner;

public class SomaParesPrimos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int somaPares = 0, somaPrimos = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o número " + i + ": ");
            int num = entrada.nextInt();

            if (num % 2 == 0) somaPares += num;

            if (num > 1) {
                boolean primo = true;
                for (int j = 2; j <= Math.sqrt(num); j++) {
                    if (num % j == 0) {
                        primo = false;
                        break;
                    }
                }
                if (primo) somaPrimos += num;
            }
        }

        System.out.println("\nSoma dos números pares: " + somaPares);
        System.out.println("Soma dos números primos: " + somaPrimos);

        entrada.close();
    }
}

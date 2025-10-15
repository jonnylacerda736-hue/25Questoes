import java.util.Scanner;

public class AudienciaCanais {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int canal, total = 0;
        int c4 = 0, c5 = 0, c7 = 0, c12 = 0;

        do {
            System.out.print("Digite o canal (0 para finalizar): ");
            canal = entrada.nextInt();
            if (canal == 4) c4++;
            else if (canal == 5) c5++;
            else if (canal == 7) c7++;
            else if (canal == 12) c12++;
            if (canal != 0) total++;
        } while (canal != 0);

        if (total > 0) {
            System.out.printf("Canal 4: %.2f%%\n", (c4 / (double)total) * 100);
            System.out.printf("Canal 5: %.2f%%\n", (c5 / (double)total) * 100);
            System.out.printf("Canal 7: %.2f%%\n", (c7 / (double)total) * 100);
            System.out.printf("Canal 12: %.2f%%\n", (c12 / (double)total) * 100);
        } else {
            System.out.println("Nenhuma audiência registrada.");
        }

        entrada.close();
    }
}

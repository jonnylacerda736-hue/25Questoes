import java.util.Scanner;

public class OpiniaoEspectadores {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int somaIdadeOtimo = 0, contOtimo = 0, contRegular = 0, contBom = 0;

        for (int i = 1; i <= 15; i++) {
            System.out.print("Idade do espectador " + i + ": ");
            int idade = entrada.nextInt();
            System.out.print("Opinião (3=Ótimo, 2=Bom, 1=Regular): ");
            int opiniao = entrada.nextInt();

            if (opiniao == 3) { somaIdadeOtimo += idade; contOtimo++; }
            else if (opiniao == 2) { contBom++; }
            else if (opiniao == 1) { contRegular++; }
        }

        double mediaOtimo = contOtimo > 0 ? (double)somaIdadeOtimo / contOtimo : 0;
        double percBom = (contBom / 15.0) * 100;

        System.out.printf("\nMédia das idades (Ótimo): %.2f\n", mediaOtimo);
        System.out.println("Quantidade de Regular: " + contRegular);
        System.out.printf("Porcentagem de Bom: %.2f%%\n", percBom);

        entrada.close();
    }
}

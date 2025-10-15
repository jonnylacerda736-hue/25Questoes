import java.util.Scanner;

public class EstatisticasPessoas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int totalIdade = 0, pesoAltura = 0, acima190 = 0, entre10e30Acima190 = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Idade da pessoa " + i + ": ");
            int idade = entrada.nextInt();
            System.out.print("Peso da pessoa " + i + " (kg): ");
            double peso = entrada.nextDouble();
            System.out.print("Altura da pessoa " + i + " (m): ");
            double altura = entrada.nextDouble();

            totalIdade += idade;

            if (peso > 90 && altura < 1.50) pesoAltura++;
            if (altura > 1.90) {
                acima190++;
                if (idade >= 10 && idade <= 30) entre10e30Acima190++;
            }
        }

        double mediaIdades = totalIdade / 10.0;
        double porcentagem = acima190 > 0 ? (entre10e30Acima190 / (double)acima190) * 100 : 0;

        System.out.printf("\nMédia das idades: %.2f\n", mediaIdades);
        System.out.println("Quantidade com peso > 90 kg e altura < 1,50 m: " + pesoAltura);
        System.out.printf("Porcentagem de pessoas entre 10 e 30 anos com altura > 1,90 m: %.2f%%\n", porcentagem);

        entrada.close();
    }
}

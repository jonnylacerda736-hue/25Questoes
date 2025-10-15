import java.util.Scanner;

public class PesquisaProduto {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int sim = 0, nao = 0, mulheresSim = 0, homens = 0, homensNao = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Sexo (M/F): ");
            char sexo = entrada.next().toUpperCase().charAt(0);
            System.out.print("Resposta (S/N): ");
            char resposta = entrada.next().toUpperCase().charAt(0);

            if (resposta == 'S') sim++;
            else if (resposta == 'N') nao++;

            if (sexo == 'F' && resposta == 'S') mulheresSim++;
            if (sexo == 'M') {
                homens++;
                if (resposta == 'N') homensNao++;
            }
        }

        double percHomensNao = homens > 0 ? (homensNao / (double)homens) * 100 : 0;

        System.out.println("\nNúmero de pessoas que responderam 'sim': " + sim);
        System.out.println("Número de pessoas que responderam 'não': " + nao);
        System.out.println("Número de mulheres que responderam 'sim': " + mulheresSim);
        System.out.printf("Porcentagem de homens que responderam 'não': %.2f%%\n", percHomensNao);

        entrada.close();
    }
}

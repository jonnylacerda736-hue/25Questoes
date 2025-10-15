import java.util.Scanner;

public class TransacoesLoja {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double totalVista = 0, totalPrazo = 0;

        for (int i = 1; i <= 15; i++) {
            System.out.print("Código da transação (V/P): ");
            char codigo = entrada.next().toUpperCase().charAt(0);
            System.out.print("Valor da transação: ");
            double valor = entrada.nextDouble();

            if (codigo == 'V') totalVista += valor;
            else if (codigo == 'P') totalPrazo += valor;
        }

        double totalGeral = totalVista + totalPrazo;
        double primeiraPrestacao = totalPrazo / 3;

        System.out.printf("\nTotal à vista: R$ %.2f", totalVista);
        System.out.printf("\nTotal a prazo: R$ %.2f", totalPrazo);
        System.out.printf("\nTotal geral: R$ %.2f", totalGeral);
        System.out.printf("\nValor da primeira prestação (a prazo): R$ %.2f\n", primeiraPrestacao);

        entrada.close();
    }
}

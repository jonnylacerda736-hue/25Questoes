import java.util.Scanner;

public class PrecoCarro {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o valor do carro: R$ ");
        double valor = entrada.nextDouble();

        double valorAVista = valor * 0.8;
        System.out.printf("\nÀ vista: R$ %.2f\n", valorAVista);

        int[] parcelas = {6, 12, 18, 24, 30, 36, 42, 48, 54, 60};
        double[] acrescimos = {0.03, 0.06, 0.09, 0.12, 0.15, 0.18, 0.21, 0.24, 0.27, 0.30};

        System.out.println("\nParcelas\tPreço Final\tValor da Parcela");
        for (int i = 0; i < parcelas.length; i++) {
            double precoFinal = valor * (1 + acrescimos[i]);
            double valorParcela = precoFinal / parcelas[i];
            System.out.printf("%d\t\tR$ %.2f\t\tR$ %.2f\n", parcelas[i], precoFinal, valorParcela);
        }

        entrada.close();
    }
}

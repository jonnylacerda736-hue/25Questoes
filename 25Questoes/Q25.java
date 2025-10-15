import java.util.Scanner;

public class Investimentos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int codigo;
        String tipo;
        double valor, totalInvestido = 0, totalJuros = 0;

        do {
            System.out.print("Código do cliente (<=0 para sair): ");
            codigo = entrada.nextInt();
            if (codigo <= 0) break;

            System.out.print("Tipo de investimento (Poupança/Plus/Renda Fixa): ");
            tipo = entrada.next();
            System.out.print("Valor investido: ");
            valor = entrada.nextDouble();

            double rendimento = 0;
            if (tipo.equalsIgnoreCase("Poupança")) rendimento = valor * 0.015;
            else if (tipo.equalsIgnoreCase("Plus")) rendimento = valor * 0.02;
            else if (tipo.equalsIgnoreCase("Renda") || tipo.equalsIgnoreCase("RendaFixa") || tipo.equalsIgnoreCase("Renda_Fixa"))
                rendimento = valor * 0.04;

            totalInvestido += valor;
            totalJuros += rendimento;

            System.out.printf("Rendimento mensal: R$ %.2f\n", rendimento);
        } while (codigo > 0);

        System.out.printf("\nTotal investido: R$ %.2f\nTotal de juros pagos: R$ %.2f\n", totalInvestido, totalJuros);
        entrada.close();
    }
}

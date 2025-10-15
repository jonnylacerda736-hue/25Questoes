import java.util.Scanner;

public class MenuSalario {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcao;
        double salario, reajuste;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Novo salário");
            System.out.println("2. Férias");
            System.out.println("3. Décimo terceiro");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = entrada.nextInt();

            if (opcao == 4) break;

            System.out.print("Digite o salário: ");
            salario = entrada.nextDouble();

            switch (opcao) {
                case 1:
                    if (salario <= 1000) reajuste = salario * 0.15;
                    else if (salario <= 2000) reajuste = salario * 0.10;
                    else reajuste = salario * 0.05;
                    System.out.printf("Novo salário: R$ %.2f\n", salario + reajuste);
                    break;
                case 2:
                    System.out.printf("Férias: R$ %.2f\n", salario + salario / 3);
                    break;
                case 3:
                    System.out.print("Meses trabalhados: ");
                    int meses = entrada.nextInt();
                    System.out.printf("Décimo terceiro proporcional: R$ %.2f\n", (salario / 12) * meses);
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 4);

        entrada.close();
    }
}

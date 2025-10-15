import java.util.Scanner;

public class MenuCalculoMedias {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            exibirMenu();
            if (scanner.hasNextInt()) {
                opcao = scanner.nextInt();
                scanner.nextLine();

                switch (opcao) {
                    case 1:
                        calcularMediaAritmetica(scanner);
                        break;
                    case 2:
                        calcularMediaPonderada(scanner);
                        break;
                    case 3:
                        System.out.println("Programa encerrado. Até logo!");
                        break;
                    default:
                        System.out.println("Opção inválida. Por favor, escolha 1, 2 ou 3.");
                        break;
                }
            } else {
                System.out.println("Entrada inválida. Por favor, digite um número.");
                scanner.next();
                opcao = 0;
            }
        } while (opcao != 3);

        scanner.close();
    }

    public static void exibirMenu() {
        System.out.println("\n--- MENU DE CÁLCULO DE MÉDIAS ---");
        System.out.println("1. Média Aritmética (2 notas)");
        System.out.println("2. Média Ponderada (3 notas e pesos)");
        System.out.println("3. Sair");
        System.out.print("Escolha uma opção: ");
    }

    public static void calcularMediaAritmetica(Scanner scanner) {
        System.out.println("\n--- Média Aritmética ---");
        try {
            System.out.print("Digite a primeira nota: ");
            double n1 = scanner.nextDouble();
            System.out.print("Digite a segunda nota: ");
            double n2 = scanner.nextDouble();

            double media = (n1 + n2) / 2.0;
            System.out.printf("A média aritmética é: %.2f\n", media);
        } catch (java.util.InputMismatchException e) {
            System.out.println("Erro: Entrada inválida. Por favor, digite valores numéricos.");
            scanner.nextLine();
        }
    }

    public static void calcularMediaPonderada(Scanner scanner) {
        System.out.println("\n--- Média Ponderada ---");
        try {
            System.out.print("Nota 1: ");
            double n1 = scanner.nextDouble();
            System.out.print("Peso 1: ");
            double p1 = scanner.nextDouble();
            
            System.out.print("Nota 2: ");
            double n2 = scanner.nextDouble();
            System.out.print("Peso 2: ");
            double p2 = scanner.nextDouble();

            System.out.print("Nota 3: ");
            double n3 = scanner.nextDouble();
            System.out.print("Peso 3: ");
            double p3 = scanner.nextDouble();

            double somaProdutos = (n1 * p1) + (n2 * p2) + (n3 * p3);
            double somaPesos = p1 + p2 + p3;
            
            if (somaPesos > 0) {
                double media = somaProdutos / somaPesos;
                System.out.printf("A média ponderada é: %.2f\n", media);
            } else {
                System.out.println("A soma dos pesos deve ser maior que zero.");
            }
        } catch (java.util.InputMismatchException e) {
            System.out.println("Erro: Entrada inválida. Por favor, digite valores numéricos.");
            scanner.nextLine();
        }
    }
}
import java.util.Scanner;

public class CalculoMediaAlturas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double somaAlturas = 0;
        int contPessoasMais50 = 0;
        int idade;

        System.out.println("--- Cálculo da Média de Alturas (Pessoas com mais de 50 anos) ---");
        System.out.println("Digite idade <= 0 (zero ou negativo) para encerrar.");

        while (true) {
            System.out.print("\nDigite a idade: ");
            if (scanner.hasNextInt()) {
                idade = scanner.nextInt();
                
                if (idade <= 0) {
                    break;
                }

                if (idade > 50) {
                    double altura;
                    System.out.print("Digite a altura (em metros): ");
                    
                    if (scanner.hasNextDouble()) {
                        altura = scanner.nextDouble();
                        somaAlturas += altura;
                        contPessoasMais50++;
                    } else {
                        System.out.println("Entrada de altura inválida. Ignorando esta pessoa.");
                        scanner.next(); // Limpa a entrada inválida
                    }
                } else {
                    System.out.println("Idade <= 50 anos. Altura não será considerada no cálculo da média.");
                }
            } else {
                System.out.println("Entrada de idade inválida. Por favor, digite um número inteiro.");
                scanner.next(); // Limpa a entrada inválida
            }
        }

        System.out.println("\n--- Resultados ---");
        if (contPessoasMais50 > 0) {
            double mediaAlturas = somaAlturas / contPessoasMais50;
            System.out.printf("Total de pessoas com mais de 50 anos consideradas: %d\n", contPessoasMais50);
            System.out.printf("Soma das alturas: %.2f metros\n", somaAlturas);
            System.out.printf("Média das alturas das pessoas com mais de 50 anos: %.2f metros\n", mediaAlturas);
        } else {
            System.out.println("Nenhuma pessoa com mais de 50 anos foi registrada para o cálculo da média.");
        }

        scanner.close();
    }
}
import java.util.Scanner;

public class DadosPessoas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int idade, minIdade = Integer.MAX_VALUE, maxIdade = Integer.MIN_VALUE, mulheres200 = 0;
        double salario, somaSalario = 0, menorSalario = Double.MAX_VALUE;
        String sexo, nomeMenorSalario = "";
        int cont = 0;

        do {
            System.out.print("Idade (negativa para sair): ");
            idade = entrada.nextInt();
            if (idade < 0) break;

            System.out.print("Sexo (M/F): ");
            sexo = entrada.next();
            System.out.print("Salário: ");
            salario = entrada.nextDouble();

            somaSalario += salario;
            cont++;

            if (idade < minIdade) minIdade = idade;
            if (idade > maxIdade) maxIdade = idade;

            if (sexo.equalsIgnoreCase("F") && salario <= 200) mulheres200++;

            if (salario < menorSalario) {
                menorSalario = salario;
                nomeMenorSalario = "Pessoa " + cont;
            }
        } while (true);

        double mediaSalario = cont > 0 ? somaSalario / cont : 0;
        System.out.printf("\nMédia salarial: %.2f\n", mediaSalario);
        System.out.println("Maior idade: " + maxIdade);
        System.out.println("Menor idade: " + minIdade);
        System.out.println("Mulheres com salário até R$200: " + mulheres200);
        System.out.println("Pessoa com menor salário: " + nomeMenorSalario + " (R$ " + menorSalario + ")");
        entrada.close();
    }
}

import java.util.Scanner;

public class MaiorMenor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num, maior = Integer.MIN_VALUE, menor = Integer.MAX_VALUE;

        do {
            System.out.print("Digite um número positivo (0 para sair): ");
            num = entrada.nextInt();
            if (num > 0) {
                if (num > maior) maior = num;
                if (num < menor) menor = num;
            }
        } while (num != 0);

        if (maior != Integer.MIN_VALUE)
            System.out.println("Maior: " + maior + "\nMenor: " + menor);
        else
            System.out.println("Nenhum número válido foi digitado.");

        entrada.close();
    }
}

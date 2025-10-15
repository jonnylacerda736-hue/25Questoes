import java.util.Scanner;

public class MediaIdades {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int idade, soma = 0, cont = 0;

        do {
            System.out.print("Digite a idade (0 para finalizar): ");
            idade = entrada.nextInt();
            if (idade != 0) {
                soma += idade;
                cont++;
            }
        } while (idade != 0);

        double media = cont > 0 ? (double)soma / cont : 0;
        System.out.printf("Média das idades: %.2f\n", media);
        entrada.close();
    }
}

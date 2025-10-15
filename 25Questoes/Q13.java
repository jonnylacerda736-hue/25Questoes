import java.util.Scanner;

public class MediaPesoFaixaEtaria {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double soma1 = 0, soma2 = 0, soma3 = 0, soma4 = 0;
        int cont1 = 0, cont2 = 0, cont3 = 0, cont4 = 0;

        for (int i = 1; i <= 15; i++) {
            System.out.print("Idade da pessoa " + i + ": ");
            int idade = entrada.nextInt();
            System.out.print("Peso da pessoa " + i + ": ");
            double peso = entrada.nextDouble();

            if (idade >= 1 && idade <= 10) { soma1 += peso; cont1++; }
            else if (idade >= 11 && idade <= 20) { soma2 += peso; cont2++; }
            else if (idade >= 21 && idade <= 30) { soma3 += peso; cont3++; }
            else if (idade >= 31) { soma4 += peso; cont4++; }
        }

        System.out.printf("\nMédia peso 1-10 anos: %.2f\n", cont1 > 0 ? soma1/cont1 : 0);
        System.out.printf("Média peso 11-20 anos: %.2f\n", cont2 > 0 ? soma2/cont2 : 0);
        System.out.printf("Média peso 21-30 anos: %.2f\n", cont3 > 0 ? soma3/cont3 : 0);
        System.out.printf("Média peso acima de 31 anos: %.2f\n", cont4 > 0 ? soma4/cont4 : 0);

        entrada.close();
    }
}

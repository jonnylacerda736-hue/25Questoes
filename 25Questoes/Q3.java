import java.util.Scanner;

public class FaixaEtaria {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] idades = new int[8];
        int f1 = 0, f2 = 0, f3 = 0, f4 = 0, f5 = 0;

        for (int i = 0; i < 8; i++) {
            System.out.print("Idade da pessoa " + (i + 1) + ": ");
            idades[i] = entrada.nextInt();
            if (idades[i] <= 15) f1++;
            else if (idades[i] <= 30) f2++;
            else if (idades[i] <= 45) f3++;
            else if (idades[i] <= 60) f4++;
            else f5++;
        }

        System.out.println("\nFaixa 1 (até 15 anos): " + f1);
        System.out.println("Faixa 2 (16 a 30 anos): " + f2);
        System.out.println("Faixa 3 (31 a 45 anos): " + f3);
        System.out.println("Faixa 4 (46 a 60 anos): " + f4);
        System.out.println("Faixa 5 (acima de 60 anos): " + f5);

        double p1 = (f1 / 8.0) * 100;
        double p5 = (f5 / 8.0) * 100;

        System.out.printf("\nPorcentagem até 15 anos: %.2f%%\n", p1);
        System.out.printf("Porcentagem acima de 60 anos: %.2f%%\n", p5);

        entrada.close();
    }
}

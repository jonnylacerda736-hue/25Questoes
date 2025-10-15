import java.util.Scanner;

public class CaracteristicasPessoas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int idadePeso = 0, olhosAzuis = 0, ruivasNaoAzuis = 0, alturaMenor150 = 0;
        int somaIdadeAlturaMenor150 = 0;

        for (int i = 1; i <= 6; i++) {
            System.out.print("Idade da pessoa " + i + ": ");
            int idade = entrada.nextInt();
            System.out.print("Peso da pessoa " + i + " (kg): ");
            double peso = entrada.nextDouble();
            System.out.print("Altura da pessoa " + i + " (m): ");
            double altura = entrada.nextDouble();
            System.out.print("Cor dos olhos (A,P,V,C): ");
            char olhos = entrada.next().toUpperCase().charAt(0);
            System.out.print("Cor dos cabelos (P,C,L,R): ");
            char cabelos = entrada.next().toUpperCase().charAt(0);

            if (idade > 50 && peso < 60) idadePeso++;
            if (altura < 1.50) {
                somaIdadeAlturaMenor150 += idade;
                alturaMenor150++;
            }
            if (olhos == 'A') olhosAzuis++;
            if (cabelos == 'R' && olhos != 'A') ruivasNaoAzuis++;
        }

        double mediaIdadeAlturaMenor150 = alturaMenor150 > 0 ? (double)somaIdadeAlturaMenor150 / alturaMenor150 : 0;
        double porcentagemOlhosAzuis = (olhosAzuis / 6.0) * 100;

        System.out.println("\nPessoas com idade > 50 e peso < 60 kg: " + idadePeso);
        System.out.printf("Média das idades com altura < 1,50 m: %.2f\n", mediaIdadeAlturaMenor150);
        System.out.printf("Porcentagem de pessoas com olhos azuis: %.2f%%\n", porcentagemOlhosAzuis);
        System.out.println("Pessoas ruivas sem olhos azuis: " + ruivasNaoAzuis);

        entrada.close();
    }
}



import java.util.Arrays;
import java.util.Scanner;

public class GruposValores {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        final int grupos = 5;
        final int valoresPorGrupo = 4;

        
        for (int i = 1; i <= grupos; i++) {
            int[] valores = new int[valoresPorGrupo];

            System.out.println("\n--- Grupo " + i + " ---");

            
            for (int j = 0; j < valoresPorGrupo; j++) {
                System.out.print("Digite o valor " + (j + 1) + ": ");
                valores[j] = entrada.nextInt();
            }

            
            System.out.print("Ordem lida: ");
            for (int v : valores) {
                System.out.print(v + " ");
            }

            
            Arrays.sort(valores);

            
            System.out.print("\nOrdem crescente: ");
            for (int v : valores) {
                System.out.print(v + " ");
            }

            
            System.out.print("\nOrdem decrescente: ");
            for (int j = valores.length - 1; j >= 0; j--) {
                System.out.print(valores[j] + " ");
            }

            System.out.println("\n---------------------------");
        }

        entrada.close();
    }
}

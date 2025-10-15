import java.util.Scanner;

public class AnaliseAcoes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double lucroTotal = 0;
        int contLucroAlto = 0;   
        int contLucroBaixo = 0;  
        
        System.out.println("--- Análise de Transações de Ações ---");
        System.out.println("Insira os dados da transação. Digite 'F' como Tipo de Ação para finalizar.");
        
        while (true) {
            String tipoAcao;
            
            System.out.print("\nTipo de Ação (ou 'F' para finalizar): ");
            tipoAcao = scanner.next().toUpperCase();
            
            if (tipoAcao.equals("F")) {
                break;
            }
            
            double precoCompra;
            double precoVenda;
            int quantidade;

            try {
                System.out.print("Preço de Compra: R$");
                precoCompra = scanner.nextDouble();
                
                System.out.print("Preço de Venda: R$");
                precoVenda = scanner.nextDouble();
                
                System.out.print("Quantidade de Ações: ");
                quantidade = scanner.nextInt();
                
            } catch (java.util.InputMismatchException e) {
                System.out.println("\nErro: Entrada inválida. Por favor, insira números para preços e quantidade.");
                scanner.nextLine();
                continue;
            }

            double lucroPorAcao = precoVenda - precoCompra;
            double lucroPorTransacao = lucroPorAcao * quantidade;
            
            lucroTotal += lucroPorTransacao;
            
            if (lucroPorTransacao > 1000) {
                contLucroAlto++;
            }
            
            if (lucroPorTransacao < 200) {
                contLucroBaixo++;
            }
            
            System.out.printf("   > Lucro por Ação: R$%.2f\n", lucroPorAcao);
            System.out.printf("   > Lucro Total da Transação: R$%.2f\n", lucroPorTransacao);
        }
        
        System.out.println("\n=============================================");
        System.out.println("             RESULTADOS FINAIS               ");
        System.out.println("=============================================");
        System.out.printf("Lucro Total (somatório de todas as transações): R$%.2f\n", lucroTotal);
        System.out.println("Número de transações com lucro > R$1000: " + contLucroAlto);
        System.out.println("Número de transações com lucro < R$200: " + contLucroBaixo);
        System.out.println("Finalização: Tipo de ação 'F' recebido, análise concluída.");
        System.out.println("=============================================");
        
        scanner.close();
    }
}

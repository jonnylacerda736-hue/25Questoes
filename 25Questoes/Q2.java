public class TeatroLucro {
    public static void main(String[] args) {
        double preco = 5.0;
        int ingressos = 120;
        double despesa = 200.0;
        double maiorLucro = 0;
        double melhorPreco = 0;
        int melhorQtd = 0;

        System.out.println("Preço\tIngressos\tLucro");
        while (preco >= 1.0) {
            double lucro = (preco * ingressos) - despesa;
            System.out.printf("R$ %.2f\t%d\t\tR$ %.2f\n", preco, ingressos, lucro);
            if (lucro > maiorLucro) {
                maiorLucro = lucro;
                melhorPreco = preco;
                melhorQtd = ingressos;
            }
            preco -= 0.5;
            ingressos += 26;
        }

        System.out.printf("\nLucro máximo: R$ %.2f\nPreço ideal: R$ %.2f\nIngressos: %d\n", maiorLucro, melhorPreco, melhorQtd);
    }
}

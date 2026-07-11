package estrutura_dados;

import java.util.Scanner;

public class ExercicioCompra {

    public static final double valorItemDeLuxo = 50.00;

    public static void main(String[] args) {

        double[] listaValoresDosProdutos = new double[10];

        double valorTotal = 0;

        int numeroDeProdutosCaros = 0;

        double precoDoProduto = 0;

        Scanner leitorDoTeclado = new Scanner(System.in);

        for (int i = 0; i < listaValoresDosProdutos.length; i++) {

            System.out.println("Digite o preco do produto: ");

            precoDoProduto = leitorDoTeclado.nextDouble();

            while (!verificadorDePreco(precoDoProduto)) {
                System.out.println("Valor Invalido, tente digitar novamente o preco do produto: ");
                precoDoProduto = leitorDoTeclado.nextDouble();

            }

            listaValoresDosProdutos[i] = precoDoProduto;

            valorTotal += listaValoresDosProdutos[i];

            if (listaValoresDosProdutos[i] >= valorItemDeLuxo) {
                numeroDeProdutosCaros++;
            }






        }

        System.out.println("\n------------------------------------");
        System.out.println("--> Valor Total da Compra: R$ " + valorTotal);
        System.out.println("--> Quantidade de itens acima de R$ 50: " + numeroDeProdutosCaros);
        System.out.println("\n------------------------------------");

    }

    public static boolean verificadorDePreco(double precoDoProduto) {
        return precoDoProduto >= 0;
    }

}


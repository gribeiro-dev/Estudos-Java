
import java.lang.Thread;
import java.util.Scanner;

public class exercicioPortugol {
    public static void limparTela() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (Exception e) {
            for (int i = 0; i < 50; ++i) System.out.println();
        }
    }

    public static void main(String[] args) throws InterruptedException {

        limparTela();

        Scanner leitor = new Scanner(System.in);
        String repeticao = "S";

        while (repeticao.equalsIgnoreCase("S")) {

            limparTela();

            System.out.print("> Quantidade: ");
            double quant = leitor.nextDouble();
            Thread.sleep(160);

            System.out.print(">--------------------------<\n");
            Thread.sleep(140);

            System.out.print("> Preço unitário: ");
            double precoUni = leitor.nextDouble();
            Thread.sleep(130);

            leitor.nextLine();

            System.out.print(">--------------------------<");
            Thread.sleep(110);

            System.out.print("\n| >>> Tipos de entrega <<<<|");
            System.out.print("\n| >> 1 - Expressa          |");
            System.out.print("\n| >> 2 - Normal            |");
            System.out.print("\n| >> 3 - Retirada na loja  |");
            System.out.print("\n>--------------------------<\n");
            Thread.sleep(150);

            System.out.print("> Escreva o tipo de entrega: ");
            String escolha = leitor.nextLine();


            while (!escolha.equals("1") && !escolha.equals("Expressa") && !escolha.equals("2") && !escolha.equals("Normal") && !escolha.equals("3") && !escolha.equals("Retirrada na loja")) {
                Thread.sleep(90);
                System.out.print("> O tipo de entrega está inválido, tente novamente: ");
                escolha = leitor.nextLine();
            }

            double valorTotal = (quant * precoUni);
            double desconto;

            if (valorTotal < 200) {
                desconto = valorTotal * 0;
            } else if (valorTotal >= 200 && valorTotal <= 499) {
                desconto = valorTotal * 0.10;
            } else {
                desconto = valorTotal * 0.15;
            }

            double valorDaEntrega;

            switch (escolha) {
                case "1", "Expressa":
                    valorDaEntrega = 40;
                    break;
                case "2", "Normal":
                    valorDaEntrega = 20;
                    break;
                default:
                    valorDaEntrega = 0;
                    break;
            }

            double valorFinal = (valorTotal + valorDaEntrega) - desconto;

            if (desconto > 0) {
                Thread.sleep(100);
                System.out.println(">--------------------------<");

                Thread.sleep(150);
                System.out.println(">> Valor total: R$" + (Math.round(valorTotal)));

                Thread.sleep(100);
                System.out.println(">> Desconto aplicado: R$" + (Math.round(desconto)));

                Thread.sleep(120);
                System.out.println(">> Custo da Entrega: R$" + (Math.round(valorDaEntrega)));

                Thread.sleep(160);
                System.out.println(">> Valor final a pagar: R$" + (Math.round(valorFinal)));

                Thread.sleep(100);
                System.out.println(">--------------------------<");

                Thread.sleep(160);
                System.out.print("Deseja reiniciar o sistema (S ou N): ");

                repeticao = leitor.nextLine();
            } else {
                Thread.sleep(100);
                System.out.println(">--------------------------<");

                Thread.sleep(150);
                System.out.println(">> Valor total: R$" + (Math.round(valorTotal)));

                Thread.sleep(160);
                System.out.println(">> Custo da Entrega: R$" + (Math.round(valorDaEntrega)));

                Thread.sleep(200);
                System.out.println(">> Valor final a pagar: R$" + (Math.round(valorFinal)));

                Thread.sleep(100);
                System.out.println(">--------------------------<");

                Thread.sleep(160);
                System.out.print("Deseja reiniciar o sistema (S ou N): ");

                repeticao = leitor.nextLine();
            }
        }
    }
}

import java.util.Random;
import java.util.Scanner;

public class ExercicioCacaAoTesouro {
        public static void main(String[] args) {
            
            char[][] arrayTesouro = new char[5][5];

            Scanner leitor = new Scanner(System.in);

            Random randomizar = new Random();

            boolean jogoGanho = false;

            boolean linhaInvalida = false, colunaInvalida = false;

            int linhaTesouro = randomizar.nextInt(5);

            int colunaTesouro = randomizar.nextInt(5);

            int opcaoDeLinha = 0, opcaoDeColuna = 0;

            int tentativa = 0;

            System.out.println();
            System.out.println("   🏴‍☠️ CAÇA AO TESOURO 🏴‍☠️     ");
            System.out.println("   ------------------------     ");
            System.out.println(">> Um tesouro foi escondido em algum buraco, você tem 5 tentativas para encontra-lo!");

            System.out.println("-----------------------------");
            System.out.println("  1     2     3     4     5");
            System.out.println("-----------------------------");

            for (int i = 0; i < arrayTesouro.length; i++) {
                for (int j = 0; j < arrayTesouro[i].length; j++) {
                    arrayTesouro[i][j] = '~';
                    
                    System.out.print("| " + arrayTesouro[i][j] + " | ");
                }

                System.out.println(i + 1);
            }

            System.out.println("-----------------------------");


            while (!jogoGanho) {

                linhaInvalida = false;
                colunaInvalida = false;

                while (!linhaInvalida) {
                    System.out.println(">> Onde você quer cavar? ");
                    System.out.print(">> Linha " + "  (1-5): ");
                    opcaoDeLinha = leitor.nextInt();

                    if (opcaoDeLinha >= 1 && opcaoDeLinha <= 5) {
                        linhaInvalida = true;
                        opcaoDeLinha--;
                    } else {
                        System.out.println();
                        System.out.println("> Essa opção de linha está inválida.");
                        System.out.println();
                    }

                }

                while (!colunaInvalida) {
                    System.out.print(">> Coluna " + " (1-5): ");
                    opcaoDeColuna = leitor.nextInt();

                    if (opcaoDeColuna >= 1 && opcaoDeColuna <= 5) {
                        colunaInvalida = true;
                        opcaoDeColuna--;
                    } else {
                        System.out.println();
                        System.out.println("> Essa opção de linha está inválida.");
                        System.out.println();
                    }
                }
                
                if (arrayTesouro[opcaoDeLinha][opcaoDeColuna] == 'X') {
                    
                    System.out.println("> Essa opção de linha já foi ocupada");
    
                } else {
                    arrayTesouro[opcaoDeLinha][opcaoDeColuna] = 'X';
                }
                
                if (opcaoDeLinha == linhaTesouro && opcaoDeColuna == colunaTesouro) {
                    arrayTesouro[opcaoDeLinha][opcaoDeColuna] = 'T';
                    jogoGanho = true;
                    System.out.println();
                    System.out.println(">> Você ganhou o jogo, meus parabéns!");
                    System.out.println();
                    System.out.println("-------> FIM DE JOGO <-------");
                    
                } else if (opcaoDeLinha < linhaTesouro) {
                    System.out.println();
                    System.out.println("-> SPLASH! Só água... mas, o tesouro está numa linha MAIOR do que essa");
                    System.out.println();
                    tentativa++;

                } else if (opcaoDeLinha > linhaTesouro ) {
                    System.out.println();
                    System.out.println("-> SPLASH! Só água... mas, o tesouro está numa linha MENOR do que essa");
                    System.out.println();
                    tentativa++;
                
                } else if (tentativa >= 10) {
                    
                    jogoGanho = true;
                    System.out.println("Você perdeu o jogo.");
                    
                } else {
                    System.out.println();
                    System.out.println("-> Você está na linha do tesouro! ");
                    System.out.println();
                    tentativa++;

                }
                
                System.out.println("-----------------------------");

                for (int i = 0; i < arrayTesouro.length; i++) {
                    for (int j = 0; j < arrayTesouro.length; j++) {
                        System.out.print("| " + arrayTesouro[i][j] + " | ");
                    }

                    System.out.println(i + 1);

                }

                System.out.println("-----------------------------");
                System.out.println();
            }
        }
    }


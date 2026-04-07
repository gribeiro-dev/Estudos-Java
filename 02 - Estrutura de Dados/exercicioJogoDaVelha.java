import java.util.Scanner;

public class exercicioJogoDaVelha {
    public static void main(String[] args) {
        
        char[][] jogaDaVelha = new char[3][3];

        Scanner leitor = new Scanner(System.in);
        
        System.out.println("----> Jogo Da Velha <----");
        System.out.println();
        System.out.print("-- Dispute turnos em um tabuleiro 3x3 tentando formar uma linha, coluna ou diagonal com seu símbolo.\n");
        System.out.println("-- O jogo termina com a vitória de um jogador ou em empate caso todas as casas sejam preenchidas.");
        System.out.println();
        System.out.println(">> Jogador 1: X");
        System.out.println(">> Jogador 2: O");

        // Primeiro, vamos fazer o fluxo do nosso jogo
        
        char sinal = 0;
        
        int linha = 0, coluna = 0;
        
        boolean oJogoFoiGanho = false;
        
        int quemVaiJogar = 1;

        while (!oJogoFoiGanho) {

            // Cria um loop que enquanto o jogo nao for ganho, essa interação vai se repetir

            // Se quem vai jogar for igual a 1, é o jogador 1, caos contrario, é o jogador 2 (No fim de cada interação, esse valor muda e o jogador muda)
            if (quemVaiJogar % 2 == 1) {
                
                System.out.println();

                System.out.println("-> É a vez do jogador 1");

                sinal = 'X';

            } else {

                System.out.println();

                System.out.println("-> É a vez do jogador 2");

                sinal = 'O';
            }

            boolean linhaValida = false;

            while (!linhaValida) { // Enquanto a linha for invalida, ele repete até ter uma linha valida de 1-3
                
                System.out.print(">> Diga uma linha para preencher com o sinal " + sinal + " (1-3): ");
                linha = leitor.nextInt();

                if (linha >= 1 && linha <= 3) {
                    linhaValida = true;
                    linha--;
                } else {
                    System.out.println("-> A linha está inválida, tente novamente. ");
                }
            }
                
            boolean colunaValida = false;

            while (!colunaValida) {
                System.out.print(">> Diga uma coluna para preencher com o sinal " + sinal + " (1-3): ");
                coluna = leitor.nextInt();

                if (coluna >= 1 && coluna <= 3) {
                    colunaValida = true;
                    coluna--;
                } else {
                    System.out.println("Coluna inválida");
                }
            }

            if (jogaDaVelha[linha][coluna] == 'X' || jogaDaVelha[linha][coluna] == 'O') {
                
                System.out.println(">> Esta linha e coluna já foi preenchida por outro jogador. Verifique abaixo: ");
                System.out.println();

            } else {

                jogaDaVelha[linha][coluna] = sinal;

                quemVaiJogar++;

            }

            System.out.println();
            System.out.println("1   2   3  ");
            System.out.println("-----------");

            for (int i = 0; i < jogaDaVelha.length; i++) {
                
                for (int j = 0; j < jogaDaVelha[i].length; j++) {

                    // 1. Criamos uma variável para decidir o que mostrar
                    char oQueMostrar;

                    if (jogaDaVelha[i][j] == 0) {
                        oQueMostrar = ' '; // Se estiver vazio, mostramos um espaço
                    } else {
                        oQueMostrar = jogaDaVelha[i][j]; // Se tiver X ou O, mostramos o sinal
                    }
                    System.out.print( oQueMostrar + "  |");
                }
                System.out.println(i+1);
            }
            System.out.println("-----------");


            if ( jogaDaVelha[0][0] == 'X' && jogaDaVelha[0][1] == 'X' && jogaDaVelha[0][2] == 'X' ||  // Ganhar fazendo horizontal na primeira linha
                 jogaDaVelha[1][0] == 'X' && jogaDaVelha[1][1] == 'X' && jogaDaVelha[1][2] == 'X' ||  // Ganhar fazendo horizontal na segunda linha
                 jogaDaVelha[2][0] == 'X' && jogaDaVelha[2][1] == 'X' && jogaDaVelha[2][2] == 'X' ||  // Ganhar fazendo horizontal na terceira linha
                 jogaDaVelha[0][0] == 'X' && jogaDaVelha[1][0] == 'X' && jogaDaVelha[2][0] == 'X' ||  // Ganhar fazendo vertical na primeira linha
                 jogaDaVelha[0][1] == 'X' && jogaDaVelha[1][1] == 'X' && jogaDaVelha[2][1] == 'X' ||  // Ganhar fazendo vertical na segunda linha
                 jogaDaVelha[0][2] == 'X' && jogaDaVelha[1][2] == 'X' && jogaDaVelha[2][2] == 'X' ||  // Ganhar fazendo vertical na tericeira linha
                 jogaDaVelha[0][0] == 'X' && jogaDaVelha[1][1] == 'X' && jogaDaVelha[2][2] == 'X' ||  // Ganhar fazendo diagonal da esquerda para baixo
                 jogaDaVelha[0][2] == 'X' && jogaDaVelha[1][1] == 'X' && jogaDaVelha[2][0] == 'X' ) { // Ganhar fazendo diagonal da esquerda para baixo

                oJogoFoiGanho = true;
                System.out.println();
                System.out.println(">> O jogador 1 ganhou!");

            } else if (
                 jogaDaVelha[0][0] == 'O' && jogaDaVelha[0][1] == 'O' && jogaDaVelha[0][2] == 'O'  ||  // Ganhar fazendo horizontal na primeira linha
                 jogaDaVelha[1][0] == 'O' && jogaDaVelha[1][1] == 'O' && jogaDaVelha[1][2] == 'O' ||  // Ganhar fazendo horizontal na segunda linha
                 jogaDaVelha[2][0] == 'O' && jogaDaVelha[2][1] == 'O' && jogaDaVelha[2][2] == 'O' ||  // Ganhar fazendo horizontal na terceira linha
                 jogaDaVelha[0][0] == 'O' && jogaDaVelha[1][0] == 'O' && jogaDaVelha[2][0] == 'O' ||  // Ganhar fazendo vertical na primeira linha
                 jogaDaVelha[0][1] == 'O' && jogaDaVelha[1][1] == 'O' && jogaDaVelha[2][1] == 'O' ||  // Ganhar fazendo vertical na segunda linha
                 jogaDaVelha[0][2] == 'O' && jogaDaVelha[1][2] == 'O' && jogaDaVelha[2][2] == 'O' ||  // Ganhar fazendo vertical na tericeira linha
                 jogaDaVelha[0][0] == 'O' && jogaDaVelha[1][1] == 'O' && jogaDaVelha[2][2] == 'O' ||  // Ganhar fazendo diagonal da esquerda para baixo
                 jogaDaVelha[0][2] == 'O' && jogaDaVelha[1][0] == 'O' && jogaDaVelha[2][0] == 'O' ) { // Ganhar fazendo diagonal da esquerda para baixo
                 
                oJogoFoiGanho = true;
                System.out.println();
                System.out.println(">> O jogador 2 ganhou!");
                  
            } else if (quemVaiJogar > 9) {
                oJogoFoiGanho = true;
                System.out.println();
                System.out.println(">> O jogo deu empate.");
            }
        }
    }
}

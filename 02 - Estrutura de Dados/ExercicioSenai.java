import java.util.Scanner;

public class ExercicioSenai {

    public static final int ADICIONAR = 1;

    public static final int LISTAR = 2;

    public static final int SAIR = 3;

    public static void main(String[] args) {

        boolean oUsuarioSaiu = false;

        int opcaoEscolhidaNoMenu = 0;

        int opcaoEscolidaLinha = 0;

        int opcaoEscolhidaColuna = 0;

        boolean linhaInvalida = false;

        boolean colunaInvalida = false;

        char[][] ListaDeAssentos = new char[10][10];

        Scanner leitor = new Scanner(System.in);

        preencherALista(ListaDeAssentos);

        while (!oUsuarioSaiu) {

            System.out.println();
            System.out.println("----> Menu do Cinema: <----");
            System.out.println(">> (1). Adicionar uma pessoa a um assento: ");
            System.out.println(">> (2). Listar todos os assentos do cinema: ");
            System.out.println(">> (3). Sair do programa");
            System.out.print("> Escolha uma das opções (1-3): ");
            opcaoEscolhidaNoMenu = leitor.nextInt();

            switch (opcaoEscolhidaNoMenu) {
                case ADICIONAR:

                    linhaInvalida = false;

                    colunaInvalida = false;

                    System.out.println("\n-----------------------> Assentos <------------------------");

                    System.out.println("| 1  -  2  -  3  -  4  -  5  -  6  -  7  -  8  -  9  - 10 |");

                    System.out.println("-----------------------------------------------------------");

                    mostrarAMatriz(ListaDeAssentos);

                    while (!linhaInvalida) {

                        System.out.print("\n >> Escolha uma linha para reservar um assento: ");
                        opcaoEscolidaLinha = leitor.nextInt();

                        if (validacaoDaLinha(opcaoEscolidaLinha)) {
                            linhaInvalida = true;
                        } else {
                            System.out.println(">> VALUE_ERROR: A opção de linha está invalida.");
                        }
                    }

                    while (!colunaInvalida) {

                        System.out.print(
                                "\n >> Escolha uma coluna (Assento) da linha " + opcaoEscolidaLinha + " (1-10): ");
                        opcaoEscolhidaColuna = leitor.nextInt();

                        if (validacaoDaColuna(opcaoEscolhidaColuna)) {
                            colunaInvalida = true;
                        } else {
                            System.out.println(">> Essa opção de linha está incorreta");
                        }

                    }

                    if (validacaoAssentoOcupado(ListaDeAssentos, opcaoEscolidaLinha - 1, opcaoEscolhidaColuna - 1)) {

                        ListaDeAssentos[opcaoEscolidaLinha - 1 ][opcaoEscolhidaColuna - 1] = 'X';
                        System.out.println("\n >> Sucesso: O assento foi reservado na posição [" + opcaoEscolidaLinha + ", " + opcaoEscolhidaColuna + "]");
                        System.out.println();
                        System.out.println("---------------------------------------------------------------------");
                        mostrarLinhaReservadaMatriz(ListaDeAssentos, opcaoEscolidaLinha - 1, opcaoEscolhidaColuna - 1);
                        System.out.println("---------------------------------------------------------------------");

                    } else {
                        System.out.println("O assento já está ocupado por outra pessoa");
                    }
                    break;
                case LISTAR:
                    System.out.println();
                    System.out.println("-----------------------------------------------------------");
                    mostrarAMatriz(ListaDeAssentos);
                    System.out.println("-----------------------------------------------------------");
                    System.out.println();
                    break;
                
                case SAIR:
                    System.out.println("Tudo bem, nos vemos denovo mais tarde, até mais! :D ");
                    oUsuarioSaiu = true;    
            }
        }
    }

    public static void preencherALista(char[][] ListaDeAssentos) {

        for (int i = 0; i < ListaDeAssentos.length; i++) {
            for (int j = 0; j < ListaDeAssentos[i].length; j++) {
                ListaDeAssentos[i][j] = '-';
            }
        }
    }

    public static void mostrarAMatriz(char[][] ListaDeAssentos) {

        for (int i = 0; i < ListaDeAssentos.length; i++) {
            for (int j = 0; j < ListaDeAssentos[i].length; j++) {
                System.out.print("| " + ListaDeAssentos[i][j] + " | ");
            }
            System.out.println(" = " + "Linha " + (i + 1));
        }
    }

    public static boolean validacaoDaLinha(int opcaoEscolidaLinha) {

        if (opcaoEscolidaLinha >= 1 && opcaoEscolidaLinha <= 10) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean validacaoDaColuna(int opcaoEscolhidaColuna) {

        if (opcaoEscolhidaColuna >= 1 && opcaoEscolhidaColuna <= 10) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean validacaoAssentoOcupado(char[][] ListaDeAssentos, int opcaoEscolidaLinha,
            int opcaoEscolhidaColuna) {

        if (ListaDeAssentos[opcaoEscolidaLinha][opcaoEscolhidaColuna] == '-') {
            return true;
        } else {
            return false;
        }
    }

    public static void mostrarLinhaReservadaMatriz(char[][] ListaDeAssentos, int opcaoEscolidaLinha, int opcaoEscolhidaColuna) {
        
        for (int j = 0; j < ListaDeAssentos[opcaoEscolidaLinha].length; j++) {

            System.out.print(" | " + ListaDeAssentos[opcaoEscolidaLinha][j] + " | ");

        }
        
        System.out.println(" = " + "Linha " + (opcaoEscolidaLinha + 1));

    }
}

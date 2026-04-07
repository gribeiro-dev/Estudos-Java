import java.util.Scanner;

public class ExercicioEstacionamento {

    public static final int ESTACIONAR = 1;

    public static final int SAIR_DA_VAGA = 2;

    public static final int LISTAR_VAGAS = 3;

    public static final int PAGAMENTO = 4;
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        boolean oUsuarioSaiuDoSistema = false;
        
        int opcaoEscolhidaNoMenu = 0;

        int escolhaDeLinha = 0;

        int escolhaDeColuna = 0;

        String placaDoCarro = "";

        boolean linhaValida = false;

        boolean colunaValida = false;

        boolean placaValida = false;

        String[][] listaDoEstacionamento = new String[3][5];

        String[][] placasDosCarrosEstacionados = new String[3][5];

        preencherAMatriz(listaDoEstacionamento);

        while (!oUsuarioSaiuDoSistema) {
            
            exibirMenu();
    
            opcaoEscolhidaNoMenu = leitor.nextInt();

            switch (opcaoEscolhidaNoMenu) {

                case ESTACIONAR:
                    
                    mostrarAMatrizEstacionamento(listaDoEstacionamento);

                    while (!linhaValida) {

                        System.out.print("\n>> Digite a linha que deseja estacionar: ");
    
                        escolhaDeLinha = leitor.nextInt();

                        if (verificadorDeLinha(escolhaDeLinha, listaDoEstacionamento)) {
                            linhaValida = true;
                        } else {
                            System.out.println(">> Linha inválida, tente novamente.");
                        }

                    }

                    while (!colunaValida) {

                        System.out.print("\n>> Digite a coluna ( [] ) que deseja estacionar: ");

                        escolhaDeColuna = leitor.nextInt();

                        if (verificadorDeColuna(escolhaDeColuna)) {
                            colunaValida = true;
                        } else {
                            System.out.println(">> Coluna inválida, tente novamente.");
                        }

                    }

                    while (!placaValida) {

                        System.out.print("\n>> Digite a placa do seu carro (7 caracteres): ");

                        placaDoCarro = leitor.next();

                        if (!verificadorDePlaca(placaDoCarro)) {
                            System.out.println("\n>> A sua placa precisa de 7 caracteres");
                        } else if (placaJaExisteNoEstacionamento(placaDoCarro, placasDosCarrosEstacionados)) {
                            System.out.println("\n>> Essa placa ja pertence a outro veiculo no estacionamento");
                        }
                        
                        else {
                            placaValida = true;
                        }
                    }

                    if (verificadorDeOcupacao(escolhaDeLinha, escolhaDeColuna, listaDoEstacionamento)) {

                        adicionarVeiculoNaMatriz(listaDoEstacionamento, escolhaDeLinha, escolhaDeColuna);

                        adicionarPlacaNaMatriz(placasDosCarrosEstacionados, placaDoCarro, escolhaDeLinha, escolhaDeColuna);
                        
                        System.out.println();

                        System.out.println("\n>> O seu veiculo foi estacionado na vaga " + "[" + escolhaDeLinha + ", " + escolhaDeColuna + "]" + ".");
                        
                        System.out.println();

                        linhaValida = false;

                        colunaValida = false;

                        placaValida = false;

                        mostrarAMatrizEstacionamento(listaDoEstacionamento);

                    } else {
                        System.out.println(">> Essa linha e coluna já está ocupada por um outro veiculo. ");
                    }

            }

        }
    }
    
    public static void exibirMenu() {
        System.out.println("---------------------------------------------------");
        System.out.println("---------    Estacionamento São Caetano   ---------");
        System.out.println("---------------------------------------------------");
        System.out.println();
        System.out.println(">> (1) - Estacionar um carro/moto em uma vaga. ");
        System.out.println(">> (2) - Saida de veiculo de uma vaga ");
        System.out.println(">> (3) - Mostrar as vagas atuais no estacionamento ");
        System.out.println(">> (4) - Pagamento da vaga estacionada ");
        System.out.println(">> (5) - Sair do sistema ");
        System.out.println("---------------------------------------------------");

        System.out.print(">> Escolha uma das opções (1-5): ");
    }

    public static void preencherAMatriz(String[][] listaDoEstacionamento) {
        for (int i = 0; i < listaDoEstacionamento.length; i++) {
            for (int j = 0; j < listaDoEstacionamento[i].length; j++) {
                listaDoEstacionamento[i][j] = "[ ]";
            }
        }
    }

    public static void mostrarAMatrizEstacionamento(String[][] listaDoEstacionamento) {
        System.out.println();
        System.out.println(" 1     2     3     4     5");
        System.out.println("-----------------------------");
        for (int i = 0; i < listaDoEstacionamento.length; i++) {
            for (int j = 0; j < listaDoEstacionamento[i].length; j++) {
                System.out.print(listaDoEstacionamento[i][j] + " | ");
            }
            System.out.println(i + 1);
        }
        System.out.println("-----------------------------");
        System.out.println("Status: [ ] Livre [X] Ocupado");
        System.out.println("-----------------------------");
        System.out.println();
    }

    public static boolean verificadorDeLinha(int escolhaDeLinha, String[][] listaDoEstacionamento) {
        return (escolhaDeLinha >= 1 && escolhaDeLinha <= listaDoEstacionamento.length);
    }

    public static boolean verificadorDeColuna(int escolhaDeColuna) {
        return (escolhaDeColuna >= 1 && escolhaDeColuna <= 5);
    }

    public static boolean verificadorDeOcupacao(int escolhaDeLinha, int escolhaDeColuna, String[][] listaDoEstacionamento) {
        
        if (listaDoEstacionamento[escolhaDeLinha - 1][escolhaDeColuna - 1] == "[ ]") {
            return true;
        } else {
            return false;
        }
    }

    public static boolean verificadorDePlaca(String placaDoCarro) {
        return (placaDoCarro.length() == 7);
    }

    public static boolean placaJaExisteNoEstacionamento(String placaDoCarro, String[][] placasDosCarrosEstacionados) {
        for (int i = 0; i < placasDosCarrosEstacionados.length; i++) {
            for (int j = 0; j < placasDosCarrosEstacionados[i].length; j++) {

                if (placasDosCarrosEstacionados[i][j] != null && placasDosCarrosEstacionados[i][j].equals(placaDoCarro)) {
                   
                    return true;
                
                }

            }
        }
        
        return false;
    
    }

    public static void adicionarVeiculoNaMatriz(String[][] listaDoEstacionamento, int escolhaDeLinha, int escolhaDeColuna) {
        listaDoEstacionamento[escolhaDeLinha-1][escolhaDeColuna-1] = "[X]";

    }

    public static void adicionarPlacaNaMatriz(String[][] placasDosCarrosEstacionados, String placaDoCarro, int escolhaDeLinha, int escolhaDeColuna) {

        placasDosCarrosEstacionados[escolhaDeLinha - 1][escolhaDeColuna - 1] = placaDoCarro;

    }

}

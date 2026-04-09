import java.util.Scanner;

public class ExercicioEstacionamento {

    public static final int ESTACIONAR = 1;

    public static final int SAIR_DA_VAGA = 2;

    public static final int LISTAR_VAGAS = 3;

    public static final int SAIDA = 4;
    public static void main(String[] args) throws InterruptedException {

        Scanner leitor = new Scanner(System.in);

        boolean oUsuarioSaiuDoSistema = false;
        
        int opcaoEscolhidaNoMenu = 0;

        int escolhaDeLinha = 0;

        int escolhaDeColuna = 0;

        String placaDoCarro = "";

        int horarioDeEntrada = 0;

        int horarioDeSaida = 0;

        int valorDaHora = 5;

        int calculoDeHoras = 0;

        String pagamentoPelaVaga = "";

        boolean linhaValida = false;

        boolean colunaValida = false;

        boolean placaValida = false;

        boolean oUsuarioPagouOEstacionamento = false;

        boolean horarioEntradaValida = false;

        boolean horarioSaidaValida = false;

        boolean aVagaFoiLiberada = false;

        boolean aPlacaFoiEncontradaNoEstacionamento = false;

        String opcaoDePlaca = "";

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

                        System.out.print(">> Digite a linha que deseja estacionar: ");
    
                        escolhaDeLinha = leitor.nextInt();

                        if (verificadorDeLinha(escolhaDeLinha, listaDoEstacionamento)) {
                            linhaValida = true;
                        } else {
                            System.out.println(">> Linha inválida, tente novamente.");
                        }

                    }

                    while (!colunaValida) {

                        System.out.print("\n>> Digite a coluna ([]) que deseja estacionar: ");

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

                        Thread.sleep(100);

                        mostrarAMatrizEstacionamento(listaDoEstacionamento);

                        linhaValida = false;

                        colunaValida = false;

                        placaValida = false;

                        Thread.sleep(200);

                        System.out.println(">> O seu veiculo foi estacionado na vaga " + "[" + escolhaDeLinha + ", " + escolhaDeColuna + "]" + ".");
                        
                        System.out.println();

                    } else {
                        System.out.println(">> Essa linha e coluna já está ocupada por um outro veiculo. ");
                    }

                    break;

                case SAIR_DA_VAGA:  

                
                mostrarAMatrizEstacionamento(listaDoEstacionamento);

                while (!aVagaFoiLiberada) {
                    aPlacaFoiEncontradaNoEstacionamento = false;
                    System.out.print(">> Digite a placa do seu carro: ");
                    opcaoDePlaca = leitor.next();

                    for (int i = 0; i < placasDosCarrosEstacionados.length; i++) {
                        for (int j = 0; j < placasDosCarrosEstacionados[i].length; j++) {
                            if (placasDosCarrosEstacionados[i][j] != null
                                    && placasDosCarrosEstacionados[i][j].equals(opcaoDePlaca)) {

                                aPlacaFoiEncontradaNoEstacionamento = true;

                                System.out.print("\n>> O carro com a placa " + opcaoDePlaca
                                        + " está estacionado na vaga " + "[" + (i + 1) + ", " + (j + 1) + "].");

                                while (!horarioEntradaValida) {
                                    System.out.println();

                                    System.out.print("\n>> Horario de entrada: ");

                                    horarioDeEntrada = leitor.nextInt();
                                    if (verificadorDeHoraDeEntrada(horarioDeEntrada)) {
                                        horarioEntradaValida = true;
                                    } else {
                                        System.out.print("\n>> Esse horario está inválido, tente novamente.");
                                    }
                                }

                                while (!horarioSaidaValida) {
                                    System.out.print("\n>> Horario de saida: ");

                                    horarioDeSaida = leitor.nextInt();

                                    if (verificadorDeHoraDeSaida(horarioDeSaida, horarioDeEntrada)) {
                                        horarioSaidaValida = true;
                                    } else {
                                        System.out.print("\n>> Esse horario está inválido, tente novamente.");
                                    }
                                }

                                calculoDeHoras = horarioDeSaida - horarioDeEntrada;

                                System.out.print("\n>> O valor do estacionamento ficou de: R$ "
                                        + calculoDeHoras * valorDaHora + ".");

                                while (!oUsuarioPagouOEstacionamento) {
                                    System.out.println();

                                    System.out.print(
                                            "\n>> O valor foi pago para o pix do estacionamento? (Este processo é feito presencialmente, digite S ou N): ");

                                    pagamentoPelaVaga = leitor.next();

                                    if (pagamentoPelaVaga.equalsIgnoreCase("S")) {

                                        System.out.println(">> Pagamento aprovado, retirando o carro da vaga...");

                                        retirarVeiculoDoEstacionamento(listaDoEstacionamento,
                                                placasDosCarrosEstacionados, opcaoDePlaca);

                                        Thread.sleep(4000);

                                        System.out.println(">> Vaga liberada com sucesso.");

                                        horarioEntradaValida = false;
                                        horarioSaidaValida = false;
                                        oUsuarioPagouOEstacionamento = true;
                                        aVagaFoiLiberada = true;

                                        System.out.println();
                                    } else {
                                        System.out.println("Para sair da vaga, é preciso fazer o pagamento.");
                                    }
                                }
                            }
                        }
                    }

                    if (!aPlacaFoiEncontradaNoEstacionamento) {
                        System.out.println(">> Essa placa não existe no sistema, tente novamente.");
                    }
                }
                
                aVagaFoiLiberada = false;

                oUsuarioPagouOEstacionamento = false;

                break;

                case LISTAR_VAGAS:

                    mostrarAMatrizEstacionamento(listaDoEstacionamento);

                    break;

                case SAIDA:
                    System.out.println("Nos vemos outra hora então, até a proxima! :)");
                    oUsuarioSaiuDoSistema = true;

                    break;
                
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
        System.out.println(">> (4) - Sair do sistema ");
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

    public static void mostrarAMatrizEstacionamento(String[][] listaDoEstacionamento) throws InterruptedException {
        Thread.sleep(110);
        System.out.println();
        System.out.println(" 1     2     3     4     5");
        Thread.sleep(110);
        System.out.println("-----------------------------");
        Thread.sleep(110);
        for (int i = 0; i < listaDoEstacionamento.length; i++) {
            for (int j = 0; j < listaDoEstacionamento[i].length; j++) {
                Thread.sleep(80);
                System.out.print(listaDoEstacionamento[i][j] + " | ");
                Thread.sleep(10);
            }
            Thread.sleep(90);
            System.out.println(i + 1);
        }

        Thread.sleep(110);
        System.out.println("-----------------------------");
        Thread.sleep(110);
        System.out.println("Status: [ ] Livre [X] Ocupado");
        Thread.sleep(110);
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
        
        if (listaDoEstacionamento[escolhaDeLinha - 1][escolhaDeColuna - 1].equals("[ ]")) {
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

    public static boolean verificadorDeHoraDeEntrada(int horarioDeEntrada) {
        return horarioDeEntrada > 0 && horarioDeEntrada < 24;
    }

    public static boolean verificadorDeHoraDeSaida(int horarioDeSaida, int horarioDeEntrada) {
        return horarioDeSaida > horarioDeEntrada && horarioDeSaida < 24;
    }

    public static void retirarVeiculoDoEstacionamento(String[][] listaDoEstacionamento, String[][] placaDosCarrosEstacionados, String opcaoDePlaca) {
        
        for (int i = 0; i < placaDosCarrosEstacionados.length; i++) {
            for (int j = 0; j < placaDosCarrosEstacionados[i].length; j++) {

                if (placaDosCarrosEstacionados[i][j] != null && placaDosCarrosEstacionados[i][j].equals(opcaoDePlaca)) {
                    listaDoEstacionamento[i][j] = "[ ]";
                    placaDosCarrosEstacionados[i][j] = null;
                }
                
            }
        }

    }
}       

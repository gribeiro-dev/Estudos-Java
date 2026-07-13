package estrutura_dados;

import java.util.Scanner;

public class ExercicioNotasProfessor {

    public static final int ADICIONAR_NOTA = 1;

    public static final int MODIFICAR_NOTA = 2;

    public static final int MOSTRAR_RELATORIO = 3;

    public static final int SAIR_DO_SISTEMA = 4;

    public static void main(String[] args) throws InterruptedException {

        Scanner teclado = new Scanner(System.in);

        int numeroDeAlunosDaLista = 0;

        int numeroDeAlunosAcimaMed = 0;

        int numeroDeAlunosAbaixoMed = 0;

        int opcaoEscolhida = 0;

        double somaDasNotasDosAlunos = 0;

        double mediaDaSalaComAsNotas = 0;

        double notaNovaParaAluno = 0.0;

        int numeroDoAluno = 0;

        char escolhaContinuarOuSairDoSistema = 'N';

        // Iniciamos o codigo aqui, esta parte eh a introducao

        System.out.print(">> Bom dia Professor, digite o numero de estudantes de sua sala por favor: ");

        numeroDeAlunosDaLista = teclado.nextInt();

        while (!verificadorDeNumeroEstudante(numeroDeAlunosDaLista)) {

            System.out.println("Esse valor de estudantes eh invalido, tente novamente: ");

            numeroDeAlunosDaLista = teclado.nextInt();

        }

        double[] listaDeNotasDosAlunos = new double[numeroDeAlunosDaLista];

        // Indo para a parte do codigo responsavel pelo funcionamento do sistema inteiro

        while (escolhaContinuarOuSairDoSistema == 'N') {

            System.out.println();

            exibirMenu();

            opcaoEscolhida = teclado.nextInt();

            switch (opcaoEscolhida) {

                case ADICIONAR_NOTA:

                    System.out.print(">> Digite o numero do aluno que deseja adicionar uma nota nova: ");

                    numeroDoAluno = teclado.nextInt();

                    while (!verificadorDoNumeroEscolhido(numeroDoAluno,listaDeNotasDosAlunos)) {

                        System.out.println("Esse valor de estudantes esta invalido, tente novamente: ");

                        numeroDoAluno = teclado.nextInt();

                    }

                    System.out.println("> | Aluno " + (numeroDoAluno) + " (" + listaDeNotasDosAlunos[numeroDoAluno - 1] + ")" + " | Digite a nova nota para o aluno " + numeroDoAluno + ": ");

                    notaNovaParaAluno = teclado.nextDouble();

                    while (!validacaoDeNotaAtribuida(numeroDoAluno, notaNovaParaAluno, listaDeNotasDosAlunos)) {

                        System.out.println("Nao eh possivel adicionar esta nota ao aluno atual, tente novamente: ");

                        notaNovaParaAluno = teclado.nextDouble();

                    }

                    listaDeNotasDosAlunos[numeroDoAluno - 1] += notaNovaParaAluno;

                    System.out.println("A nota nova foi atribuida para a nota atual, retornando ao menu em 3 segundos");

                    Thread.sleep(3000);

                    break;


                case MODIFICAR_NOTA:

                    System.out.print(">> Digite o numero do aluno que deseja modificar a nota: ");

                    numeroDoAluno = teclado.nextInt();

                    while (!verificadorDoNumeroEscolhido(numeroDoAluno,listaDeNotasDosAlunos)) {

                        System.out.println(">> Esse numero de estudante esta invalido, tente novamente: ");

                        numeroDoAluno = teclado.nextInt();

                    }

                    System.out.println("> | Aluno " + (numeroDoAluno) + " (" + listaDeNotasDosAlunos[numeroDoAluno - 1] + ")" + " | Digite a nova nota para o aluno " + numeroDoAluno + ": ");

                    notaNovaParaAluno = teclado.nextDouble();

                    while ( notaNovaParaAluno < 0 || notaNovaParaAluno > 10) {

                        System.out.print("Esta nota nao eh uma nota valida, tente novamente: ");

                        notaNovaParaAluno = teclado.nextDouble();

                    }

                    listaDeNotasDosAlunos[numeroDoAluno - 1] = notaNovaParaAluno;

                    System.out.println(">> A nota nova foi atribuida ao aluno, para verificar os relatorios, escolha 3 no menu...");

                    System.out.println("Retornando ao menu em 3 segundos...");

                    Thread.sleep(3000);

                    break;

                case MOSTRAR_RELATORIO:

                    System.out.println("\n===== RELATÓRIO DE NOTAS DOS ALUNOS =====");
                    System.out.println("-----------------------------------------");
                    System.out.printf("%-12s | %-6s\n", "Estudante", "Nota");
                    System.out.println("-----------------------------------------");

                    // Loop que percorre toda a lista de notas
                    for (int i = 0; i < listaDeNotasDosAlunos.length; i++) {
                        // Exibe "Aluno 1", "Aluno 2", etc., buscando o índice i (0, 1, 2...)
                        System.out.printf("Aluno %-6d | %.2f\n", (i + 1), listaDeNotasDosAlunos[i]);
                        somaDasNotasDosAlunos += listaDeNotasDosAlunos[i];
                    }

                    mediaDaSalaComAsNotas = somaDasNotasDosAlunos / listaDeNotasDosAlunos.length;

                    for (int i = 0; i < listaDeNotasDosAlunos.length; i++) {
                        if ( listaDeNotasDosAlunos[i] >= mediaDaSalaComAsNotas) {
                            numeroDeAlunosAcimaMed++;
                        } else {
                            numeroDeAlunosAbaixoMed++;
                        }
                    }

                    System.out.println("-----------------------------------------");
                    System.out.printf("Média da Sala:                    %.2f\n", mediaDaSalaComAsNotas);
                    System.out.println("Alunos na/ou Acima da Média:      " + numeroDeAlunosAcimaMed);
                    System.out.println("Alunos Abaixo da Média:           " + numeroDeAlunosAbaixoMed);
                    System.out.println("-----------------------------------------");

                    break;

                case SAIR_DO_SISTEMA:

                    escolhaContinuarOuSairDoSistema = 'S';

                    break;

            }

        }
    }

    public static void exibirMenu () {
        System.out.println("------>> Sistema Escolar para Professores <<--------");
        System.out.println("----------------------------------------------------");
        System.out.println();
        System.out.println(">> (1) - Adicionar notas aos estudantes ");
        System.out.println(">> (2) - Modificar nota do estudante ");
        System.out.println(">> (3) - Mostrar o relatorio dos alunos ");
        System.out.println(">> (4) - Sair do sistema ");
        System.out.println("---------------------------------------------------");

        System.out.print(">> Escolha uma das opções (1-5): ");

    }

    public static boolean verificadorDeNumeroEstudante ( int numeroDeAlunosDaLista){

        if (numeroDeAlunosDaLista < 0) {
            return false;
        }

        return true;


    }

    public static boolean verificadorDoNumeroEscolhido ( int numeroDoAluno, double[] listaDeNotasAlunos) {

        int indice = numeroDoAluno - 1;

        if (indice >= 0 && indice < listaDeNotasAlunos.length) {
            return true;
        } else {
            return false;
        }

    }

    public static boolean validacaoDeNotaAtribuida (int numeroDoAluno, double notaNovaParaAluno, double[] listaDeNotasAlunos) {

        int indice_real = numeroDoAluno - 1;

        double nota_atual = listaDeNotasAlunos[indice_real];

        if (nota_atual + notaNovaParaAluno > 10.00) {
            return false;
        } else {
            return true;
        }

    }

}



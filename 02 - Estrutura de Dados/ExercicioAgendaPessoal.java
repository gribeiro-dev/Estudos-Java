
import java.util.Scanner;

public class ExercicioAgendaPessoal {
    public static void main(String[] args) {

        /* Neste exercicio, o meu objetivo era criar um sistema de agenda funcional utilizando Matrizes.
        Para isso, usei uma estrutura bidimensional String[31][24], onde as linhas representam os dias do mês 
        e as colunas representam as 24 horas do dia.
        
        Fiz isso utilizando:
        
        * - Usei uma Matriz String[31][24] para simular um calendário de um mês inteiro (31 dias) 
        * onde cada dia tem suas 24 janelas de horários disponíveis.
        * 
        * - Implementei um Menu Interativo para eu poder escolher entre marcar um compromisso 
        * ou consultar o que eu tenho para fazer em determinado horário.
        * 
        * - Adicionei validações (while e if) para garantir que eu não digite um dia ou hora 
        * que não existe, evitando erros no sistema.
        * 
        * * No final, este código me ajudou a entender como os dados são guardados e recuperados 
        * em "tabelas" dentro da memória do computador.
        */
        
        Scanner leitor = new Scanner(System.in);

        String[][] agenda = new String[31][24];
        String menu = "s";

        while (menu.equalsIgnoreCase("s")) {
            
            System.out.println("\n-> Bom dia Gustavo, é um prazer estar aqui com você! ");
            System.out.println("-> (1) Adicionar uma nova tarefa ");
            System.out.println("-> (2) Listar todas as tarefas do dia ");
            System.out.print("-> Escolha uma das opções acima e digite: ");

            int escolha = leitor.nextInt();
            int escolhaMês = 0; // Declarei aqui para os dois cases usarem

            switch (escolha) {
                case 1:
                    boolean diaValido = false;
                    while (!diaValido) {
                        System.out.print("-> Digite o dia do mês (1-31): ");
                        escolhaMês = leitor.nextInt();
                        if (escolhaMês > 0 && escolhaMês <= 31) {
                            diaValido = true;
                        } else {
                            System.out.println("- Você digitou um valor inválido, tente novamente.");
                        }
                    }

                    boolean horaValida = false;
                    while (!horaValida) {
                        System.out.print("-> Digite a hora (0-23): ");
                        int escolhaHora = leitor.nextInt();
                        if (escolhaHora >= 0 && escolhaHora < 24) {
                            horaValida = true;
                            System.out.print("-> Digite o seu compromisso: ");
                            agenda[escolhaMês - 1][escolhaHora] = leitor.next();
                            break;
                        } else {
                            System.out.println("Hora inválida, tente novamente.");
                        }
                    }
                    System.out.print("> Voltar ao menu? (S/N): ");
                    menu = leitor.next();
                    break;

                case 2:
                    diaValido = false;
                    while (!diaValido) {
                        System.out.print("-> Digite o dia para consultar: ");
                        escolhaMês = leitor.nextInt();
                        if (escolhaMês > 0 && escolhaMês <= 31) {
                            diaValido = true;
                        } else {
                            System.out.println("Dia inválido!");
                        }
                    }

                    horaValida = false;
                    while (!horaValida) {
                        System.out.print("-> Digite a hora: ");
                        int escolhaHora = leitor.nextInt();
                        if (escolhaHora >= 0 && escolhaHora < 24) {
                            horaValida = true;
                            if (agenda[escolhaMês - 1][escolhaHora] == null) {
                                System.out.println("Sem compromissos para este horário.");
                            } else {
                                System.out.println("Compromisso: " + agenda[escolhaMês - 1][escolhaHora]);
                            }
                            break;
                        } else {
                            System.out.println("Hora inválida!");
                        }
                    }
                    System.out.print("> Voltar ao menu? (S/N): ");
                    menu = leitor.next();
                    break;
                
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
        
        System.out.println("Sistema encerrado.");
        leitor.close();
    }
}
package estrutura_dados;

import java.util.Scanner;

public class ExercicioCatracaAcademia {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String[] alunosCadastrados = {"Gustavo", "Ana", "Felipe", "Maia", "Joao"};

        System.out.println("--> Digite o nome do Aluno: ");

        String alunoTentandoEntrar = teclado.next();

        if (encontradorDeAluno(alunosCadastrados, alunoTentandoEntrar)) {
            System.out.println("--> O acesso foi liberado, tenha um bom treino");
        } else {
            System.out.println("--> O acesso foi negado, verifique a mensalidade e contate o suporte");
        }

        teclado.close();

    }

    public static boolean encontradorDeAluno(String[] alunosCadastrados, String alunoTentandoEntrar) {
        for (String nomeDeAluno : alunosCadastrados) {
            if (alunoTentandoEntrar.equalsIgnoreCase(nomeDeAluno)) {
                return true;
            }
        }

        return false;
    }
}
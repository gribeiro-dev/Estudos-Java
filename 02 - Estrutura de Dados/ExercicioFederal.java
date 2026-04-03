
import java.util.Scanner;

public class ExercicioFederal {
    public static void main(String[] args) {
        /* Nesse exercicio, o meu objetivo era criar um simples array e percorrer por ele com os laços de repetição for.
        Fiz isso usando a sintaxe padrão do java pra criar array e os laços
        No fim, eu mostrei o resultado com println. */
        
        Scanner leitor = new Scanner(System.in);

        int[] notaDosAlunos = new int[11];

        double soma = 0;

        for (int i = 0; i <= notaDosAlunos.length - 1; i++) {
            System.out.print("Digite a nota do aluno " + i + ": ");
            notaDosAlunos[i] = leitor.nextInt();
            soma += notaDosAlunos[i];
        }
        
        double media = soma / notaDosAlunos.length;

        System.out.println("Relatório das notas dos alunos: ");
        System.out.println("A média dos alunos foi de: " + (media));
        System.out.println("Alunos acima da média: ");

        for (int i = 0; i < media; i++) {
            if (notaDosAlunos[i] >= 7) {
                System.out.println("Aluno " + i + " = " + notaDosAlunos[i]);
            }
        }
    }
}


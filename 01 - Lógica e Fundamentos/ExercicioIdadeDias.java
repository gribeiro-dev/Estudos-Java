
import java.io.IOException;
import java.util.Scanner;
public class ExercicioIdadeDias {
    public static void main(String[] args) throws IOException {
        /* Nesse exercicio, o meu objetivo era calcular um valor de idade e dizer quantos (anos, meses e dias) esse idade corresponde.
        Fiz isso usando as variáveis [idade, anos, meses e dias] e utilizei a lógica para chegar ao valor final 
        Por fim, eu mostrei o resultado com println.
        */

        Scanner leitor = new Scanner(System.in);

        int idade = leitor.nextInt();
        int anos = idade/365;
        int meses = idade % 365 / 30;
        int dias = (idade % 365) % 30;

        System.out.println(anos + "ano(s)\n" + meses + "mes(es)\n" + dias + "dia(s)");

        leitor.close();

    }
}
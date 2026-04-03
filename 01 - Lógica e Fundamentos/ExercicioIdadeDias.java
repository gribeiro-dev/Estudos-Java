
import java.io.IOException;
import java.util.Scanner;
public class ExercicioIdadeDias {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);

        int idade = leitor.nextInt();
        int anos = idade/365;
        int meses = idade % 365 / 30;
        int dias = (idade % 365) % 30;

        System.out.println(anos + "ano(s)\n" + meses + "mes(es)\n" + dias + "dia(s)");

    }
}
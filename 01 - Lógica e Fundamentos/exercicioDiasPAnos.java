
import java.util.Scanner;

public class exercicioDiasPAnos {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int x = leitor.nextInt();

        int ano = x / 365;
        int mes = (x % 365) / 30;
        int dias = (x % 365) % 30;

        System.out.println(ano + " ano(s)");
        System.out.println(mes + " mes(es)");
        System.out.println(dias + " dia(s");

    }

}

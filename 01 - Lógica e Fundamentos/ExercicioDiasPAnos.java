
import java.util.Scanner;

public class ExercicioDiasPAnos {
    public static void main(String[] args) {

        /* Nesse exercicio, o meu objetivo era transformar um valor x em ano, mes e dias.
        Fiz isso usando o Scanner para fazer o processo de entrada de dados e utilizei a lógica para determinar o valor x em (ano, mes e dias) 
        Por fim, mostrei o resultado com println.
        */ 

        Scanner leitor = new Scanner(System.in);

        int x = leitor.nextInt();

        int ano = x / 365;
        int mes = (x % 365) / 30;
        int dias = (x % 365) % 30;

        System.out.println(ano + " ano(s)");
        System.out.println(mes + " mes(es)");
        System.out.println(dias + " dia(s");

        leitor.close();

    }

}

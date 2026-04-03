
import java.util.Scanner;

public class ExercicioSegEmHoras {
    public static void main(String[] args) {

        /* Nesse exercicio, o meu objetivo era transformar um valor x em horas, minutos e segundos
        Fiz isso usando o Scanner para fazer o processo de entrada de dados e utilizei a lógica para determinar o valor x em (horas, minutos e segundos) 
        Por fim, mostrei o resultado com println.
        */ 

        Scanner leitor = new Scanner(System.in);

        int x = leitor.nextInt();

        int horas = (x / 3600);
        int minutos = (x % 3600) / 60;
        int segundos = (x % 3600) % 60;

        System.out.println(horas + ":" + minutos + ":" + segundos);

    }
}


import java.util.Scanner;

public class ExercicioSegEmHoras {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int x = leitor.nextInt();

        int horas = (x / 3600);
        int minutos = (x % 3600) / 60;
        int segundos = (x % 3600) % 60;

        System.out.println(horas + ":" + minutos + ":" + segundos);

    }
}

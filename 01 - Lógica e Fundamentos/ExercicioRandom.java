
import java.util.Random;
import java.util.Scanner;

public class ExercicioRandom {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        Random rnd = new Random();
        int x = rnd.nextInt(100);

        int palpite = 0;

        while (palpite != x) {
            System.out.print("> Diga seu palpite: ");
            palpite = leitor.nextInt();

            if (palpite < x) {
                System.out.println("MAIOR");
            } else if (palpite > x){
                System.out.println("MENOR");
            } else {
                System.out.print("> Vocẽ acertou!");
            }


        }

    }
}

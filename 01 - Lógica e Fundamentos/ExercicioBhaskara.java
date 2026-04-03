package exercicioDiferente;
import java.util.Scanner;

public class ExercicioBhaskara {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double a = leitor.nextDouble(), b = leitor.nextDouble(), c = leitor.nextDouble();

        double delta = Math.pow(b, 2) - 4 * (a * c);

        if (a == 0 || delta < 0) {
            System.out.println("Impossivel calcular");
        } else {
            //double R1 = ((b * -1) + (Math.sqrt(delta)) / (2 * a));
            double R1 = ( (-b) + Math.sqrt(delta) ) / (2 * a);
            double R2 = ( (-b) - Math.sqrt(delta) ) / (2 * a);

            System.out.printf("R1 = %.5f%n", R1);
            System.out.printf("R2 = %.5f%n", R2);

        }
    }
}

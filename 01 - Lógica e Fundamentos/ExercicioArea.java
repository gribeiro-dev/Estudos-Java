package exercicioDiferente;
import java.util.Scanner;
public class ExercicioArea {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double a = leitor.nextDouble(), b = leitor.nextDouble(), c = leitor.nextDouble();

        double triangulo = a * c / 2;
        double circulo =  3.14159 * (c*c);
        double trapezio = ((a + b) * c) / 2;
        double quadrado = b * b;
        double retangulo = a * b;

        System.out.printf("TRIANGULO: %.3f%n", triangulo);
        System.out.printf("CIRCULO: %.3f%n", circulo);
        System.out.printf("TRAPEZIO: %.3f%n", trapezio);
        System.out.printf("QUADRADO: %.3f%n", quadrado);
        System.out.printf("RETANGULO: %.3f%n", retangulo);


    }
}

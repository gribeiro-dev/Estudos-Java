

import java.util.Scanner;

public class ExercicioTriangulo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double a = leitor.nextDouble(), b = leitor.nextDouble(), c = leitor.nextDouble();

        boolean aSomaEMaiorQueA = (b+c > a && a+c > b && a+b > c);

        if (aSomaEMaiorQueA) {
            System.out.println("Perimetro = " + (a+b+c));
        } else {
            double calculoTrapezio = ((a + b) * c) / 2;
            System.out.println("Area = " + calculoTrapezio);
        }
    }
}

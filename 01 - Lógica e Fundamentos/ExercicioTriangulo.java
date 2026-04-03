

import java.util.Scanner;

public class ExercicioTriangulo {
    public static void main(String[] args) {

        /* Nesse exercicio, o meu objetivo era transformar valores (a, b e c) em perimetro de um triangulo ou area de um trapezio.
        Para isso, usei o scanner pare receber os valores e criei uma variavel booleana que compara:
        (A soma de b e c é maior que A): Se sim, calcula o perimetro desses valores
        Caso contrário, faz a área de um trapézio com os valores (a, b e c)
        No fim, eu mostrei o resultado baseado nas condicoes (if e else)
        */

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

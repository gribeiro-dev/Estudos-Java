import java.util.Scanner;

public class ExercicioBhaskara {
    public static void main(String[] args) {

        /* Nesse exercicio, o meu objetivo era treinar a entrada de dados e fazer o calculo da bhaskara com os valores atribuidos.
        Fiz isso usando o scanner para receber os valores e calculei com as formulas de bhaskara com os valores de a, b e c
        Exemplo de valores: 10.0 20.1 5.1
        Por fim, utilizei as condicionais para verificar se é possivel calcular ou não, caso contrário, 
        mostra o resultado com printf.
        */

        Scanner leitor = new Scanner(System.in);

        double a = leitor.nextDouble(), b = leitor.nextDouble(), c = leitor.nextDouble();

        double delta = Math.pow(b, 2) - 4 * (a * c);

        if (a == 0 || delta < 0) {
            System.out.println("Impossivel calcular");
        } else {
            //double R1 = ((b * -1) + (Math.sqrt(delta)) / (2 * a));
            double R1 = ((-b) + Math.sqrt(delta)) / (2 * a);
            double R2 = ((-b) - Math.sqrt(delta)) / (2 * a);

            System.out.printf("R1 = %.5f%n", R1);
            System.out.printf("R2 = %.5f%n", R2);

        }
        
        leitor.close();

    }
}


import java.util.Random;
import java.util.Scanner;

public class ExercicioRandom {
    public static void main(String[] args) {

        /* Nesse exercicio, o meu objetivo era treinar o conhecimento de condicionais e laço de repetição, para isso, eu criei um mini jogo de adivinhação.
        Fiz isso usando as bibliotecas Scanner e Random, para começar, eu criei as variáveis [x] para determinar um valor aleatorio e [palpite] 
        que é oque o usuario digita e é lido pelo scanner, enquanto o palpite for diferente de x, o código da certas 
        dicas para o usuario, se o numero escondido é maior do que o digitado ou menor e assim vai...
        Por fim, se o usuario conseguir acertar o numero escondido, é mostrado que ele acertou e o codigo acaba
        */

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

import java.util.Scanner;

public class exercicioBanco {
    public static void main(String[] args) throws InterruptedException {

        /* Nesse exercicio, o meu objetivo era fazer um sistema de banco bem simples.
        Fiz isso usando o scanner para a entrada de dados, atribuindo a variáveis nome e senha, e comparando as mesma com condiconais if e else
        No fim, mostrei o resultado com println.
        */

        String nomeCorreto = "Gustavo";
        String senhaCorreta = "123";
        String nomeDaConta;
        String senhaDaConta;

        Scanner leitor = new Scanner(System.in);

        System.out.println("------------------------------------");
        System.out.println(">>>>> Login de acesso ao banco <<<<<");
        System.out.println("------------------------------------");

        System.out.println(">> Usuário: ");
        nomeDaConta = leitor.nextLine();

        System.out.println(">> Senha: ");
        senhaDaConta = leitor.nextLine();

        System.out.println("\n>> Efetuando login, aguarde um momento...! ");
        Thread.sleep(500);

        if (nomeDaConta.equals(nomeCorreto) && senhaDaConta.equals(senhaCorreta)) {
            System.out.println("\n------------------------------------------");
            System.out.println("         > LOGIN BEM-SUCEDIDO <           ");
            System.out.println("------------------------------------------");
            System.out.println(">> Usuário: " + nomeDaConta + " | " + " Banco: Nubank" + " | " + " <<");
            System.out.println("\n> Saldo dispónivel: R$ 2.50");
            System.out.println("\n> Limite de crédito: R$ 1200");
            System.out.println("------------------------------------------");
        } else {
            System.out.println(">> O usuário ou senha estão inválidos, tente novamente mais tarde.");
        }

        leitor.close();

    }
}

package POO.Exercicios.EX2_Conta.dominio;

public class Conta {

    public String titular;
    public double saldo;

    public void depositar(double numeroDep) throws InterruptedException {
        saldo += numeroDep;
        System.out.println(">> Depositando " + numeroDep + "R$...");

        Thread.sleep(1200);

        System.out.println(">-------------><------------<");

        System.out.println("> Deposito " + "realizado com sucesso!");

        System.out.println(">-------------><------------<");

        System.out.println();

    }

    public void sacar(double numeroSaque) throws InterruptedException {

        if (numeroSaque <= saldo) {
            saldo = saldo - numeroSaque;

            System.out.println("Sacando " + numeroSaque + " R$ do saldo...");
            Thread.sleep(1000);

            System.out.println(">-------------><------------<");

            System.out.println("> " + numeroSaque + "R$ foram sacados pelo saldo atual!");

            System.out.println(">-------------><------------<");

        } else {
            System.out.println(">-------------><------------<");
            System.out.println("> Nao e possivel sacar um numero maior do que o saldo atual, tente novamente.");
            System.out.println(">-------------><------------<");
        }

    }

    public void mostrarSaldo() {
        System.out.println("> Saldo atual: " + saldo + "R$");
        System.out.println(">-------------><------------<");
    }
}
package POO.Exercicios.EX2_Conta.test;

import POO.Exercicios.EX2_Conta.dominio.Conta;

public class testConta01 {

    public static void main(String[] args) throws InterruptedException{

        Conta conta1 = new Conta();

        Conta conta2 = new Conta();

        System.out.println(">--------- Conta 1 --------<");

        conta1.depositar(40.00);

        conta1.sacar(20.00);

        conta1.mostrarSaldo();

        System.out.println();

        System.out.println(">--------- Conta 2 --------<");

        conta2.depositar(20.00);

        conta2.sacar(21.00);

        conta2.mostrarSaldo();


    }




}

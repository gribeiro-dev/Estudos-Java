package POO.Exercicios.EX1_Livro.test;

import POO.Exercicios.EX1_Livro.dominio.Livro;

public class testLivro01 {

    public static void main(String[] args) {


        Livro livro1 = new Livro();

        Livro livro2 = new Livro();

        // Colocando os valores dentro dos atributos do livro1

        livro1.anoPublicacao = 2000;

        livro1.titulo = "Aprendendo POO de uma vez por todas!";

        livro1.autor = "Caio Kirigaya";

        livro1.disponivel = true;

        // Utilizando os metodos do livro 1

        System.out.println();

        System.out.println("-------> Livro 1 <-------");

        System.out.println(">> Opa, posso pegar esse livro emprestado?");

        livro1.emprestar();

        System.out.println(">> Eu ja li tudo, quero devolver por favor: ");

        livro1.devolver();

        System.out.println(">> Quero ver as informacoes do livro...");

        livro1.mostrarDados();

        System.out.println();

        // Colocando os valores do livro 2 em seus atributos

        livro2.anoPublicacao = 2026;

        livro2.titulo = "Guia de Primogems em Genshin Impact";

        livro2.autor = "Mr.Casual";

        livro2.disponivel = false;

        // Utilizando os metodos do livro 2

        System.out.println();

        System.out.println("-------> Livro 2 <-------");

        System.out.println(">> Opa, posso pegar esse livro emprestado?");

        livro2.emprestar();

        System.out.println("Em outro dia, Davi devolve o livro " + livro2.titulo + "para a biblioteca");

        livro2.devolver();

        System.out.println(">> Opa, hoje eu posso pegar emprestado?  ");

        livro2.emprestar();

        System.out.println(">> Quero ver as informacoes do livro...");

        livro2.mostrarDados();

        System.out.println();



    }




}

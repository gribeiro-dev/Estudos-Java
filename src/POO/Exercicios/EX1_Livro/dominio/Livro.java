package POO.Exercicios.EX1_Livro.dominio;

public class Livro {

    public String titulo;
    public String autor;
    public int anoPublicacao;
    public boolean disponivel;

    public void emprestar() {
        if (disponivel) {
            disponivel = false;

            System.out.println("Livro emprestado com sucesso");

        } else {
            System.out.println("Este livro ja foi emprestado!");
        }



    }

    public void devolver() {

        disponivel = true;

        System.out.println("Livro devolvido!");

    }

    public void mostrarDados() {

        if (titulo != null && autor != null && anoPublicacao != 0) {
            System.out.println();
            System.out.print("| Informacoes sobre o livro: ");
            System.out.println();
            System.out.println("-------------><-------------");

            System.out.println("| Nome: ");
            System.out.println("| >> " + titulo);
            System.out.println("| Ano: ");
            System.out.println("| >> " + anoPublicacao);
            System.out.println("| Autor: ");
            System.out.println("| >> " + autor);
            System.out.println("-------------><-------------");

        } else {
            System.out.println("Erro: Nao existem informacoes sobre o livro, registre e tente novamente.");
        }




    }



}


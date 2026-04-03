package exercicioDiferente;

public class Aula03TiposPrimitivosExercicio {
    public static void main (String[] args) {

        /* Crie váriaveis para os campos descritos abaixo com <> e imprima-os

        Eu sou <nome>, morando no endereço <endereço>,
        confirmo que recebi o salário de <salário>, na data <data> */

        String nomeDoUsuario = "Gustavo";
        String enderecoDoUsuario = "Rua Theobaldo de Nigris 180, Boa Vista, SCS";
        double salarioDoUsuario = 1621D;
        byte diaDoPagamento = 15;
        String mesDoPagamento = "03";
        int anoDoPagamento = 2026;
        String nomeDoEmailDele = "gustavo.ribeiro16@gmail.com";

        System.out.println("\n> Email de " + nomeDoEmailDele);

        System.out.println("\n> Boa noite chefe, tudo bem?\n");

        System.out.println("> Eu sou "+ nomeDoUsuario + ", morador d endereço " + enderecoDoUsuario);

        System.out.println("> E vim confirmar que recebi o salário de R$ "+ salarioDoUsuario + ", na data " + diaDoPagamento + "/" + mesDoPagamento + "/" + anoDoPagamento);

    }
}


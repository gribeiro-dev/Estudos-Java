

public class ExercicioTaxa {
    public static void main(String[] args) throws InterruptedException {

        /* Olá gustavo, vamos começar um exercicio agora ein!
        Neste exercicio, você deve determinar quanto de taxa uma pessoa paga baseado nessa tabela abaixo
        From | Up to and including | Rate
        € 0     | € 34,712 | 9.70%
        € 34,713 | € 68,507 | 37.35%
        € 68,508 | — | 49.50%

        O from é salario base e o up to é o maximo que pode chegar para pagar até 9.70 por exemplo */

        double salario = 70000;
        double primeiraTaxa = (9.70/100);
        double segundaTaxa = (37.35/100);
        double terceiraTaxa = (49.50/100);
        double quantoPagar;
        String taxa = "";

        if (salario >= 0 && salario <= 34712) {
            quantoPagar = salario * primeiraTaxa;
            taxa = "9.70%!";
        } else if (salario >= 34713 && salario <= 68507) {
            quantoPagar = salario * segundaTaxa;
            taxa = "37.35%!";
        } else{
            quantoPagar = salario * terceiraTaxa;
            taxa = "49.50%!";
        }
        System.out.println("========================================");
        System.out.println(">>>>> Calculadora de Taxa Salarial <<<<<");
        System.out.println("========================================");

        System.out.println("\n>> Bom dia Gustavo, vamos calcular a sua taxa!" + "\n>> O seu salário é de: " + "€ " + (int)salario);

        Thread.sleep(700);

        System.out.println("\n[====================] 100%");

        Thread.sleep(500);

        System.out.println("\n>> A sua taxa salarial será de: " + taxa);

        System.out.println(">> O valor que deverá ser pago é de: € " + quantoPagar);
    }
}


public class ExercicioHoras {
    public static void main(String[] args) throws InterruptedException {

        /* Nesse exercicio, o meu objetivo era calcular um valor de horas e minutos e dizer se era de (Madrugada, manhã, tarde ou noite).
        Fiz isso usando as variavéis [horas e minutos] para determinar os principais valores e utilizei as condicionais if e else para dizer o periodo do dia
        No fim, eu mostrei o resultado com println.
        */

        int hora = 12;
        int minuto = 30;
        int calculoEmMinuto;
        String horarioDoDia;

        calculoEmMinuto = (hora*60) + minuto;

        if (calculoEmMinuto < 359) {
            horarioDoDia = "madrugada";
        } else if (calculoEmMinuto < 719) {
            horarioDoDia = "manhã";
        } else if (calculoEmMinuto < 1079) {
            horarioDoDia = "tarde";
        } else {
            horarioDoDia = "noite";
        }

        System.out.println("===============================");
        System.out.println(">>>> Descobrindo o horário <<<<");
        System.out.println("===============================");

        System.out.println("\n>> Bom dia Gustavo, vamos analisar a hora digitada!");

        Thread.sleep(900);
        System.out.println(">> Que horas são?: " + hora + ":" + minuto);

        Thread.sleep(700);
        System.out.println("\n[====================] 100%");

        Thread.sleep(500);
        System.out.println("\n>> O horário digitado está de " + horarioDoDia + "! Tenha um ótimo dia Gustavo >:D");

    }


}

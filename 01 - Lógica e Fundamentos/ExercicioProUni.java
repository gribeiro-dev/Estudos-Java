

public class ExercicioProUni {
    public static void main(String[] args) {

        int participacaoDoEnem26 = 1;
        int mediaGeralDaProva = 500;
        int notaSuperiorAZeroNaRedação = 100;
        int participouComoTreineiro = 0;
        double rendaFamiliarBrutaMensal = 6000;
        int numerosDePessoas = 3;
        double resultado = (rendaFamiliarBrutaMensal / numerosDePessoas);

        boolean isParticipacaoDoEnemVerdadeira = (participacaoDoEnem26 == 1);
        boolean isMediaEstaDentroDoRequisito = (mediaGeralDaProva >= 450);
        boolean isNotaDaRedacaoEstaDentroDoReq = (notaSuperiorAZeroNaRedação > 0);
        boolean isTreineiro = (participouComoTreineiro == 1);
        boolean isRendaBrutaEstaDentroDaBolsaInt = (((resultado <= 2432)));
        boolean isRendaBrutaEstaDentroDaBolsaParc = ((resultado > 2432 && resultado <= 4863));
        boolean isDentroDeAlgumaBolsa = (isRendaBrutaEstaDentroDaBolsaInt || isRendaBrutaEstaDentroDaBolsaParc);

        boolean estaDentroDoProUni = (isParticipacaoDoEnemVerdadeira && isMediaEstaDentroDoRequisito && isNotaDaRedacaoEstaDentroDoReq && !isTreineiro && isDentroDeAlgumaBolsa);

        System.out.println("----> Dados de análise para o PROUNI de Gustavo Ribeiro <----");
        System.out.println("----> O estudante participou do ENEM 2026: " + isParticipacaoDoEnemVerdadeira);
        System.out.println("----> A média do estudante está dentro do requisito: " + isMediaEstaDentroDoRequisito);
        System.out.println("----> A nota da sua redação está dentro do requisito: " + isNotaDaRedacaoEstaDentroDoReq);
        System.out.println("----> O estudante participou como treineiro: " + isTreineiro);
        System.out.println("----> O estudante receberá a bolsa integral: " + isRendaBrutaEstaDentroDaBolsaInt);
        System.out.println("----> O estudante receberá a bolsa parcial: " + isRendaBrutaEstaDentroDaBolsaParc);
        System.out.println("----> O estudante participa de alguma bolsa: " + isDentroDeAlgumaBolsa);
        System.out.println("----> Poderá participar do serviço do PROUNI: " + (estaDentroDoProUni));
    }
}

package estrutura_dados;

public class ExercicioFate {
    public static void main(String[] args) {

        String[] listaDePersonagensFate = {"Tohsaka Rin", "Emiya Shirou", "Artoria", "Illyia", "Gilgamesh", "Herculis"};

        for (int i = listaDePersonagensFate.length - 1; i >= 0; i--) {
            System.out.print(listaDePersonagensFate[i] + " | ");
        }

    }
}

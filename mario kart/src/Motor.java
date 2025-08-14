public class Motor {
    String cilindradas;
    float velocidadeMaxima;

    void mostraInfo() {
        String linha1 = String.format("|  %-64s|", "Cilindradas: " + cilindradas);
        String linha2 = String.format("|  %-64s|", "Velocidade Máxima: " + velocidadeMaxima);
        System.out.println(linha1);
        System.out.println(linha2);
    }
}

/*      Exercício 6

    Crie Classes em Java que atendam a especificação UML abaixo
    Em seguida crie ao menos dois objetos de cada, os relacione e
    Os métodos devem apenas imprimir suas ações
    As cilindradas podem assumir três valores: 50, 100 e 150
    A velocidade pode assumir valores entre 0 e 150

( ) -> agregação
(*) -> composição

    *---------------------------------*
    |             Piloto              |
    |---------------------------------|
    |   + nome: String                |
    |   + vilao: boolean              |
    |---------------------------------|
    |   + soltaSuperPoder()           |
    *---------------------------------*
                    |
                    |
                    |
                    |
                    |
                    |
                   ( )
    *---------------------------------*
    |             Kart                |
    |---------------------------------|
    |   + Nome: String                |
    |---------------------------------|
    |   + pular()                     |
    |   + soltarTurbo()               |
    |   + fazerDrift()                |
    *---------------------------------*
                   (*)
                    |
                    |
                    |
                    |
                    |
                    |
    *---------------------------------*
    |             Motor               |
    |---------------------------------|
    |   + cilindradas: String         |
    |   + velocidadeMaxima: float     |
    |---------------------------------|
    |   + mostraInfo()                |
    *---------------------------------*

 */

public class Main {
    public static void main(String[] args) {

        // criação dos objetos
        Kart kart = new Kart();
        Piloto  piloto = new Piloto();
        Kart kart2 = new Kart();
        Piloto piloto2 = new Piloto();

        // valores nos atributos do piloto
        piloto.nome = "Senna";
        piloto.vilao = true;
        piloto2.nome = "McQueen";
        piloto2.vilao = true;

        // agregando piloto ao kart
        kart.piloto = piloto;
        kart2.piloto = piloto2;

        // valores nos atributos do kart
        kart.nome = "Capotis";
        kart.motor.cilindradas = "150";
        kart.motor.velocidadeMaxima = 150;

        kart2.nome = "Relâmpago";
        kart2.motor.cilindradas = "50";
        kart2.motor.velocidadeMaxima = 0;

        // exibição dos valores
        System.out.println("*------------------------------------------------------------------*");
        System.out.println("|                                                                  |");
        System.out.println("|                   Info dos Karts e Pilotos                       |");
        System.out.println("|                                                                  |");
        System.out.println("|__________________________________________________________________|");
        System.out.println("|                                                                  |");
        System.out.println("|   Kart N° 1                                                      |");
        System.out.println("|   Nome do kart: " + kart.nome + "                                          |");
        System.out.println("|   Nome do piloto: " + kart.piloto.nome + "                                          |");
        kart.motor.mostraInfo();
        System.out.println("|                                                                  |");
        System.out.println("|__________________________________________________________________|");
        System.out.println("|                                                                  |");
        System.out.println("|   Kart N° 2                                                      |");
        System.out.println("|   Nome do kart: " + kart2.nome + "                                        |");
        System.out.println("|   Nome do piloto: " + kart2.piloto.nome + "                                        |");
        System.out.println("|   Cilindradas: " + kart2.motor.cilindradas + "                                                |");
        System.out.println("|   Velocidade Máxima: " + kart2.motor.velocidadeMaxima + "                                         |");
        System.out.println("|                                                                  |");
        System.out.println("|__________________________________________________________________|");
        System.out.println("|                                                                  |");
        System.out.println("|                       Ações dos Karts                            |");
        System.out.println("|                                                                  |");
        System.out.println("|   Pular                                                          |");
        System.out.println("|   Soltar Turbo                                                   |");
        System.out.println("|   Fazer drift                                                    |");
        System.out.println("|                                                                  |");
        System.out.println("|__________________________________________________________________|");
        System.out.println("|                                                                  |");
        System.out.println("|                       Ações dos Pilotos                          |");
        System.out.println("|                                                                  |");
        System.out.println("|   Soltar Super Poder                                             |");
        System.out.println("|                                                                  |");
        System.out.println("*------------------------------------------------------------------*");

    }
}

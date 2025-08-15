import java.util.Scanner;

/*  Exercício 5 – Jogo!

    -Crie Classes em Java que atendam a seguinte especificação
    -Cada vez que o personagem toma dano ele perde 5 pontos de vida;
    -Cada vez que usa a arma, ela perde 2 pontos de resistência

    ( ) -> agregação
    (*) -> composição

    *---------------------------------*
    |             Personagem          |
    |---------------------------------|
    |   + nome: String                |
    |   + pontos: int                 |
    |---------------------------------|
    |   + usarArma()                  |
    |   + tomarDano()                 |
    *---------------------------------*
                   ( )
                    |
                    |
                    |
                    |
                    |
                    |
    *---------------------------------*
    |             Arma                |
    |---------------------------------|
    |   + nome: String                |
    |   + poder: int                  |
    |   + resistencia: int            |
    |   + descricao: int              |
    |---------------------------------|
    |   + mostraInfoArma()            |
    *---------------------------------*

 */
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int opcao;

        // criando objeto
        Personagem personagem1 = new Personagem();
        Arma arma1 = new Arma();

        // valores no objeto personagem
        personagem1.nome = "Stivu";
        personagem1.pontos = 10;

        // valores no objeto arma
        arma1.nome = "Iron Pickaxe";
        arma1.poder = 2;
        arma1.resistencia = 10;
        arma1.descricao = "Minera carvao pae";

        // agregando arma ao personagem
        personagem1.arma = arma1;

        do{
            System.out.println("*------------------------------------------------------------------*");
            System.out.println("|                                                                  |");
            System.out.println("|   1 - Mostar info da arma                                        |");
            System.out.println("|   2 - Usar arma                                                  |");
            System.out.println("|   3 - Tomar hit                                                  |");
            System.out.println("|   4 - Encerrar programa                                          |");
            System.out.println("|                                                                  |");
            System.out.println("*------------------------------------------------------------------*");
            opcao = input.nextInt();

            if(opcao == 1){
                personagem1.arma.mostraInfoArma();
            }
            else if(opcao == 2){
                if(personagem1.arma.resistencia <= 0){
                    System.out.println("Sua arma quebrou");
                }
                else{
                    personagem1.usarArma();
                    System.out.println("Arma usada");
                }

            }
            else{
                personagem1.tomarDano();
                System.out.println("Hit tomado. Quantidade de HP: " + personagem1.pontos);
                if(personagem1.pontos <= 0){
                    System.out.println("Voce morreu");
                    break;
                }
            }
        }while(opcao != 4);
    }
}
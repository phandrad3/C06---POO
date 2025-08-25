/*      Exercício 6

     Crie classes em Java que atendam as especificações UML abaixo
    Crie uma classe Main e, nela, crie:
    Uma cantina com nome “Cantina do Inatel”
    3 Salgados da sua escolha
    Adicione os Salgados na Cantina
    Mostre os Salgados adicionados


( ) -> agregação
(*) -> composição

    *----------------------------------------*
    |                Salgado                 |
    |----------------------------------------|
    |   + nome: String                       |
    |----------------------------------------|
    |   + soltaSuperPoder()                  |
    *----------------------------------------*
                       |
                       |
                       |
                       |
                       |
                       |
                      ( )
    *----------------------------------------*
    |                Cantina                 |
    |----------------------------------------|
    |   + Nome: String                       |
    |--------------------------------- ------|
    |   + addSalgado(Salgado novoSalvado)    |
    |   + soltarTurbo()                      |
    |   + fazerDrift()                       |
    *----------------------------------------*

 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int parada;
        String nome;
        Cantina cantina = new Cantina();

        cantina.nome = "Cantina do Abreu";

        do{
            System.out.println("*------------------------------------------------------------------*");
            System.out.println("|                                                                  |");
            System.out.println("|    " + cantina.nome + "                                              |");
            System.out.println("|                                                                  |");
            System.out.println("|   1 - Adicionar novo salgado                                     |");
            System.out.println("|   2 - Mostrar salgados na cantina                                |");
            System.out.println("|   3 - Encerrar programa                                          |");
            System.out.println("|                                                                  |");
            System.out.println("*------------------------------------------------------------------*");
            parada = input.nextInt();

            switch(parada){
                case 1:
                    System.out.println("Digite o nome do salgado: ");
                    nome = input.next();
                    Salgado salgado = new Salgado();
                    salgado.nome = nome;
                    cantina.addSalgado(salgado);
                    break;
                    case 2:
                        cantina.mostraInfo();
            }

        }while(parada != 3);
        }
    }

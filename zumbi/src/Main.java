/*

    Você e seus amigos AINDA estão criando um software para modelar zumbis! Considere o UML para modelar o zumbi!

    |---------------------------------|
    |             Zumbi               |
    |---------------------------------|
    |   + double: vida                |
    |   + nome: String                |
    |---------------------------------|
    |   + mostrarVida(): double       |
    |   + transfereVida(zumbiAlvo     |
    |                   Zumbi, quantia|
    |                   double): void |
    |---------------------------------|

 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Zumbi zumbi1 = new Zumbi();
        Zumbi zumbi2 = new Zumbi();
        int opcao;
        int quantidade;

        // input do nome do zumbi
        System.out.print("Digite o nome do primeiro zumbi: ");
        zumbi1.nome = input.nextLine();
        System.out.print("Digite o nome do segundo zumbi: ");
        zumbi2.nome = input.nextLine();

        // input da vida do zumbi
        System.out.print("Digite a vida do primeiro zumbi: ");
        zumbi1.vida = input.nextDouble();
        System.out.print("Digite a vida do segundo zumbi: ");
        zumbi2.vida = input.nextDouble();

        // menuzinho

        do{
            System.out.println("*------------------------------------------------------------------*");
            System.out.println("|                                                                  |");
            System.out.println("|   1 - Mostar nome do primeiro zumbi                              |");
            System.out.println("|   2 - Mostrar nome do segundo zumbi                              |");
            System.out.println("|   3 - Mostrar vida do primeiro zumbi                             |");
            System.out.println("|   4 - Mostrar vida do segundo zumbi                              |");
            System.out.println("|   5 - Transferir vida do primeiro zumbi para o segundo           |");
            System.out.println("|   6 - Transferir vida do segundo zumbi para o primeiro           |");
            System.out.println("|   7 - Encerrar programa                                          |");
            System.out.println("|                                                                  |");
            System.out.println("*------------------------------------------------------------------*");
            opcao = input.nextInt();

            if(opcao == 1){
                System.out.println("O nome do primeiro zumbi é: " +  zumbi1.nome);
            }
            else if(opcao == 2){
                System.out.println("O nome do segundo zumbi é: " + zumbi2.nome);
            }
            else if(opcao == 3){
                System.out.println("A vida do primeiro zumbi é: " + zumbi1.mostrarVida());
            }
            else if(opcao == 4){
                System.out.println("A vida do segundo zumbi é: " + zumbi2.mostrarVida());
            }
            else if(opcao == 5){
                System.out.println("Quantidade de vida que deseja transferir: ");
                quantidade = input.nextInt();
                if(quantidade > 0){
                    zumbi1.transferirVida(zumbi2, quantidade);
                }
            }
            else{
                System.out.println("Quantidade de vida que deseja transferir: ");
                quantidade = input.nextInt();
                if(quantidade > 0){
                    zumbi2.transferirVida(zumbi1, quantidade);
                }
            }
        }while(opcao != 7);

        input.close();
    }
}

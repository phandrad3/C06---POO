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

    Exercício 3 – Zumbis!
    Você e seus amigos CONTINUAM criando um software para modelar zumbis! Considerando o zumbi do exercício 2
    - Crie dois zumbis (cada um com seu “new”).
    Manipule a vida individualmente
    Depois faça ambas as variáveis de referencias iguais
    Ex: z1 = z2;
    Manipule a vida dos zumbis (através de z1 e z2).
    Verifique a vida deles

    Exercício 4 – Zumbis!
    Sim isso mesmo, ainda estão no zumbis! Modifique o Zumbi do Exercício 2 para atender a seguinte especificação
    A ação de transferir vida faz uma verificação antes
    se de fato é possível ser realizada.
    Ele retorna um booleano informando se deu certo a
    transferência
    - Modifique o Diagrama para atender o novo requisito


 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Zumbi zumbi1 = new Zumbi();
        Zumbi zumbi2 = new Zumbi();
        int opcao;
        int quantidade;
        boolean verificacao;

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
            System.out.println("|   1 - Mostar info dos zumbis                                     |");
            System.out.println("|   2 - Transferir vida                                            |");
            System.out.println("|   3 - Apontar ambos para a mesma mémoria                         |");
            System.out.println("|   4 - Encerrar programa                                          |");
            System.out.println("|                                                                  |");
            System.out.println("*------------------------------------------------------------------*");
            opcao = input.nextInt();

            if(opcao == 1){
                System.out.println("O nome do primeiro zumbi é: " +  zumbi1.nome + "|   HP: " + zumbi1.vida);
                System.out.println("O nome do segundo zumbi é: " +  zumbi2.nome + "|   HP: " + zumbi2.vida);
            }
            else if(opcao == 2){
                verificacao = zumbi1.verificTransfVida(zumbi1, zumbi2);
                if(verificacao){
                    System.out.println("Para qual zumbi deseja transferir a vida? (1/2)");
                    opcao = input.nextInt();
                    System.out.println("Quantidade de vida que deseja transferir: ");
                    quantidade = input.nextInt();

                     if(quantidade > 0 && opcao == 1){
                        zumbi2.transferirVida(zumbi1, quantidade);
                    }
                    else if(quantidade > 0 && opcao == 2){
                        zumbi1.transferirVida(zumbi2, quantidade);
                    }

                }
                else{
                    System.out.println("Não é possível transferir vida!");
                }

            }
            else if(opcao == 3){
                zumbi1 = zumbi2;
                System.out.println("Digite uma nova quantidade de vida: ");
                quantidade = input.nextInt();
                zumbi1.vida = quantidade;
            }
        }while(opcao != 4);

        input.close();
    }
}
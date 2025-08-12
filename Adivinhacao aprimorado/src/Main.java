/*

    Faça um programa que gere um número aleatório entre 1 e 10, e depois pergunte ao usuário
    qual número foi gerado. O jogo deve continuar até que o usuário adivinhe o número.
    Informe o usuário se o número que ele digitou é maior ou menor que o gerado pelo computador!

 */

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int x = rand.nextInt(10) + 1;
        Scanner entrada = new Scanner(System.in);
        int y;

        do {
            System.out.print("Digite um numero entre 1 e 10: ");
            y = entrada.nextInt();

            if(y > x){
                System.out.println("O numero que voce digitou é maior que o gerado");
            }
            else{
                System.out.println("O numero que voce digitou é menor que o gerado");
            }

        }while (x != y);

        entrada.close();

        System.out.println("Acerto papai");

    }
}
/*
    Faça um programa que consiga ler o número de lanches consumidos no trailler do Zé.
    Mostre a soma e a média. Utilize o pacote java.util.Scanner para ler os dados e
    utilize a saída com o metodo System.out.println()

 */

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Entre com o valor de lanches1: ");
        int lanche1 = entrada.nextInt();
        System.out.print("Entre com o valor de lanches2: ");
        int lanche2 = entrada.nextInt();
        System.out.print("Entre com o valor de lanches3: ");
        int lanche3 = entrada.nextInt();

        int total = lanche1 + lanche2 + lanche3;
        double media = (double)total / 3;

        System.out.println("Total de lanches: " + total);
        System.out.println("Media de lanches: " + media);

        entrada.close();
    }
}
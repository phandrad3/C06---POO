/*

    Faça um programa que receba uma NPA e informe se o aluno passou ou se ficou de NP3.
    Caso tenha ficado de NP3, informe a nota e faça a soma com NPA, para o cálculo da NFA.
    Imprima se ele passou ou não! Utilize a classe Scanner para ler as notas do aluno:

 */

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Entre com o valor da np1: ");
        int np1 = entrada.nextInt();
        System.out.print("Entre com o valor da np2: ");
        int np2 = entrada.nextInt();

        double npa = (np1 + np2) / 2;

        if(npa < 30){
            System.out.print("Nao passou");
        }
        else if(npa >= 30 && npa < 60){
            System.out.print("Entre com o valor da np3: ");
            int np3 = entrada.nextInt();

            double nfa = (np3 + npa) / 2;

            if(nfa >= 50){
                System.out.print("Passo");
            }
            else{
                System.out.print("Nao passou");
            }


        }
        else{
            System.out.print("Passo");
        }


        entrada.close();
    }
}
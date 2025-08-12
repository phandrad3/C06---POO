/*

    Faça um programa que receba o número de alunos matriculados na disciplina C206/C06 e
    imprima a sala onde o curso será ministrado. Esse número pode ser 10, 20 ou 30 alunos.
    Caso o número seja 10 ou 20 a sala utilizada pode ser a I-16. Caso o número seja 30,
    então deve ser utilizada a sala I-22. Caso o número de alunos não seja nenhum desses 3,
    o software deve mostrar uma mensagem ao usuário. Use a estrutura switch-case.

 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Entre com o numero de alunos: ");
        int numAlunos = entrada.nextInt();

        switch(numAlunos){
            case 10,20:
                System.out.println("Sala I-16");
                break;
            case 30:
                System.out.println("Sala I-22");
                break;
            default:
                System.out.println("Numeros de alunos invalido");
                break;

            /* Outra maneira de usar o switch

                    case 10:
                    case20:
                    sout
                    break;

             */
        }

        entrada.close();

    }
}
/***********************************************************************************
 *     22)Faça um programa que leia o valor de dois números inteiros e a operação
 *        aritmética desejada.Calcule então a respota adequada. Utilize os símbolos
 *        abaixo para ler qual operação aritmética escolhida.
 * 
 *      Símbolo                     Operação
 *      +                           Adição
 *      -                           Subtração
 *      *                           Multiplicação
 *      /                           Divisão  
************************************************************************************/

package listaExercicioJava;

import java.util.Scanner;

public class Exercicio_22 {
    /**
     * @param args
     */
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

            System.out.println("Digite o tipo de operção aritmética: ");
            char tipoOperacao = sc.next().charAt(0);

            System.out.println("Digite o primeiro valor: ");
            int valor_1 = sc.nextInt();

            System.out.println("Digite o segundo valor: ");
            int valor_2 = sc.nextInt();

            double resultadoOperacao = 0;
            
            //para usar o char usar '' no lugar da "".

            switch (tipoOperacao) {
                case '*':
                        resultadoOperacao = valor_1 * valor_2;
                        System.out.printf("O resultado para a multiplicação: %.2f",resultadoOperacao);
                    break;
                case '-':
                        resultadoOperacao = valor_1 - valor_2;
                        System.out.printf("O resultado para a subtração: %.2f", resultadoOperacao);
                    break;
                case '+':
                        resultadoOperacao = valor_1 - valor_2;
                        System.out.printf("O resultado para a adição: %.2f", resultadoOperacao);
                    break;
                case '/':
                        resultadoOperacao = (double) valor_1 / valor_2;
                        System.out.printf("O resultado para a divisão: %.2f", resultadoOperacao);
                    break;

                default:
                        System.out.println("Código digitado é inválido.");
                    break;
            }

        sc.close();
    }
}

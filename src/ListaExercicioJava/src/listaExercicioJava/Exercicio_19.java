/*****************************************************************
 *  19) Escreva um programa que leia o código de um determinado 
 *      produto e mostre a sua classificação.
 *      
 *      cod                     Classificação
 *      1                       Alimento não-perecível
 *      2                       Alimento perecível
 *      5 ou 6                  Vestuário
 *      7                       Higiene pessoal
 *      8 até 15                Limpeza e utensílios domésticos
 *      Qualquer outro código   Inválido
 *****************************************************************/

package ListaExercicioJava.src.listaExercicioJava;

import java.util.Scanner;

public class Exercicio_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            System.out.println("Digite o código do produto: ");
            int codigo = sc.nextInt();

            switch(codigo){
                case 1:
                    System.out.println("O produto é da categoria: Alimento não perecível.");
                    break;
                case 2:
                    System.out.println("O produto é da categoria: Alimento perecível.");
                    break;
                case 5, 6:
                    System.out.println("O produto é da categoria: Vestuário.");
                    break;
                case 7:
                    System.out.println("O produto é da categoria: Higiene pessoal.");
                    break;
                case 8, 9, 10, 11, 12, 13, 14, 15:
                    System.out.println("O produto é da categoria: Limpeza e utensílios domésticos.");
                    break;
                default:
                System.out.println("Código inválido.");
            }
        sc.close();
    }
}

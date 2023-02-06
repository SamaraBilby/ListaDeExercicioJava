/***********************************************************
 * Dados três valores A, B, C verificar se eles pode ser os 
 * os comprimentos do lados, se forem verificar se compõe um
 * triângulo equilátero, isósceles ou escoleno. 
 * Informar se não compuserem nenhum triângulo.
 *
 * Lógica para resolução
 * Triângulo -  figura geométrica de três lados, em que cada
 * um é menor que a soma dos outros dois;
 * Então: (A <= B + C) && (B <= A + C) && (C <= A + B)
 * Triângulo equilátero - possui três lados iguais;
 * Então : (A == B) && (B == C) 
 * Triângulo isósceles -  possui dois lados iguais;
 * Então: (A == B) || (A == C) || (B == C)
 * Triângulo escaleno - possui todos os lados diferentes
 * Então: (A <> B) && (B <> C) && (A <> C)
 ***********************************************************/


package listaExercicioJava;

import java.util.Scanner;

public class Exercicio_13 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

            double A, B,C;

            System.out.println("informe o valor de A:");
            A = sc.nextDouble();

            System.out.println("informe o valor de B:");
            B = sc.nextDouble();

            System.out.println("informe o valor de C:");
            C = sc.nextDouble();

            if((A <= B + C) && (B <= A + C) && (C <= A + B)){
                if((A == B) && (B == C)){
                    System.out.println("É um Triângulo Equilátero");
                }
                else if((A == B) || (A == C) || (B == C)){
                    System.out.println("É um Triângulo Isósceles");
                }

                else{
                    System.out.println("É um Triângulo Escaleno");
                }
            }
            else{
                System.out.println("Não é um triângulo");
            }

        sc.close();
    
    }
}

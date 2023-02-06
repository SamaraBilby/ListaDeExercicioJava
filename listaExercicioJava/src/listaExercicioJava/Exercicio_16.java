/*****************************************************************
 *     16) Desenvolva um programa que calcule as raízes de uma
 *         equação do 2grau, na forma ax2 + bx + c, levando em
 *         consideração a existência de raízes rais
 *****************************************************************/


package listaExercicioJava;

import java.util.Scanner;

public class Exercicio_16 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

            int A, B, C;
            double delta, x1, x2, raizDelta;
            
            System.out.println("Programa para calcular as raizes da equação do 2grau = ax2 + bx + c");
            System.out.println("Digite o valor de A: ");
            A = sc.nextInt();

            System.out.println("Digite o valor de B: ");
            B = sc.nextInt();
            
            System.out.println("Digite o valor de C: ");
            C = sc.nextInt();

            if(A != 0){
                // Cálculo de delta e raiz quedrada de delta
                delta = Math.pow(B, 2) - (4*A*C);
                raizDelta = Math.sqrt(delta);

                System.out.printf("Os valores de delta e a raiz de delta são:%n x'= %.2f %n x''= %.2f %n", delta, raizDelta);

                // Cáculo das raízes 
                x1 = (-B + raizDelta ) / (2*A);
                x2 = (-B - raizDelta ) / (2*A);

                System.out.printf("Os valores das raízes são:%n x'= %.2f %n x''= %.2f %n", x1, x2);

                
            }
            else{
                System.out.println("O valor de A deve ser diferente de zero, ");
            }

        sc.close();
    }
    
}

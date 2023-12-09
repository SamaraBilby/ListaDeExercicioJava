/*****************************************************************
 *  15) Escreva um progama que leia três valores inteiros e 
 *  diferentes e mostre-os em ordem decrescente.
 ****************************************************************/

package ListaExercicioJava.src.listaExercicioJava;

import java.util.Scanner;

public class Exercicio_15 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
            
            int A, B, C;
            System.out.println("Digite o primeiro valor: ");
            A =  sc.nextInt();

            System.out.println("Digite o segundo valor: ");
            B =  sc.nextInt();

            System.out.println("Digite o terceiro valor: ");
            C =  sc.nextInt();

            if( A != B && A != C && B != C){
                if(A > B && A > C && B > C ){
                    System.out.printf("Valores em resultado decrescente: %d, %d, %d", A, B, C);
                }
                else if (B > A && B > C && A > C){
                    System.out.printf("Valores em resultado decrescente: %d, %d, %d", B, A, C);
                }

                else if (C > A && C > B && A > B){
                    System.out.printf("Valores em resultado decrescente: %d, %d, %d", C, A, B);
                }
            }
            else {
                System.out.println("Exitem valores iguais, favor digitar valores diferentes!");
            }
        
        sc.close();
    }
}

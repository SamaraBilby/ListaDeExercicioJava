/*********************************************************************************
*  32) Sendo H = 1 + 1/2 + 1/3 + 1/4 ... + 1/N, escreva um programa para gera o
       número H. O número N é fornecido pelo usuário.
**********************************************************************************/

package listaExercicioJava;

import java.util.Scanner;

public class Exercicio_32 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
            
            System.out.println("Informe o valor para N:");
            int N = sc.nextInt();
            
            double H = 0;

            if(N != 0){
                
                for(int i = 1; i <= N; i++){
                    H =  H + ( (double) 1 / i);  
                }

                System.out.printf(" Valor do H: %.2f", H);
            }
            else{
                System.out.println("Para N informar um valor diferente de 0");
            }


        sc.close();
    }
}

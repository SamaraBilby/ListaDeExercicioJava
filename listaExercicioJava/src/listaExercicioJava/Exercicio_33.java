/*********************************************************************************
*   33) Elabore um programa que calacule N! (fatorial de N), sendo que o valor
        inteiro de N é fornecido pelo usuário
        Sabendo que:

        N! => 1 x 2 x 3 ... x(N-1) x N;
        0! => 1, por definição 
**********************************************************************************/


package listaExercicioJava;

import java.util.Scanner;

public class Exercicio_33 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

            System.out.println("Informe o valor para N: ");

            int N = sc.nextInt();
            int resultadoFatoracao = 1;

            if(N != 0){
                
                for(int i = 1; i <= N; i++){

                    resultadoFatoracao = resultadoFatoracao * i;  
                }

                System.out.println("O resultado da fatoração: " + resultadoFatoracao );
            }
            else{
                System.out.println("O resultado da fatoração: 1");
            }
        
        sc.close();
    }
}

/**********************************************************************************
*  29) Faca um programa de tabuada que a operação aritmética seja escolhido pelo 
      usuário e o numero da tabuada também seja escolhido pelo usuário. 
***********************************************************************************/

package ListaExercicioJava.src.listaExercicioJava;

import java.util.Scanner;

public class Exercicio_29 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
         char operacao;
         int numero, multiplicacao, adicao, subtracao, divisao;

        // entrada tipo operação
         System.out.println("Qual é operação aritmética que deseja utilizar? ");
         operacao = sc.next().charAt(0);

        // entrada número
         System.out.println("Informe a número da tabuada: ");
         numero =sc.nextInt();

         // verificação do tipo de operação
         if(operacao == '+') {
            System.out.println("Operação escolhida foi a adição");
            
            // laço for para repetiçao da operaçao de 0 até 10;
            for(int i = 0; i <= 10; i++){
                adicao = numero + i;
                
                // saída do resultado
                System.out.printf("%d + %d = %d %n", i, numero, adicao);
            }
         }
         else if(operacao == '-') {
            System.out.println("Operação escolhida foi a subtração");

            for(int i = 1; i <= 10; i++){
                subtracao = i - numero;
                if(subtracao < 0){
                    subtracao = subtracao * (-1);
                }
                System.out.printf("%d - %d = %d %n",i, numero, subtracao);
            }
         }
         else if(operacao == '*') {
            System.out.println("Operação escolhida foi a multiplicação");

            for(int i = 0; i <= 10; i++){
                multiplicacao = numero * i;
                System.out.printf("%d * %d = %d %n", i, numero, multiplicacao);
            }
         }
         else if(operacao == '/') {
            System.out.println("Operação escolhida foi a divisão");

            for(int i = 0; i <= 10; i++){
                multiplicacao = numero * i;
                divisao = multiplicacao / numero;
                System.out.printf("%d / %d = %d %n", multiplicacao, numero, divisao);
            }
        }
        sc.close();
    }
}

/********************************************************************************
 *   26) Imagine uma brincadeira entre dois colegas, no qual um pensa um número
 *       e o outro deve fazer chutes até acertar o número imaginado. Como dica,
 *       a cada tentativa é dito se o chute foi alto ou foi baix. 
 *       Elabore um programa dentro deste contexto, que leia o número imaginado 
 *       e os chutes, ao final mostre quantas tentativas foram nescessários para
 *       descobrir o número.
 ********************************************************************************/

package ListaExercicioJava.src.listaExercicioJava;

import java.util.Scanner;

public class Exercicio_26 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

            int senha, chute, tentativas;

            System.out.println("Programa para adivinhar a senha");

            System.out.println("Informe a senha: ");
            senha = sc.nextInt();
            
            tentativas = 0;
            chute = 0;

            do {
                System.out.println("Digite seu palpite: ");
                chute = sc.nextInt();
                tentativas++;

                if(chute > senha){
                    System.out.println("Valor muito alto");
                }
                else{
                    System.out.println("Valor muito baixo");
                }
            } 
            while (chute != senha);
          

            System.out.printf("Parabéns você consegui!! %n Quantidade de tentativas: %d ", tentativas);
        
        sc.close();
    }
}

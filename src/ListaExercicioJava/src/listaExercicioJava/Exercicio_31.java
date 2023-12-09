/*****************************************************************************************
*   31)  Construa um programa que calcule um número inteiro que mais se aproxima da raiz
         quadrada de um número fornecido pelo usuário.
*****************************************************************************************/
package ListaExercicioJava.src.listaExercicioJava;

import java.util.Scanner;

public class Exercicio_31 {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
            
            System.out.println("Informe o valor:");
            int valor = sc.nextInt();
            
            int raizValor = (int) Math.sqrt(valor);
            
                    System.out.println("O valor da raiz quadrada:" + raizValor);
                
            
        sc.close();
    }
}

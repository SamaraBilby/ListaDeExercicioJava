/***************************************************************
 * 12) Escreva um programa que leia um número inteiro e exiba 
 *      o seu módulo. O módulo de um número x é: 
 *      x se x é maior ou igual a zero
 *      x * (-1) se x é menor que zero
 **************************************************************/

package ListaExercicioJava.src.listaExercicioJava;

import java.util.Scanner;

public class Exercicio_12 {
    /**
     * @param args
     */
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
            int numero, modulo;

            System.out.println("Informe o número: ");
            numero = sc.nextInt();

            if(numero < 0){
                modulo = numero * (-1);
            }
            else{
                modulo = numero;
            }

            System.out.println("O módulo do número é: " + modulo);

         sc.close();   
    }
}

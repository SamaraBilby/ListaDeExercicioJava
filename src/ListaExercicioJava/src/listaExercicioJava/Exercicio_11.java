/********************************************************
 * 11) Ler dois valores inteiros para as variáveis A e B, 
 *  efetuar a troca dos valores de modo que a variável A 
 *  passe a possuir o valor da variável B, 
 *  e a variável B passe a possuir o valor da variável A. 
 *  Apresentar os valores trocados.
 * 
 * 
 ********************************************************/

package ListaExercicioJava.src.listaExercicioJava;

import java.util.Scanner;

public class Exercicio_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A, B, C;
        
        System.out.println("Digite o valor de A: ");
        A = sc.nextInt();
        
        System.out.println("Digite o valor de B: ");
        B = sc.nextInt();
        
        C = A;
        
        if(A != B){
            A = B;
            B = C;

            System.out.println("Novo valor de A: " + A);
            System.out.println("Novo valor de B: " + B);
        };

        sc.close();
    }
}

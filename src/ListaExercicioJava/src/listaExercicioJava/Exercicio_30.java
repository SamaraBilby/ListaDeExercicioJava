/************************************************************************
*  30) Contrua um programa que verifique se um número fornecido pelo
       usuário é primo ou não
*************************************************************************/
package ListaExercicioJava.src.listaExercicioJava;

import java.util.Scanner;

public class Exercicio_30 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

            // entrada do valor
            System.out.println("Informe o valor: ");
            int valor = sc.nextInt();

            int divisores = 0;
            String resultado = "";

            
            // Verificando quantos divisores o número tem (através da fotoração)
            for(int i = 1; i <= valor; i++){
                if( valor % i == 0){
                    divisores += 1;
                }
            }

            // Um número é chamado de primo quando possui exatamente dois divisores, 1 e ele mesmo.
            resultado = (divisores == 2) ? "O valor informado é um número primo!" : "O valor informado não é um número primo!";
                System.out.print(resultado);

        sc.close();
    }
}

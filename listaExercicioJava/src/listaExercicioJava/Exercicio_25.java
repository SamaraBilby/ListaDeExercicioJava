/*************************************************************************************
 *  25) Crie um programa  que calcule a média aritmética de um conjunto de números
 *      pares que forem fornecidos pelos usuários. O valor de finalização dserá a 
 *      entrada do número 0. Obseve que nada impede que os usuário forneça quantos
 *      números ímpares quiser, com a ressalva de que eles não poderão ser acumulados.        
 *************************************************************************************/

package listaExercicioJava;

import java.util.Scanner;

public class Exercicio_25 {
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

            int contador, valor, acumalador;
            double media;

            System.out.println("Digite o número. Quando quiser parar digite 0.");
            valor = sc.nextInt();

            contador = 0;
            acumalador = 0;

            while(valor != 0){
                if(valor % 2 == 0){
                    contador++;
                    acumalador = acumalador + valor;
                }

                System.out.println("Digite o número. Quando quiser parar digite 0.");
                valor = sc.nextInt();
            }

            media = (double) acumalador/contador;

            System.out.printf("A media dos números pares digitados: %.2f", media);
        sc.close();


    }
}

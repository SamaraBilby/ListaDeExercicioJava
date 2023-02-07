/******************************************************************
 *    20) Elabore um programa que, dada a idade de um nadador,
 *        Classifique-o em uma das categorias:
 *      
 *    idade                    Categoria
 *    5 até 7 anos             Infantil A
 *    8 até 10 anos            infantil B
 *    11 até 13 anos           Juvenil  A
 *    14 até 17 anos           Juvenil  B
 *    Maiores de 18 anos       Adulto
 ******************************************************************/

package listaExercicioJava;

import java.util.Scanner;

public class Exercicio_20 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
            System.out.println("Informe a idade: ");
            int idade = sc.nextInt();

            if(idade >= 5){
                if(idade >= 5 && idade <= 7){
                    System.out.println("A categoria para essa idade é: Infantil A");
                }
                else if(idade >= 8 && idade <= 10){
                    System.out.println("A categoria para essa idade é: Infantil B");
                }
                else if(idade >= 11 && idade <= 13){
                    System.out.println("A categoria para essa idade é: Juvenil A");
                }
                else if(idade >= 14 && idade <= 17){
                    System.out.println("A categoria para essa idade é: Juvenil B");
                }
                else{
                    System.out.println("A categoria para essa idade é: Adulto");
                }
            } 
            else{
                System.out.println("Infelizmente não temos categorias disponíveis para essa idade");
            }

        sc.close();
    }
}

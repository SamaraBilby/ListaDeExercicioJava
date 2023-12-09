/******************************************************************
 *  18) Faça um programa que leia o nascimento de uma pessoa,
 *      calcule e mostre sua idade e, também, verifique se ela já
 *      pode votar (16 anos ou mais) e para conseguir a Carteira de
 *      Habilitação (18 anos ou mais)
 ******************************************************************/

package ListaExercicioJava.src.listaExercicioJava;

import java.util.Calendar;
import java.util.Scanner;

public class Exercicio_18 {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
            Calendar date = Calendar.getInstance();

            int anoAtual = date.get(Calendar.YEAR);

            int anoNascimento = sc.nextInt();

            int idade = anoAtual - anoNascimento;

            if(anoNascimento != anoAtual){
                if(idade >=16 && idade < 18){
                    System.out.printf("Sua idade é: %d %n Parabéns você pode Votar!", idade);
                }
                else if (idade >= 18){
                    System.out.printf("Sua idade é: %d %n Parabéns você pode Votar! %nE não é só isso, você também pode tirar sua CNH", idade);
                }
                else {
                    System.out.printf("Sua idade é: %d %n Parabéns você ainda não tem boleto, Aproveite! %n Em breve você vai poder votar e ter sua CNH", idade);
                }
            }
            else {
                System.out.println("Valor digitado é igual ao ano atual!");
            }
        sc.close();

    
    }

}

/****************************************************************************************************
 * 9)	Faça um algoritmo que leia a idade de uma pessoa expressa em anos, 
 * 		meses e dias e escreva a idade dessa pessoa expressa apenas em dias. 
 * 		Considerar ano com 365 dias e mês com 30 dias.
 * *************************************************************************************************/

package listaExercicioJava;

import java.util.Scanner;

public class Exercicio_9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
			int anos, meses, dias, resultadoEmDias;
			
			System.out.println("Informe sua idade em anos: ");
			 anos = sc.nextInt();
			 
			System.out.println("Informe os meses: ");
			meses = sc.nextInt();
			
			System.out.println("Informe os dias: ");
			dias = sc.nextInt();
			
			resultadoEmDias = anos*365 + meses*30 + dias;
			
			System.out.println("Total em dias: " + resultadoEmDias);
			
		sc.close();

	}

}

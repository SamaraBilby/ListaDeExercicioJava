/************************************************************************************
 *  4) Ler quatro valores numéricos inteiros e apresentar o resultado dois a dois da 
 *  adição e multiplicação entre os valores lidos, baseando-se na utilização do conceito de propriedade distributiva. 
 *  	Dica: se forem lidas as variáveis A, B, C e D, 
 *  		  devem ser somados e multiplicados os valores de A com B, A com C e A com D;
 *            depois B com C, B com D e por último C com D. 
 *            Note que para cada operação serão utilizadas seis combinações. 
 *            Assim sendo, devem ser realizadas doze operações de processamento, 
 *            sendo seis para as adições e seis para as multiplicações.
 * **********************************************************************************/





package listaExercicioJava;

import java.util.Scanner;

public class Exercicio_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
			int A, B, C, D;
			int soma_1, soma_2, soma_3, soma_4, soma_5, soma_6;
			int multiplicacao_1, multiplicacao_2, multiplicacao_3, multiplicacao_4, multiplicacao_5, multiplicacao_6;
			
			System.out.println("Digite o primeiro valor:");
			A = sc.nextInt();
			
			System.out.println("Digite o segundo valor:");
			B = sc.nextInt();
			
			System.out.println("Digite o terceiro valor:");
			C = sc.nextInt();
			
			System.out.println("Digite o querto valor:");
			D = sc.nextInt();
			
			
			soma_1 = A + B;
			soma_2 = A + C;
			soma_3 = A + D;
			
			soma_4 = B + C;
			soma_5 = B + D;
			soma_6 = C + D;
			
			multiplicacao_1 = A * B;
			multiplicacao_2 = A * C;
			multiplicacao_3 = A * D;
			
			multiplicacao_4 = B * C;
			multiplicacao_5 = B * D;
			multiplicacao_6 = C * D;
			
			System.out.println("O valor da soma de A + B = " + soma_1);
			System.out.println("O valor da soma de A + C = " + soma_2);
			System.out.println("O valor da soma de A + D = " + soma_3);
			
			System.out.println("O valor da soma de B + A = " + soma_1);
			System.out.println("O valor da soma de B + C = " + soma_4);
			System.out.println("O valor da soma de B + D = " + soma_5);
			
			System.out.println("O valor da soma de C + A = " + soma_2);
			System.out.println("O valor da soma de C + B = " + soma_4);
			System.out.println("O valor da soma de C + D = " + soma_6);
			
			System.out.println("O valor da soma de D + A = " + soma_3);
			System.out.println("O valor da soma de D + B = " + soma_5);
			System.out.println("O valor da soma de D + C = " + soma_6);
			
			
			System.out.println("O valor da multiplicação de A * B = " + multiplicacao_1);
			System.out.println("O valor da multiplicação de A * C = " + multiplicacao_2);
			System.out.println("O valor damultiplicação de A * D = " + multiplicacao_3);
			
			System.out.println("O valor da multiplicação de B * A = " + multiplicacao_1);
			System.out.println("O valor da multiplicação de B * C = " + multiplicacao_4);
			System.out.println("O valor da multiplicação de B * D = " + multiplicacao_5);
			
			System.out.println("O valor da multiplicação de C * A = " + multiplicacao_2);
			System.out.println("O valor da multiplicação de C * B = " + multiplicacao_4);
			System.out.println("O valor da multiplicação de C * D = " + multiplicacao_6);
			
			System.out.println("O valor da multiplicação de D * A = " + multiplicacao_3);
			System.out.println("O valor da multiplicação de D * B = " + multiplicacao_5);
			System.out.println("O valor da multiplicação de D * C = " + multiplicacao_6);
			
		sc.close();

	}

}

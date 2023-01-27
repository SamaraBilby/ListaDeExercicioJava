/*************************************************************************
 *  Faça um programa que:
 * - Leia a cotação do dólar
 * -Leia um valor em dólares
 * - Converta esse valor para Real - Mostre o resultado
 *
 *************************************************************************/


package listaExercicioJava;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
			
			//Entrada de dados;
			
			System.out.println("Informe o valor da cotação do Dólar: ");
			
			double cotacaoDolar = sc.nextDouble();
			
			System.out.println("Digite o valor em Dólar: $");
			
			double valorDolares = sc.nextDouble();
			
			//processamento das entradas
			double valorEmReal = cotacaoDolar * valorDolares;
			
			// saída
			
			System.out.println("O valor do Dólar em Reais é: " + valorEmReal);
			
		sc.close();

	}

}

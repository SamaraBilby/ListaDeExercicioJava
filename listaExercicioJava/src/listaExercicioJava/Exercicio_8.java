/***********************************************************************************************
 * 8) Calcular e apresentar o valor do volume de uma lata de óleo, utilizando a fórmula: 
 * 			V= 3.14159*R*R*A 
 * 	Onde as variáveis: V, R e A representam respectivamente o volume, o raio e a altura.
 * 
 * ********************************************************************************************/




package listaExercicioJava;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_8 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
				
			System.out.println("Programa para calcular o volume de uma lata de óleo!!");
			
			double raio, altura, volume; 
			
			
			System.out.println("Informe o valor do raio da lata de Óleo:");
			raio = sc.nextDouble();
			
			System.out.println("Informe o valor do altura da lata de Óleo:");
			altura = sc.nextDouble();
			
			volume = 3.14159 * raio * raio * altura;
			
			System.out.printf("O volume da Lata de óleo é: %.2f%n", volume);
			
		sc.close();

	}

}

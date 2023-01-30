/*******************************************
 * Ler uma temperatura em graus Fahrenheit e apresentá-Ia convertida em graus Celsius. 
 * 	A fórmula de conversão de temperatura a ser utilizada é 
 * 			C = (F - 32) * 5 / 9, 
 * 	em que a variável F é a temperatura em graus Fahrenheit e a variável C é a temperatura em graus Celsius.
 * 
 * 
 * ******************************************/



package listaExercicioJava;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_7 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
			double F, C;
			
			System.out.println("Informe a temperatura em Fahrenheit: ");
				
				F = sc.nextDouble();
				
				C = (F - 32) * 5/9;
				
				System.out.printf("O valor da temperatura em Celsius: %.2f %n", C);
				
		sc.close();
		

	}

}

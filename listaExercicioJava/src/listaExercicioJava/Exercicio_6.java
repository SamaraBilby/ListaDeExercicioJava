/**************************************************************************************************
 * 6) Ler uma temperatura em graus Celsius e apresentá-Ia convertida em graus Fahrenheit. 
 * 		A fórmula de conversão de temperatura a ser utilizada é 
 * 				F = (9 * C + 160) / 5, 
 * 		em que a variável F representa é a temperatura em graus Fahrenheit e 
 * 		a variável C representa é a temperatura em graus Celsius. 
 * *************************************************************************************************/

package listaExercicioJava;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_6 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
			
			double F, C; 
		
			System.out.println("Informe a temperatura em  Celsius: ");
			
			C = sc.nextDouble();
			
			F = (9 * C + 160)/5;
			
			System.out.println("O valor da temperatura em Fahrenheit: " + F);
			
		
		sc.close();

	}

}

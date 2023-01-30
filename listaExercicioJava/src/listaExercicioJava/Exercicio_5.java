/************************************************************************************************************************
 * 5) Efetuar o cálculo da quantidade de litros de combustível gasta em uma viagem, 
 *  	utilizando um automóvel que faz 12 Km por litro. Para obter o cálculo, 
 *  	o usuário deve fornecer o tempo gasto na viagem e a velocidade média. Desta forma, 
 *  	será possível obter a distância percorrida com a fórmula DISTANCIA = TEMPO * VELOCIDADE. 
 *  	Tendo o valor da distância, basta calcular a quantidade de litros de combustível utilizada na viagem com a fórmula:
 *   		LITROS_USADOS = DISTANCIA / 12. 
 *   	O programa deve apresentar os valores da velocidade média, tempo gasto, 
 *   	a distância percorrida e a quantidade de litros utilizada na viagem. Dica: trabalhe com valores reais.
 
 * **********************************************************************************************************************/




package listaExercicioJava;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_5 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double tempo, velocidade, distancia, litrosUsados;
		
		System.out.println("Informe o tempo gasto na viagem em hora: ");
		tempo = sc.nextDouble();
		
		System.out.println("Informe a velocidade média da viagem em km/h: ");
		velocidade = sc.nextDouble();
		
		distancia = tempo * velocidade;
		
		litrosUsados = distancia / 12;
		
		System.out.printf("A velocidade média: %.2f %n", velocidade);
		System.out.printf("O tempo gasto: %.2f %n", tempo);
		System.out.printf("A distancia percorrida: %.2f %n", distancia);
		System.out.printf("Litros de combustível usado: %.2f %n", litrosUsados);
		
		sc.close();

	}

}

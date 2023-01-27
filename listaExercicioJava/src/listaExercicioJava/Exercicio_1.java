package listaExercicioJava;

import java.util.Scanner;

public class Exercicio_1 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		// entrada dos valores
	
			int qtdMin, qtdMax, estoqueMedio;
			
			System.out.println("Digite a quantidade mínima do estoque: ");
			qtdMin = sc.nextInt();
			
			System.out.println("Digite a quantidade máxima do estoque: ");
			qtdMax = sc.nextInt();
			
			//processamento
			estoqueMedio = (qtdMin + qtdMax) / 2;
			
			//saída
			System.out.println("O valor do estoque médio é: " + estoqueMedio);
		sc.close();
	}

}

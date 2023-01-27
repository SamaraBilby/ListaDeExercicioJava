/**********************************************************************************
 *  3) Faça um programa para pagamento de comissão de vendedores de peças, 
 * 		levando-se em consideração que sua comissão será de 5% do total da venda 
 * 		e que você tem os seguintes dade que você tem os seguintes dados:
 * 		
 * 		- Identificação do vendedor
 * 		- Código da peça
 * 		- Preço unitário da peça
 * 		- Quantidade vendida
 * 
 * ********************************************************************************/


package listaExercicioJava;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
			
			System.out.println("Pragrama para cáculo de comissão de vendedores!");
			
			int idVendedor, codPeca, qtdVendida;
			double valorComissao,precoUniPeca, valorVenda;
			double porcentagemComissao = 0.05f;
			
			
			System.out.println("Informe o ID do vendedor:");
			idVendedor = sc.nextInt();
			
			System.out.println("Informe o código da peça:");
			codPeca = sc.nextInt();
			
			System.out.println("Informe o preço unitário da peça:");
			precoUniPeca = sc.nextDouble();
			
			System.out.println("Informe a quantidade vendida:");
			qtdVendida = sc.nextInt();
			
			valorVenda = qtdVendida * precoUniPeca;
			valorComissao = valorVenda * porcentagemComissao; 
			
			
			System.out.printf("Valor Total da venda: %.2f%n Valor da Comissão do vendedor: %.2f%n", valorVenda, valorComissao);
			
			
		sc.close();

	}

}

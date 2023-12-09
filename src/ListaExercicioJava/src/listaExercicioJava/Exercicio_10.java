/*******************************************************************************
* 10) Escrever um programa que leia dois números inteiros e mostre todos os 
* relacionamentos de ordem existentes entre eles. Os relacionamentos possíveis 
* são: Igual, Não igual, Maior, Menor, Maior ou igual, Menor ou igual.
*******************************************************************************/

package ListaExercicioJava.src.listaExercicioJava;

import java.util.Scanner;

public class Exercicio_10 {

	public static void main(String[] args) {
		
	  Scanner sc = new Scanner(System.in);
		int primeiroNumero, segundoNumero;
		
		boolean igual, naoIgual, maior, menor, maiorOuIgual, menorOuIgual;
		
		System.out.println("Digite o primeiro valor: ");
		primeiroNumero = sc.nextInt();
		
		System.out.println("Digite o segundo valor: ");
		segundoNumero = sc.nextInt();
		
		igual = (primeiroNumero == segundoNumero) ? true : false ;
		naoIgual = (primeiroNumero != segundoNumero) ? true : false ;
		maior = (primeiroNumero > segundoNumero) ? true : false ;
		menor = (primeiroNumero < segundoNumero) ? true : false ;
		maiorOuIgual = (primeiroNumero >= segundoNumero) ? true : false ;
		menorOuIgual = (primeiroNumero <= segundoNumero) ? true : false ;
		
		System.out.println("Os valores são iguais:  " + igual);
		System.out.println("Os valores não são iguais:  " + naoIgual);
		System.out.println("O valor do primeiro é maior que o segundo valor:  " + maior);
		System.out.println("O valor do primeiro é menor que o segundo valor:  " + menor);
		System.out.println("O valor do primeiro é maior ou igual ao segundo valor: " + maiorOuIgual);
		System.out.println("O valor do primeiro é menor ou igual ao segundo valor:  " + menorOuIgual);
		
	  sc.close();
		

	}

}

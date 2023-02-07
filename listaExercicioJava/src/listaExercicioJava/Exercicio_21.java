/*******************************************************************************
 *  21)Elabore um programa que calcule o que deve ser pago por um produto
 *     que calcule o que deve ser pago por um produto, considerando o
 *     preço normal de etiqueta e a escolha da condição de pagamento.
 *     Utilize os códigos abaixo para ler qual a condição de pagamento e 
 *     efetuar o cálculo adequado.
 * 
 *    Código            Condição pagamento
 *    1                 À vista em dinheiro ou cheque, recebe 10% de desconto
 *    2                 À vista no cartão de crédito, recebe 5% de desconto
 *    3                 Em 2x, preço normal da etiqueta sem juros
 *    4                 Em 3x, preço normal de etiqueta mais juros de 10% 
 *******************************************************************************/

package listaExercicioJava;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_21 {
    public static void main(String[] args){
        
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
            System.out.println("Digite o preço da etiqueta: ");
            double precoEtiqueta, valorPagar;

            precoEtiqueta = sc.nextDouble();

            System.out.println("Digite o código para escolher a forma de pagamento: ");
            int codigoPagamento = sc.nextInt();
           
            switch(codigoPagamento){
                case 1:
                    valorPagar = precoEtiqueta - (precoEtiqueta * 0.1f);
                    System.out.printf("Tatal a pagar: %.2f", valorPagar);
                break;
                case 2:
                    valorPagar = precoEtiqueta - (precoEtiqueta * 0.05f);
                    System.out.printf("Tatal a pagar: %.2f", valorPagar);
                break;
                case 3:
                    valorPagar = precoEtiqueta;
                    System.out.printf("Tatal a pagar: %.2f", valorPagar);
                break;
                case 4:
                    valorPagar = precoEtiqueta + (precoEtiqueta * 0.1f);
                    System.out.printf("Tatal a pagar: %.2f", valorPagar);
                break;
                default:
                System.out.println("Código inválido, favor tentar novamente!");
            }

        sc.close();
    }
}

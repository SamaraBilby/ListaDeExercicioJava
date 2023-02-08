/****************************************************************************
 *      24) Construa um programa que permita fazer um levantamento do
 *          do estoque de vinhos de uma adega tendo como dados de entradas
 *          tipos de vinho, sendo:
 *          
 *          T - para tinto;
 *          B - para branco;
 *          R - para rosê;
 *          
 *          Especifique a porcentagem de cada tipo sobre o total geral de
 *          vinhos.
 *          A quantidade de vinhos é desconhecida utilize como finalizador 
 *          'F'de fim. 
 ***************************************************************************/

package listaExercicioJava;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_24 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
            char tipoVinho;
            int contadorGeral, contadorTinto, contadorBranco, contadorRose;
            double porcentagemTinto, porcentagemBranco, porcentagemRose;

            System.out.println("Programa para levantamento de estoque de Vinho");

            System.out.println("Informe o tipo do vinho: ");
             tipoVinho = sc.next().charAt(0);

            contadorGeral = 0;
            contadorTinto = 0;
            contadorBranco = 0 ;
            contadorRose = 0;

            while(tipoVinho != 'F' && tipoVinho != 'f'){
                
                if(tipoVinho == 'T' || tipoVinho == 't'){
                    contadorTinto++;
                }
                else if(tipoVinho == 'B' || tipoVinho == 'b'){
                    contadorBranco++;
                }
                else if(tipoVinho == 'R' || tipoVinho == 'r') {
                    contadorRose++;
                }

                else{
                    System.out.println("código inválido. Tente novamente!");
                }

                System.out.println("Informe o tipo do vinho: ");
                tipoVinho = sc.next().charAt(0);
            }
                
                contadorGeral = contadorTinto + contadorBranco + contadorRose;
                
                porcentagemTinto = (double) (contadorTinto * 100) / contadorGeral;
                porcentagemBranco =(double) (contadorBranco * 100) / contadorGeral ;
                porcentagemRose = (double) (contadorRose * 100) / contadorGeral;
                
                
                System.out.printf("A quantidade de vinho Tinto no estoque é: %d. E a porcentagem é: %.2f %n", contadorTinto, porcentagemTinto);
                System.out.printf("A quantidade de vinho Branco no estoque é: %d. E a porcentagem é: %.2f %n", contadorBranco, porcentagemBranco);
                System.out.printf("A quantidade de vinho Rose no estoque é: %d. E a porcentagem é: %.2f %n", contadorRose, porcentagemRose);
            
        sc.close();
    }
}

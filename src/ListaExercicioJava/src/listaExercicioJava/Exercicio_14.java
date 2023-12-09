/***********************************************************************
 *      14) Construa um algoritmo que, tendo como dados de entrada o 
 *          preço de um produto e seu código de origem, mostre o preço 
 *          junto de sua procedência. Caso o código não seja nenhum dos
 *          especificados, o produto deve ser encarado como importado. 
 * 
 *      Siga os códigos:
 *       1 - Sul
 *       2 - Norte
 *       3 - Leste
 *       4 - Oeste
 *       5 ou 6 - Nordeste
 *       7, 8 ou 9 - Sudeste
 *       10 até 20 - Centro - Oeste
 *       25 até 30 Nordeste
 ********************************************************************/

package ListaExercicioJava.src.listaExercicioJava;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_14 {

    /**
     * @param args
     */
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

            System.out.println("Valor do produto: ");
            double preco = sc.nextDouble();

            System.out.println("Digite o código da região: ");
            int codigoOrigem = sc.nextInt();

            switch(codigoOrigem){
                case 1:
                    System.out.println("Produto da região Sul.Preço do produto: " + preco);
                break;
                case 2:
                    System.out.println("Produto da região Norte.Preço do produto: " + preco);
                break;
                case 3:
                    System.out.println("Produto da região Leste.Preço do produto: " + preco);
                break;
                case 4:
                    System.out.println("Produto da região Oeste.Preço do produto: " + preco);
                break;
                case 7,8,9:
                    System.out.println("Produto da região Sudeste.Preço do produto: " + preco);
                break;
                case 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20:
                    System.out.println("Produto da região Centro Oeste.Preço do produto: " + preco);
                break;
                case 5, 6, 25, 26, 27, 28, 29, 30:
                    System.out.println("Produto da região Nordeste. Preço do produto: " + preco);
                break;
                default:
                System.out.println("Produto Importado. Preço do produto: " + preco);
            }
        
        sc.close();

    }
    
}

/******************************************************************
 * 17) Tendo como dados de entrada a altura e o sexo de uma pessoa,
 *     construa um programa que calcule seu peso ideal, utilizando 
 *     as seguintes fórmulas:
 * 
 *     para homens: (72.7 * h) - 58;
 *     para mulheres: (62.1 * h) - 44.7.
 ******************************************************************/


package ListaExercicioJava.src.listaExercicioJava;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_17 {

    /**
     * @param args
     */
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        
        Scanner sc = new Scanner(System.in);
            
            int sexo;
            double altura, pesoIdeal;

            System.out.println("Informe o sexo, digite 1 para mulher e 2 para homem:");
            sexo = sc.nextInt();

            System.out.println("Informe sua altura");
            altura = sc.nextDouble();

            if(sexo == 1){
                pesoIdeal =  (62.1 * altura) - 44.7;
                System.out.printf("De acordo com sua altura seu peso ideal é: %.2f", pesoIdeal);
            } 
            else if(sexo == 2){
                pesoIdeal =  (72.7 * altura) - 58;
                System.out.printf("De acordo com sua altura seu peso ideal é: %.2f", pesoIdeal);
            }
        sc.close();
    }
    
}

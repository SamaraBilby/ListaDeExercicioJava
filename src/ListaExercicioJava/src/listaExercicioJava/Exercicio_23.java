/****************************************************************************
 *      23) Faça um programa que leia o peso e a altura de adulto e mostre
 *          sua condição. 
 *          Utilize a fórmula IMC peso / (altura)ˆ2
 * 
 *    IMC em adultos                Condição
 *    abaixo de 18,5                abaixo do peso
 *    entre 18,5 e 25               peso normal
 *    entre 25 e 30                 acima do peso
 *    acima de 30                   obeso
 ****************************************************************************/

package ListaExercicioJava.src.listaExercicioJava;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_23 {
    public static void main(String[] args){
        
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
            double altura, peso, imc;

            System.out.println("Informe sua altura: ");
            altura = sc.nextDouble();

            System.out.println("Informe seu peso: ");
            peso = sc.nextDouble();

            imc = peso / (Math.pow(altura, 2));

            if(imc < 18.5 ){
                System.out.println("Você está abaixo do peso =(!");
                System.out.printf("Resultado IMC: %.2f", imc);
            }
            else if(imc >= 18.5 && imc < 25){
                System.out.println("Parabéns seu peso está normal!");
                System.out.printf("Resultado IMC: %.2f", imc);
            }
            else if(imc >= 25 && imc < 30){
                System.out.println("Cuidado você está acima do peso!");
                System.out.printf("Resultado IMC: %.2f", imc);
            }
            else{
                System.out.println("Você está obeso =(!");
                System.out.printf("Resultado IMC: %.2f", imc);
            }

        sc.close();
    }
}

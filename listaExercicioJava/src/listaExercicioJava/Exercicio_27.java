/*********************************************************************************************
 * 27) Faça um programa que efetue a soma de todos os números ímpares que são múltiplos de 3
 *     e que se encontram no conjunto dos números de 1 até 500.
**********************************************************************************************/

package listaExercicioJava;

public class Exercicio_27 {
    public static void main(String[] args){
        int multiplosDeTres;
        
        multiplosDeTres = 0;

        for(int i = 1; i <= 500; i++ ){
            if(i % 2 == 1 && i % 3 == 0){
                multiplosDeTres += i;
            }
        }

        System.out.println("A soma dos números múltiplos de 3 é: " + multiplosDeTres);
    }
}

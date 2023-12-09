/******************************************************************************************
 * 28) Elabore um algoritmo que simule uma contagem regressiva de 10 minutos, ou seja,
 *      mostre 10:00, e então 9:59... até 0:00.
*******************************************************************************************/


package ListaExercicioJava.src.listaExercicioJava;

public class Exercicio_28 {
    public static void main(String[] args){
        int minutos, segundos;
        
        minutos = 0;
        segundos = 0;

        for(int i = 10; i >= 0; i--){
            minutos = i;
        
            for(int l = 60; l >= 0; l--){
                segundos = l;

                System.out.printf("%d : %d %n", minutos, segundos);
            }
        }     
        
    }
}

/***************************************************************************************
*   34) A série de Fibonacci é formada pela seguinte sequência: 1, 1, 2, 3, 5, 8, 13, 
        21, 34, 55 ... etc.
        Escreva um algoritmo que gere a série até o vigêsimo termo. 
****************************************************************************************/

package ListaExercicioJava.src.listaExercicioJava;

public class Exercicio_34 {
    public static void main(String[] args){
        int fibonacci = 0;     // atual
        int anterior = 0;   // anterior
        
        int n = 20;
       
        for (int i = 1; i <= n; i++) {

            if (i == 1) {
                
                fibonacci = 1;
                anterior = 0;

            } else {
                
                fibonacci += anterior;
                anterior = fibonacci - anterior;
           
            }

            System.out.println(fibonacci);
        }



    }
}

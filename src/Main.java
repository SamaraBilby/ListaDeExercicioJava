/***************************************************************************************
 *   35) Uma rainha requisitou os serviços de um monge e disse-lhe que pagaria qualquer preço.
 * O monge, necessitando de alimentos, perguntou à rainha se o pagamento poderia ser feito
 * com grãos de trigo dispostos em um tabuleiro de xadrez, de tal forma que o primeiro
 * quadro contivesse apenas um grão e os quadros subseqüentes, o dobro do quadro anterior.
 * A rainha considerou o pagamento barato e pediu que o serviço fosse executado, sem se
 * dar conta de que seria impossível efetuar o pagamento. Faça um algoritmo para calcular o
 * número de grãos que o monge esperava receber:
 ****************************************************************************************/



public class Main {
    public static void main(String[] args) {

            double soma = 0;
            double inicio = 1;

            for(int i = 2 ; i <= 64; i++){
                inicio = inicio * 2;
                soma += inicio;
            }

            System.out.println(soma);

    }
}
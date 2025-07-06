/* (Calculadora de crescimento demográfico mundial) Utilize a internet para descobrir a população mundial atual e a taxa de cresci-
mento demográfico mundial anual. Escreva um aplicativo que introduza esses valores e, então, que exiba a população mundial estimada
depois de um, dois, três, quatro e cinco anos. */ 

class Populacao {

    public static void main (String[]args) {

        double populacaoAtual = 8062000000.0;
        double taxa = 0.011;

        for (int i=1; i <= 5; i++) {
            double novaPopulacao = populacaoAtual * (1+taxa);

                System.out.printf("Em %d anos, a população será %.0f. \n", i , novaPopulacao);

            populacaoAtual = novaPopulacao;
        }
    }
}
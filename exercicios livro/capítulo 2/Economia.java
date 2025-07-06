/* 
(Calculadora de economia da faixa solidária) Pesquise vários sites sobre faixa solidária. Crie um aplicativo que calcule o custo diário
de dirigir, para estimar quanto dinheiro pode ser economizado com o uso da faixa solidária, que também tem outras vantagens, como
reduzir emissões de carbono e congestionamento de tráfego. O aplicativo deve introduzir as seguintes informações e exibir o custo por dia
de dirigir para o trabalho do usuário:
a) Quilômetros totais dirigidos por dia.
b) Preço por litro de gasolina.
c) Quilômetros médios por litro.
d) Taxas de estacionamento por dia.
e) Pedágio por dia.
*/

import java.util.Scanner;

class Economia {

    public static void main (String[]args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Quantos quilômetros você dirige por dia?");
        double km = input.nextDouble();

        System.out.println("Qual o preço por litro de gasolina?");
        double preco = input.nextDouble();

        System.out.println("Quantos quilômetros o carro faz em média por litro?");
        double kmlitro = input.nextDouble();

        System.out.println("Quanto você gasta em taxas de estacionamento por dia?");
        double estacionamento = input.nextDouble();

        System.out.println("Quanto você paga em pedágio por dia?");
        double pedagio = input.nextDouble();

        double quilometrosFeitos = km / kmlitro;
        double gastoGasolina = quilometrosFeitos * preco;
        double total = gastoGasolina + estacionamento + pedagio;

        System.out.printf("O seu gasto total por dia é %.2f. \n" , total);

        input.close();
    }

}
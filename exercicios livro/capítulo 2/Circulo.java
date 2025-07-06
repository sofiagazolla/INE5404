/* (Diâmetro, circunferência e área de um círculo) Eis uma prévia do que veremos mais adiante. Neste capítulo, você aprendeu sobre
inteiros e o tipo int . O Java também pode representar números de pontos flutuantes que contêm pontos de fração decimal, como 3,14159.
Escreva um aplicativo que leia a entrada a partir do usuário do raio de um círculo como um inteiro e imprima o diâmetro do círculo,
circunferência e área utilizando o valor do ponto flutuante 3,14159 para S . Utilize as técnicas mostradas na Figura 2.7. [Observação: você
também pode empregar a constante Math.PI predefinida para o valor de S . Essa constante é mais precisa que o valor 3,14159. A classe
Math é definida no pacote java.lang . As classes nesse pacote são importadas automaticamente, portanto, você não precisa importar
a classe Math para utilizá-la.] Adote as seguintes fórmulas (r é o raio):
diâmetro = 2r
circunferência = 2 S r
área = S r 2
Não armazene os resultados de cada cálculo em uma variável. Em vez disso, especifique cada cálculo como o valor de saída em uma
instrução System.out.printf . Os valores produzidos pelos cálculos de circunferência e área são números de ponto flutuante. A saída
desses valores pode ser gerada com o especificador de formato %f em uma instrução System.out.printf . Você aprenderá mais sobre
números de pontos flutuantes no Capítulo 3. */ 

import java.util.Scanner;

class Circulo {

    public static void main (String[]args) {

        Scanner input = new Scanner (System.in);

        System.out.print("Insira o valor do raio: ");
        int raio = input.nextInt();

        double pi = Math.PI;

        System.out.printf ("Diâmetro = %f \n" , (2.0 * raio));

        System.out.printf ("Circunferência = %f \n" , (2 * pi* raio ));

        System.out.printf ("Área = %f \n" , ((pi * Math.pow(raio, 2) )));

        input.close();

    }

}
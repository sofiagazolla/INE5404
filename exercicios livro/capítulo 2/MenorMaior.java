/* (Aritmética, menor e maior) Escreva um aplicativo que insira três inteiros digitados pelo usuário e exiba a soma, média, produto e os
números menores e maiores. Utilize as técnicas mostradas na Figura 2.15. [Observação: o cálculo da média neste exercício deve resultar
em uma representação de inteiro. Assim, se a soma dos valores for 7, a média deverá ser 2, não 2,3333...] */

import java.util.Scanner;

class MenorMaior {

    public static void main(String[]args){

        Scanner input = new Scanner(System.in);


        int numero1;
        System.out.print("Insira o primeiro inteiro: ");
        numero1 = input.nextInt();

        int numero2;
        System.out.print("Insira o segundo inteiro: ");
        numero2 = input.nextInt();

        int numero3;
        System.out.print("Insira o terceiro inteiro: ");
        numero3 = input.nextInt();

        int soma = numero1 + numero2 + numero3;
        System.out.printf("A soma é %d! \n" , soma);

        int media = (numero1 + numero2 + numero3) / 3;
        System.out.printf("A média é %d! \n" , media);

        int produto = numero1 * numero2 * numero3;
        System.out.printf("O produto é %d! \n" , produto);

        int maior;

        if (numero1 >= numero2 && numero1 >= numero3) {
            maior = numero1;
        } else if (numero2 >= numero1 && numero2 >= numero3) {
            maior = numero2;
        } else {
            maior = numero3;
        }
        System.out.printf("O maior número é %d! \n" , maior);

        int menornum;
        if (numero1 <= numero2 && numero1 <= numero3) {
            menornum = numero1;
        } else if (numero2 <= numero1 && numero2 <= numero3) {
            menornum = numero2;
        } else {
            menornum = numero3;
        }
        System.out.printf("O menor número é %d! \n", menornum);

        input.close();

    }

}
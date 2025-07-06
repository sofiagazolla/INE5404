/* (Ímpar ou par) Escreva um aplicativo que leia um inteiro, além de determinar e imprimir se ele é ímpar ou par. [Dica: utilize o operador
de resto. Um número par é um múltiplo de 2. Qualquer múltiplo de 2 deixa um resto 0 quando dividido por 2.] */

import java.util.Scanner;

class EvenOdd {

    public static void main (String[]args) {

        Scanner input = new Scanner(System.in);


        System.out.print("Insira um inteiro: ");
        int inteiro = input.nextInt();

        if (inteiro % 2 == 0) {
            System.out.printf ("%d é par \n" , inteiro);
        }
        else {
            System.out.printf("%d é ímpar \n" , inteiro);
        }

        input.close();
    }
}
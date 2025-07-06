/* Essa é a resolução para as questões 2.5 e 2.6 do segundo capítulo do livro Java: Como Programar
 O programa desenvolvido tem como objetivo calcular e imprimir o produto de três números inteiros seguindo instruções da questão */

import java.util.Scanner;

public class Produto {

    public static void main (String[]args) 
    { 

        Scanner input = new Scanner(System.in);

        int x;
        int y;
        int z;
        int result;

        System.out.print("Insira o primeiro inteiro: ");
        x = input.nextInt();

        System.out.print("Insira o segundo inteiro: ");
        y = input.nextInt();

        System.out.print("Insira o terceiro inteiro: ");
        z = input.nextInt();

        result = x * y * z;

        System.out.printf("Product is %d!" , result);

        input.close(); /// só pq o vs code tava reclamando
    } /// fim do método
} /// fim da classe


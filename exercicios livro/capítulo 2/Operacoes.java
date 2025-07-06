/* (Aritmética) Escreva um aplicativo que solicite ao usuário inserir dois inteiros, obtenha dele esses números e imprima sua soma, produto,
diferença e quociente (divisão). Utilize as técnicas mostradas na Figura 2.7. */

import java.util.Scanner;

class Operacoes {

    public static void main (String[]args) {

        Scanner input = new Scanner(System.in);

        int numero1;
        int numero2;
        int soma;
        int diferenca;
        int quociente;

        System.out.print("Insira o primeiro número: ");
        numero1 = input.nextInt();

        System.out.print("Insira o segundo número: ");
        numero2 = input.nextInt();

        soma = numero1 + numero2;
        diferenca = numero1 - numero2;
        quociente = numero1 / numero2;

        System.out.printf("Soma: %d %n" , soma);
        System.out.printf("Diferença: %d %n" , diferenca);
        System.out.printf("Quociente: %d %n" , quociente);

        input.close();

    }

}
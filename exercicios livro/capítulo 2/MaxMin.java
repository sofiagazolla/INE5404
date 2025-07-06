/* (Inteiros maiores e menores) Escreva um aplicativo que leia cinco inteiros, além de determinar e imprimir o maior e o menor inteiro
no grupo. Utilize somente as técnicas de programação que você aprendeu neste capítulo. */

import java.util.Scanner;

class MaxMin {

    public static void main (String[]args) {

        Scanner input = new Scanner(System.in);

        int um;
        System.out.println("Insira o primeiro inteiro: ");
        um = input.nextInt();

        int dois;
        System.out.println("Insira o segundo inteiro: ");
        dois = input.nextInt();

        int tres;
        System.out.println("Insira o terceiro inteiro: ");
        tres = input.nextInt();

        int quatro;
        System.out.println("Insira o quarto inteiro: ");
        quatro = input.nextInt();

        int cinco;
        System.out.println("Insira o quinto inteiro: ");
        cinco = input.nextInt();

        int maior;
        maior = Math.max( um, Math.max( dois, (Math.max(tres,(Math.max(quatro, cinco))))));

        int menor;
        menor = Math.min( um, Math.min( dois, (Math.min(tres,(Math.min(quatro, cinco))))));

        System.out.printf("O maior número é %d! \n" , maior);
        System.out.printf("O menor número é %d! \n", menor);

        input.close();

    }
}
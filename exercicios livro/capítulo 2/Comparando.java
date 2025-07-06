/* (Comparando inteiros) Escreva um aplicativo que solicite ao usuário inserir dois inteiros, obtenha dele esses números e exiba o número
maior seguido pelas palavras “is larger" . Se os números forem iguais, imprima a mensagem “These numbers are equal" . Utilize
as técnicas mostradas na Figura 2.15. */ 

import java.util.Scanner;

class Comparando {

    public static void main (String[]args) {

        Scanner input = new Scanner(System.in);

        int numero1;
        int numero2;

        numero1 = input.nextInt();
        numero2 = input.nextInt();

        if (numero1 > numero2) {
            System.out.printf("The first integer is larger."); }

        else if (numero1 < numero2) {
            System.out.printf("The second integer is larger."); }

        else if (numero1 == numero2) {
            System.out.printf("These numbers are equal."); }

        input.close();

    }
}
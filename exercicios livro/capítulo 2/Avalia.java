/* (Valores negativos, positivos e zero) Escreva um programa que insira cinco números, além de determinar e imprimir quantos negativos,
quantos positivos e quantos zeros foram inseridos. */

import java.util.Scanner;

class Avalia {

    public static void main (String[]args) {

        Scanner input = new Scanner(System.in);

        int negativos = 0;
        int positivos = 0;
        int zero = 0;

        for (int i = 0; i < 5; i++) {

            System.out.println("Insira um número inteiro: ");
            int numero = input.nextInt();

            if (numero<0) {
                negativos ++;
            }
            else if (numero>0) {
                positivos ++;
            }
            else {
                zero ++;
            }

        }

        System.out.printf("Há %d negativos. \n" , negativos);
        System.out.printf("Há %d positivos. \n" , positivos);
        System.out.printf("Há %d números zero. \n" , zero);

        input.close();
    }
}
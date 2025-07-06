/* (Múltiplos) Escreva um aplicativo que leia dois inteiros, além de determinar se o primeiro é um múltiplo do segundo e imprimir o resul-
tado. [Dica: utilize o operador de resto.] */

import java.util.Scanner;

class Multiplos {

    public static void main (String[]args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Insira o primeiro número: ");
        int numero1 = input.nextInt();

        System.out.print("Insira o segundo número: ");
        int numero2 = input.nextInt();

        int resultado = (numero1 / numero2);

        if (numero1 % numero2 == 0) {
            System.out.print("Os números são múltiplos! \n");
            System.out.printf("O resultado é %d. \n" , resultado);
        }
        else { 
            System.out.print("Os números não são múltiplos :( \n");
        }

        input.close();

    }

}

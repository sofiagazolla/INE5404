/* (Separando os dígitos em um inteiro) Escreva um aplicativo que insira um número consistindo em cinco dígitos a partir do usuário,
separe o número em seus dígitos individuais e imprima os dígitos separados uns dos outros por três espaços. Por exemplo, se o usuário
digitar o número 42339 , o programa deve imprimir */ 

import java.util.Scanner;

class Separando {

    public static void main (String[]args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Insira um número de cinco dígitos: ");
        String numero = input.next();

        String[] caracteres = numero.split("");


        for (String c : caracteres) {
            System.out.printf( c + " ");
        }

        System.out.println();

        input.close();
    }
}
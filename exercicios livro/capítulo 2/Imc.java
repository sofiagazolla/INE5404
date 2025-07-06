/* (Calculadora de índice de massa corporal) Introduzimos a calculadora de índice de massa corporal (IMC) no Exercício 1.10. As fór-
mulas para calcular o IMC são

IMC = pesoEmLibras × 703 / alturaEmPolegadas**2 ou
IMC = pesoEmQuilogramas / alturaEmMetros**2

Crie um aplicativo de calculadora IMC que leia o peso do usuário em libras e a altura em polegadas (ou, se preferir, o peso em quilogra-
mas e a altura em metros) e, então, calcule e exiba o índice de massa corporal dele. Além disso, que exiba as seguintes informações do De-
partment of Health and Human Services/National Institutes of Health, assim o usuário pode avaliar o seu IMC:

BMI VALUES
Underweight: less than 18.5
Normal: between 18.5 and 24.9
Overweight: between 25 and 29.9
Obese: 30 or greater
*/ 

import java.util.Scanner;

class Imc {

    public static void main (String[]args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Insira seu peso em quilogramas: ");
        double peso = input.nextDouble();

        System.out.println("Insira sua altura em metros: ");
        double altura = input.nextDouble();

        double calculo = (peso / Math.pow(altura,2));
        
        System.out.printf("Your IMC is %.1f \n" , calculo);

        if (calculo < 18.5) {
            System.out.println("You are underweight");
        }

        else if (calculo >= 18.5 && calculo <= 24.9) {
            System.out.println("You IMC is normal");
        }

        else if (calculo >= 25.0 && calculo <= 29.9) {
            System.out.println("You are overweight");
        }

        else if (calculo >= 30) {
            System.out.println("You are obese");
        }

        input.close();

    }

}
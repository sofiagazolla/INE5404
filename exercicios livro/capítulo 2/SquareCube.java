/* Utilizando apenas as técnicas de programação que aprendeu neste capítulo, escreva um aplicativo que
calcule os quadrados e cubos dos números de 0 a 10 e imprima os valores resultantes em formato de tabela como a seguir: */

class SquareCube {
    
    public static void main (String[]args) {

        System.out.println ("number square cube");

        for (int i = 0; i < 11; i++) {
            System.out.printf ("%d   %d   %d \n" ,  i, (int)Math.pow(i,2.0) , (int)Math.pow(i,3.0));
            }
        } 
    }
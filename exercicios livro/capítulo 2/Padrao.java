/* (Padrão de tabuleiro de damas de asteriscos) Escreva um aplicativo que exiba um padrão de tabuleiro de damas, como mostrado a seguir: 
* * * * * * * *
 * * * * * * * *
* * * * * * * *
 * * * * * * * *
* * * * * * * *
 * * * * * * * *
* * * * * * * *
 * * * * * * * *
*/

class Padrao {

    public static void main (String[]args) { 

        for (int i = 0; i < 8; i++) {
            
            if ( i % 2 == 0) {
                for (int s = 0; s < 8; s++) {
                    System.out.print("* ");
            }
            } 

            else {
                System.out.print(" ");
                for (int s = 0; s < 8 ; s++) {
                    System.out.print("* ");
                }
            }

            System.out.println();
        }
    }
}
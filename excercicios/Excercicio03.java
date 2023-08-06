
package excercicios;

import java.util.Scanner;

public class Excercicio03 {
    
    public static void main(String[] args){
        
        Scanner ler = new Scanner(System.in);
	    
        System.out.println( "Digite um núemero: " );
        int numero = ler.nextInt();
        
        for (int i = 2; i < numero; i++) {
            if (ehPrimo(i)) {
                System.out.print(i + " ");
            }
        }
        
    }
    
    private static boolean ehPrimo(int numero) {
        for (int j = 2; j < numero; j++) {
            if (numero % j == 0)
                return false;   
        }
        return true;
    }
    
}




package excercicios;

import java.util.Scanner;


public class Excercicio08 {
    
    public static void main(String[] args) {
	    
	Scanner ler = new Scanner(System.in);
	    
	System.out.println("Digite uma palavra: ");
	String palavra = ler.nextLine();
	    
	    
	if (ehPalindromo(palavra)) {
            System.out.println(palavra + " é um palíndromo.");
        } else {
            System.out.println(palavra + " não é um palíndromo.");
        }
	    
        
	}
	
	public static boolean ehPalindromo(String palavra) {
        int esquerda = 0;
        int direita = palavra.length() - 1;
        
        while (esquerda < direita) {
            if (palavra.charAt(esquerda) != palavra.charAt(direita)) {
                return false;
            }
            esquerda++;
            direita--;
        }
        
        return true;
    }
    
}

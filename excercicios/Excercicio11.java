
package excercicios;

import java.util.Scanner;


public class Excercicio11 {
    
    public static void main(String[] args) {
	    
	Scanner ler = new Scanner(System.in);
	    
	System.out.print("Digite a primeira palavra: ");
        String palavra1 = ler.nextLine();
        
        System.out.print("Digite a segunda palavra: ");
        String palavra2 = ler.nextLine();
        
        int comparacao = palavra1.compareTo(palavra2);
        String palavraMaior = (palavra1.length() > palavra2.length()) ? palavra1 : palavra2;
        
        System.out.println("Palavras em ordem alfabética: ");
        if (comparacao < 0) {
            System.out.println(palavra1);
            System.out.println(palavra2);
        } else if (comparacao > 0) {
            System.out.println(palavra2);
            System.out.println(palavra1);
        } else {
            System.out.println("As palavras são iguais.");
        }
        
        System.out.println("Palavra com maior número de caracteres: " + palavraMaior);
		
    }
    
}

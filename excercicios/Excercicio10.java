
package excercicios;

import java.util.Scanner;


public class Excercicio10 {
    
    public static void main(String[] args) {
	    
	Scanner ler = new Scanner(System.in);
	    
	System.out.println("Digite uma frase: ");
	String frase = ler.nextLine();
	    
	    int quantidadeVogais = contarVogais(frase);
        int quantidadeEspacos = contarEspacos(frase);
        int quantidadeConsoantes = contarConsoantes(frase);
        
        System.out.println("Quantidade de vogais: " + quantidadeVogais);
        System.out.println("Quantidade de espaços em branco: " + quantidadeEspacos);
        System.out.println("Quantidade de consoantes: " + quantidadeConsoantes);
	    
	    
        String result = frase.replaceAll("\\s+","");
		
    }
    
    public static int contarVogais(String result) {
        int contador = 0;
        for (int i = 0; i < result.length(); i++) {
            char c = Character.toLowerCase(result.charAt(i));
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contador++;
            }
        }
        return contador;
    }
    
    public static int contarEspacos(String frase) {
        int contador = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (Character.isWhitespace(frase.charAt(i))) {
                contador++;
            }
        }
        return contador;
    }
    
    public static int contarConsoantes(String result) {
        int contador = 0;
        for (int i = 0; i < result.length(); i++) {
            char c = Character.toLowerCase(result.charAt(i));
            if (Character.isLetter(c) && c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
                contador++;
            }
        }
        return contador;
    }
    
}

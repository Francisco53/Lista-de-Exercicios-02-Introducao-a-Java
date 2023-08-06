
package excercicios;

import java.util.Scanner;


public class Excercicio04 {
    
    public static void main(String[] args) {
	    
	Scanner ler = new Scanner(System.in);
	    
        System.out.println( "Digite a distância em milhas: " );
        double milhas = ler.nextInt();
        
        double quilometros = milhas * 1.609;
        
        
        System.out.printf( "Resultado da conversão para quilômetros:%.2f ",quilometros);
        
	}
    
}

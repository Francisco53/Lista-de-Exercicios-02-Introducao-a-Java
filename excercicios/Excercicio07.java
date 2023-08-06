
package excercicios;

import java.util.Scanner;


public class Excercicio07 {
    
    public static void main(String[] args) {
	    
	Scanner ler = new Scanner(System.in);
	    
	for (int i = 1; i <= 100; i++) {
        if (i % 3 == 0) {
        int resultadoInt = i / 2;
        double resultadoDouble = (double) i / 2;
                
        System.out.println("Número múltiplo de 3: " + i);
        System.out.println("Resultado da divisão por 2 (int): " + resultadoInt);
        System.out.println("Resultado da divisão por 2 (double): " + resultadoDouble);
        System.out.println("---------------------------");
            }
        }
        
    }
    
}

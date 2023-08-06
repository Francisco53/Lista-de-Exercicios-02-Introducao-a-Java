
package excercicios;

import java.util.Scanner;


public class Excercicio06 {
    
    public static void main(String[] args) {
	    
	Scanner ler = new Scanner(System.in);
	    
	int produtoInt = 1;
        float produtoFloat = 1.0f;

        for (int i = 15; i <= 30; i++) {
            if (i % 2 != 0) {
                produtoInt *= i;
                produtoFloat *= i;
            }
        }

        System.out.println("Produto dos números ímpares (int): " + produtoInt);
        System.out.println("Produto dos números ímpares (float): " + produtoFloat);
        
	}
    
}

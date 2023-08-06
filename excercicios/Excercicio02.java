
package excercicios;

import java.util.Scanner;


public class Excercicio02 {

    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
	    
	double numero1, numero2;
	    
        System.out.println("Digite o primeiro número: ");
        numero1 = ler.nextDouble();
        
        System.out.println("Digite o segundo número: ");
        numero2 = ler.nextDouble();
        
        if(numero1 >= numero2){
            System.out.println("O maior número é: "+numero1);
        }
        else{
            System.out.println("O maior número é: "+numero2);
        }
        
    }
    
}

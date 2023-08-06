
package excercicios;

import java.util.Scanner;


public class Excercicio09 {
    
    public static void main(String[] args) {
	    
	Scanner ler = new Scanner(System.in);
	    
	
        System.out.print("Digite o raio do círculo: ");
        double raio = ler.nextDouble();
        
        double area = calcularAreaCirculo(raio);
        
        System.out.println("A área do círculo é: " + area);
	    
        
	}
	
	public static double calcularAreaCirculo(double raio) {
        final double PI = 3.14159;
        
        double area = PI * raio * raio;
        return Math.round(area);
    }
    
}

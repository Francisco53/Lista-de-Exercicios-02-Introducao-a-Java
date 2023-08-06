
package excercicios;

import java.util.Scanner;


public class Excercicio05 {
    
    public static void main(String[] args) {
	    
	Scanner ler = new Scanner(System.in);
	    
	String[] diasDaSemana = {
            "Segunda-feira",
            "Terça-feira",
            "Quarta-feira",
            "Quinta-feira",
            "Sexta-feira",
            "Sábado",
            "Domingo"
        };
	    
        System.out.println("Digite um número de 1 a 7: ");
        int numero = ler.nextInt();
        
        if (numero >= 1 && numero <= 7) {
            String dia = diasDaSemana[numero - 1];
            System.out.println(dia);
        } else {
            System.out.println("Número inválido. Por favor, digite um número de 1 a 7.");
        }
        
    }
}

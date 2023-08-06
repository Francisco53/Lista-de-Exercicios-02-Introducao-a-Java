
package excercicios;

import java.util.Scanner;


public class Excercicio12 {
    
    public static void main(String[] args) {
	    
	Scanner ler = new Scanner(System.in);
	    
	int totalQuilometros = 0;
        int totalLitros = 0;
        int tanque = 1;
        
        while (true) {
            System.out.print("Informe a quilometragem do tanque " + tanque + " (ou -1 para sair): ");
            int quilometros = ler.nextInt();
            
            if (quilometros == -1) {
                break;
            }
            
            System.out.print("Informe a quantidade de litros de combustível do tanque " + tanque + ": ");
            int litros = ler.nextInt();
            
            double consumo = (double) quilometros / litros;
            System.out.println("Consumo do tanque " + tanque + ": " + consumo + " km/l");
            
            totalQuilometros += quilometros;
            totalLitros += litros;
            
            tanque++;
        }
        
        double consumoTotal = (double) totalQuilometros / totalLitros;
        
        System.out.println("Consumo médio geral: " + consumoTotal + " km/l");
        System.out.println("Total de quilômetros percorridos: " + totalQuilometros + " km");
        System.out.println("Total de litros de combustível consumidos: " + totalLitros + " litros");
		
    }
    
}

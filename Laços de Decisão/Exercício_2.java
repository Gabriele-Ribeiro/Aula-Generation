package Lista1_lacos;

import java.util.Scanner;

public class Exerc�cio_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	// Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente.
		
		int num1, num2, num3, ordem;
		
		Scanner leia = new Scanner(System.in);
		
		
			System.out.println("\nEntre com um N�mero: ");
			num1 = leia.nextInt();
		
			System.out.println("\nEntre com um N�mero: ");
			num2 = leia.nextInt();
		
			System.out.println("\nEntre com um N�mero: ");
			num3 = leia.nextInt();
			
			 if(num3 < num1){
				 
		            ordem = num1; num1 = num3; 
		            num3 = ordem;
		        }
			 
		     if(num2 < num1){
		        	
		            ordem = num1; num1 = num2; 
		            num2 = ordem;
		        }
		        
		     if(num3 < num2){
		        	
		            ordem = num2; num2 = num3; 
		            num3 = ordem;
		        }

		        System.out.println("\nA Ordem crescente dos N�meros � de:" + num1 + ", " + num2 + " e " + num3 + ".");
			
			

			

	}

}

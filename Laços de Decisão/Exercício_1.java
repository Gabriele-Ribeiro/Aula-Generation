package Lista1_lacos;

import java.util.Scanner;

public class Exerc�cio_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
// 1- Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.

		
		int num1, num2, num3, maior = 0;
		
		Scanner leia = new Scanner(System.in);
		
		
		System.out.println("\nEntre com um N�mero: ");
		num1 = leia.nextInt();
		
		System.out.println("\nEntre com um N�mero: ");
		num2 = leia.nextInt();
		
		System.out.println("\nEntre com um N�mero: ");
		num3 = leia.nextInt();	
		
		maior = num1;
		
		if(maior < num2){
				
			maior = num2;
		}
		
		if (maior < num3){
			
			maior = num3;
			}
			
		System.out.println("\nO maior n�mero foi: " +maior);	

	}

	private static void While(boolean b) {
		// TODO Auto-generated method stub
		
	}

}

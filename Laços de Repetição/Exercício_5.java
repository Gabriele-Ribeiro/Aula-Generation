package Repeticao_04_06;

import java.util.Scanner;

public class Exerc�cio_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Crie um programa que leia um n�mero do teclado at� que encontre um n�mero igual a zero. 
		 * No final, mostre a soma dos n�meros digitados.(DO...WHILE) */

		int num, soma = 0;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("\nEntre com um N�mero: ");
		num = ler.nextInt();
		
		do 
		{
			soma = (num + soma);
			
			System.out.println("\nEntre com um N�mero: ");
			num = ler.nextInt();	
		}
		
		while(num != 0);	
		
		System.out.println("\nOpera��o Finalizada.");
		
		System.out.println("\nA Soma dos N�meros digitados foi de: "+ soma);
		

	}

}

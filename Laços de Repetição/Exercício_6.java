package Repeticao_04_06;

import java.util.Scanner;

public class Exerc�cio_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Escrever um programa que receba v�rios n�meros inteiros no teclado.
		 *  E no final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar 0(zero).(DO...WHILE)*/
		
		int num, soma = 0, cont = 0;
		float media = 0;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("\nEntre com um N�mero: \nSe deseja sair, entre com o N�mero ZERO[0]: ");
		num = ler.nextInt();
		
		do 
		{
			num++;
			
			if (num % 3 == 0)
			{
				soma = (num + soma);
				cont++;				
			}
			
			media = (soma / cont);
			
			System.out.println("\nEntre com um N�mero: \nEntre com o N�mero 0 se deseja sair.");
			num = ler.nextInt();
		
		}
		while(num != 0);	
		
		System.out.println("\nOpera��o Finalizada.");
		
		System.out.printf("\nA M�dia dos N�meros M�ltiplos de tr�s foi de: %.2f", media);
		
		
		
	}

}

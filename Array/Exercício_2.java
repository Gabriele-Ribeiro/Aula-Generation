package Arrays_07_06;

import java.util.Scanner;

public class Exerc�cio_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* 2- Fa�a um programa que receba 6 n�meros inteiros e mostre: 
� Os n�meros pares digitados;  
� A soma dos n�meros pares digitados; 
� Os n�meros �mpares digitados; 
� A quantidade de n�meros �mpares digitados.*/
		
		int [] A = new int[6];
 				
 		int somapar = 0, contimpar = 0;
	
		Scanner ler = new Scanner (System.in);
		
		for (int x = 0; x < 6; x++)
		{
			System.out.println("\nEntre com um N�mero:  ");
			A [x]= ler.nextInt();
			 
			if (A[x] % 2 == 0)
			{
				somapar += A[x];
			}
			
			else 
			{
				contimpar++;
			}
		}
			System.out.println("\nA Soma dos n�meros Pares foi:  " + somapar);
			System.out.println("\nA Quantidade de N�meros �mpares foi: " + contimpar);
			
			System.out.println("\nOs n�meros �mpares foram:  ");
			
			for (int x = 0; x < 6; x++)
			{
				if (A[x] % 2 == 0)
				{
					System.out.println("\n\t"+ A[x]);
				}
			}
			
			System.out.println("\nOs n�meros �mpares foram:  ");
				
			for (int x = 0; x < 6; x++)
			{	
				if (A[x] % 2 == 1)
				{
					System.out.println("\n\t"+ A[x]);
				}
			}
	}

}

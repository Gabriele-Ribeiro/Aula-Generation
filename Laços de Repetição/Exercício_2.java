package Repeticao_04_06;

import java.util.Scanner;

public class Exerc�cio_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)
		
		float num;
		int nump = 0, numi = 0;
		
		Scanner leia = new Scanner(System.in);
		
		for (int x = 1; x < 11; x++)
		{
			System.out.println("\nDigite um N�mero: ");
			num = leia.nextFloat();
			
			if(num % 2 == 0)
			{
				nump++;
			}
			else
			{
				numi++;
			}
		}
		
		System.out.println("\nN�meros Pares: "+ nump);
			
		System.out.println("\nN�meros �mpares: "+ numi);
	}

}

package Lista1_lacos;

import java.util.Scanner;

public class Exerc�cio_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
// 4- Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
// n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
// �mpar exiba o n�mero elevado ao quadrado.

		float num;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com um N�mero: ");
		num = leia.nextFloat();
		
		if (num % 2 ==0) {
			System.out.println("\nSeu N�mero � Par.");
			
			num = (float) Math.sqrt(num);
			
			System.out.println("\nA Raiz Quadrada do seu N�mero � de: " + num);
		}
		
		if (num % 2 == 1) {
			System.out.println("\nSeu N�mero � �mpar.");
			
			num = (float) Math.pow(num, 2);
			
			System.out.println("\nO Seu N�mero elevado ao Quadrado �: " +num);
		}
		
	}

}

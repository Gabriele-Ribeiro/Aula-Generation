package Lista1_lacos;

import java.util.Scanner;

public class Exercício_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
// 4- Faça um programa em que permita a entrada de um número qualquer e exiba se este
// número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
// ímpar exiba o número elevado ao quadrado.

		float num;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com um Número: ");
		num = leia.nextFloat();
		
		if (num % 2 ==0) {
			System.out.println("\nSeu Número é Par.");
			
			num = (float) Math.sqrt(num);
			
			System.out.println("\nA Raiz Quadrada do seu Número é de: " + num);
		}
		
		if (num % 2 == 1) {
			System.out.println("\nSeu Número é Ímpar.");
			
			num = (float) Math.pow(num, 2);
			
			System.out.println("\nO Seu Número elevado ao Quadrado é: " +num);
		}
		
	}

}

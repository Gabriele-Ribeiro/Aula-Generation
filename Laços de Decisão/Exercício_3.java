package Lista1_lacos;

import java.util.Scanner;

public class Exerc�cio_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
// 3- Fa�a um programa que receba a idade de uma pessoa e mostre na sa�da 
// em qual categoria ela se encontra: 

		int idade, ordem;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre coma sua idade: ");
		idade = leia.nextInt();
		
		if (idade >= 10 && idade <= 14) {
			System.out.println("\nVoc� entra na Categoria Infantil. ");
		}
		
		if (idade >= 15 && idade <= 17) {
			System.out.println("\nVoc� entra na Categoria Juvenil. ");
		}
		
		if (idade >= 18 && idade <= 25) {
			System.out.println("\nVoc� entra na Categoria Adulto. ");
		}
		
		else {
			System.out.println("\nVoc� n�o se enquadra em nenhuma das Categorias. ");
		}
			
			
	}

}

package Arrays_07_06;

public class Exerc�cio_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* 1- Fa�a um programa que possua um vetor denominado A que armazene 6 n�meros inteiros. O programa deve executar os seguintes passos: 
(a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7. 
(b) Armazene em uma vari�vel inteira (simples) a soma entre os valores das posi��es A[0], A[1] e A[5] do vetor e mostre na tela esta soma. 
(c) Modifique o vetor na posi��o 4, atribuindo a esta posi��o o valor 100. 
(d) Mostre na tela cada valor do vetor A, um em cada linha. */
		
		
		int [] A = {1, 0, 5, -2, -5, 7};
		int soma = 0, vetor = 0;
		
		soma = A[0] + A[1] + A[5];
		
		System.out.println("\nA Soma das Vari�veis A[0], A[1] e A[5] �: " + soma);
		
		A [3] = 100;
		
		for (vetor = 0; vetor < 7; vetor++)
		{
			System.out.println("\nOS valores do vetor A s�o: " + A[vetor]);	
		}
	}

}

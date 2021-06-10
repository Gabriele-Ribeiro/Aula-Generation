programa
{
	inclua biblioteca Matematica-->mat
	
	funcao inicio()
	{
		real nota1, nota2, nota3, media

		escreva("\nInsira a primeira nota do aluno: ")
		leia(nota1)

		escreva("\nInsira a segunda nota do aluno: ")
		leia(nota2)

		escreva("\nInsira a terceira nota do aluno: ")
		leia(nota3)

		nota1 = nota1 * 2
		nota2 = nota2 * 3
		nota3 = nota3 * 5

		media = (nota1 + nota2 + nota3) /3

		escreva("\nMédia do aluno: ", media)
		

		

		

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 439; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
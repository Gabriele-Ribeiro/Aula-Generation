programa
{
	inclua biblioteca Matematica-->mat
	
	funcao inicio()
	{
		inteiro x1, x2, y1, y2, potencia, d

		escreva("\nDigite o x1: ")
		leia(x1)

		escreva("\nDigite o x2: ")
		leia(x2)

		escreva("\nDigite o y1: ")
		leia(y1)

		escreva("\nDigite o y2: ")
		leia(y2)

		potencia = mat.potencia(x1 - x2, 2.0) + mat.potencia(y1 - y2, 2.0)
		d = mat.raiz(potencia, 2.0)

		escreva("\nA distância entre os dois pontos é: ", d)
		
		
	}

}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 429; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
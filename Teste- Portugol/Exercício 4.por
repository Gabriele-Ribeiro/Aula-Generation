programa
{
	inclua biblioteca Matematica-->mat
	
	funcao inicio()
	{
		inteiro a, b, c, d, r, s

		escreva("\nEscreva um valor para A: ")
		leia(a) 
		escreva("\nEscreva um valor para B: ")
		leia(b)
		escreva("\nEscreva um valor para C: ")
		leia(c)

		r = (mat.potencia(a + b, 2.0)) 
		
		s = (mat.potencia(b + c, 2.0))
	

		escreva("\nResultado do R: ", r, "\nResultado do S: ", s)

		d= (mat.potencia(a + b, 2.0)) + (mat.potencia(b + c, 2.0))/2

		escreva("\nResultado do D: ", d)
		
		
		

		
		

		

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 488; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
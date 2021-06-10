programa
{
	inclua biblioteca Matematica--> mat
	
	funcao inicio()
	{
		
		inteiro diastotais, anos, meses, dias

			escreva("\nDigite sua idade expressa em Dias: ")
			leia(diastotais)

			anos= (diastotais / 365)
		
			meses = (diastotais / 365) % 12
		
			dias = (diastotais % 365) % 30
			
			escreva("\nSua idade expressa em Anos: ",(anos))
			escreva("\nEm Meses: ",(meses)) 
			escreva("\nEm Dias: ",(dias))
			

		

		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 279; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
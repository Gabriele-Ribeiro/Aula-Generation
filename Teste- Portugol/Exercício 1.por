programa 
{
	inclua biblioteca Matematica-->mat
	

	funcao inicio()
	
	{
		
		inteiro anos, meses, dias, diastotais

			escreva("\nDigite sua idade expressa em anos: ")
			leia(anos)

			escreva("\nMeses: ")
			leia(meses)

			escreva("\nDias: ")
			leia(dias)
			
			diastotais = (anos * 365) + (meses * 30) + (dias)
			escreva("\nSua idade expressa em dias: ",mat.arredondar(diastotais,2))
	
	
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 400; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
programa
{
	inclua biblioteca Matematica-->mat
	
	funcao inicio()
	{

		inteiro horas, minutos, segundos, segundostotal

			escreva("\nDigite o tempo de duração do evento em Segundos: ")
			leia(segundostotal)

			horas = (segundostotal / 3600)
			escreva("\nDuração em Horas: ",mat.arredondar(horas,2)) 
			
			minutos = ((segundostotal % 3600) / 60)
			escreva("\nMinutos: ",mat.arredondar(minutos,2))
			
			segundos = ((segundostotal % 3600) %60)
			escreva("\nSegundos: ",mat.arredondar(segundos,2))
			
			
			

			
			
			
			
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 423; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
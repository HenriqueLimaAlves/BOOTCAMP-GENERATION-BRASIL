programa
{
	funcao inicio()
	{
		inteiro seg, min, hr, segF

		escreva("Digite os segudos: ")
		leia(seg)
		
		hr=seg/3600
		min=(seg%3600)/60
		segF=min%60

		escreva("\nTempo de dura��o � de: ", hr," horas ", min," minutos e ", segF," segundos." )
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta se��o do arquivo guarda informa��es do Portugol Studio.
 * Voc� pode apag�-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 156; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
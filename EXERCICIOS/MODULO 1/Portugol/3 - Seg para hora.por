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

		escreva("\nTempo de duração é de: ", hr," horas ", min," minutos e ", segF," segundos." )
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 156; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
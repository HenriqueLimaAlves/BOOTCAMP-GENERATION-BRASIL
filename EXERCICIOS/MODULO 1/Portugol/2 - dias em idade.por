programa
{
	funcao inicio()
	{
		inteiro dia, diaD, mes, ano

		escreva("Digite sua idade em dias: ")
		leia(dia)

		ano= dia/365
		mes= (dia%365)/30
		diaD= (dia%365)%30

		escreva("\nSua idade � de: ", ano, " anos, ", mes, " meses e ", diaD, " dias." )
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta se��o do arquivo guarda informa��es do Portugol Studio.
 * Voc� pode apag�-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 171; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
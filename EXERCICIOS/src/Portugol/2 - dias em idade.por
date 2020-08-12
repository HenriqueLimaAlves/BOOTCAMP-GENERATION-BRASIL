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

		escreva("\nSua idade é de: ", ano, " anos, ", mes, " meses e ", diaD, " dias." )
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 171; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
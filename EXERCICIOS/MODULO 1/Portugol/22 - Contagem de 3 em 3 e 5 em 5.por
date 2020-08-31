programa
{
	inclua biblioteca Util -->U
	funcao inicio()
	{
		inteiro sum, contador=233

		faca 
		{
			se((contador >= 300) e (contador <=400))
			{
				contador=contador+3
			}
			senao
			{
				contador=contador+5
			}
			
			U.aguarde(1000)
			escreva("\n", contador)
			
		}enquanto(contador<=456)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 307; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
programa
{
	funcao inicio()
	{
		inteiro mult=1, cont, soma=0

		para(cont=1 ; cont <500 ; cont++)
		{
			se(cont % 3 == 0)
			{
				soma=cont+soma
			}

		}
		escreva("A soma dos multiplos de 3 �: ", soma)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta se��o do arquivo guarda informa��es do Portugol Studio.
 * Voc� pode apag�-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 152; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
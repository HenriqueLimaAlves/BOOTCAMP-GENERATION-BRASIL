programa
{
	funcao inicio()
	{
		real inp

		escreva("Digite o indice de polui��o: ")
		leia(inp)

		se ((inp >= 0.30) e (inp <=0.39))
		{
			escreva("Todas as empresas do 1� grupo devem suspender suas atividades!!")
		}
		senao se ((inp >= 0.40) e (inp <= 0.49)) 
		{
			escreva("Todas as empresas do 1� e 2� grupo devem suspender suas atividades!!")
		}
		senao se(inp>=0.5)
		{
			escreva("Todas as empresas devem suspender suas atividades!!")
		}
		senao
		{
			escreva("A polui��o est� em um indice aceitavel!")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta se��o do arquivo guarda informa��es do Portugol Studio.
 * Voc� pode apag�-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 450; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
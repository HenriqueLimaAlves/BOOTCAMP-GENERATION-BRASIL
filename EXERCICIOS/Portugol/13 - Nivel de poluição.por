programa
{
	funcao inicio()
	{
		real inp

		escreva("Digite o indice de poluição: ")
		leia(inp)

		se ((inp >= 0.30) e (inp <=0.39))
		{
			escreva("Todas as empresas do 1º grupo devem suspender suas atividades!!")
		}
		senao se ((inp >= 0.40) e (inp <= 0.49)) 
		{
			escreva("Todas as empresas do 1º e 2º grupo devem suspender suas atividades!!")
		}
		senao se(inp>=0.5)
		{
			escreva("Todas as empresas devem suspender suas atividades!!")
		}
		senao
		{
			escreva("A poluição está em um indice aceitavel!")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 450; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
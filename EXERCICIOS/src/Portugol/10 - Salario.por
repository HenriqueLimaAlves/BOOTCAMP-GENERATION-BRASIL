programa
{
	funcao inicio()
	{
		real c, n, E

		escreva("Digite o numero de horas trabalhadas: ")
		leia(c)
		limpa()
		se (c<=50)
		{
			E=0.00
			escreva("Seu salario é de 500.00 R$, e suas horas excedentes são de: ", E, " R$")
		}
		senao
		{
			E=(c-50)*20
			escreva("Seu salario é de 500.00 R$, e suas horas excedentes são de: ", E, " R$")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 355; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
programa
{
	inclua biblioteca Matematica --> mat
	funcao inicio()
	{
		real n1, n2, n3, n4

		escreva("Digite o primeiro numero: ")
		leia(n1)

		escreva("Digite o segundo numero: ")
		leia(n2)

		escreva("Digite o terceiro numero: ")
		leia(n3)

		escreva("Digite o quarto numero: ")
		leia(n4)

		limpa() 
		
		n1= mat.raiz(n1, 2) 
		n2= mat.raiz(n2, 2) 
		n3= mat.raiz(n3, 2) 
		n4= mat.raiz(n4, 2) 
		
		se (n3 >= 1000)
		{
			escreva(mat.arredondar(n3, 2)) 
		}
		senao
		{
		
		escreva(mat.arredondar(n1, 2), "\n", mat.arredondar(n2, 2), "\n",mat.arredondar(n3, 2), "\n", mat.arredondar(n4, 2))
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 466; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
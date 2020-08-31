programa
{
	inclua biblioteca Matematica --> mat
	funcao inicio()
	{
	 	real x1,y1,x2,y2
	 	inteiro d, p

	 	escreva("Digite x1: ")
	 	leia(x1)

	 	escreva("\nDigite y1: ")
	 	leia(y1)

	 	escreva("\nDigite x2: ")
	 	leia(x2)

	 	escreva("\nDigite y2: ")
	 	leia(y2)

		p = mat.potencia((x2-x1), 2) + mat.potencia((y2-y1), 2)
		d=mat.raiz(p, 2)

	 	escreva("\nA distancia entre eles é de: ", d)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 394; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
programa
{
	funcao inicio()
	{
		real base, altura, area 

		escreva("Digite a base: ")
		leia (base)

		escreva("\nDigite a altura: ")
		leia (altura)

		area = (base*altura)/2
		se(area>0)
		{
			escreva("A area do triangulo é igual a: ", area)
		}
		senao
		{
			escreva("O valor não é valido, pois a base e altura devem ser maiores que 0!")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 351; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
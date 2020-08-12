programa
{
	funcao inicio()
	{
		inteiro mult2=0, mult3=0, mult5=0,mult235=0, x=100

		enquanto(x>0 e x<=100)
		{
			se(x%2==0 e x%3==0 e x%5==0)
			{
				mult235++
			}
			senao se(x%2==0)
			{
				mult2++
			}
			senao se(x%3==0)
			{
				mult3++
			}
			senao se(x%5==0)
			{
				mult5++
			}
			x--
		}

		escreva("Os numeros de 1 até 100, são eles: ")
		escreva("\n", mult2, " multiplos de 2")
		escreva("\n", mult3, " multiplos de 3")
		escreva("\n", mult5, " multiplos de 5")
		escreva("\n", mult235, " multiplos de 2, de 3 e de 5")

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
programa
{
	inclua biblioteca Util --> u
	funcao inicio()
	{
		inteiro mat[2][2], i, j, maior=0, lin=0, col=0

		para(i=0;i<2;i++)
		{
			para(j=0;j<2;j++)
			{
				escreva("Digite um numero: ")
				leia(mat[i][j])

				se(mat[i][j] > maior)
				{
					maior = mat[i][j] 
					lin=i
					col=j
				}
			}
		}
		escreva("O maior valor é ", maior)
		escreva("\ne Está localizado na linha ", lin, " coluna ", col)
	}

}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 414; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
programa
{
	funcao inicio()
	{
		inteiro mat[3][3], i, j, somaM=0, somaD=0

		para(i=0 ; i<3 ; i++)
		{
			para(j = 0 ; j<3 ; j++)
			{
				escreva("Digite: ")
				leia(mat[i][j])
				somaM=somaM+mat[i][j]
				
			}
		}
		somaD=mat[0][1]+mat[0][2]+mat[1][2]

		escreva("A soma dos valores �: ", somaM, "\nA soma da diagonal �: ", somaD)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta se��o do arquivo guarda informa��es do Portugol Studio.
 * Voc� pode apag�-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 336; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {mat, 5, 10, 3};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
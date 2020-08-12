programa
{
	funcao inicio()
	{
		inteiro n1[2][3], n2[2][3], m1[2][3], m2[2][3], i, j

		para (i=0 ; i<2 ; i++)
		{
			para (j =0 ; j<3 ; j++)
			{
				escreva("Digite: ")
				leia(n1[i][j])
			}
		}
		para (i=0 ; i<2 ; i++)
		{
			para (j=0 ; j<3 ; j++)
			{
				escreva("Digite: ")
				leia(n2[i][j])
			}
		}
		para(i=0 ; i<2 ; i++)
		{
			para(j=0 ; j<3 ; j++)
			{
				m1[i][j]= n1[i][j] + n2[i][j]
				m2[i][j]= n1[i][j] - n2[i][j]
			}
		}
		para(i=0;i<2;i++)
		{
			para(j=0 ; j<3 ; j++)
			{
				escreva("m1 : \n[ ", m1[i][j], " ]")
			
			}
		}
		para(i=0;i<2;i++)
		{
			para(j=0 ; j<3 ; j++)
			{
				escreva("m2: \n[ ", m2[i][j], " ]")
			}
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 574; 
 * @PONTOS-DE-PARADA = 35, 28;
 * @SIMBOLOS-INSPECIONADOS = {n1, 5, 10, 2}-{n2, 5, 20, 2}-{m1, 5, 30, 2}-{m2, 5, 40, 2}-{i, 5, 50, 1}-{j, 5, 53, 1};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
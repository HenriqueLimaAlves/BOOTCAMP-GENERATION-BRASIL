programa
{
	funcao inicio()
	{
		inteiro vet[3], x, valor, resul=0
		
		para(x=0 ; x<3 ; x++)
		{
			escreva("Digite o valor do vetor: ")
			leia(vet[x])
		}
		limpa()
		escreva("Qual o valor que deseja encontrar: ")
		leia(valor)
		limpa()

		para(x=0 ; x<3 ; x++)
		{
			se(vet[x]==valor)
			{
				resul=x
				escreva("O valor ", valor, " se encontra na posição ", resul, " do vetor\n")
			}

		}
		se (resul==0)
		{
			escreva("Não existe o valor ", valor, " nesse vetor")
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 430; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
programa
{
	inclua biblioteca Matematica --> mat
	funcao inicio()
	{
		inteiro data[10], x, cont=0
		real media, maior=0.0, sum=0.0

		para (x=0 ; x<3 ; x++)
		{
			escreva("Digite o valor: ")
			leia(data[x])
			
			sum=data[x] + sum 
			se(data[x] > maior)
			{
				maior=data[x]
				cont=cont+1
			}
			
			
		}
	

		media = sum/3

					
		escreva("Os valores são: \n", data[0], "\n", data[1], "\n", data[2])
		escreva("\nA média aritmetica é de: ", mat.arredondar(media,2))
		escreva("\nA ocorrência da maior pontuação foi de: ", cont, " vezes.")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 306; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
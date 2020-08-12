programa
{
	funcao inicio()
	{
		real num=0, tsum=0, med=0, tlid=0
	
		enquanto(num>=0)
		{	
			escreva("Digite um numero: ")
			leia(num)

		
			se(num>0)
			{
				tlid++
				tsum=num+tsum
				med=tsum/tlid
			}
		
		}
		escreva("\nO total do somatorio é: ", tsum, "\nMédia: ", med, "\nTotal de valores lidos: ", tlid)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 324; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
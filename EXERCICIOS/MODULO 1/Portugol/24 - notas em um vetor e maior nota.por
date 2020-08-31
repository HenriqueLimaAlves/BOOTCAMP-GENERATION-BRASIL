programa
{
	funcao inicio()
	{
		real ativ[5], maior=0.0
		inteiro x, nota=0

		para (x=0;x<5;x++)
		{
			escreva("Digite sua nota: ")
			leia(ativ[x])	
			se (ativ[x] > maior)
			{
				maior=ativ[x]
			}
		}
		
		limpa()
		
		escreva("\nAs notas são: \n", ativ[0], "\n", ativ[1], "\n", ativ[2], "\n", ativ[3], "\n", ativ[4])
		
		escreva("\nA maior nota é: ", maior )
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 181; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {ativ, 5, 7, 4}-{maior, 5, 16, 5}-{x, 6, 10, 1}-{nota, 6, 13, 4};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
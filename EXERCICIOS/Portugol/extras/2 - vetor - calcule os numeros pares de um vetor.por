programa
{	inclua biblioteca Util --> u 
	funcao inicio()
	{
		inteiro vet[40], x, cont=0

		para(x=0 ; x<40 ; x++)
		{
			vet[x] = u.sorteia(1, 10)
		}
		para(x=0 ; x<40 ; x++)
		{
			se (vet[x]%2==0)
			{
				cont++
			}
		}
		limpa()
		escreva("\nO vetor tem ", cont, " numeros pares")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 222; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {vet, 5, 10, 3};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
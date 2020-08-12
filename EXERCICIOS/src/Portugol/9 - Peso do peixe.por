programa
{
	funcao inicio()
	{
		real P, E, M
		escreva("Digite o peso do peixe: ")
		leia(P)
		limpa()
		E=P-50
		
		se (P>50.00)
		{
			M=E*4.00
			escreva("O peso atual ultrapassa as normas em ", E,"Kg. Deverá ser paga uma multa de ", M, "R$" )
		}
		senao
		{
			escreva("O peso atual está dentro das normas, a multa é de 0.00 R$")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 339; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
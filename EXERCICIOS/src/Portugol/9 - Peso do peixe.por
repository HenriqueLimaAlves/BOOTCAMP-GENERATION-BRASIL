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
			escreva("O peso atual ultrapassa as normas em ", E,"Kg. Dever� ser paga uma multa de ", M, "R$" )
		}
		senao
		{
			escreva("O peso atual est� dentro das normas, a multa � de 0.00 R$")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta se��o do arquivo guarda informa��es do Portugol Studio.
 * Voc� pode apag�-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 339; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
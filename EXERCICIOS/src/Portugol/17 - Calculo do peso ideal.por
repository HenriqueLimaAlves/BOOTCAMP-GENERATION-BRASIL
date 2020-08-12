programa
{
	inclua biblioteca Matematica --> mat
	funcao inicio()
	{
		real altura, peso 
		cadeia sexo

		escreva("Digite seu sexo: ")
		leia(sexo)

		escreva("\nDigite sua Altura: ")
		leia(altura)

		se ((sexo == "Masculino") ou (sexo == "MASCULINO") ou (sexo == "masculino"))
		{
			peso=(72.7*altura)-58
			escreva("Seu peso ideal é de: ", mat.arredondar(peso, 2), " Kg")
		}
		senao se ((sexo == "Feminino") ou (sexo=="FEMININO") ou (sexo=="feminino"))
		{
			peso=(62.1*altura)-44.7
			escreva("Seu peso ideal é de: ", mat.arredondar(peso, 2), " Kg")
		}
		senao 
		{
			escreva("Digite dados validos!")
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 561; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
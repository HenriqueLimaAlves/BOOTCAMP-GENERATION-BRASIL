programa
{
	inclua biblioteca Matematica -->mat
	funcao inicio()
	{
		inteiro a,b,c, r, s, d

		escreva("Digite o primeiro numero: ")
		leia(a)

		escreva("\nDigite o Segundo numero: ")
		leia(b)
		
		escreva("\nDigite o primeiro numero: ")
		leia(c)	

		r=mat.potencia(a+b,2)
		s=mat.potencia(b+c,2)
		d=(r+s)/2

		escreva("\nO resultado de D= (R+S)/2 é: ", d)
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 367; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
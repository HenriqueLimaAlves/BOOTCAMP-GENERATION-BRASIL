/*2 - Considere, como subclasse da classe Pessoa (desenvolvida no exerc�cio
 anterior) a classe Fornecedor. Considere que cada inst�ncia da classe 
 Fornecedor tem, para al�m dos atributos que caracterizam a classe 
 Pessoa, os atributos valorCredito (correspondente ao cr�dito m�ximo 
 atribu�do ao fornecedor) e valorDivida (montante da d�vida para com 
 o fornecedor). Implemente na classe Fornecedor, para al�m dos usuais 
 m�todos seletores e modificadores, um m�todo obterSaldo() que devolve 
 os valores dos atributos valorCredito e valorDivida. Depois de 
 implementada a classe Fornecedor, crie um programa de teste adequado
  que lhe permita verificar o funcionamento dos m�todos implementados 
 na classe Fornecedor e os herdados da classe Pessoa.*/
package program;

import entities.Fornecedor;
import entities.Pessoa;

public class FornecedorMain {
	public static void main(String[] args)
	{
		Pessoa forc = new Fornecedor("Madeira ltda.", "S�o paulo-SP", "(11)9555-5555", 1000, 500);
		
		System.out.println(forc.toString());
	}
}

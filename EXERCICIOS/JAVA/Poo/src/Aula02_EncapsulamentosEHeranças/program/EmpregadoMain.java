/*3 - Considere, como subclasse da classe Pessoa, a classe Empregado. 
Considere que cada inst�ncia da classe Empregado tem, para al�m dos 
atributos que caracterizam a classe Pessoa, os atributos codigoSetor 
(inteiro), salarioBase (vencimento base) e imposto (porcentagem retida dos impostos)
. Implemente a classe Empregado com m�todos seletores e modificadores 
e um m�todo calcularSalario. Escreva um programa de teste adequado 
para a classe Empregado. */
package program;

import entities.Empregado;
import entities.Pessoa;

public class EmpregadoMain {
	public static void main(String[] args)
	{
		//inst�ncia da classe "Empregado"
		Pessoa emp = new Empregado("Manuel", "S�o Paulo-SP", "(11)9332-9059", 633, 1000, 7.5);
		//printa no console as informa��es contidas na classe "Empregado"
		System.out.println(emp.toString());
	}
}

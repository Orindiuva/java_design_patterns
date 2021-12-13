package br.com.orindiuva.chainResponsibility.teste;

import java.math.BigDecimal;

import br.com.orindiuva.chainResponsibility.desconto.CalculadoraDeDesconto;
import br.com.orindiuva.chainResponsibility.orcamento.Orcamento;

/*
 *Sempre que uma nova funcionalidade for implementada, o ideal
 *é que possamos criar código novo e editar o mínimo possível de código já existente. 
 *Este é um dos principais pontos do princípio Aberto-Fechado (Open-Closed Principle) do SOLID. 
 *Ao editar código existente, podemos acabar quebrando funcionalidades já implementadas e funcionais
 */
public class TesteDesconto {

	public TesteDesconto() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Orcamento orcamento1 = new Orcamento(new BigDecimal("300"), 6);
		Orcamento orcamento2 = new Orcamento(new BigDecimal("1000"), 1);
		Orcamento orcamento3 = new Orcamento(new BigDecimal("1"), 1);
		
		CalculadoraDeDesconto calcularDesconto = new CalculadoraDeDesconto();
		BigDecimal desconto1 = calcularDesconto.calcular(orcamento1);
		System.out.println(desconto1);
		BigDecimal desconto2 = calcularDesconto.calcular(orcamento2);
		System.out.println(desconto2);
		BigDecimal desconto3 = calcularDesconto.calcular(orcamento3);
		System.out.println(desconto3);

	}

}

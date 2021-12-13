package br.com.orindiuva.chainResponsibility.desconto;


import java.math.BigDecimal;

import br.com.orindiuva.chainResponsibility.orcamento.Orcamento;

public class DescontoParaOrcamentoParaMaisDeCincoItens extends Desconto{

	public DescontoParaOrcamentoParaMaisDeCincoItens(Desconto proximo) {
		super(proximo);
	}

	public BigDecimal calcular(Orcamento orcamento) {
		if (orcamento.getQuantidade() > 5) {
			System.out.println("Desconto para mais de cinco itens");
			return orcamento.getValor().multiply(new BigDecimal("0.05"));
		}
		return proximo.calcular(orcamento);
	}
	
	

}

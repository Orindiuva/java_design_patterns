package br.com.orindiuva.chainResponsibility.desconto;

import java.math.BigDecimal;

import br.com.orindiuva.chainResponsibility.orcamento.Orcamento;

public abstract class Desconto {
	
	protected Desconto proximo; 
	
	public Desconto(Desconto proximo) {
		this.proximo = proximo;
	}

	abstract BigDecimal calcular(Orcamento orcamento);
	
	public BigDecimal aplicarDesconto(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.10"));	
	}
	


}

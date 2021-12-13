package br.com.orindiuva.chainResponsibility.desconto;

import java.math.BigDecimal;

import br.com.orindiuva.chainResponsibility.orcamento.Orcamento;

public class DescontoParaOrcamentoMaiorQueQuinhentos extends Desconto{

	public DescontoParaOrcamentoMaiorQueQuinhentos(Desconto proximo) {
		super(proximo);
	}

	public BigDecimal calcular(Orcamento orcamento) {		
		if (orcamento.getValor().compareTo(new BigDecimal("500")) >= 0) {
			System.out.println("Desconto para valor de compra maior que quinhentos");
			return orcamento.getValor().multiply(new BigDecimal("0.10"));
		}
		return proximo.calcular(orcamento);
	}

}

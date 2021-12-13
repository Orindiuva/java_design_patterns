package br.com.orindiuva.chainResponsibility.desconto;

import java.math.BigDecimal;

import br.com.orindiuva.chainResponsibility.orcamento.Orcamento;

public class SemDesconto extends Desconto{



	public SemDesconto(Desconto proximo) {
		super(proximo);
	}

	@Override
	BigDecimal calcular(Orcamento orcamento) {
		System.out.println("Sem Desconto");
		return BigDecimal.ZERO;
	}

}

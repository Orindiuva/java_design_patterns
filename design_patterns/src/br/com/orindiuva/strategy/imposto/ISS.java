package br.com.orindiuva.strategy.imposto;

import java.math.BigDecimal;

import br.com.orindiuva.strategy.orcamento.Orcamento;

public class ISS implements TipoImposto{

	@Override
	public BigDecimal calcular(Orcamento orcamento) {
		System.out.println("Calculando ISS");
		return orcamento.getValor().multiply(new BigDecimal("0.10"));
	}

}

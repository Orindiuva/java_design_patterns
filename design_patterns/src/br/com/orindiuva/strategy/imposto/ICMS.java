package br.com.orindiuva.strategy.imposto;

import java.math.BigDecimal;

import br.com.orindiuva.strategy.orcamento.Orcamento;

public class ICMS implements TipoImposto{

	@Override
	public BigDecimal calcular(Orcamento orcamento) {		
		System.out.println("Calculando ICMS");
		return orcamento.getValor().multiply(new BigDecimal("0.30"));
	}

}

package br.com.orindiuva.strategy.imposto;

import java.math.BigDecimal;

import br.com.orindiuva.strategy.orcamento.Orcamento;

public interface TipoImposto {

	
	BigDecimal calcular(Orcamento orcamento);
}

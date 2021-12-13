package br.com.orindiuva.strategy.imposto;

import java.math.BigDecimal;

import br.com.orindiuva.strategy.orcamento.Orcamento;

public class CalculadoraDeImpostos {

	public BigDecimal calcular(Orcamento orcamento, TipoImposto tipoEmposto) {
		System.out.println("CalculadoraImposto");
		return tipoEmposto.calcular(orcamento);

	}

}

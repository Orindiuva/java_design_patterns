package br.com.orindiuva.chainResponsibility.desconto;

import java.math.BigDecimal;

import br.com.orindiuva.chainResponsibility.orcamento.Orcamento;

public class CalculadoraDeDesconto {

	public BigDecimal calcular(Orcamento orcamento){
		BigDecimal desconto = new DescontoParaOrcamentoParaMaisDeCincoItens(new DescontoParaOrcamentoMaiorQueQuinhentos(new SemDesconto(null))).calcular(orcamento);		
		return desconto;
	}

}

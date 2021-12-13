

import java.math.BigDecimal;

import br.com.orindiuva.chainResponsibility.orcamento.Orcamento;

public class DescontoParaOrcamentoParaMaisDeCincoItens {

	public BigDecimal calcular(Orcamento orcamento) {
		if (orcamento.getQuantidade() > 5) {
			return orcamento.getValor().multiply(new BigDecimal("0.10"));
		}
		return BigDecimal.ZERO;
	}

}

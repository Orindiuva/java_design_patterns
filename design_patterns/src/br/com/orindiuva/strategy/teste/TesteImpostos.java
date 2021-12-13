package br.com.orindiuva.strategy.teste;
import java.math.BigDecimal;

import br.com.orindiuva.strategy.imposto.CalculadoraDeImpostos;
import br.com.orindiuva.strategy.imposto.ICMS;
import br.com.orindiuva.strategy.imposto.ISS;
import br.com.orindiuva.strategy.orcamento.Orcamento;
/**
 * 
 * @author Marcelo André
 * Reduzindo de N ifs para nenhum com Strategy em Java
 *
 */
public class TesteImpostos {

	public static void main(String[] args) {
		Orcamento orcamento1 = new Orcamento(new BigDecimal(1000), 10);
		Orcamento orcamento2 = new Orcamento(new BigDecimal(2000), 10);
		CalculadoraDeImpostos cal = new CalculadoraDeImpostos();
		BigDecimal calculoICMS = cal.calcular(orcamento1, new ICMS());
		System.out.println("Valor do ICMS: " + calculoICMS);
		BigDecimal calculoISS = cal.calcular(orcamento2, new ISS());
		System.out.println("Valor do ISS: " + calculoISS);
	}

}

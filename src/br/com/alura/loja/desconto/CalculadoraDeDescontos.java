package br.com.alura.loja.desconto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public class CalculadoraDeDescontos {
	
	public BigDecimal calcularDesconto(Orcamento orcamento) {
		Desconto desconto = new DescontoMaior5itens(
				new DescontoValorMaior500(
						new SemDesconto()));
		
		return desconto.calcular(orcamento);
	}
	
}

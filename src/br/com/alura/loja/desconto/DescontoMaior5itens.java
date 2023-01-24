package br.com.alura.loja.desconto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public class DescontoMaior5itens extends Desconto {
	
	public DescontoMaior5itens(Desconto proximo) {
		super(proximo);
	}

	@Override
	protected BigDecimal efetuarCalculo(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.1"));
	}

	@Override
	protected boolean deveAplicar(Orcamento orcamento) {
		return orcamento.getQtdePedidos() > 5;
	}
	
	
	
}

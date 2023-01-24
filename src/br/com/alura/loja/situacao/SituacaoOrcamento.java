package br.com.alura.loja.situacao;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public abstract class SituacaoOrcamento {
	public BigDecimal calcularDescontoExtra(Orcamento orcamento) {
		return BigDecimal.ZERO;
	}
	
	public void aprovar(Orcamento orcamento) {
		throw new DominioException("Situacao não pode mudar para aprovada");
	}
	
	public void reprovar(Orcamento orcamento) {
		throw new DominioException("Situacao não pode mudar para reprovada");
	}
	
	public void finalizar(Orcamento orcamento) {
		throw new DominioException("Situacao não pode mudar para finalizada");
	}
}

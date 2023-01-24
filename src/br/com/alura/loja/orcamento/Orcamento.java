package br.com.alura.loja.orcamento;

import java.math.BigDecimal;

import br.com.alura.loja.situacao.EmAnalise;
import br.com.alura.loja.situacao.SituacaoOrcamento;

public class Orcamento {
	private BigDecimal valor;
	private int qtdePedidos;
	private SituacaoOrcamento situacao;
	
	public Orcamento(BigDecimal valor, int qtdePedidos) {
		this.valor = valor;
		this.qtdePedidos = qtdePedidos;
		this.situacao = new EmAnalise();
	}
	
	public void aplicarDescontoExtra() {
		BigDecimal valorDescontoExtra = this.situacao.calcularDescontoExtra(this);
		
		this.valor = this.valor.subtract(valorDescontoExtra);
		
	}
	
	public void aprovar() {
		this.situacao.aprovar(this);
	}
	
	public void reprovar() {
		this.situacao.reprovar(this);
	}
	
	public void finalizar() {
		this.situacao.finalizar(this);
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	
	public int getQtdePedidos() {
		return qtdePedidos;
	}
	
	public SituacaoOrcamento getSituacao() {
		return situacao;
	}
	
	public void setSituacao(SituacaoOrcamento situacao) {
		this.situacao = situacao;
	}
	
}

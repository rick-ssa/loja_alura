package br.com.alura.loja.pedido;

import java.math.BigDecimal;
import java.time.LocalDate;

import br.com.alura.loja.orcamento.Orcamento;

public class GerarPedido {
	private String cliente;
	private int qtdeItens;
	private BigDecimal valorOrcamento;
	
	public GerarPedido(String cliente, int qtdeItens, BigDecimal valorOrcamento) {
		this.cliente = cliente;
		this.qtdeItens = qtdeItens;
		this.valorOrcamento = valorOrcamento;
	}
	
	public void executa() {
		Orcamento orcamento = new Orcamento(this.valorOrcamento, this.qtdeItens);
		String cliente = this.cliente;
		
		Pedido pedido = new Pedido(cliente, LocalDate.now(), orcamento);
		
		System.out.println(pedido.getOrcamento().getValor());
	}
	
	
}

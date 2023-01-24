package br.com.alura.loja.pedido;

import java.time.LocalDate;

import br.com.alura.loja.orcamento.Orcamento;

public class Pedido {
	private String cliente;
	private LocalDate dataPedido;
	private Orcamento orcamento;
	public Pedido(String cliente, LocalDate dataPedido, Orcamento orcamento) {
		this.cliente = cliente;
		this.dataPedido = dataPedido;
		this.orcamento = orcamento;
	}
}

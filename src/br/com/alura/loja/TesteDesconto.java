package br.com.alura.loja;

import java.math.BigDecimal;

import br.com.alura.loja.desconto.CalculadoraDeDescontos;
import br.com.alura.loja.orcamento.Orcamento;

public class TesteDesconto {

	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(new BigDecimal("1000"), 5);
		CalculadoraDeDescontos cdd = new CalculadoraDeDescontos();
		
		System.out.println(cdd.calcularDesconto(orcamento));
	}

}

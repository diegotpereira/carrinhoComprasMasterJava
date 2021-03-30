package br.com.java;

import java.util.ArrayList;
import java.util.List;

public class Produtos {
	
	private final List<Produto> produtos = new ArrayList<Produto>();
	
	public Produtos() {
		this.iniciarItensLoja();
	}
	public void iniciarItensLoja(){
		String [] produtoNomes = { "Lux Sabonete", "Fair n Lovely", "Shampoo"};
		Double [] produtoPreco = { 2.d, 5.0d, 3.0d };
		Integer [] estoque = {10, 6, 10};
		
		for (int i = 0; i < produtoNomes.length; i++) {
			this.produtos.add(new Produto(i + 1, produtoNomes[i], produtoPreco[i], estoque[i]));
		}
	}
	public List<Produto> getProdutos(){
		return produtos;
	}
}

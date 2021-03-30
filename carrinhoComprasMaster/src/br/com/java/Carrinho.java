package br.com.java;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
	
	List<Produto> carrinhoItens = new ArrayList<Produto>();
	
	public void adicionarProdutoCarrinhoPorPID(int pid) {
		Produto produto = getProdutoPorProdutoID(pid);
		adicionaNoCarrinho(produto);
	}
	private Produto getProdutoPorProdutoID(int pid) {
		Produto produto = null;
		List<Produto> produtos = new Produtos().getProdutos();
		
		for(Produto prod: produtos) {
			if (prod.getPid() == pid) {
				produto = prod;
				break;
			}
		}
		return produto;
	}
	private void adicionaNoCarrinho(Produto produto) {
		carrinhoItens.add(produto);
	}
	void marcarItensCarrinho() {
		for(Produto produto: carrinhoItens) {
			System.out.println(produto.getNome());
		}
	}
	public void removeProdutoPorPID(int pid) {
		Produto produto = getProdutoPorProdutoID(pid);
		carrinhoItens.remove(produto);
	}
}

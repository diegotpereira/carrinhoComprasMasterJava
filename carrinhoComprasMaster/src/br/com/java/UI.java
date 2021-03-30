package br.com.java;

import java.util.List;
import java.util.Scanner;

public class UI {
	
	Carrinho carrinho = new Carrinho();
	private int ch = 0;
	
	public UI() {
		
		menu();
	}
	
	public void menu() {

		do {
			
			telaInicial();
			getUsuarioEntrada();
			
			switch (ch) {
			case 1:
				exibirProdutosLoja();
				menuProdutosLoja();
				getUsuarioEntrada();
				escolhaInterna();
				break;
			case 2: 
				mostrarCarrinho();
				break;
			
			case 0:
				System.exit(0);
				break;
			default:
				break;
			}
		}
		while (ch !=0);
	}
	public void telaInicial() {
		
		System.out.println("1. Exibir produtos da loja.");
		System.out.println("2. Mostrar Carrinho.");
		System.out.println("0. Exit");
	}
	private int getUsuarioEntrada() throws NumberFormatException{
		Scanner entrada = new Scanner(System.in);
		ch = Integer.parseInt(entrada.nextLine());
		return ch;
	}
	
	public void exibirProdutosLoja() {
		List<Produto> produtos = new Produtos().getProdutos();
		
		for(Produto produto: produtos) {
			System.out.println(
					produto.getPid()  + "- " + 
			        produto.getNome() + " " + 
				    produto.getPreco() + " " + 
			        produto.getEstoque());
		}
	}
	
	public void menuProdutosLoja() {
		System.out.println("1. Adicionar no Carrinho.");
		System.out.println("2. Remover do carrinho.");
		System.out.println("0. Exit");
	}
	public void escolhaInterna() {
		switch (ch) {
		case 1:
			adicionarProdutoCarrinho();
			mostrarCarrinho();
			break;
		case 2:
			removerProdutoCarrinho();
			break;
		default:
			break;
		}
	}
	private void mostrarCarrinho() {
		carrinho.marcarItensCarrinho();
	}
	private void adicionarProdutoCarrinho() {
		int pid = getUsuarioEntrada();
		carrinho.adicionarProdutoCarrinhoPorPID(pid);
	}
	private void removerProdutoCarrinho() {
		int pid = getUsuarioEntrada();
		carrinho.removeProdutoPorPID(pid);
	}
}


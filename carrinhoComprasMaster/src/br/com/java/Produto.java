package br.com.java;

import java.util.Objects;

public class Produto {
	
	private Integer pid;
	private String nome;
	private Double preco;
	private Integer estoque;
	
	public Produto() {}
	
	public Produto(Integer pid, String nome, Double preco, Integer estoque) {
		this.pid = pid;
		this.nome = nome;
		this.preco = preco;
		this.estoque = estoque;
	}

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Integer getEstoque() {
		return estoque;
	}

	public void setEstoque(Integer estoque) {
		this.estoque = estoque;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((estoque == null) ? 0 : estoque.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((pid == null) ? 0 : pid.hashCode());
		result = prime * result + ((preco == null) ? 0 : preco.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		
		if (obj == null)
			return false;
		
		if (getClass() != obj.getClass())
			return false;
		
		final Produto other = (Produto) obj;
		
		if (!Objects.equals(this.nome, other.nome)) {
			return false;
		}
		
		if (!Objects.equals(this.pid, other.pid)) {
			return false;
		}
		
		if (!Objects.equals(this.preco, other.preco)) {
			return false;
		}
		
		if (!Objects.equals(this.estoque, other.estoque)) {
			return false;
		}
		return true;
	}
	
}

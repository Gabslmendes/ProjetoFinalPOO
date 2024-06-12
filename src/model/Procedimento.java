package model;
public class Procedimento {
	
    private String nome; // Variável privada para armazenar o nome do procedimento.
    private double preco; // Variável privada para armazenar o preço do procedimento.
    
    // Construtor para criar um novo procedimento com nome e preço especificados.
    public Procedimento(String nome, double preco) {
        this.nome = nome; // Atribui o nome passado ao campo nome da classe.
        this.preco = preco; // Atribui o preço passado ao campo preco da classe.
    }

    // Getters e Setters de nome e preço

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

  
}
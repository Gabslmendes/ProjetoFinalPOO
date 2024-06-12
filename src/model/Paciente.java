package model;
public class Paciente {
	
    private String nome;  // Variável privada para armazenar o nome do paciente.
    private String cpf; // Variável privada para armazenar o CPF do paciente.
    private String telefone; // Variável privada para armazenar o telefone do paciente.
    
    // Construtor para criar um novo paciente com nome, CPF e telefone.
    public Paciente(String nome, String cpf, String telefone) {
        this.nome = nome; // Atribui o nome passado ao campo nome da classe.
        this.cpf = cpf; // Atribui o CPF passado ao campo cpf da classe.
        this.telefone = telefone; // Atribui o telefone passado ao campo telefone da classe.
    }
    
// Getters e Setters de nome, cpf e telefone


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

   
}
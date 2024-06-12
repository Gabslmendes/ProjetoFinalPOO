package model;
import java.util.Date; // Importa a classe Date do pacote java.util para manipulação de datas.

public class Agendamento {
    private Paciente paciente; // Variável privada para armazenar o paciente associado ao agendamento.
    private Date data; // Variável privada para armazenar a data do agendamento.
    private String procedimento; // Variável privada para armazenar o tipo de procedimento a ser realizado.
    
    // Construtor para criar um novo agendamento com paciente, data e procedimento especificados.
    public Agendamento(Paciente paciente, Date data, String procedimento) {
        this.paciente = paciente; // Atribui o paciente passado ao campo paciente da classe.
        this.data = data; // Atribui a data passada ao campo data da classe.
        this.procedimento = procedimento; // Atribui o procedimento passado ao campo procedimento da classe.
    }

    // Getters e Setters de paciente, data e procedimento

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getProcedimento() {
		return procedimento;
	}

	public void setProcedimento(String procedimento) {
		this.procedimento = procedimento;
	}

   
}
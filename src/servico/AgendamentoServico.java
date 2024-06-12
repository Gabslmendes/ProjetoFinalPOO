// Declara que esta classe pertence ao pacote servico
package servico;

// Importando a classe Agendamento do pacote model
import model.Agendamento;

//Importando as classes ArrayList e List do pacote java.util
import java.util.ArrayList;
import java.util.List;

// Declarando a classe AgendamentoServico como pública, permitindo que seja acessível por outras classes fora do pacote servico

public class AgendamentoServico {

    //O objeto procedimentos: Declara e inicializa um atributo privado do tipo List<Agendamento>.
    //Ele usa ArrayList como a implementação específica da lista. Este atributo armazenará os objetos do tipo Agendamento.
    private List<Agendamento> agendamentos = new ArrayList<>();

    //adicionarAgendamento: Este método é público e permite adicionar um objeto Agendamento à lista agendamento.
    //Parâmetro agendamentos: O método recebe um parâmetro do tipo Agendamento.
    //agendamentos.add: Adiciona o procedimento recebido à lista Agendamentos.
    public void adicionarAgendamento(Agendamento agendamento) {
        agendamentos.add(agendamento);
    }

    //Método listarAgendamentos: Este método é público e retorna a lista de agendamentos armazenados.

    public List<Agendamento> listarAgendamentos() {
        return agendamentos;
    }
}

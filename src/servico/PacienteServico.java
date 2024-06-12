// Declara que esta classe pertence ao pacote servico
package servico;
// Importando a classe Paciente do pacote model
import model.Paciente;
//Importando as classes ArrayList e List do pacote java.util
import java.util.ArrayList;
import java.util.List;

// Declarando a classe PacienteServico como pública, permitindo que seja acessível por outras classes fora do pacote servico

public class PacienteServico {

    //O objeto procedimentos: Declara e inicializa um atributo privado do tipo List<Paciente>.
    //Ele usa ArrayList como a implementação específica da lista. Este atributo armazenará os objetos do tipo paciente.
    private List<Paciente> pacientes = new ArrayList<>();

     //adicionarPaciente: Este método é público e permite adicionar um objeto Paciente à lista paciente.
    //Parâmetro paciente: O método recebe um parâmetro do tipo Paciente.
    //pacientes.add(paciente): Adiciona o paciente recebido à lista paciente.
    public void adicionarPaciente(Paciente paciente) {
        pacientes.add(paciente);
    }

    //Método listarPacientes: Este método é público e retorna a lista de pacientes armazenada.
    public List<Paciente> listarPacientes() {
        return pacientes;
    }
}

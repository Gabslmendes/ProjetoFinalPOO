// Declara que esta classe pertence ao pacote servico

package servico;

// Importando a classe Procedimento do pacote model
import model.Procedimento;
//Importando as classes ArrayList e List do pacote java.util
import java.util.ArrayList;
import java.util.List;

// Declarando a classe ProcedimentoServico como pública, permitindo que seja acessível por outras classes fora do pacote servico

public class ProcedimentoServico {

    //O objeto procedimentos: Declara e inicializa um atributo privado do tipo List<Procedimento>.
    //Ele usa ArrayList como a implementação específica da lista. Este atributo armazenará os objetos do tipo Procedimento.
    private List<Procedimento> procedimentos = new ArrayList<>();

    //adicionarProcedimento: Este método é público e permite adicionar um objeto Procedimento à lista procedimentos.
    //Parâmetro procedimento: O método recebe um parâmetro do tipo Procedimento.
    //procedimentos.add: Adiciona o procedimento recebido à lista procedimento.
    public void adicionarProcedimento(Procedimento procedimento) {
        procedimentos.add(procedimento);
    }
    //Método listarProcedimentos: Este método é público e retorna a lista de procedimentos armazenados.

    public List<Procedimento> listarProcedimentos() {
        return procedimentos;
    }
}

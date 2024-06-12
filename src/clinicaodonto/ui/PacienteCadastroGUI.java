package clinicaodonto.ui;

import model.Paciente;
import servico.PacienteServico;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PacienteCadastroGUI extends JFrame {
    private JTextField textFieldNome;
    private JTextField textFieldCpf;
    private JTextField textFieldTelefone;
    private PacienteServico pacienteServico;

    public PacienteCadastroGUI(PacienteServico pacienteServico) {
        this.pacienteServico = pacienteServico;
        setTitle("Cadastro de Paciente");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        // Aumentar o tamanho da janela
        setBounds(100, 100, 600, 400);
        getContentPane().setLayout(null);

        // Ajustar os bounds dos componentes
        JLabel lblNome = new JLabel("Nome:");
        lblNome.setBounds(10, 30, 100, 30);
        getContentPane().add(lblNome);

        textFieldNome = new JTextField();
        textFieldNome.setBounds(120, 30, 300, 30);
        getContentPane().add(textFieldNome);
        textFieldNome.setColumns(10);

        JLabel lblCpf = new JLabel("CPF:");
        lblCpf.setBounds(10, 80, 100, 30);
        getContentPane().add(lblCpf);

        textFieldCpf = new JTextField();
        textFieldCpf.setBounds(120, 80, 150, 30);
        getContentPane().add(textFieldCpf);
        textFieldCpf.setColumns(10);

        JLabel lblTelefone = new JLabel("Telefone:");
        lblTelefone.setBounds(10, 130, 100, 30);
        getContentPane().add(lblTelefone);

        textFieldTelefone = new JTextField();
        textFieldTelefone.setBounds(120, 130, 150, 30);
        getContentPane().add(textFieldTelefone);
        textFieldTelefone.setColumns(10);

        JButton btnCadastrar = new JButton("Cadastrar");
        btnCadastrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nome = textFieldNome.getText();
                String cpf = textFieldCpf.getText();
                String telefone = textFieldTelefone.getText();

                Paciente paciente = new Paciente(nome, cpf, telefone);
                pacienteServico.adicionarPaciente(paciente);
                textFieldNome.setText("");
                textFieldCpf.setText("");
                textFieldTelefone.setText("");
            }
        });
        btnCadastrar.setBounds(120, 180, 150, 30);
        getContentPane().add(btnCadastrar);
    }
}

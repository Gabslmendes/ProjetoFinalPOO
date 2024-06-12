package clinicaodonto.ui;

import model.Agendamento;
import model.Paciente;
import servico.AgendamentoServico;
import servico.PacienteServico;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Date;

public class AgendamentoGUI extends JFrame {
    private JTextField textFieldData;
    private JComboBox<String> comboBoxPaciente;
    private JTextField textFieldProcedimento;
    private AgendamentoServico agendamentoServico;
    private PacienteServico pacienteServico;

    public AgendamentoGUI(AgendamentoServico agendamentoServico, PacienteServico pacienteServico) {
        this.agendamentoServico = agendamentoServico;
        this.pacienteServico = pacienteServico;
        setTitle("Agendamento");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        getContentPane().setLayout(null);

        JLabel lblData = new JLabel("Data:");
        lblData.setBounds(10, 30, 46, 14);
        getContentPane().add(lblData);

        textFieldData = new JTextField();
        textFieldData.setBounds(66, 27, 86, 20);
        getContentPane().add(textFieldData);
        textFieldData.setColumns(10);

        JLabel lblPaciente = new JLabel("Paciente:");
        lblPaciente.setBounds(10, 70, 46, 14);
        getContentPane().add(lblPaciente);

        comboBoxPaciente = new JComboBox<>();
        for (Paciente paciente : pacienteServico.listarPacientes()) {
            comboBoxPaciente.addItem(paciente.getNome());
        }
        comboBoxPaciente.setBounds(66, 67, 86, 20);
        getContentPane().add(comboBoxPaciente);

        JLabel lblProcedimento = new JLabel("Procedimento:");
        lblProcedimento.setBounds(10, 110, 80, 14);
        getContentPane().add(lblProcedimento);

        textFieldProcedimento = new JTextField();
        textFieldProcedimento.setBounds(100, 107, 86, 20);
        getContentPane().add(textFieldProcedimento);
        textFieldProcedimento.setColumns(10);

        JButton btnAgendar = new JButton("Agendar");
        btnAgendar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String data = textFieldData.getText();
                String pacienteNome = (String) comboBoxPaciente.getSelectedItem();
                String procedimento = textFieldProcedimento.getText();

                Paciente paciente = null;
                for (Paciente p : pacienteServico.listarPacientes()) {
                    if (p.getNome().equals(pacienteNome)) {
                        paciente = p;
                        break;
                    }
                }

                Agendamento agendamento = new Agendamento(paciente, new Date(data), procedimento);
                agendamentoServico.adicionarAgendamento(agendamento);
                textFieldData.setText("");
                textFieldProcedimento.setText("");
            }
        });
        btnAgendar.setBounds(66, 150, 120, 23);
        getContentPane().add(btnAgendar);
    }
}

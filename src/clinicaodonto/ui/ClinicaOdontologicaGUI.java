package clinicaodonto.ui;

import servico.PacienteServico;
import servico.AgendamentoServico;
import servico.ProcedimentoServico;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.BoxLayout;

public class ClinicaOdontologicaGUI extends JFrame {
    private PacienteServico pacienteServico = new PacienteServico();
    private AgendamentoServico agendamentoServico = new AgendamentoServico();
    private ProcedimentoServico procedimentoServico = new ProcedimentoServico();

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    ClinicaOdontologicaGUI frame = new ClinicaOdontologicaGUI();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public ClinicaOdontologicaGUI() {
        setTitle("Clínica Odontológica");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Tamanho da janela
        setSize(757, 548);

        // Centralizar a janela na tela
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation((screenSize.width - getWidth()) / 2, (screenSize.height - getHeight()) / 2);
        
        // Layout do painel principal
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        getContentPane().add(panel);

        // Espaçamento entre os botões
        panel.add(javax.swing.Box.createVerticalStrut(100));

        // Botão de Cadastro de Paciente
        JButton btnCadastroPaciente = new JButton("Cadastro de Paciente");
        btnCadastroPaciente.setAlignmentX(CENTER_ALIGNMENT);
        btnCadastroPaciente.setPreferredSize(new Dimension(300, 70)); // Aumentando o tamanho do botão
        btnCadastroPaciente.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                PacienteCadastroGUI pacienteCadastroGUI = new PacienteCadastroGUI(pacienteServico);
                pacienteCadastroGUI.setVisible(true);
            }
        });
        panel.add(btnCadastroPaciente);

        // Espaçamento entre os botões
        panel.add(javax.swing.Box.createVerticalStrut(30));
        
                // Botão de Procedimento
                JButton btnProcedimento = new JButton("Procedimento");
                btnProcedimento.setAlignmentX(CENTER_ALIGNMENT);
                btnProcedimento.setPreferredSize(new Dimension(300, 70)); // Aumentando o tamanho do botão
                btnProcedimento.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        ProcedimentoGUI procedimentoGUI = new ProcedimentoGUI(procedimentoServico);
                        procedimentoGUI.setVisible(true);
                    }
                });
                panel.add(btnProcedimento);

        // Espaçamento entre os botões
        panel.add(javax.swing.Box.createVerticalStrut(30));
        
                // Botão de Agendamento
                JButton btnAgendamento = new JButton("Agendamento");
                btnAgendamento.setAlignmentX(CENTER_ALIGNMENT);
                btnAgendamento.setPreferredSize(new Dimension(500, 70)); // Aumentando o tamanho do botão
                btnAgendamento.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        AgendamentoGUI agendamentoGUI = new AgendamentoGUI(agendamentoServico, pacienteServico);
                        agendamentoGUI.setVisible(true);
                    }
                });
                panel.add(btnAgendamento);

        // Espaçamento entre os botões
        panel.add(javax.swing.Box.createVerticalStrut(30));

        // Espaçamento final na parte inferior
        panel.add(javax.swing.Box.createVerticalStrut(100));
    }
}

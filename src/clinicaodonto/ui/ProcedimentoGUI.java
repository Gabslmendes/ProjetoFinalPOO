package clinicaodonto.ui;

import model.Procedimento;
import servico.ProcedimentoServico;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ProcedimentoGUI extends JFrame {
    private JTextField textFieldNome;
    private JTextField textFieldPreco;
    private ProcedimentoServico procedimentoServico;

    public ProcedimentoGUI(ProcedimentoServico procedimentoServico) {
        this.procedimentoServico = procedimentoServico;
        setTitle("Procedimento");
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

        JLabel lblPreco = new JLabel("Preço:");
        lblPreco.setBounds(10, 80, 100, 30);
        getContentPane().add(lblPreco);

        textFieldPreco = new JTextField();
        textFieldPreco.setBounds(120, 80, 150, 30);
        getContentPane().add(textFieldPreco);
        textFieldPreco.setColumns(10);

        JButton btnCadastrar = new JButton("Cadastrar");
        btnCadastrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nome = textFieldNome.getText();
                String precoStr = textFieldPreco.getText();

                if (nome.isEmpty() || precoStr.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Por favor, preencha todos os campos.");
                    return;
                }

                try {
                    double preco = Double.parseDouble(precoStr);
                    Procedimento procedimento = new Procedimento(nome, preco);
                    procedimentoServico.adicionarProcedimento(procedimento);
                    textFieldNome.setText("");
                    textFieldPreco.setText("");
                    JOptionPane.showMessageDialog(null, "Procedimento cadastrado com sucesso!");
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Por favor, insira um valor numérico válido para o preço.");
                }
            }
        });
        btnCadastrar.setBounds(120, 130, 150, 30);
        getContentPane().add(btnCadastrar);
    }
}

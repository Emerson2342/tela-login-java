package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JLogin extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldUsuario;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JLogin frame = new JLogin();
					frame.setLocationRelativeTo(null);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 786, 526);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(49,62,64));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBackground(new Color(204,207,208));
		panel.setBounds(201, 60, 334, 286);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Usuário");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(57, 43, 60, 19);
		panel.add(lblNewLabel);
		
		textFieldUsuario = new JTextField();
		textFieldUsuario.setBounds(57, 63, 209, 31);
		panel.add(textFieldUsuario);
		textFieldUsuario.setColumns(10);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblSenha.setBounds(57, 102, 60, 19);
		panel.add(lblSenha);
		
		JButton btnNewButton = new JButton("Entrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textFieldUsuario.getText() != null && !textFieldUsuario.getText().isEmpty() &&
						passwordField != null && !passwordField.getText().isBlank()) {
					
					JOptionPane.showMessageDialog(btnNewButton, "Informações Válidas");
				}else {
					JOptionPane.showMessageDialog(btnNewButton, "Verifique as Informações", "Aviso", JOptionPane.WARNING_MESSAGE);
				}
								
			}
		});
		btnNewButton.setBackground(new Color(49,62,64));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBounds(118, 215, 113, 31);
		panel.add(btnNewButton);
		
		JLabel lblBemVindo = new JLabel("Bem Vindo");
		lblBemVindo.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblBemVindo.setBounds(118, 10, 113, 19);
		panel.add(lblBemVindo);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(57, 121, 209, 31);
		panel.add(passwordField);
	}
}

package view;

import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import model.Cliente;
import model.ModeloTabela;

import javax.swing.JScrollPane;

public class JPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTable table;
	private ArrayList<Cliente> clientes;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JPrincipal frame = new JPrincipal();
					frame.setLocationRelativeTo(frame);
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
	public JPrincipal() {
		clientes = new ArrayList<>();
		clientes.add(new Cliente("1", "MiSsiNhOo", "email@email.com","9835-4398", "999.999.999-99","SHSH CH 02 MiSsiNhOo"));
		clientes.add(new Cliente("2", "Leopoldo", "Leopoldo@email.com","9835-4398", "999.999.999-99","SHSH CH 02 Leopoldo"));
		clientes.add(new Cliente("3", "Tusk", "Tusk@email.com","9835-4398", "999.999.999-99","SHSH CH 02 Tusk"));
		clientes.add(new Cliente("4", "Magina", "Magina@email.com","9835-4398", "999.999.999-99","SHSH CH 02 Magina"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 817, 490);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.setBounds(35, 26, 123, 30);
		contentPane.add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(187, 26, 376, 30);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(35, 87, 731, 315);
		contentPane.add(scrollPane);
		ModeloTabela modeloTabela = new ModeloTabela(clientes);
		
		
		table = new JTable();
		table.setModel(modeloTabela);
		scrollPane.setViewportView(table);
		
	}
}

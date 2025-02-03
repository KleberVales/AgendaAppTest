package com.virtures.agenda.view;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.virtures.agenda.controller.Controller;
import javax.swing.JTextArea;

public class AgendaUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private Controller controller;

	public AgendaUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 787, 463);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Data (YYYY-MM-DD)");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel.setBounds(10, 45, 174, 39);
		contentPane.add(lblNewLabel);
		
		JLabel lblHorahhmm = new JLabel("Hora (HH:MM)");
		lblHorahhmm.setFont(new Font("Arial", Font.PLAIN, 14));
		lblHorahhmm.setBounds(10, 107, 174, 39);
		contentPane.add(lblHorahhmm);
		
		JLabel lblDescrio = new JLabel("Descrição");
		lblDescrio.setFont(new Font("Arial", Font.PLAIN, 14));
		lblDescrio.setBounds(10, 170, 174, 39);
		contentPane.add(lblDescrio);
		
		textField = new JTextField();
		textField.setBounds(177, 45, 229, 39);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(177, 107, 229, 39);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(177, 170, 229, 39);
		contentPane.add(textField_2);
		
		JButton btnNewButton = new JButton("SALVAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller = new Controller();
				controller.salvarCompromisso(textField.getText(), textField_1.getText(), textField_2.getText());
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(26, 288, 133, 39);
		contentPane.add(btnNewButton);
		
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setBounds(434, 53, 329, 363);
		contentPane.add(textArea);
		
		JButton btnNewButton_1 = new JButton("LISTAR");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_1.setBounds(177, 288, 133, 32);
		contentPane.add(btnNewButton_1);
	}

	public void iniciar() {
		// TODO Auto-generated method stub
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AgendaUI frame = new AgendaUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}
}

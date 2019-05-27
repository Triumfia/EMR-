package org.eclipse.wb.swt;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class SignPrescription extends JFrame {

	private JPanel contentPane;
	private JTextField MedSignField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignPrescription frame = new SignPrescription();
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
	public SignPrescription() {
		setTitle("Sign");
		setBounds(100, 100, 372, 114);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		MedSignField = new JTextField();
		MedSignField.setBounds(57, 11, 234, 20);
		contentPane.add(MedSignField);
		MedSignField.setColumns(10);
		
		Button button = new Button("Sign");
		button.setBackground(new Color(50, 205, 50));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
	
						
						try {
							
							
							Class.forName("com.mysql.cj.jdbc.Driver");
							Connection con = DriverManager.getConnection("jdbc:mysql://35.226.84.132:3306/EMR?user=root&password=password\";\r\n" + 
									"    			connection", "root", "password");
							
							
							 String sign=MedSignField.getText();
							 
				
							 String sql = "UPDATE SIGNMEDICATION SET Sign = '"+sign+"', " + "'";
										
							PreparedStatement stmt1 = con.prepareStatement(sql);
								PreparedStatement stmt = con.prepareStatement(sql);
								stmt.executeUpdate(sql);
								
		                   JOptionPane.showMessageDialog(null,"Information Saved");				

						} 
						catch(Exception e) {System.out.print(e);}
					}
				});
						
		
		button.setBounds(142, 37, 70, 22);
		contentPane.add(button);
	}

}

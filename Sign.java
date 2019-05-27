package org.eclipse.wb.swt;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.JTextComponent;

import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

import javax.swing.JTextPane;
import java.awt.Dialog.ModalExclusionType;
import java.awt.Window.Type;
import java.awt.Button;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;
import java.awt.Color;


public class Sign extends JFrame {

	private JPanel contentPane;
	private JTextField signField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sign frame = new Sign();
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
	public Sign() {
		setTitle("Signature");
		setType(Type.POPUP);
		setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);
		setResizable(false);
		setBounds(100, 100, 343, 123);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Button button = new Button("Ok");
		button.setBackground(new Color(50, 205, 50));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg) {
						
						try {
							
							
							Class.forName("com.mysql.cj.jdbc.Driver");
							Connection con = DriverManager.getConnection("jdbc:mysql://35.226.84.132:3306/EMR?user=root&password=password\";\r\n" + 
									"    			connection", "root", "password");
							
							
							 String signature=signField.getText();
							
				
							 
						String sql = "UPDATE SIGN SET signature = '"+signature+"', " + "'";
										
							PreparedStatement stmt1 = con.prepareStatement(sql);
								PreparedStatement stmt = con.prepareStatement(sql);
								stmt.executeUpdate(sql);
								
		                   JOptionPane.showMessageDialog(null,"Information Saved");				

						} 
						catch(Exception e) {System.out.print(e);}
					}
				});
						

		button.setBounds(134, 62, 70, 22);
		contentPane.add(button);
		
		signField = new JTextField();
		signField.setBounds(47, 11, 228, 20);
		contentPane.add(signField);
		signField.setColumns(10);
	}
}

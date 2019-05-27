package org.eclipse.wb.swt;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JPasswordField;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JEditorPane;
import javax.swing.JSpinner;
import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.Color;

public class DischSum extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DischSum frame = new DischSum();
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
	public DischSum() {
		setTitle("Discharge Summary");
		setResizable(false);
		setBounds(100, 100, 822, 564);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaptionBorder);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblInpatientStatus = new JLabel("Discharge Summary ");
		lblInpatientStatus.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblInpatientStatus.setBounds(343, 71, 199, 25);
		contentPane.add(lblInpatientStatus);
		
		JLabel lblDischargeSummaryTitle = new JLabel("Discharge Summary Title ");
		lblDischargeSummaryTitle.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDischargeSummaryTitle.setBounds(41, 117, 177, 14);
		contentPane.add(lblDischargeSummaryTitle);
		
		textField = new JTextField();
		textField.setBounds(202, 115, 538, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblSummary = new JLabel("Summary");
		lblSummary.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSummary.setBounds(63, 275, 81, 14);
		contentPane.add(lblSummary);
		
		JLabel lblDictationDatetime = new JLabel("Dictation Date/Time");
		lblDictationDatetime.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblDictationDatetime.setBounds(10, 440, 118, 14);
		contentPane.add(lblDictationDatetime);
		
		textField_1 = new JTextField();
		textField_1.setBounds(202, 437, 177, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Dictator/Author");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(10, 476, 134, 14);
		contentPane.add(lblNewLabel);
		
		textField_2 = new JTextField();
		textField_2.setBounds(202, 473, 177, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Atending Physician");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(10, 501, 123, 14);
		contentPane.add(lblNewLabel_1);
		
		textField_3 = new JTextField();
		textField_3.setBounds(202, 498, 177, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		Button button = new Button("Sign");
		button.setBackground(new Color(50, 205, 50));
		button.setBounds(644, 440, 70, 22);
		contentPane.add(button);
		
		Button button_1 = new Button("Save");
		button_1.setBackground(new Color(50, 205, 50));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
						try {
							
							
							Class.forName("com.mysql.cj.jdbc.Driver");
							Connection con = DriverManager.getConnection("jdbc:mysql://35.226.84.132:3306/EMR?user=root&password=password\";\r\n" + 
									"    			connection", "root", "password");
							
							
							 String DischargeSumm=textField.getText();
							 String Summary=textField_4.getText();
							 String DictationDateTime=textField_1.getText();
							 String Author=textField_2.getText();
							 String AttendingPhys=textField_3.getText();
							
							
							 
						String sql = "UPDATE DISCHARGE SUMMARY SET DischargeSumm = '"+DischargeSumm+"',  Summary = '"+Summary+"', DictationDateTime = '"+DictationDateTime+"', Author = '"+Author+"', AttendingPhys = '"+AttendingPhys+"', " + "'";
										
							PreparedStatement stmt1 = con.prepareStatement(sql);
								PreparedStatement stmt = con.prepareStatement(sql);
								stmt.executeUpdate(sql);
								
		                   JOptionPane.showMessageDialog(null,"Information Saved");				

						} 
						catch(Exception e) {System.out.print(e);}
					}
				});
		
		button_1.setBounds(644, 493, 70, 22);
		contentPane.add(button_1);
		
		textField_4 = new JTextField();
		textField_4.setBounds(202, 173, 512, 253);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
	}
}

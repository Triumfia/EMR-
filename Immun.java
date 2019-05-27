package org.eclipse.wb.swt;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import net.proteanit.sql.DbUtils;

import javax.swing.JScrollPane;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.awt.SystemColor;
import java.awt.Color;

public class Immun extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Immun frame = new Immun();
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
	public Immun() {
		setTitle("Immunization");
		setResizable(false);
		setBounds(100, 100, 718, 479);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaptionBorder);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblImmunizationSummary = new JLabel("Immunization Summary");
		lblImmunizationSummary.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblImmunizationSummary.setBounds(255, 52, 275, 26);
		contentPane.add(lblImmunizationSummary);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(35, 97, 643, 128);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
			},
			new String[] {
				"Vaccine", "Date Given", "Next Due", "Location", "Type", "UpComing"
			}
		));
		
		Button button = new Button("OK");
		button.setBackground(new Color(50, 205, 50));
		button.addActionListener(new ActionListener() {			
						
							public void actionPerformed(ActionEvent arg0) {
								try {
									
									Class.forName("com.mysql.cj.jdbc.Driver");
									Connection con = DriverManager.getConnection("jdbc:mysql://35.226.84.132:3306/EMR?user=root&password=password\";\r\n" + 
											"    			connection", "root", "password");
									

		table.setModel(new DefaultTableModel(
				new Object[][] {
					{null, null, null, null, null, null},
					{null, null, null, null, null, null},
					{null, null, null, null, null, null},
					{null, null, null, null, null, null},
					{null, null, null, null, null, null},
					{null, null, null, null, null, null},
					{null, null, null, null, null, null},
					{null, null, null, null, null, null},
				},
				new String[] {
					"Vaccine", "Date Given", "Next Due", "Location", "Type", "UpComing"
				}
				));
			
							
						String sql = "UPDATE IMMUN SET Vaccine = '"+null+"', Date Given  = '"+null+"', Next Due = '"+null+"',Location = '"+null+"', Type = '"+null+"', UpComing ="
								+ " '"+null+"', " + "'";
				
							PreparedStatement stmt1 = con.prepareStatement(sql);
								PreparedStatement stmt = con.prepareStatement(sql);
								stmt.executeUpdate(sql);
								
		                   JOptionPane.showMessageDialog(null,"Information Saved");				

						} 
						catch(Exception e) {System.out.print(e);}
					}
				});
						
						
		button.setBounds(313, 334, 70, 22);
		contentPane.add(button);
	}
}

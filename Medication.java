package org.eclipse.wb.swt;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

import java.awt.Choice;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.DefaultComboBoxModel;
import java.awt.Label;
import java.awt.Font;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;
import java.awt.Panel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.Color;

public class Medication extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Medication frame = new Medication();
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
	public Medication() {
		setTitle("Medication");
		setResizable(false);
	
		setBounds(100, 100, 823, 390);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaptionBorder);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Panel panel = new Panel();
		panel.setFont(new Font("Dialog", Font.BOLD, 12));
		panel.setBounds(43, 101, 729, 261);
		contentPane.add(panel);
		panel.setLayout(null);
		
		final JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"g (gram) ", "L (liter) ", "lb", "mcg(microgram)", "mG", "mL (milliliter)", "nG (milligram)"}));
		comboBox_1.setBounds(85, 41, 103, 20);
		panel.add(comboBox_1);
		
		Label label_1 = new Label("Dose");
		label_1.setFont(new Font("Dialog", Font.BOLD, 12));
		label_1.setBounds(10, 41, 62, 22);
		panel.add(label_1);
		
		final JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Daily", "Discontinue", "Hourly", "Every 2 hours", "Everyday", "Every Other day ", "Subcutaneous", "Twice a week"}));
		comboBox_2.setBounds(85, 72, 103, 20);
		panel.add(comboBox_2);
		
		Label label_2 = new Label("Frequency");
		label_2.setFont(new Font("Dialog", Font.BOLD, 12));
		label_2.setBounds(10, 69, 62, 22);
		panel.add(label_2);
		
		Label label_3 = new Label("Duration");
		label_3.setFont(new Font("Dialog", Font.BOLD, 12));
		label_3.setBounds(523, 72, 62, 22);
		panel.add(label_3);
		
		final JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"1/5", "1 hour", "24 hours", "48 hours ", "72 hours ", "1 week", "2 weeks", "3 weeks ", "1 month"}));
		comboBox_3.setBounds(605, 72, 103, 20);
		panel.add(comboBox_3);
		
		final JComboBox comboBox = new JComboBox();
		comboBox.setBounds(503, 24, 205, 29);
		panel.add(comboBox);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Acetaminophen", "Adderall", "Alprazolam", "Amitriptyline", "Amlodipine", "Amoxicillin", "Ativan", "Atorvastatin", "Azithromycin", "Ciprofloxacin", "Citalopram", "Clindamycin", "Clonazepam", "Codeine", "Cyclobenzaprine", "Cymbalta", "Doxycycline", "Gabapentin", "Hydrochlorothiazide", "Ibuprofen", "Lexapro", "Lisinopril", "Loratadine", "Lorazepam", "Losartan", "Lyrica", "Meloxicam", "Metformin", "Metoprolol", "Naproxen", "Omeprazole", "Oxycodone", "Pantoprazole", "Prednisone", "Tramadol", "Trazodone", "Viagra", "Wellbutrin", "Xanax", "Zoloft", "Baclofen", "Bactrim", "Bactroban", "Basaglar", "Benicar", "Bentyl", "Benzonatate", "Berinert", "Betaseron", "Bevespi Aerosphere", "Bisoprolol", "Bosulif", "Breo Ellipta", "Brilinta", "Brovana", "Bupropion", "Buspar", "Buspirone", "Bydureon", "Bystolic", "Calquence", "Casodex", "Celexa", "Cialis", "Cinqair", "Cinryze", "Cipro IV", "Clobevate", "Clobex", "Clodan", "Clomid", "Combivent", "Complera", "Concerta", "Copaxone", "Cormax", "Cormax Scalp Application", "Cosentyx", "Crestor", "Cymbalta", "Darzalex", "Depakote", "Descovy", "Dexamethasone", "Dextromethorphan", "Diazepam", "Diclofenac", "Diflucan", "Digoxin", "Dilantin", "Dilaudid", "Diltiazem", "Diovan", "Diphenhydramine", "Doxazosin", "Doxycycline", "Dulera", "Duloxetine ", "DuoNeb", "Dupixent"}));
		
		Label label = new Label("Select Medication");
		label.setBounds(378, 31, 108, 22);
		panel.add(label);
		label.setFont(new Font("Dialog", Font.BOLD, 12));
		
		Button button_1 = new Button("Print");
		button_1.setBackground(new Color(50, 205, 50));
		button_1.setBounds(2, 210, 70, 22);
		panel.add(button_1);
		
		Button button_2 = new Button("Sign");
		button_2.setBackground(new Color(50, 205, 50));
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				SignPrescription nw  = new SignPrescription();
				nw.setVisible(true);
			}
		});
	
	     
		button_2.setBounds(317, 210, 70, 22);
		panel.add(button_2);
		
		Button button = new Button("Save");
		button.setBackground(new Color(50, 205, 50));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
					
						
						try {
							
							
							Class.forName("com.mysql.cj.jdbc.Driver");
							Connection con = DriverManager.getConnection("jdbc:mysql://35.226.84.132:3306/EMR?user=root&password=password\";\r\n" + 
									"    			connection", "root", "password");
							
							 String SelectMedication= (String) comboBox.getSelectedItem();
							 String Dose = (String) comboBox_1.getSelectedItem();
							 String Frequency = (String) comboBox_2.getSelectedItem();
							 String Duration = (String) comboBox_3.getSelectedItem();
							 
							 
						String sql = "UPDATE MEDICATION SET SelectMedication = '"+SelectMedication+"',Dose = '"+Dose+"', Frequency = '"+Frequency+"', Duration = '"+Duration+"', " + "'";
										
							PreparedStatement stmt2 = con.prepareStatement(sql);
								PreparedStatement stmt = con.prepareStatement(sql);
								stmt.executeUpdate(sql);
								
		                   JOptionPane.showMessageDialog(null,"Information Saved");				

						} 
						catch(Exception e) {System.out.print(e);}
					}
				});
						
						
		button.setBounds(597, 210, 122, 22);
		panel.add(button);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
												PrinterJob job = PrinterJob.getPrinterJob();
												
												boolean ok = job.printDialog();
												if (ok) {
													try {
														job.print();
													} catch (PrinterException arg) {
													}
												}
											}
										});
				
				
		
		JLabel lblNewLabel = new JLabel("Medication - Prescription");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(309, 24, 233, 27);
		contentPane.add(lblNewLabel);
	}
}

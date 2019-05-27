package org.eclipse.wb.swt;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JSplitPane;
import javax.swing.JLayeredPane;
import javax.swing.JDesktopPane;
import javax.swing.JToolBar;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;

//import org.eclipse.wb.swt.Order.Order;

import javax.swing.JSeparator;
import javax.swing.JInternalFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.JEditorPane;
import javax.swing.JRadioButtonMenuItem;
import java.awt.Canvas;
import java.awt.TextArea;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.BorderLayout;
import java.awt.Label;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import java.awt.SystemColor;

public class LoadPatients {

	private JFrame frmPatients;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;

	/**
	 * Launch the application.
	 * @return 
	 */
	public static void NewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoadPatients window = new LoadPatients();
					window.frmPatients.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	
	}

	/**
	 * Create the application.
	 */
	public LoadPatients() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPatients = new JFrame();
		frmPatients.getContentPane().setBackground(SystemColor.inactiveCaptionBorder);
		frmPatients.getContentPane().setForeground(SystemColor.desktop);
		frmPatients.setTitle("Jim ");
		frmPatients.setResizable(false);
		frmPatients.setBounds(100, 100, 1016, 708);
		
		JLabel lblNewJgoodiesLabel = DefaultComponentFactory.getInstance().createLabel("MENU");
		lblNewJgoodiesLabel.setBounds(10, 51, 64, 23);
		lblNewJgoodiesLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 85, 213, 573);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("Order");	
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		Order1 nw = new Order1 ();
		nw.setVisible(true);
			}
		});
		
		btnNewButton.setBounds(0, 0, 213, 96);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Presciption ");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Medication nw = new Medication();
				nw.setVisible(true);
						
			}
		});
		btnNewButton_1.setBounds(0, 94, 213, 96);
		panel.add(btnNewButton_1);
		
		JButton btnDischargeSummary = new JButton("Discharge Summary");
		btnDischargeSummary.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnDischargeSummary.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DischSum nw = new DischSum();
				nw.setVisible(true);
			}
		});
		btnDischargeSummary.setBounds(0, 190, 213, 96);
		panel.add(btnDischargeSummary);
		
		JButton btnImmunization = new JButton("Immunization ");
		btnImmunization.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnImmunization.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Immun nw = new Immun();
				nw.setVisible(true);
			}
		});
		btnImmunization.setBounds(0, 286, 213, 96);
		panel.add(btnImmunization);
		
		JButton btnForms = new JButton("Physician Note");
		btnForms.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnForms.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddHocNote nw = new AddHocNote();
				nw.setVisible(true);
				
			}
		});
		btnForms.setBounds(0, 381, 213, 96);
		panel.add(btnForms);
		
		JButton btnNewButton_2 = new JButton("Depart Process");
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Depart nw = new Depart();
				nw.NewScreen();
			}
		});
		btnNewButton_2.setBounds(0, 477, 213, 96);
		panel.add(btnNewButton_2);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(233, 98, 677, 560);
		
		JInternalFrame internalFrame_3 = new JInternalFrame("Allergy");
		internalFrame_3.getContentPane().setBackground(SystemColor.inactiveCaptionBorder);
		internalFrame_3.getContentPane().setForeground(Color.BLACK);
		tabbedPane.addTab("Allergy", null, internalFrame_3, null);
		internalFrame_3.getContentPane().setLayout(null);
		
		JLabel lblSubstance = new JLabel("Substance:");
		lblSubstance.setBounds(97, 48, 93, 14);
		internalFrame_3.getContentPane().add(lblSubstance);
		
		JLabel lblType = new JLabel("Type:");
		lblType.setBounds(97, 86, 93, 14);
		internalFrame_3.getContentPane().add(lblType);
		
		JLabel lblCategory = new JLabel("Category:");
		lblCategory.setBounds(97, 119, 93, 14);
		internalFrame_3.getContentPane().add(lblCategory);
		
		JLabel lblSeverity = new JLabel("Severity:");
		lblSeverity.setBounds(97, 159, 93, 14);
		internalFrame_3.getContentPane().add(lblSeverity);
		
		JLabel lblReactions = new JLabel("Reactions:");
		lblReactions.setBounds(97, 199, 93, 14);
		internalFrame_3.getContentPane().add(lblReactions);
		
		JLabel lblReactionStatus = new JLabel("Reaction Status:");
		lblReactionStatus.setBounds(97, 237, 93, 14);
		internalFrame_3.getContentPane().add(lblReactionStatus);
		
		JLabel lblInteraction = new JLabel("Interaction:");
		lblInteraction.setBounds(97, 272, 93, 14);
		internalFrame_3.getContentPane().add(lblInteraction);
		
		JLabel lblSource = new JLabel("Source:");
		lblSource.setBounds(97, 309, 93, 14);
		internalFrame_3.getContentPane().add(lblSource);
		
		JLabel lblUpdatedTime = new JLabel("Updated Time:");
		lblUpdatedTime.setBounds(97, 344, 93, 14);
		internalFrame_3.getContentPane().add(lblUpdatedTime);
		
		JLabel lblReviewedBy = new JLabel("Reviewed By:");
		lblReviewedBy.setBounds(97, 382, 93, 14);
		internalFrame_3.getContentPane().add(lblReviewedBy);
		
		JLabel lblEstimatedOnset = new JLabel("Estimated Onset");
		lblEstimatedOnset.setBounds(97, 407, 115, 14);
		internalFrame_3.getContentPane().add(lblEstimatedOnset);
		
		JLabel lblComment = new JLabel("Comment");
		lblComment.setBounds(97, 432, 93, 14);
		internalFrame_3.getContentPane().add(lblComment);
		
		textField_7 = new JTextField();
		textField_7.setBounds(194, 45, 241, 20);
		internalFrame_3.getContentPane().add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(194, 116, 241, 20);
		internalFrame_3.getContentPane().add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(194, 196, 368, 20);
		internalFrame_3.getContentPane().add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(194, 234, 241, 20);
		internalFrame_3.getContentPane().add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(194, 341, 122, 20);
		internalFrame_3.getContentPane().add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(194, 379, 241, 20);
		internalFrame_3.getContentPane().add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(194, 404, 122, 20);
		internalFrame_3.getContentPane().add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(194, 429, 323, 20);
		internalFrame_3.getContentPane().add(textField_14);
		
		 final JComboBox comboBox = new JComboBox();
		comboBox.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
		    JComboBox<String> comboType = (JComboBox<String>) e.getSource();
		    String selectedItem = (String) comboType.getSelectedItem();
			}
		});
		

		comboBox.setModel(new DefaultComboBoxModel(new String[] {"FOOD", "Balsam of Peru", "Egg", "Fish or shellfish", "Fruit", "Gluten", "Garlic", "Hot peppers", "Oats", "Meat", "Milk", "Peanut", "Rice", "Sesame", "Soy", "Sulfites", "Tartrazine", "Tree nut", "Wheat", "", "DRUG", "Balsam of Peru", "Cephalosporins", "Dilantin", "Intravenous contrast dye", "Local anesthetics", "Non-Seroidal anti-inflammatories", "(Cromolyn sodium, nedocrmil sodium, etc.)", "Penicillin", "Sulfonamides", "Tegretol", "Tetracycline", "", "ENVIRONMENTAL", "Balsam of Peru", "Cat", "Chromium", "Cobalt Chloride", "Cosmetics", "Dog ", "Formaldehyde", "Fungicide", "Gold (gold sodium thiosulfate)", "House dust mite", "Insect Sting", "Latex", "Mold", "Nickel(nickel sulfate hexahydrate)", "Perfume", "Photographic developers", "Pollen", "Semen", "Water"}));
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 17));
	
		
		
		
		comboBox.setBounds(194, 83, 261, 20);
		internalFrame_3.getContentPane().add(comboBox);
		
		final JComboBox comboBox_2 = new JComboBox();
		comboBox_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JComboBox<String> comboSeverity = (JComboBox<String>) e.getSource();
		        String selectedSeverity = (String) comboSeverity.getSelectedItem();
			}
		});
		
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Low", "Medium", "High", "Critical"}));
		comboBox_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		
		
		comboBox_2.setBounds(194, 153, 72, 20);
		internalFrame_3.getContentPane().add(comboBox_2);
		
		final JComboBox comboBox_3 = new JComboBox();
		comboBox_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JComboBox<String> comboInteraction = (JComboBox<String>) e.getSource();
		        String selectedInteraction = (String) comboInteraction.getSelectedItem();
			}
		});
		
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"Yes", "No"}));
		comboBox_3.setFont(new Font("Tahoma", Font.PLAIN, 17));
		
	
		
		
		comboBox_3.setBounds(194, 269, 72, 20);
		internalFrame_3.getContentPane().add(comboBox_3);
		
		final JComboBox comboBox_4 = new JComboBox();
		comboBox_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JComboBox<String> comboSource = (JComboBox<String>) e.getSource();
		        String selectedSource = (String) comboSource.getSelectedItem();
			}
		});
		
		comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"Drug", "Food ", "Rhinitis", "Seasonal", "Skin", "Pet"}));
		comboBox_4.setFont(new Font("Tahoma", Font.PLAIN, 17));
		
		
		
		comboBox_4.setBounds(194, 300, 82, 30);
		internalFrame_3.getContentPane().add(comboBox_4);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.setBackground(new Color(50, 205, 50));
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		
										try {
											Class.forName("com.mysql.cj.jdbc.Driver");
											Connection con = DriverManager.getConnection("jdbc:mysql://35.226.84.132:3306/EMR?user=root&password=password\";\r\n" + 
													"    			connection", "root", "password");
											 String sub=textField_7.getText();
											 String selectedType = (String) comboBox.getSelectedItem();
											 String cat=textField_8.getText();
											 String selectedSeverity = (String) comboBox_2.getSelectedItem();
											 String react=textField_9.getText();
											 String rStatus=textField_10.getText();
											 String selectedInteraction = (String) comboBox_3.getSelectedItem();
											 String selectedSource = (String) comboBox_4.getSelectedItem();
											 String updated=textField_11.getText();
											 String review=textField_12.getText();
											 String onset=textField_13.getText();
											 String comment=textField_14.getText();
											String sql = "UPDATE ALLERGY SET Substance = '"+sub+"', Type = '"+selectedType+"', Category = '"+cat+"',  Severity = '"+selectedSeverity+"', Reactions = '"+react+"', Reaction_Status = '"+rStatus+"', Interaction = '"+selectedInteraction+"', Source = '"+selectedSource+"', Updated_Time = '"+updated+"', Reviewed_By = '"+review+"', Estimated_Onset = '"+onset+"', Comment = '"+comment+"'  WHERE patient_id ='"+"'";
											PreparedStatement stmt = con.prepareStatement(sql);
											stmt.executeUpdate(sql);
											JOptionPane.showMessageDialog(null,"Saved!");
									} 
										catch(Exception arg0) {System.out.print(e);}
								
				
				
			}
		});
		btnUpdate.setBounds(68, 468, 89, 23);
		internalFrame_3.getContentPane().add(btnUpdate);
		
		JButton btnClear = new JButton("Clear");
		btnClear.setBackground(new Color(50, 205, 50));
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						textField_7.setText(null);
						textField_8.setText(null);
						textField_9.setText(null);
						textField_10.setText(null);
						textField_11.setText(null);
						textField_12.setText(null);
						textField_13.setText(null);
						textField_14.setText(null);	
				
			}
		});
		btnClear.setBounds(540, 468, 89, 23);
		internalFrame_3.getContentPane().add(btnClear);
		
	
					
		
		JInternalFrame internalFrame_1 = new JInternalFrame("Vital Signs");
		internalFrame_1.getContentPane().setBackground(SystemColor.inactiveCaptionBorder);
		internalFrame_1.setBorder(null);
		tabbedPane.addTab("Vital Signs", null, internalFrame_1, null);
		internalFrame_1.getContentPane().setLayout(null);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblName.setBounds(64, 30, 46, 14);
		internalFrame_1.getContentPane().add(lblName);
		
		JLabel lblUnit = new JLabel("Unit");
		lblUnit.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblUnit.setBounds(324, 30, 46, 14);
		internalFrame_1.getContentPane().add(lblUnit);
		
		JLabel lblWeight = new JLabel("Weight");
		lblWeight.setBounds(64, 60, 46, 14);
		internalFrame_1.getContentPane().add(lblWeight);
		
		JLabel lblHeight = new JLabel("Height");
		lblHeight.setBounds(64, 85, 46, 14);
		internalFrame_1.getContentPane().add(lblHeight);
		
		JLabel lblBpSystolic = new JLabel("BP Systolic");
		lblBpSystolic.setBounds(64, 121, 66, 14);
		internalFrame_1.getContentPane().add(lblBpSystolic);
		
		JLabel lblPulse = new JLabel("Pulse");
		lblPulse.setBounds(64, 152, 46, 14);
		internalFrame_1.getContentPane().add(lblPulse);
		
		JLabel lblTemperature = new JLabel("Temperature");
		lblTemperature.setBounds(64, 177, 86, 14);
		internalFrame_1.getContentPane().add(lblTemperature);
		
		JLabel lblTemparatureLocation = new JLabel("TemparatureLocation");
		lblTemparatureLocation.setBounds(64, 202, 117, 14);
		internalFrame_1.getContentPane().add(lblTemparatureLocation);
		
		JLabel lblOxygenSaturation = new JLabel("Oxygen Saturation");
		lblOxygenSaturation.setBounds(64, 227, 117, 25);
		internalFrame_1.getContentPane().add(lblOxygenSaturation);
		
		JLabel lblHeadCircumference = new JLabel("BMI");
		lblHeadCircumference.setBounds(64, 263, 46, 14);
		internalFrame_1.getContentPane().add(lblHeadCircumference);
		
		JLabel lblLbs = new JLabel("lbs");
		lblLbs.setBounds(324, 60, 46, 14);
		internalFrame_1.getContentPane().add(lblLbs);
		
		JLabel lblCm = new JLabel("in");
		lblCm.setBounds(324, 85, 46, 14);
		internalFrame_1.getContentPane().add(lblCm);
		
		JLabel lblMmhg = new JLabel("mm/hg");
		lblMmhg.setBounds(324, 121, 46, 14);
		internalFrame_1.getContentPane().add(lblMmhg);
		
		JLabel lblPerMin = new JLabel("per min");
		lblPerMin.setBounds(324, 152, 46, 14);
		internalFrame_1.getContentPane().add(lblPerMin);
		
		JLabel lblF = new JLabel("F");
		lblF.setBounds(324, 177, 46, 14);
		internalFrame_1.getContentPane().add(lblF);
		
		JLabel label = new JLabel("%");
		label.setBounds(324, 232, 46, 14);
		internalFrame_1.getContentPane().add(label);
		
		JLabel lblKgm = new JLabel("kg/m^2");
		lblKgm.setBounds(324, 263, 46, 14);
		internalFrame_1.getContentPane().add(lblKgm);
		
		textField = new JTextField();
		textField.setBounds(431, 57, 86, 20);
		internalFrame_1.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(431, 82, 86, 20);
		internalFrame_1.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(431, 118, 86, 20);
		internalFrame_1.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(431, 149, 86, 20);
		internalFrame_1.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(431, 174, 86, 20);
		internalFrame_1.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		final JComboBox comboTempLoc = new JComboBox();
		comboTempLoc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JComboBox<String> comboTempLoc = (JComboBox<String>) arg0.getSource();
		        String selectedTemparatureLocation = (String) comboTempLoc.getSelectedItem();
			}
		});
		
		
		
		comboTempLoc.setModel(new DefaultComboBoxModel(new String[] {"Axillary", "Oral "}));
		comboTempLoc.setBounds(431, 199, 86, 20);
		internalFrame_1.getContentPane().add(comboTempLoc);
		
		textField_5 = new JTextField();
		textField_5.setBounds(431, 229, 86, 20);
		internalFrame_1.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(431, 260, 86, 20);
		internalFrame_1.getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		java.awt.Button button_3 = new java.awt.Button("Ok");
		button_3.setBackground(new Color(50, 205, 50));
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
						try {
							Class.forName("com.mysql.cj.jdbc.Driver");
							Connection con = DriverManager.getConnection("jdbc:mysql://35.226.84.132:3306/EMR?user=root&password=password\";\r\n" + 
									"    			connection", "root", "password");
							 String weight=textField.getText();
							 String Height=textField_1.getText();
							 String BP=textField_2.getText();
							 String pulse=textField_3.getText();
							 String selectedTemparatureLocation = (String) comboTempLoc.getSelectedItem();
							 String Oxygen=textField_5.getText();
							 String BMI=textField_6.getText();			
							 
						String sql = "UPDATE VITALS SET Pulse_Rate = '"+pulse+"',  BP_Location = '"+BP+"', Heigh = '"+Height+"', Weight = '"+weight+"', Temperature = '"+selectedTemparatureLocation+"', Oxygen = '"+Oxygen+"', BMI = '"+BMI+"'";
								PreparedStatement stmt = con.prepareStatement(sql);
								stmt.executeUpdate(sql);
								
		                   JOptionPane.showMessageDialog(null,"Inserted Successfully!");				
	
						} 
						catch(Exception e) {System.out.print(e);}
					}
				});

		
		
			
		button_3.setBounds(281, 353, 70, 22);
		internalFrame_1.getContentPane().add(button_3);
		
		JInternalFrame internalFrame_2 = new JInternalFrame("Past Visit");
		internalFrame_2.getContentPane().setBackground(SystemColor.inactiveCaptionBorder);
		tabbedPane.addTab("Past Visit", null, internalFrame_2, null);
		internalFrame_2.getContentPane().setLayout(null);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"1", "11", "12", "13", "14"}));
		comboBox_1.setBounds(512, 11, 134, 20);
		internalFrame_2.getContentPane().add(comboBox_1);
		
		JLabel lblNewLabel = new JLabel("Select Encounter");
		lblNewLabel.setBounds(407, 14, 95, 14);
		internalFrame_2.getContentPane().add(lblNewLabel);
		internalFrame_1.setVisible(true);
		
		
		/* JLabel lblSubstance = new JLabel("Substance:");
		lblSubstance.setFont(new Font("Tahoma", Font.PLAIN, 17));
		
		JLabel lblType = new JLabel("Type:");
		lblType.setFont(new Font("Tahoma", Font.PLAIN, 17));
		
		JLabel lblCategory = new JLabel("Category:");
		lblCategory.setFont(new Font("Tahoma", Font.PLAIN, 17));
		
		JLabel lblSeverity = new JLabel("Severity:");
		lblSeverity.setFont(new Font("Tahoma", Font.PLAIN, 17));
		
		JLabel lblReactions = new JLabel("Reactions:");
		lblReactions.setFont(new Font("Tahoma", Font.PLAIN, 17));
		
		JLabel lblReactionStatus = new JLabel("Reaction Status:");
		lblReactionStatus.setFont(new Font("Tahoma", Font.PLAIN, 17));
		
		JLabel lblInteraction = new JLabel("Interaction:");
		lblInteraction.setFont(new Font("Tahoma", Font.PLAIN, 17));
		
		JLabel lblSource = new JLabel("Source:");
		lblSource.setFont(new Font("Tahoma", Font.PLAIN, 17));
		
		JLabel lblUpdatedTime = new JLabel("Updated Time:");
		lblUpdatedTime.setFont(new Font("Tahoma", Font.PLAIN, 17));
		
		JLabel lblReviewedBy = new JLabel("Reviewed By:");
		lblReviewedBy.setFont(new Font("Tahoma", Font.PLAIN, 17));
		
		JLabel lblEstimatedOnset = new JLabel("Estimated Onset:");
		lblEstimatedOnset.setFont(new Font("Tahoma", Font.PLAIN, 17));
		
		JLabel lblComment = new JLabel("Comment:");
		lblComment.setFont(new Font("Tahoma", Font.PLAIN, 17)); */
		
		/* textSubstance = new JTextField();
		textSubstance.setFont(new Font("Tahoma", Font.PLAIN, 17));
		textSubstance.setColumns(10);
		
		textCategory = new JTextField();
		textCategory.setFont(new Font("Tahoma", Font.PLAIN, 17));
		textCategory.setColumns(10);
		
		textReactions = new JTextField();
		textReactions.setFont(new Font("Tahoma", Font.PLAIN, 17));
		textReactions.setColumns(10);
		
		textRStatus = new JTextField();
		textRStatus.setFont(new Font("Tahoma", Font.PLAIN, 17));
		textRStatus.setColumns(10);
		
		textUpdated = new JTextField();
		textUpdated.setFont(new Font("Tahoma", Font.PLAIN, 17));
		textUpdated.setColumns(10);
		
		textReviewed = new JTextField();
		textReviewed.setFont(new Font("Tahoma", Font.PLAIN, 17));
		textReviewed.setColumns(10);
		
		textOnset = new JTextField();
		textOnset.setFont(new Font("Tahoma", Font.PLAIN, 17));
		textOnset.setColumns(10);
		
		textComment = new JTextField();
		textComment.setFont(new Font("Tahoma", Font.PLAIN, 17));
		textComment.setColumns(10);
		
		*/
		final JComboBox comboType = new JComboBox();
		comboType.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JComboBox<String> comboType = (JComboBox<String>) e.getSource();
		        String selectedItem = (String) comboType.getSelectedItem();
			}
		});
		
		comboType.setModel(new DefaultComboBoxModel(new String[] {"FOOD", "Balsam of Peru", "Egg", "Fish or shellfish", "Fruit", "Gluten", "Garlic", "Hot peppers", "Oats", "Meat", "Milk", "Peanut", "Rice", "Sesame", "Soy", "Sulfites", "Tartrazine", "Tree nut", "Wheat", "", "DRUG", "Balsam of Peru", "Cephalosporins", "Dilantin", "Intravenous contrast dye", "Local anesthetics", "Non-Seroidal anti-inflammatories", "(Cromolyn sodium, nedocrmil sodium, etc.)", "Penicillin", "Sulfonamides", "Tegretol", "Tetracycline", "", "ENVIRONMENTAL", "Balsam of Peru", "Cat", "Chromium", "Cobalt Chloride", "Cosmetics", "Dog ", "Formaldehyde", "Fungicide", "Gold (gold sodium thiosulfate)", "House dust mite", "Insect Sting", "Latex", "Mold", "Nickel(nickel sulfate hexahydrate)", "Perfume", "Photographic developers", "Pollen", "Semen", "Water"}));
		comboType.setFont(new Font("Tahoma", Font.PLAIN, 17));
		
		final JComboBox comboSeverity = new JComboBox();
		comboSeverity.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JComboBox<String> comboSeverity = (JComboBox<String>) e.getSource();
		        String selectedSeverity = (String) comboSeverity.getSelectedItem();
			}
		});
		comboSeverity.setModel(new DefaultComboBoxModel(new String[] {"Low", "Medium", "High", "Critical"}));
		comboSeverity.setFont(new Font("Tahoma", Font.PLAIN, 17));
		
		final JComboBox comboInteraction = new JComboBox();
		comboInteraction.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JComboBox<String> comboInteraction = (JComboBox<String>) e.getSource();
		        String selectedInteraction = (String) comboInteraction.getSelectedItem();
			}
		});
		comboInteraction.setModel(new DefaultComboBoxModel(new String[] {"Yes", "No"}));
		comboInteraction.setFont(new Font("Tahoma", Font.PLAIN, 17));
		
		final JComboBox comboSource = new JComboBox();
		comboSource.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JComboBox<String> comboSource = (JComboBox<String>) e.getSource();
		        String selectedSource = (String) comboSource.getSelectedItem();
			}
		});
		comboSource.setModel(new DefaultComboBoxModel(new String[] {"Drug", "Food ", "Rhinitis", "Seasonal", "Skin", "Pet"}));
		comboSource.setFont(new Font("Tahoma", Font.PLAIN, 17));

		
		
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frmPatients.getContentPane().setLayout(null);
		frmPatients.getContentPane().add(lblNewJgoodiesLabel);
		frmPatients.getContentPane().add(panel);
		frmPatients.getContentPane().add(tabbedPane);
		
		
		JButton button_5 = new JButton("Clear");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	
			}
		});
		
	
		// panel_1.setLayout(gl_panel_1);
	
	
		
	}

	public static void main(Object object) {
		// TODO Auto-generated method stub
		
	}
	}

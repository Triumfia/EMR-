package org.eclipse.wb.swt;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Label;
import javax.swing.DefaultComboBoxModel;
import java.awt.Button;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.UIManager;

public class Order1 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Order1 frame = new Order1();
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
	public Order1() {
		setForeground(Color.BLACK);
		setTitle("Order");
		setResizable(false);
		setBounds(100, 100, 913, 451);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaptionBorder);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		final JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"LAB", "", "ANA", "BMP (Basic Metabolic Panel)", "CBC (Complete Blood Count)", "CMP (Comprehensive Metabolic)", "ESR (Sedimentation Rate)", "Flu( Influenza A and B Screen)", "Glucose Level", "Urine ", "", "", "Radiology", "", "Computed Tomography ", "Fluoroscopy", "Magnetic Resonance Imaging", "Mammography", "Nuclear Medicine ", "Plain x-rays", "Ultrasound", "Venous Access Catheter Placement ", "Vertebroplasty and Kyphoplasty", "", ""}));
		comboBox.setBounds(664, 83, 233, 20);
		contentPane.add(comboBox);
		
		JLabel lblOrderCatalog = new JLabel("Order Catalog");
		lblOrderCatalog.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblOrderCatalog.setBounds(560, 85, 94, 14);
		contentPane.add(lblOrderCatalog);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(95, 124, 721, 216);
		contentPane.add(panel);
		
		Label label_1 = new Label("Dose");
		label_1.setFont(new Font("Dialog", Font.BOLD, 12));
		label_1.setBounds(109, 38, 38, 22);
		panel.add(label_1);
		
		Label label_2 = new Label("Route of Adminstration");
		label_2.setFont(new Font("Dialog", Font.BOLD, 12));
		label_2.setBounds(10, 64, 137, 22);
		panel.add(label_2);
		
		Label label_3 = new Label("PRN");
		label_3.setBounds(78, 88, 69, 22);
		panel.add(label_3);
		
		JLabel lblInfuseOverUnit = new JLabel("Infuse over unit");
		lblInfuseOverUnit.setBounds(48, 116, 99, 14);
		panel.add(lblInfuseOverUnit);
		
		JLabel lblPriorexStat = new JLabel("Prior (ex: STAT or NOW)");
		lblPriorexStat.setBounds(10, 142, 139, 14);
		panel.add(lblPriorexStat);
		
		JLabel lblRequestedStartDatetime = new JLabel("Requested Start Date/Time");
		lblRequestedStartDatetime.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblRequestedStartDatetime.setBounds(10, 168, 137, 14);
		panel.add(lblRequestedStartDatetime);
		
		JLabel lblNewLabel = new JLabel("Drug Form");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(500, 38, 62, 14);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Frequency");
		lblNewLabel_1.setBounds(487, 64, 75, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Duration");
		lblNewLabel_2.setBounds(511, 90, 51, 14);
		panel.add(lblNewLabel_2);
		
		JLabel lblSpecialInstructions = new JLabel("Special Instructions");
		lblSpecialInstructions.setBounds(439, 116, 125, 14);
		panel.add(lblSpecialInstructions);
		
		JLabel lblStopType = new JLabel("Stop type");
		lblStopType.setBounds(493, 142, 69, 14);
		panel.add(lblStopType);
		
		final JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"g (gram) ", "L (liter) ", "lb", "mcg(microgram)", "mG", "mL (milliliter)", "nG (milligram)"}));
		comboBox_1.setBounds(153, 38, 133, 20);
		panel.add(comboBox_1);
		
		final JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"AURICULAR (OTIC) ear", "BUCCAL within the cheek", "CONJUNCTIVAL surface of the eyeball", "CUTANEOUS skin.", "DENTAL a tooth or teeth", "ELECTRO-OSMOSIS  membrane in an electric field", "ENDOCERVICAL cervix uteri", "ENDOSINUSIAL nasal sinuses of the head", "ENDOTRACHEAL  trachea", "ENTERAL intestines", "EPIDURAL upon or over the dura mater. ", "EXTRA\u2011AMNIOTIC outside of the membrane enveloping the fetus ", "EXTRACORPOREAL outside of the body", "HEMODIALYSIS through hemodialysate fluid", "INFILTRATION passing into tissue spaces or into cells", "INTERSTITIAL interstices of a tissue", "INTRA-ABDOMINAL within the abdomen", "INTRA-AMNIOTIC  within the amnion", "INTRA-ARTERIAL  within an artery or arteries", "INTRA-ARTICULAR within a joint", "INTRABILIARY within the bile, bile ducts or gallbladder", "INTRABRONCHIAL Administration within a bronchus. ", "INTRABURSAL Administration within a bursa", "INTRACARDIAC Administration with the heart", "INTRACARTILAGINOUS Administration within a cartilage; endochondral", "INTRACAUDAL Administration within the cauda equina", "INTRACAVERNOUS  within a pathologic cavity, such as  occurs in the lung in tuberculosis", "INTRACAVITARY within a non-pathologic cavity, such as that of the cervix", "INTRACEREBRAL Administration within the cerebrum", "INTRACISTERNAL Administration within the cisterna magna cerebellomedularis", "INTRACORNEAL within the cornea ", "INTRACORONAL, DENTAL within a portion of a tooth ", "INTRACORONARY Administration within the coronary arteries", "INTRACORPORUS CAVERNOSUM  within the dilatable spaces of the corporus cavernosa of the penis", "INTRADERMAL Administration within the dermis", "INTRADISCAL Administration within a disc", "INTRADUCTAL Administration within the duct of a gland", "INTRADUODENAL Administration within the duodenum", "INTRADURAL Administration within or beneath the dura", "INTRAEPIDERMAL Administration within the epidermis", "INTRAESOPHAGEAL Administration within the esophagus", "INTRAGASTRIC Administration within the stomach", "INTRAGINGIVAL Administration within the gingivae", "INTRAILEAL Administration within the distal portion of the small intestine", "INTRALESIONAL Administration within or introduced directly into a localized lesion.", "INTRALUMINAL Administration within the lumen of a tube", "INTRALYMPHATIC Administration within the lymph", "INTRAMEDULLARY Administration within the marrow cavity of a bone", "INTRAMENINGEAL within the meninges", "INTRAMUSCULAR Administration within a muscle", "INTRAOCULAR Administration within the eye", "INTRAOVARIAN Administration within the ovary", "INTRAPERICARDIAL Administration within the pericardium", "INTRAPERITONEAL Administration within the peritoneal cavity", "INTRAPLEURAL Administration within the pleura", "INTRAPROSTATIC Administration within the prostate gland", "INTRAPULMONARY Administration within the lungs or its bronchi", "INTRASINAL Administration within the nasal or periorbital sinuses", "INTRASPINAL Administration within the vertebral column", "INTRASYNOVIAL Administration within the synovial cavity of a joint", "INTRATENDINOUS Administration within a tendon", "INTRATESTICULAR Administration within the testicle", "INTRATHECAL  within the cerebrospinal fluid ", "INTRATHORACIC  within the thorax; synonymous with the term endothoracic.", "INTRATUBULAR Administration within the tubules of an organ", "INTRATUMOR Administration within a tumor", "INTRATYMPANIC Administration within the aurus media", "INTRAUTERINE Administration within the uterus", "INTRAVASCULAR Administration within a vessel or vessels", "INTRAVENOUS Administration within or into a vein or veins", "INTRAVENOUS BOLUS Administration within or into a vein or veins all at once", "INTRAVENOUS DRIP Administration within or into a vein or veins over a sustained period of time", "INTRAVENTRICULAR Administration within a ventricle", "INTRAVESICAL Administration within the bladder", "INTRAVITREAL Administration within the vitreous body of the eye", "IONTOPHORESIS An electric current where ions of soluble salts migrate into the tissues of the body", "IRRIGATION Administration to bathe or flush open wounds or body cavities.", "LARYNGEAL Administration directly upon the larynx", "NASAL Administration to the nose; administered by way of the nose", "NASOGASTRIC Administration through the nose and into the stomach, usually by means of a tube", "NOT APPLICABLE Routes of administration are not applicable", "OCCLUSIVE DRESSING TECHNIQUE  topical route which is then covered by a dressing which occludes the area", "OPHTHALMIC Administration  to the external eye", "ORAL Administration to or by way of the mouth", "OROPHARYNGEAL Administration directly to the mouth and pharynx", "OTHER Administration is different from others on this list", "PARENTERAL Administration by injection, infusion, or implantation", "PERCUTANEOUS Administration through the skin", "PERIARTICULAR Administration around a joint", "PERIDURAL Administration to the outside of the dura mater of the spinal cord", "PERINEURAL Administration surrounding a nerve or nerves", "PERIODONTAL Administration around a tooth", "RECTAL Administration to the rectum", "RESPIRATORY (INHALATION) within the respiratory tract by inhaling orally", "RETROBULBAR behind the pons or behind the eyeball", "SOFT TISSUE into any soft tissue", "SUBARACHNOID beneath the arachnoid", "SUBCONJUNCTIVAL  beneath the conjunctiva", "SUBCUTANEOUS  beneath the skin; hypodermic", "SUBLINGUAL beneath the tongue", "SUBMUCOSALbeneath the mucous membrane", "TOPICAL particular spot on the outer surface of the body", "TRANSDERMAL through the dermal layer of the skin to the systemic circulation by diffusion", "TRANSMUCOSAL across the mucosa", "TRANSPLACENTAL through or across the placenta", "TRANSTRACHEAL through the wall of the trachea", "TRANSTYMPANIC  through the tympanic cavity", "UNASSIGNED has not yet been assigned", "UNKNOWN Route of administration is unknown", "URETERAL Administration into the ureter", "URETHRAL Administration into the urethra", "VAGINAL Administration into the vagina"}));
		comboBox_2.setBounds(153, 66, 324, 20);
		panel.add(comboBox_2);
		
		final JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"Yes", "No"}));
		comboBox_3.setBounds(153, 90, 133, 20);
		panel.add(comboBox_3);
		
		final JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"U or IU (Write units)", "IV (intravenous)"}));
		comboBox_4.setBounds(153, 116, 133, 20);
		panel.add(comboBox_4);
		
		final JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setModel(new DefaultComboBoxModel(new String[] {"Stat", "Now"}));
		comboBox_5.setBounds(153, 142, 133, 20);
		panel.add(comboBox_5);
		
		final JComboBox comboBox_6 = new JComboBox();
		comboBox_6.setModel(new DefaultComboBoxModel(new String[] {"Now", "1/5", "1 hour", "24 hours", "48 hours", "72 hours", "1 week", "2 weeks", "3 weeks", "1 month"}));
		
		comboBox_6.setBounds(153, 168, 133, 20);
		panel.add(comboBox_6);
		
		final JComboBox comboBox_7 = new JComboBox();
		comboBox_7.setModel(new DefaultComboBoxModel(new String[] {"AD", "Caps", "Inhal", "IV", "Oral", "Oral Suspension", "Syrup", "Tab", "Valproic Acid Oral ", "", "", ""}));
		comboBox_7.setBounds(568, 38, 133, 20);
		panel.add(comboBox_7);
		
		final JComboBox comboBox_8 = new JComboBox();
		comboBox_8.setModel(new DefaultComboBoxModel(new String[] {"Daily", "DC (Discontinue)", "Hourly", "HS (Write at bedtime or a designated time. Also write out the specific dosing strength and/or quantity)", "QD (Write every day)", "QOD (Write every other day or daily, according to patient\u2019s needs.)", "SQ or SC (Write Subq,subcutaneous)", "TIW (Write twice a week or three times a week)"}));
		comboBox_8.setBounds(568, 64, 133, 20);
		panel.add(comboBox_8);
		
		final JComboBox comboBox_9 = new JComboBox();
		comboBox_9.setModel(new DefaultComboBoxModel(new String[] {"1/5", "1 hour", "24 hours", "48 hours", "72 hours", "1 week", "2 weeks", "3 weeks", "1 month"}));
		comboBox_9.setBounds(568, 90, 133, 20);
		panel.add(comboBox_9);
		
		final JComboBox comboBox_10 = new JComboBox();
		comboBox_10.setModel(new DefaultComboBoxModel(new String[] {"N/A", "See note"}));
		comboBox_10.setBounds(568, 113, 133, 20);
		panel.add(comboBox_10);
		
		final JComboBox comboBox_11 = new JComboBox();
		comboBox_11.setModel(new DefaultComboBoxModel(new String[] {"Manual", "Automatic"}));
		comboBox_11.setBounds(568, 139, 133, 20);
		panel.add(comboBox_11);
		
		final JComboBox comboBox_12 = new JComboBox();
		comboBox_12.setModel(new DefaultComboBoxModel(new String[] {"Approve Order", "Hold Order"}));
		comboBox_12.setBounds(568, 165, 133, 20);
		panel.add(comboBox_12);
		
		Button button = new Button("Sign");
		button.setBackground(new Color(50, 205, 50));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Sign nw = new Sign();
				nw.setVisible(true);
			}
		});
		button.setBounds(746, 367, 70, 22);
		contentPane.add(button);
		
		JLabel lblNewLabel_3 = new JLabel("Ordering Physician");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3.setBounds(27, 367, 148, 14);
		contentPane.add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setBounds(203, 367, 206, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblOrder = new JLabel("Order");
		lblOrder.setBackground(UIManager.getColor("InternalFrame.activeTitleGradient"));
		lblOrder.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblOrder.setBounds(403, 23, 167, 31);
		contentPane.add(lblOrder);
		
		Button button_1 = new Button("Save");
		button_1.setBackground(new Color(50, 205, 50));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				try {
					
					
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://35.226.84.132:3306/EMR?user=root&password=password\";\r\n" + 
							"    			connection", "root", "password");
					
					
					 String OrderingPhys=textField.getText();
					 String OrderCatalog = (String) comboBox.getSelectedItem();
					 String Dose = (String) comboBox_1.getSelectedItem();
					 String RouteAministration = (String) comboBox_2.getSelectedItem();
					 String PRN = (String) comboBox_3.getSelectedItem();
					 String InfuseUnit = (String) comboBox_4.getSelectedItem();
					 String Priority = (String) comboBox_5.getSelectedItem();
					 String RequestedStartDate = (String) comboBox_5.getSelectedItem();
					 String DrugForm = (String) comboBox_6.getSelectedItem();
					 String Frequency = (String) comboBox_7.getSelectedItem();
					 String Duration = (String) comboBox_8.getSelectedItem();
					 String SepcialInstruction = (String) comboBox_9.getSelectedItem();
					 String StopType = (String) comboBox_10.getSelectedItem();
		
					 
					 String sql = "UPDATE ORDER1 SET OrderingPhys = '"+OrderingPhys+"',  OrderCatalog = '"+OrderCatalog+"', Dose = '"+Dose+"', RouteAministration = '"+RouteAministration+"', PRN = '"+PRN+"', InfuseUnit ="
								+ " '"+InfuseUnit+"',  Priority = '"+ Priority+"', RequestedStartDate = '"+RequestedStartDate+"', DrugForm = '"+DrugForm+"', Frequency = "+ "'"+Frequency+"', Duration = '"+Duration+"', SepcialInstruction = '"+SepcialInstruction+"', StopType = '"+StopType+"'";
										
					PreparedStatement stmt1 = con.prepareStatement(sql);
						PreparedStatement stmt = con.prepareStatement(sql);
						stmt.executeUpdate(sql);
						
                   JOptionPane.showMessageDialog(null," Saved");				

				} 
				catch(Exception e) {System.out.print(e);
				
				}
			}
		});
				
		
				
		
		button_1.setBounds(500, 367, 70, 22);
		contentPane.add(button_1);
		
	

	
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 69, 721, 357);
		panel_2.setLayout(null);
	}
}

package org.eclipse.wb.swt;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JEditorPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class About {

	private JFrame frmAbout;

	/**
	 * Launch the application.
	 */
	public static void NewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					About window = new About();
					window.frmAbout.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public About() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAbout = new JFrame();
		frmAbout.setResizable(false);
		frmAbout.getContentPane().setEnabled(false);
		frmAbout.setTitle("About");
		frmAbout.setBounds(100, 100, 949, 944);
		frmAbout.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 924, 886);
		frmAbout.getContentPane().add(scrollPane);
		
		JTextArea txtrWelcomeToEmr = new JTextArea();
		txtrWelcomeToEmr.setEditable(false);
		txtrWelcomeToEmr.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		txtrWelcomeToEmr.setText("\t\t\t\t                                     Welcome to EMR \r\n\r\n\tThe EMR Application platform will work to create a central location where all patient medical records can be stored. This is to ensure that medical records \r\ncan be transferred between professionals with ease. This ease of access of records will help medical professionals work with each other for the wellbeing of the patient. \r\nThe EMR platform will also comply with the HIPAA compliance guidelines including password and user authentication, encryption, keeping up-to-date security, and \r\nenabling firewalls.\r\n\r\n\tThe objective of this Application is to create a system for one specific rural country. The unique component of our project will be its ability to be utilized in \r\nthe country\u2019s National Language and well as its native language. Medical professionals will be able to print out patient discharge instruction and well as patient education in\r\neither their national language or their native language. This functionality is currently not available with any Electronic Medical Record system. \r\nThe final EMR system will be proposed to a Hospital in Benin Republic called Centre National Hospitalier Universitaire also known as CNHU. \r\nAs of now Benin does not have an EMR system implemented into their health care system.\r\n\r\nElectronic Medical Records is a program that will allow for the easy storing and accessing of patient medical data. A central storage system will allow for the ease of \r\ntransferring patient information between medical professionals. Due to the nature of the data stored there will be a large emphasis on privacy.\r\n\r\nBasic Functions\r\n\r\n\tThe basic function of the Electronic Medical Records system will be to provide a platform for viewing and editing of patient medical information by licensed \r\nmedical professionals (users). The system must have a login functionality to keep the patient information for each user private. Access to patient records will\r\nbe accessed by a system where the user will request permission, to be granted by a data administrator. A central database system hosted on a cloud will be\r\nprovided to allow for the hosting of all patient information in one place. This will allow for easy access of patient information from multiple users.\r\n\r\n(a)\tViewing Patient Information\r\n\r\nThe main point of the Electronic Medical Records system is easy access to patient information. The patient information must be shown in a way that is\r\neasy to understand. The user should be able to view the following information from the Electronic Medical Record system:\r\n\r\n\u2022\tBasic information: Name, Address, Languages Spoken, Marital Status, and Date of Birth\r\n\u2022\tMedical History\r\no\tAllergies\r\no\tImmunizations\r\no\tRisk factors: Smoking, Drug use, Drinking\r\no\tHospitalization data: Hospital admitted, Reason, Duration, Procedures done, and any diagnoses\r\no\tFamily history\r\n\u2022\tVisit information\r\no\tVital Signs\r\no\tReason for visit\r\no\tNotes\r\n\u2022\tMedications\r\n\u2022\tTest results from laboratories\r\n\r\n(b)\tEditing Patient Information\r\nThe user should be able to edit the patient information in such a way as to keep the records up to date with each visit the patient makes. For example, each \r\nvisit will result in a new subset of vital sign data that would need to be stored within the EMR system. It is also important to allow the user to add additional information to \r\nthe medical history and basic information as it is needed. For the patient to receive the best care from multiple medical professionals it is necessary to allow for the taking \r\nof notes to be done for each visit as well. This will serve as an update to the patient\u2019s condition that any other user may need to do a satisfactory job. \r\n\r\n\r\n(c)\tPatient Search Functionality\r\nA search function will be provided to the user to search for patients. Once they have inserted a search criterion a page will be presented to the user that will list all patients\r\nthat meet that criteria. Once clicking on a patient, more information about the patient will be given on the GUI, or if they do no have permission to access the patient records\r\nthen a button will be provided to request access.\r\n\r\n");
		scrollPane.setRowHeaderView(txtrWelcomeToEmr);
	}
}

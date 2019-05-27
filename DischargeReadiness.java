package org.eclipse.wb.swt;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JEditorPane;
import javax.swing.JLabel;
import java.awt.Font;

public class DischargeReadiness {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void NewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DischargeReadiness window = new DischargeReadiness();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	


	/**
	 * Create the application.
	 */
	public DischargeReadiness() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 985, 694);
		frame.getContentPane().setLayout(null);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setBounds(39, 132, 868, 393);
		frame.getContentPane().add(editorPane);
		
		JLabel lblDischargeItems = new JLabel("DISCHARGE ITEMS");
		lblDischargeItems.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDischargeItems.setBounds(39, 55, 157, 21);
		frame.getContentPane().add(lblDischargeItems);
		
		JButton btnSave = new JButton("SAVE");
		btnSave.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnSave.setBounds(818, 55, 89, 23);
		frame.getContentPane().add(btnSave);
	
	}
}



package org.eclipse.wb.swt;
import java.awt.Button;
import java.awt.Color;

import java.awt.Font;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import java.awt.event.MouseAdapter;

import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JButton;

import javax.swing.JFrame;

import javax.swing.JScrollPane;

import javax.swing.JTable;

import javax.swing.JTextField;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.SystemColor;




public class Depart {
	private static JScrollPane pane;
	private static JTable table;
	private static JTextField textId;
	private static JTextField textFname;
	private static JTextField textLname;
	private static JTextField textAge;
	private static JButton btnAdd;
	private static JButton btnDelete;
	private static JButton btnUpdate;
	private static JLabel lblNewLabel;
	private static JLabel lblNewLabel_1;
	private static JLabel lblProblemCodeInput;
	private static JLabel lblProblemDetail;
	private static JLabel lblDiagnosisCodeInput;
	private static JLabel lblDiagnosisDetail;




    /**
     * @wbp.parser.entryPoint
     */
    public static void NewScreen(){

        

        // create JFrame and JTable

        JFrame frmDepartProcess = new JFrame();
        frmDepartProcess.getContentPane().setBackground(SystemColor.inactiveCaptionBorder);
        frmDepartProcess.setTitle("Depart Process");
        frmDepartProcess.setResizable(false);

        table = new JTable(); 

        

        // create a table model and set a Column Identifiers to this model 

        Object[] columns = {"Patient ID","Problem & Diagnosis ICD-10 Code","Problem Detail","Diagnosis Detail"};

        final DefaultTableModel model = new DefaultTableModel();

        model.setColumnIdentifiers(columns);

        

        // set the model to the table

        table.setModel(model);

        

        // Change A JTable Background Color, Font Size, Font Color, Row Height

        table.setBackground(Color.LIGHT_GRAY);

        table.setForeground(Color.black);

        Font font = new Font("",1,22);

        table.setFont(font);

        table.setRowHeight(30);

        

        // create JTextFields

     
        textId = new JTextField();
        
        textFname = new JTextField();

        textLname = new JTextField();

        textAge = new JTextField();

        

        // create JButtons

        btnAdd = new JButton("Add");
        btnAdd.setBackground(new Color(50, 205, 50));

        btnDelete = new JButton("Delete");
        btnDelete.setBackground(new Color(50, 205, 50));

        btnUpdate = new JButton("Update");     
        btnUpdate.setBackground(new Color(50, 205, 50));
        btnUpdate.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent arg0) {
        		
        		     				
        				try {
        					
        					
        					Class.forName("com.mysql.cj.jdbc.Driver");
        					Connection con = DriverManager.getConnection("jdbc:mysql://35.226.84.132:3306/EMR?user=root&password=password\";\r\n" + 
        							"    			connection", "root", "password");
        					
        					
        					 String Id =textId.getText();
        					 String FirstName =textFname.getText();
        					 String LastName =textLname.getText();
        					 String Age =textAge.getText();
        					
        					
        				String sql = "UPDATE DEPART SET textId = '"+textId+"',  textFname = '"+textFname+"', textLname = '"+textLname+"', textAge = '"+textAge+"', " + "'";
        								
        					PreparedStatement stmt1 = con.prepareStatement(sql);
        						PreparedStatement stmt = con.prepareStatement(sql);
        						stmt.executeUpdate(sql);
        						
                           JOptionPane.showMessageDialog(null,"Information Saved");				

        				} 
        				catch(Exception e) {System.out.print(e);}
        			}
        		});
        				
  
        

        textId.setBounds(176, 220, 159, 25);

        textFname.setBounds(455, 220, 399, 25);

        textLname.setBounds(176, 256, 159, 25);

        textAge.setBounds(455, 256, 399, 25);

        

        btnAdd.setBounds(534, 325, 100, 25);

        btnUpdate.setBounds(644, 325, 100, 25);

        btnDelete.setBounds(754, 325, 100, 25);

        

        // create JScrollPane

        pane = new JScrollPane(table);

        pane.setBounds(0, 56, 880, 144);

        

        frmDepartProcess.getContentPane().setLayout(null);

        

        frmDepartProcess.getContentPane().add(pane);

        

        // add JTextFields to the jframe

        frmDepartProcess.getContentPane().add(textId);

        frmDepartProcess.getContentPane().add(textFname);

        frmDepartProcess.getContentPane().add(textLname);

        frmDepartProcess.getContentPane().add(textAge);

    

        // add JButtons to the jframe

        frmDepartProcess.getContentPane().add(btnAdd);

        frmDepartProcess.getContentPane().add(btnDelete);

        frmDepartProcess.getContentPane().add(btnUpdate);
        
        lblNewLabel = new JLabel("Problem");
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
        lblNewLabel.setBounds(40, 16, 165, 34);
        frmDepartProcess.getContentPane().add(lblNewLabel);
        
        lblNewLabel_1 = new JLabel("Diagnosis");
        lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
        lblNewLabel_1.setBounds(632, 21, 128, 24);
        frmDepartProcess.getContentPane().add(lblNewLabel_1);
        
        lblProblemCodeInput = new JLabel("Patient ID");
        lblProblemCodeInput.setBounds(10, 225, 156, 14);
        frmDepartProcess.getContentPane().add(lblProblemCodeInput);
        
        lblProblemDetail = new JLabel("Problem Detail");
        lblProblemDetail.setBounds(358, 225, 100, 14);
        frmDepartProcess.getContentPane().add(lblProblemDetail);
        
        lblDiagnosisCodeInput = new JLabel("Problem & Diagnosis Code");
        lblDiagnosisCodeInput.setBounds(10, 262, 165, 14);
        frmDepartProcess.getContentPane().add(lblDiagnosisCodeInput);
        
        lblDiagnosisDetail = new JLabel("Diagnosis Detail");
        lblDiagnosisDetail.setBounds(358, 261, 149, 14);
        frmDepartProcess.getContentPane().add(lblDiagnosisDetail);

        

        // create an array of objects to set the row data

        final Object[] row = new Object[4];

        

        // button add row

        btnAdd.addActionListener(new ActionListener(){




            @Override

            public void actionPerformed(ActionEvent e) {

             

            	row[0] = textId.getText();

            	row[1] = textFname.getText();

                row[2] = textLname.getText();

                row[3] = textAge.getText();

                

                // add row to the model

                model.addRow(row);

            }

        });

        

        // button remove row

        btnDelete.addActionListener(new ActionListener(){




            @Override

            public void actionPerformed(ActionEvent e) {

            

                // i = the index of the selected row

                int i = table.getSelectedRow();

                if(i >= 0){

                    // remove a row from jtable

                    model.removeRow(i);

                }

                else{

                    System.out.println("Delete Error");

                }

            }

        });

        

        // get selected row data From table to textfields 

        table.addMouseListener(new MouseAdapter(){

        

        @Override

        public void mouseClicked(MouseEvent e){

            

            // i = the index of the selected row

            int i = table.getSelectedRow();

            

            textId.setText(model.getValueAt(i, 0).toString());

            textFname.setText(model.getValueAt(i, 1).toString());

            textLname.setText(model.getValueAt(i, 2).toString());

            textAge.setText(model.getValueAt(i, 3).toString());

        }

        });

        

        // button update row

        btnUpdate.addActionListener(new ActionListener(){




            @Override

            public void actionPerformed(ActionEvent e) {

             

                // i = the index of the selected row

                int i = table.getSelectedRow();

                

                if(i >= 0) 

                {

                   model.setValueAt(textId.getText(), i, 0);

                   model.setValueAt(textFname.getText(), i, 1);

                   model.setValueAt(textLname.getText(), i, 2);

                   model.setValueAt(textAge.getText(), i, 3);

                }

                else{

                    System.out.println("Update Error");

                }

            }

        });

        

        frmDepartProcess.setSize(900,400);

        frmDepartProcess.setLocationRelativeTo(null);

        frmDepartProcess.setVisible(true);

        

    }

	public TableModel getModel() {
		return table.getModel();
	}
	public void setModel(TableModel model_1) {
		table.setModel(model_1);
	}
	public TableModel getTableModel() {
		return table.getModel();
	}
	public void setTableModel(TableModel model_2) {
		table.setModel(model_2);
	}
}

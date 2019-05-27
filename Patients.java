package Registration.src.Driver;


import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Patients extends JFrame 
{
	JTable jt;
	
	String [] column_headers = {"Patient ID", "First Name", "Last Name", "Date of Birth"};
	String [][] patient_data = {{"01", "Joshua", "Chambers", "01/12/1989"},{"02", "John", "Smith", "02/12/1999"},{"03", "Jerry", "Dollar", "05/12/1965"}};
	
	public Patients()
	{
		jt=new JTable(patient_data, column_headers);
		jt.setBounds(50,50,200,230);
		JScrollPane js= new JScrollPane(jt);
		this.add(js);
		this.setSize(300,400);
		this.setVisible(true);
		
	}
	
	public static void main(String[] args)
	{
		new Patients();
	}

}

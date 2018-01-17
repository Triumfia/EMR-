import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JTabbedPane;
import javax.swing.JInternalFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import java.awt.Panel;
import javax.swing.JEditorPane;
import javax.swing.JList;


public class EMR {

   private JFrame frame;
   private final JLabel lblNewLabel = new JLabel("ELECTRONIC MEDICAL RECORD");
   private JTextField txtPatientNameMrn;

   /**
    * Launch the application.
    */
   public static void main(String[] args) {
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
               EMR window = new EMR();
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
   public EMR() {
      initialize();
   }

   /**
    * Initialize the contents of the frame.
    */
   private void initialize() {
      frame = new JFrame();
      frame.setBounds(0, 0, 1195, 679);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.getContentPane().setLayout(null);
      lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 35));
      lblNewLabel.setBounds(10, 0, 697, 35);
      frame.getContentPane().add(lblNewLabel);
      
      // column tab
      JPanel panel_2 = new JPanel();
      panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
      panel_2.setBounds(15, 86, 153, 900);
      frame.getContentPane().add(panel_2);   
      
            
      JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
      tabbedPane_1.setBounds(173, 67, 1735, 920);
      frame.getContentPane().add(tabbedPane_1);
      
      // Row tab
      JButton btnNewButton = new JButton("");
      tabbedPane_1.addTab("Visit History", null, btnNewButton, null);
      

      
   }
}

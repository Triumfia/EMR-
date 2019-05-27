package org.eclipse.wb.swt;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.io.FileFilter;
import java.util.Scanner;
import javax.swing.GroupLayout.Alignment;

/**
 * @author s1gma
 */
public class AddHocNote extends JFrame implements ActionListener {
    private JTextArea txt = new JTextArea(); 

    private JMenuBar newMenubar() {
        JMenuBar menubar = new JMenuBar(); 
        String[] titles = {"File"};   
        String[][] elements = {{"Open", "Save"}};  
        for(int i = 0; i < titles.length; i++) { 
            String title = titles[i];
            String[] elems = elements[i];
            menubar.add(newMenu(title, elems)); 

        }
        return menubar;
    }

    /**
     *
     * @param title The title like "File"
     * @param elements  The elements like "Load", "Save"
     * @return  returns the JMenu that you make o
     */
    private JMenu newMenu(String title, String[] elements) {
        JMenu menu = new JMenu(title);
        for(String element : elements) {
            JMenuItem menuitem = new JMenuItem(element);
            menu.add(menuitem); 
            menuitem.addActionListener(this);
        }
        return menu;
    }

    AddHocNote() {
        setTitle("Physician Note AddHoc");  
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());  //basically gives it the system themeik
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
        setSize(800, 600); 
        setJMenuBar(newMenubar());
        JScrollPane scroller = new JScrollPane(txt);
        GroupLayout groupLayout = new GroupLayout(getContentPane());
        groupLayout.setHorizontalGroup(
        	groupLayout.createParallelGroup(Alignment.LEADING)
        		.addComponent(scroller, GroupLayout.PREFERRED_SIZE, 784, GroupLayout.PREFERRED_SIZE)
        );
        groupLayout.setVerticalGroup(
        	groupLayout.createParallelGroup(Alignment.LEADING)
        		.addComponent(scroller, GroupLayout.PREFERRED_SIZE, 540, GroupLayout.PREFERRED_SIZE)
        );
        getContentPane().setLayout(groupLayout);
   
    }

    public static void main(String[] args) {
        new AddHocNote().setVisible(true);
    }

    public void actionPerformed(ActionEvent actionEvent) {
        String cmd = actionEvent.getActionCommand(); 
        if(cmd.equals("Save")) { // If the button pressed has the text "Save" on it do something inside.
       
            JFileChooser chooser = new JFileChooser(); // sets up the file choosing dialog. 
            int option = chooser.showSaveDialog(this); // Shows the save dialog and is the option for what you've clicked
            if(option == JFileChooser.APPROVE_OPTION) {   //if you've pressed the ok or save button or w/e do something ok
          
                try {
                    BufferedWriter buf = new BufferedWriter(new FileWriter(chooser.getSelectedFile().getAbsolutePath()));
                    buf.write(txt.getText()); // basically this gets the text in the text area and writes it to the file
                    setTitle(chooser.getSelectedFile().getName()); 
                    buf.close(); // closes the stream for memory purposesk, now we can run it
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } else if(cmd.equals("Open")) {
            JFileChooser chooser = new JFileChooser(); 
            chooser.setFileFilter(new Filter());
            int option = chooser.showOpenDialog(this); 
            if(option == JFileChooser.APPROVE_OPTION) {
                try {
                    Scanner scanner = new Scanner(chooser.getSelectedFile()); // gets the selected file from chooser
                    while(scanner.hasNext()) { // When the scanner still has stuff to read, do something
                        String data = scanner.nextLine(); // Read lines inside the scanner
                        txt.setText(data); // Puts the data it read from the file into the text area.
                    }
                    setTitle(chooser.getSelectedFile().getName());
                    scanner.close();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    
    class Filter extends javax.swing.filechooser.FileFilter implements FileFilter {

        public boolean accept(File file) {
            return file.getName().endsWith(".txt") || file.getName().endsWith(".java");
        }

        @Override
        public String getDescription() {
            return "Text File (.txt)";  
        }                                              
    }
}

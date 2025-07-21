import java.util.*;

import javax.swing.JComboBox;
import javax.swing.JFrame;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Main extends JFrame implements ActionListener
{
    JComboBox box;
    Main()
    {
        // Use the warper class for the JCombo box
        String arr[]={"Home","Personal_details","Achievements","Goal"};
        box=new JComboBox(arr);
        box.addActionListener(this);

        // box.setEditable(true);
        //box.addItem("salary");
       //System.out.print(box.getItemCount());
       // box.insertItemAt("Skills",3);
        //box.setSelectedIndex(0);

        //box.removeItem("Goal");
        box.removeItemAt(3);

        this.setLayout(new FlowLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(box);
        this.setVisible(true);
        this.pack();
    }
    public static void main(String args[])
    {
        new Main();
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource()==box)
        {
            System.out.println(box.getSelectedIndex());
        }
    }
    
}

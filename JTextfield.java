import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashSet;
import java.util.Set;

import javax.swing.JTextField;

public class JTextfield extends JFrame implements ActionListener
{
    JButton button1;JTextField j;
    JButton button2;
    Set<String> S;
    JCheckBox box1;
    JTextfield()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);

        S=new HashSet<>();

        j=new JTextField();
        j.setBounds(50,50,250,80);
        j.setBackground(Color.white);
        j.setFont(new Font("Comic Sans",Font.BOLD,24));
        j.setForeground(Color.DARK_GRAY);
        j.setCaretColor(Color.BLACK);

        button1 =new JButton("submit");
        button1.setBounds(40,180,100,30);
        button1.setFocusable(false);
        button1.addActionListener(this);

        button2 =new JButton("clear");
        button2.setBounds(200,180,100,30);
        button2.setFocusable(false);
        button2.addActionListener(this);

        box1=new JCheckBox("I am not a Robot");
        box1.setBounds(100,250,500,30);
        box1.setFont(new Font("Consolas",Font.BOLD,15));
        box1.setFocusable(false);

        
        this.add(j);
        this.add(button1);
        this.add(button2);
        this.add(box1);
        this.setSize(500,500);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button2)
        {
            j.setText("");
        }
        else if(e.getSource()==button1 && box1.isSelected())
        {
            String name=j.getText().trim();


            if(name.isEmpty())
            {
                JOptionPane.showMessageDialog(this,"please enter the name","alert",JOptionPane.ERROR_MESSAGE);
            }

            else if(!S.contains(name))
            {
                S.add(name);
                System.out.println("Welcome  "+name);
            }
            else
            {
                JOptionPane.showMessageDialog(this,"This user name is already exists","warning",JOptionPane.ERROR_MESSAGE);
            }
        }
        else
        {
            JOptionPane.showMessageDialog(this,"please verify your are not a robot","warning",JOptionPane.ERROR_MESSAGE);
        }
    }
    public static void main(String args[])
    {
        new JTextfield();
    }

}

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Dimension;
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

    JTextfield()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);

        S=new HashSet<>();

        j=new JTextField();
        j.setPreferredSize(new Dimension(50,40));
        j.setBounds(50,50,250,80);
        j.setBackground(Color.white);
        j.setFont(new Font("Comic Sans",Font.BOLD,24));
        j.setForeground(Color.DARK_GRAY);
        j.setCaretColor(Color.BLACK);
        j.setText("Click clear");


        button1 =new JButton("submit");
        button1.setBounds(40,180,100,30);
        button1.setFocusable(false);
        button1.addActionListener(this);

        button2 =new JButton("clear");
        button2.setBounds(200,180,100,30);
        button2.setFocusable(false);
        button2.addActionListener(this);

        
        this.add(j);
        this.add(button1);
        this.add(button2);
        this.setSize(500,500);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button2)
        {
            j.setText("");
        }
        else if(e.getSource()==button1)
        {
            String name=j.getText().trim();


            if(name.isEmpty())
            {
                JOptionPane.showMessageDialog(this,"please enter the name","alert",JOptionPane.ERROR_MESSAGE);
            }

            if(!S.contains(name))
            {
                S.add(name);
                System.out.println("Welcome  "+name);
            }
            else
            {
                JOptionPane.showMessageDialog(this,"This user name is already exists","warning",JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    public static void main(String args[])
    {
        new JTextfield();
    }

}

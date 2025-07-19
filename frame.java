import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class demo extends JFrame implements ActionListener
{
    JLabel label;
    JButton button1;
    JButton button2;
    demo()
    {

        this.setLayout(new BorderLayout(10,10));


       JPanel p1=new JPanel();
       JPanel p2=new JPanel();
       JPanel p3=new JPanel();
       JPanel p4=new JPanel();
       JPanel p5=new JPanel();

        p1.setBackground(Color.LIGHT_GRAY);
        p2.setBackground(Color.DARK_GRAY);
        p3.setBackground(Color.BLACK);
        p4.setBackground(Color.GRAY);
        p5.setBackground(Color.WHITE);

        p5.setLayout(new BorderLayout());


        p1.setPreferredSize(new Dimension(100,100));
        p2.setPreferredSize(new Dimension(100,100));
        p3.setPreferredSize(new Dimension(100,100));
        p4.setPreferredSize(new Dimension(100,100));
        p5.setPreferredSize(new Dimension(100,100));
        

        

        

        label=new JLabel("It's me Vicky");
        label.setFont(new Font("Arial",Font.ITALIC,90));
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVisible(false);

        JPanel but1=new JPanel();
        but1.setBackground(Color.WHITE);

        JPanel but2=new JPanel();
        but1.setBackground(Color.WHITE);
        

        button1 =new JButton("VIEW");
        button1.setPreferredSize(new Dimension(100,50));
        button1.setFocusable(false);
        button1.addActionListener(this);

        button2 =new JButton("HIDE");
        button2.setPreferredSize(new Dimension(100,50));
        button2.setFocusable(false);
        button2.addActionListener(this);

        but1.add(button1);
        but2.add(button2);

        

        p5.add(label,BorderLayout.CENTER);
        p5.add(but1,BorderLayout.WEST);
        p5.add(but2,BorderLayout.EAST);





        this.add(p1,BorderLayout.NORTH);
        this.add(p2,BorderLayout.SOUTH);
        this.add(p3,BorderLayout.WEST);
        this.add(p4,BorderLayout.EAST);
        this.add(p5,BorderLayout.CENTER);
        


        this.setTitle("new window");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==button1)
       {
            label.setVisible(true);
       }
       else if(e.getSource()==button2)
       {
            label.setVisible(false);
       }
    }

}
    

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

public class Jlayout 
{
    public static void main(String a[])
    {
        JLabel label1=new JLabel();
        label1.setOpaque(true);
        label1.setBackground(Color.BLUE);
        label1.setBounds(50,50,200,200);

        JLabel label2=new JLabel();
        label2.setOpaque(true);
        label2.setBackground(Color.green);
        label2.setBounds(100,100,200,200);

        JLabel label3=new JLabel();
        label3.setOpaque(true);
        label3.setBackground(Color.ORANGE);
        label3.setBounds(200,200,200,200);

        JLayeredPane  LL=new JLayeredPane();
        LL.setBounds(0,0,500,500);
        LL.add(label1,Integer.valueOf(0));
        LL.add(label2,Integer.valueOf(2));
        LL.add(label3,Integer.valueOf(1));

        JFrame frame=new JFrame();
        frame.setTitle("new one");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.add(LL);

    }    
}

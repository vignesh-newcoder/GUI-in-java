import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class window 
{
    JFrame frame=new JFrame();
    JLabel label=new JLabel("Hello !.......");
    window()
    {
        label.setBounds(0,0,100,50);
        label.setFont(new Font(null,Font.PLAIN,25));
        frame.add(label);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(400,400);
        frame.setVisible(true);
    }
}

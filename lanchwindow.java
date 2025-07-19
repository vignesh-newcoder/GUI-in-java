import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class lanch implements ActionListener
{
    JFrame frame=new JFrame();
    JButton button=new JButton("New Window");
    lanch()
    {
        button.setBounds(100,160,200,40);
        button.setFocusable(false);
        button.addActionListener(this);
        frame.add(button);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        frame.dispose();
        if(e.getSource()==button)
        {
           new window();
        }
    }
     public static void main(String args[])
    {
        new lanch();
    }    
}

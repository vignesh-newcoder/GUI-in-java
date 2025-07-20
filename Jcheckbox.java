import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame implements ActionListener
{
    JButton button;
    JCheckBox box;
    ImageIcon icon1;
    ImageIcon icon2;
    Main()
    {
        icon1=new ImageIcon("tick.png");
        icon2=new ImageIcon("cross.png");

        box=new JCheckBox();
        box.setText("I am not a Robot");
        box.setFocusable(false);
        box.setFont(new Font("Consolas",Font.PLAIN,30));
        box.setIcon(icon2);
        box.setSelectedIcon(icon1);

        button=new JButton("Submit");
        button.setFocusable(false);
        button.addActionListener(this);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setLayout(new FlowLayout());
        this.add(box);
        this.add(button);
        this.pack();
    }
    public static void main(String args[])
    {
        new Main();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(box.isSelected())
        {
            System.out.print("ok bye");
        }
    }
}

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class Main extends JFrame implements ActionListener
{
    JRadioButton good;
    JRadioButton very_good;
    JRadioButton Excellent;
    Main()
    {
        good=new JRadioButton("good");
        very_good=new JRadioButton("very_good");
        Excellent=new JRadioButton("Excellent");
        good.addActionListener(this);
        very_good.addActionListener(this);
        Excellent.addActionListener(this);

        ButtonGroup group=new ButtonGroup();
        group.add(good);
        group.add(very_good);
        group.add(Excellent);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setTitle("radio");
        this.setLayout(new FlowLayout());
        this.add(good);
        this.add(very_good);
        this.add(Excellent);
        this.pack();
    }

    public static void main(String args[])
    {
        new Main();
    }
    /*We can also add the image to the radios buttons */

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==good)
        {
            System.out.println("You are good level");
        }
        else if(e.getSource()==very_good)
        {
            System.out.println("You are at very_good level");
        }
        else
        {
            System.out.print("You are at Excellent level");
        }
    }
}

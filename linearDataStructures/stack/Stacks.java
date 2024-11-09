package linearDataStructures.stack;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;

import codes.CommonCodes;
import linearDataStructures.LinearDataStructures;
import linearDataStructures.stack.popop.Pop;
import linearDataStructures.stack.pushop.Push;

public class Stacks extends CommonCodes implements ActionListener {
    JButton backButton,pushButton, popButton;
    JLabel heading;
    public Stacks(String title)
    {
        super(title);
        backButton = CommonCodes.backButtonLayout();
        backButton.addActionListener(this);
        add(backButton);
        heading = headingLabelSetter("Stacks", 400, 10, 400, 50);
        add(heading);
        pushButton = CommonCodes.buttonLayout("Push",250,80,400,50,Color.GREEN,Color.MAGENTA, Font.SERIF,Font.BOLD,25);
        pushButton.addActionListener(this);
        add(pushButton);
        popButton = CommonCodes.buttonLayout("Pop",250,230,400,50,Color.GREEN,Color.MAGENTA, Font.SERIF,Font.BOLD,25);
        popButton.addActionListener(this);
        add(popButton);
    }
    public void actionPerformed(ActionEvent event) {
        if(event.getSource() == backButton){
            new LinearDataStructures("Data Structures/Linear Data Structures");
        }
        if(event.getSource() == pushButton){
            new Push("Data Structures/Linear Data Structures/Stacks/Push");
        }
        if(event.getSource() == popButton){
            new Pop("Data Structures/Linear Data Structures/Stacks/Pop");
        }
        dispose();
    }
}

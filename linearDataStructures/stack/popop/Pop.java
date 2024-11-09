package linearDataStructures.stack.popop;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

import codes.CommonCodes;
import linearDataStructures.stack.Stacks;

public class Pop extends CommonCodes implements ActionListener{
JButton backButton,quizButton;
    ImageIcon imageLabel;
    JLabel label,algorithmLabel,heading;
    public Pop(String title)
    {
        super(title);
        backButton = backButtonLayout();
        backButton.addActionListener(this);
        add(backButton);
        heading = headingLabelSetter("Pop Operation in Stacks", 350, 10, 400, 50);
        add(heading);
        String[] poppath = {"Images/Linear Data Structures/Stacks/Pop/1.png",
                        "Images/Linear Data Structures/Stacks/Pop/2.png",
                        "Images/Linear Data Structures/Stacks/Pop/3.png",
                        "Images/Linear Data Structures/Stacks/Pop/4.png",
                        "Images/Linear Data Structures/Stacks/Pop/5.png",
                        "Images/Linear Data Structures/Stacks/Pop/6.png",
                        "Images/Linear Data Structures/Stacks/Pop/7.png"};
        cancelTask();
        label = imageSlider(poppath, 300,80, 450,300);
        add(label);
        algorithmLabel = algorithmSetter("Images/Linear Data Structures/Stacks/Pop/algorithm.jpg", 250, 420, 550, 300);
        add(algorithmLabel);
        quizButton = quizButtonLayout();
        quizButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                quizZone("Pop");
            }
        });
        add(quizButton);
    }
    public void actionPerformed(ActionEvent event) {
        if(event.getSource() == backButton)
        {
            dispose();
            new Stacks("Data Structures/Linear Data Structures/Stacks");
        }
    }
    
}

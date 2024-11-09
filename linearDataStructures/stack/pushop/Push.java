package linearDataStructures.stack.pushop;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

import codes.CommonCodes;
import linearDataStructures.stack.Stacks;

public class Push extends CommonCodes implements ActionListener{
    JButton backButton,quizButton;
    ImageIcon imageLabel;
    JLabel label,algorithmLabel,heading;
    public Push(String title)
    {
        super(title);
        backButton = backButtonLayout();
        backButton.addActionListener(this);
        add(backButton);
        heading = headingLabelSetter("Push Operation in Stacks", 320, 10, 400, 50);
        add(heading);
        
        String[] pushpath = {"Images/Linear Data Structures/Stacks/Push/1.png",
                        "Images/Linear Data Structures/Stacks/Push/2.png",
                        "Images/Linear Data Structures/Stacks/Push/3.png",
                        "Images/Linear Data Structures/Stacks/Push/4.png",
                        "Images/Linear Data Structures/Stacks/Push/5.png",
                        "Images/Linear Data Structures/Stacks/Push/6.png",
                        "Images/Linear Data Structures/Stacks/Push/7.png"};
        cancelTask();
        label = imageSlider(pushpath, 300,80, 450,300);
        add(label);
        algorithmLabel = algorithmSetter("Images/Linear Data Structures/Stacks/Push/algorithm1.jpg", 270, 400, 500, 300);
        add(algorithmLabel);

        quizButton = quizButtonLayout();
        quizButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                quizZone("Push");
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

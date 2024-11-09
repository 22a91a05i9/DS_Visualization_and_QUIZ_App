package linearDataStructures.linkedlists.singleLinkedLists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

import codes.CommonCodes;

public class DeleteAtPosition  extends CommonCodes implements ActionListener {
    JButton backButton,quizButton;
    ImageIcon imageLabel;
    JLabel label,algorithmLabel;
    public DeleteAtPosition(String title)
    {
        super(title);
        backButton = backButtonLayout();
        backButton.addActionListener(this);
        add(backButton);
        JLabel heading = headingLabelSetter("Delete At Position Operation", 280, 10, 450, 50);
        add(heading);
        String[] path = {"Images/Linear Data Structures/Linked Lists/Single LL/Delete At Position/1.png",
                        "Images/Linear Data Structures/Linked Lists/Single LL/Delete At Position/2.png",
                        "Images/Linear Data Structures/Linked Lists/Single LL/Delete At Position/3.png",
                        "Images/Linear Data Structures/Linked Lists/Single LL/Delete At Position/4.png"};
        cancelTask();
        label = imageSlider(path, 100,100, 650,200);
        add(label);
        algorithmLabel = algorithmSetter("Images/Linear Data Structures/Linked Lists/Single LL/Delete At Position/Algorithm.png", 150, 300, 650, 500);
        add(algorithmLabel);
        quizButton = quizButtonLayout();
        quizButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                quizZone("SLDeletePosition");
            }
        });
        add(quizButton);
    }
    public void actionPerformed(ActionEvent event) {
        if(event.getSource() == backButton){
            new SingleLinkedLists("Data Structures/Linear Data Structures/Linked Lists/Single Linked Lists");
        }  
        dispose();
    }
}


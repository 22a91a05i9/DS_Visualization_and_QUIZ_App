package linearDataStructures.linkedlists.singleLinkedLists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

import codes.CommonCodes;

public class DeleteAtTail extends CommonCodes implements ActionListener {
    JButton backButton,quizButton;
    ImageIcon imageLabel;
    JLabel label,algorithmLabel;
    public DeleteAtTail(String title)
    {
        super(title);
        backButton = backButtonLayout();
        backButton.addActionListener(this);
        add(backButton);
        JLabel heading = headingLabelSetter("Delete At Tail Operation", 280, 10, 450, 50);
        add(heading);
        String[] path = {"Images/Linear Data Structures/Linked Lists/Single LL/Delete At Tail/1.png",
                        "Images/Linear Data Structures/Linked Lists/Single LL/Delete At Tail/2.png",
                        "Images/Linear Data Structures/Linked Lists/Single LL/Delete At Tail/3.png",
                        "Images/Linear Data Structures/Linked Lists/Single LL/Delete At Tail/4.png"};
        cancelTask();
        label = imageSlider(path, 100,100, 650,200);
        add(label);
        algorithmLabel = algorithmSetter("Images/Linear Data Structures/Linked Lists/Single LL/Delete At Tail/Algorithm.png", 150, 300, 650, 500);
        add(algorithmLabel);
        quizButton = quizButtonLayout();
        quizButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                quizZone("SLDeleteTail");
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

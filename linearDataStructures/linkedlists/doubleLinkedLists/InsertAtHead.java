package linearDataStructures.linkedlists.doubleLinkedLists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

import codes.CommonCodes;

public class InsertAtHead  extends CommonCodes implements ActionListener {
    JButton backButton,quizButton;
    ImageIcon imageLabel;
    JLabel label,algorithmLabel;
    public InsertAtHead(String title)
    {
        super(title);
        backButton = backButtonLayout();
        backButton.addActionListener(this);
        add(backButton);
        JLabel heading = headingLabelSetter("Insert At Head Operation", 280, 10, 450, 50);
        add(heading);
        String[] path = {"Images/Linear Data Structures/Linked Lists/Double LL/Insert At Head/9.png",
                        "Images/Linear Data Structures/Linked Lists/Double LL/Insert At Head/10.png",
                        "Images/Linear Data Structures/Linked Lists/Double LL/Insert At Head/11.png",
                        "Images/Linear Data Structures/Linked Lists/Double LL/Insert At Head/12.png"};
        cancelTask();
        label = imageSlider(path, 100,100, 750,200);
        add(label);
        algorithmLabel = algorithmSetter("Images/Linear Data Structures/Linked Lists/Double LL/Insert At Head/Algorithm.png", 150, 300, 750, 500);
        add(algorithmLabel);
        quizButton = quizButtonLayout();
        quizButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                quizZone("DLInsertHead");
            }
        });
        add(quizButton);
    }
    public void actionPerformed(ActionEvent event) {
        if(event.getSource() == backButton){
            new DoubleLinkedLists("Data Structures/Linear Data Structures/Linked Lists/Double Linked Lists");
        }  
        dispose();
    }
}

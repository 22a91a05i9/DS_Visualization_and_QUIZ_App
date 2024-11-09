package sortingAlgorithms.Bubble;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;

import codes.CommonCodes;
import sortingAlgorithms.Sorting;

public class BubbleSort extends CommonCodes implements ActionListener{
    JButton backButton,quizButton;
    JLabel label,algorithmLabel;
    public BubbleSort(String title)
    {
        super(title);
        backButton = backButtonLayout();
        backButton.addActionListener(this);
        add(backButton);
        JLabel heading = headingLabelSetter("Bubble Sort", 420, 10, 400, 50);
        add(heading);
        
        label = algorithmSetter("Images/Sorting/Bubble Sort/Working.gif", 295,70, 750,200);
        add(label);
        algorithmLabel = algorithmSetter("Images/Sorting/Bubble Sort/Algorithm.jpg", 150, 300, 750, 400);
        add(algorithmLabel);
        quizButton = quizButtonLayout();
        quizButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                quizZone("BubbleSort");
            }
        });
        add(quizButton);
    }

    public void actionPerformed(ActionEvent event) {
        if(event.getSource() == backButton)
        {
            new Sorting("Data Structures/Sorting");
        }
        dispose();
    }
    
}

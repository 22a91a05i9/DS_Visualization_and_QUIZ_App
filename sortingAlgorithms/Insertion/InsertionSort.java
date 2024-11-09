package sortingAlgorithms.Insertion;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;

import codes.CommonCodes;
import sortingAlgorithms.Sorting;

public class InsertionSort extends CommonCodes implements ActionListener{
    JButton backButton,quizButton;
    JLabel label,algorithmLabel;
    public InsertionSort(String title)
    {
        super(title);
        backButton = backButtonLayout();
        backButton.addActionListener(this);
        add(backButton);
        JLabel heading = headingLabelSetter("Insertion Sort", 380, 10, 400, 50);
        add(heading);
        
        label = algorithmSetter("Images/Sorting/Insertion Sort/Working1.gif", 300,80, 750,230);
        add(label);
        algorithmLabel = algorithmSetter("Images/Sorting/Insertion Sort/Algorithm.jpg", 160, 300, 750, 420);
        add(algorithmLabel);
        quizButton = quizButtonLayout();
        quizButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                quizZone("InsertionSort");
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

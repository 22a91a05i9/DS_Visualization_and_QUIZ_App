package sortingAlgorithms.Selection;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;

import codes.CommonCodes;
import sortingAlgorithms.Sorting;

public class SelectionSort extends CommonCodes implements ActionListener{
    JButton backButton,quizButton;
    JLabel label,algorithmLabel;
    public SelectionSort(String title)
    {
        super(title);
        backButton = backButtonLayout();
        backButton.addActionListener(this);
        add(backButton);
        JLabel heading = headingLabelSetter("Selection Sort", 400, 10, 400, 50);
        add(heading);
        
        label = algorithmSetter("Images/Sorting/Selection Sort/working2.gif",310,50, 750,250);
        add(label);
        algorithmLabel = algorithmSetter("Images/Sorting/Selection Sort/Algorithm.jpg", 40, 250, 900, 500);
        add(algorithmLabel);
        quizButton = quizButtonLayout();
        quizButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                quizZone("SelectionSort");
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

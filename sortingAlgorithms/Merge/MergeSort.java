package sortingAlgorithms.Merge;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;

import codes.CommonCodes;
import sortingAlgorithms.Sorting;

public class MergeSort extends CommonCodes implements ActionListener{
    JButton backButton,quizButton;
    JLabel label,algorithmLabel,mergeLabel;
    public MergeSort(String title)
    {
        super(title);
        backButton = backButtonLayout();
        backButton.addActionListener(this);
        add(backButton);
        JLabel heading = headingLabelSetter("Merge Sort", 330, 10, 400, 50);
        add(heading);
        
        label = algorithmSetter("Images/Sorting/Merge Sort/working.gif", 100,50, 500,500);
        add(label);
        mergeLabel = algorithmSetter("Images/Sorting/Merge Sort/merge.jpg", 450, 250, 500, 500);
        add(mergeLabel);
        algorithmLabel = algorithmSetter("Images/Sorting/Merge Sort/mergesort.jpg", 500, 80, 400, 150);
        add(algorithmLabel);
        quizButton = quizButtonLayout();
        quizButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                quizZone("MergeSort");
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

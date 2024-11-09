package sortingAlgorithms.Radix;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;

import codes.CommonCodes;
import sortingAlgorithms.Sorting;

public class RadixSort extends CommonCodes implements ActionListener {
    JButton backButton,quizButton;
    JLabel label,algorithmLabel;
    public RadixSort(String title)
    {
        super(title);
        backButton = backButtonLayout();
        backButton.addActionListener(this);
        add(backButton);
        JLabel heading = headingLabelSetter("Radix Sort", 400, 10, 400, 50);
        add(heading);
        
        label = algorithmSetter("Images/Sorting/Radix Sort/Working1.gif", 280,80, 750,250);
        add(label);
        algorithmLabel = algorithmSetter("Images/Sorting/Radix Sort/algorithm.jpg", 110, 300, 750, 500);
        add(algorithmLabel);
        quizButton = quizButtonLayout();
        quizButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                quizZone("RadixSort");
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

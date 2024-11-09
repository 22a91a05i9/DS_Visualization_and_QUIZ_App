package sortingAlgorithms.Quick;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;

import codes.CommonCodes;
import sortingAlgorithms.Sorting;

public class QuickSort extends CommonCodes implements ActionListener {
    JButton backButton,quizButton;
    JLabel label,algorithmLabel,partionLabel;
    public QuickSort(String title)
    {
        super(title);
        backButton = backButtonLayout();
        backButton.addActionListener(this);
        add(backButton);
        JLabel heading = headingLabelSetter("Quick Sort", 330, 10, 400, 50);
        add(heading);
        
        label = algorithmSetter("Images/Sorting/Quick Sort/Working1.gif", 80,50, 750,200);
        add(label);
        algorithmLabel = algorithmSetter("Images/Sorting/Quick Sort/quicksort.jpg" , 450, 50, 750, 200);
        add(algorithmLabel);
        partionLabel = algorithmSetter("Images/Sorting/Quick Sort/partition.jpg", 150, 170, 900,670);
        add(partionLabel);
        quizButton = quizButtonLayout();
        quizButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                quizZone("QuickSort");
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

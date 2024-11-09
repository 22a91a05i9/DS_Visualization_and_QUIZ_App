package searchingAlgorithms.BinarySearching;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;

import codes.CommonCodes;
import searchingAlgorithms.Searching;

public class BinarySearch extends CommonCodes implements ActionListener{
    JButton backButton,quizButton;
    JLabel label,algorithmLabel;
    public BinarySearch(String title)
    {
        super(title);
        backButton = backButtonLayout();
        backButton.addActionListener(this);
        add(backButton);
        JLabel heading = headingLabelSetter("Binary Search", 350, 10, 400, 50);
        add(heading);
        
        label = algorithmSetter("Images/Searching/BinarySearch/binary-search-small.gif", 100,100, 750,200);
        add(label);
        algorithmLabel = algorithmSetter("Images/Searching/BinarySearch/algorithm.png", 150, 300, 750, 500);
        add(algorithmLabel);
        quizButton = quizButtonLayout();
        quizButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                quizZone("BinarySearch");
            }
        });
        add(quizButton);
    }
    public void actionPerformed(ActionEvent event) {
        if(event.getSource() == backButton){
            new Searching("Data Structures/Searching");
        }  
        dispose();
    }
}

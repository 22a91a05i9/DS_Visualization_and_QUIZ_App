package searchingAlgorithms;


import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;

import codes.CommonCodes;
import codes.DataStructures;
import searchingAlgorithms.BinarySearching.BinarySearch;
import searchingAlgorithms.LinearSearching.LinearSearch;

public class Searching extends CommonCodes implements ActionListener {
    JButton backButton,linearSearchButton, binarySearchButton;
    JLabel heading;
    public Searching(String title)
    {
        super(title);
        backButton = backButtonLayout();
        backButton.addActionListener(this);
        add(backButton);
        heading = headingLabelSetter("Searching Algorithms", 310, 10, 400, 50);
        add(heading);
        linearSearchButton = buttonLayout("Linear Search",250,80,400,50,Color.YELLOW,Color.RED, Font.SERIF,Font.BOLD,25);
        linearSearchButton.addActionListener(this);
        add(linearSearchButton);
        binarySearchButton = buttonLayout("Binary Search",250,230,400,50,Color.YELLOW,Color.RED, Font.SERIF,Font.BOLD,25);
        binarySearchButton.addActionListener(this);
        add(binarySearchButton);
    }
    public void actionPerformed(ActionEvent event) {
        if(event.getSource() == backButton){
            new DataStructures("Data Structures");
        }
        if(event.getSource() == linearSearchButton){
            new LinearSearch("Data Structures/Searching/Linear Search");
        }
        if(event.getSource() == binarySearchButton){
            new BinarySearch("Data Structures/Searching/Binary Search");
        }
        dispose();
    }
}

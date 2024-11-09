package treesAndGraphs.binaryTrees.binarySearchTrees;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;

import codes.CommonCodes;

public class SearchOperation extends CommonCodes implements ActionListener{
    JButton backButton,quizButton;
    JLabel workingLabel,algorithmLabel;
    public SearchOperation(String title)
    {
        super(title);
        backButton = backButtonLayout();
        backButton.addActionListener(this);
        add(backButton);
        JLabel heading = headingLabelSetter("Search Operation", 350, 10, 400, 50);
        add(heading);
        
        workingLabel = algorithmSetter("Images/Trees and Graphs/Trees/Binary Trees/Binary Search Trees/Search/BST Search.gif", 250,60, 450,250);
        add(workingLabel);
        algorithmLabel = algorithmSetter("Images/Trees and Graphs/Trees/Binary Trees/Binary Search Trees/Search/Algorithm.jpg", 200, 300, 650, 350);
        add(algorithmLabel);
        quizButton = quizButtonLayout();
        quizButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                quizZone("BSTSearch");
            }
        });
        add(quizButton);
    }
    public void actionPerformed(ActionEvent event) {
        if(event.getSource() == backButton){
            new BinarySearchTree("Data Structures/Trees and Graphs/Binary Trees/Binary Search Trees");
        }  
        dispose();
    }
}

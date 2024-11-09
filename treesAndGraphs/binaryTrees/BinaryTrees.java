package treesAndGraphs.binaryTrees;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;

import codes.CommonCodes;
import treesAndGraphs.TreesAndGraphs;
import treesAndGraphs.binaryTrees.binarySearchTrees.BinarySearchTree;
import treesAndGraphs.binaryTrees.traversals.Traversals;

public class BinaryTrees extends CommonCodes implements ActionListener {
    JButton backButton,traversalsButton, binarySearchTreeButton;
    JLabel heading;
    public BinaryTrees(String title)
    {
        super(title);
        backButton = backButtonLayout();
        backButton.addActionListener(this);
        add(backButton);
        heading = headingLabelSetter("Binary Trees", 360, 10, 400, 50);
        add(heading);
        traversalsButton = buttonLayout("Traversals",250,80,400,50,Color.YELLOW,Color.RED, Font.SERIF,Font.BOLD,25);
        traversalsButton.addActionListener(this);
        add(traversalsButton);
        binarySearchTreeButton = buttonLayout("Binary Search Trees",250,230,400,50,Color.YELLOW,Color.RED, Font.SERIF,Font.BOLD,25);
        binarySearchTreeButton.addActionListener(this);
        add(binarySearchTreeButton);
    }
    public void actionPerformed(ActionEvent event) {
        if(event.getSource() == backButton){
            new TreesAndGraphs("Data Structures/Trees and Graphs");
        }
        if(event.getSource() == traversalsButton){
            new Traversals("Data Structures/Trees and Graphs/Binary Trees/Traversals");
        }
        if(event.getSource() == binarySearchTreeButton){
            new BinarySearchTree("Data Structures/Trees and Graphs/Binary Trees/Binary Search Trees");
        }
        dispose();
    }
}

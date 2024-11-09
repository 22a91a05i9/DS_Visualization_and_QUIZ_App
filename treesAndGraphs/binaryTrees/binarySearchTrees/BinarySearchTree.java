package treesAndGraphs.binaryTrees.binarySearchTrees;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;


import codes.CommonCodes;
import treesAndGraphs.binaryTrees.BinaryTrees;

public class BinarySearchTree extends CommonCodes implements ActionListener {
    JButton backButton,searchButton, deleteButton, insertButton;
    JLabel heading;
    public BinarySearchTree(String title)
    {
        super(title);
        backButton = backButtonLayout();
        backButton.addActionListener(this);
        add(backButton);
        heading = headingLabelSetter("Binary Search Trees", 290, 10, 400, 50);
        add(heading);
        searchButton = buttonLayout("Search Operation",250,80,400,50,Color.GREEN,Color.MAGENTA, Font.SERIF,Font.BOLD,25);
        searchButton.addActionListener(this);
        add(searchButton);
        insertButton = buttonLayout("Insert Operation",250,230,400,50,Color.GREEN,Color.MAGENTA, Font.SERIF,Font.BOLD,25);
        insertButton.addActionListener(this);
        add(insertButton);
        deleteButton = buttonLayout("Delete Operation",250,380,400,50,Color.GREEN,Color.MAGENTA, Font.SERIF,Font.BOLD,25);
        deleteButton.addActionListener(this);
        add(deleteButton);
    }
    public void actionPerformed(ActionEvent event) {
        if(event.getSource() == backButton){
            new BinaryTrees("Data Structures/Trees and Graphs/Binary Trees");
        }
        if(event.getSource() == searchButton){
            new SearchOperation("Data Structures/Trees and Graphs/Binary Trees/Binary Search Trees/Search Operation");
        }
        if(event.getSource() == insertButton){
            new InsertOperation("Data Structures/Trees and Graphs/Binary Trees/Binary Search Trees/Insert Operation");
        }
        if(event.getSource() == deleteButton){
            new DeleteOperation("Data Structures/Trees and Graphs/Binary Trees/Binary Search Trees/Delete Operation");
        }
        dispose();
    }
}

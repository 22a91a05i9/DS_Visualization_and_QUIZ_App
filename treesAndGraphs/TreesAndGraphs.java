package treesAndGraphs;


import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JLabel;

import codes.CommonCodes;
import codes.DataStructures;
import treesAndGraphs.binaryTrees.BinaryTrees;
import treesAndGraphs.graphs.Graphs;

public class TreesAndGraphs extends CommonCodes implements ActionListener {
    JButton backButton,binaryTreesButton, graphsButton;
    JLabel heading;
    public TreesAndGraphs(String title)
    {
        super(title);
        backButton = backButtonLayout();
        backButton.addActionListener(this);
        add(backButton);
        heading = headingLabelSetter("Trees and Graphs", 310, 10, 400, 50);
        add(heading);
        binaryTreesButton = buttonLayout("Binary Trees",250,80,400,50,Color.YELLOW,Color.RED, Font.SERIF,Font.BOLD,25);
        binaryTreesButton.addActionListener(this);
        add(binaryTreesButton);
        graphsButton = buttonLayout("Graphs",250,230,400,50,Color.YELLOW,Color.RED, Font.SERIF,Font.BOLD,25);
        graphsButton.addActionListener(this);
        add(graphsButton);
    }
    public void actionPerformed(ActionEvent event) {
        if(event.getSource() == backButton){
            new DataStructures("Data Structures");
        }
        if(event.getSource() == binaryTreesButton){
            new BinaryTrees("Data Structures/Trees and Graphs/Binary Trees");
        }
        if(event.getSource() == graphsButton){
            new Graphs("Data Structures/Trees and Graphs/Graphs");
        }
        dispose();
    }
}

package treesAndGraphs.graphs;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;

import codes.CommonCodes;
import treesAndGraphs.TreesAndGraphs;
import treesAndGraphs.graphs.algorithms.Algorithms;
import treesAndGraphs.graphs.traversals.Traversals;

public class Graphs  extends CommonCodes implements ActionListener {
    JButton backButton,traversalsButton, algorithmsButton;
    JLabel heading;
    public Graphs(String title)
    {
        super(title);
        backButton = backButtonLayout();
        backButton.addActionListener(this);
        add(backButton);
        heading = headingLabelSetter("Graphs", 400, 10, 400, 50);
        add(heading);
        traversalsButton = buttonLayout("Traversals",250,80,400,50,Color.YELLOW,Color.RED, Font.SERIF,Font.BOLD,25);
        traversalsButton.addActionListener(this);
        add(traversalsButton);
        algorithmsButton = buttonLayout("Algorithms",250,230,400,50,Color.YELLOW,Color.RED, Font.SERIF,Font.BOLD,25);
        algorithmsButton.addActionListener(this);
        add(algorithmsButton);
    }
    public void actionPerformed(ActionEvent event) {
        if(event.getSource() == backButton){
            new TreesAndGraphs("Data Structures/Trees and Graphs");
        }
        if(event.getSource() == traversalsButton){
            new Traversals("Data Structures/Trees and Graphs/Graphs/Traversals");
        }
        if(event.getSource() == algorithmsButton){
            new Algorithms("Data Structures/Trees and Graphs/Graphs/Algorithms");
        }
        dispose();
    }
}

package treesAndGraphs.graphs.traversals;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;

import codes.CommonCodes;
import treesAndGraphs.graphs.Graphs;

public class Traversals extends CommonCodes implements ActionListener {
    JButton backButton,bfsButton, dfsButton;
    JLabel heading;
    public Traversals(String title)
    {
        super(title);
        backButton = backButtonLayout();
        backButton.addActionListener(this);
        add(backButton);
        heading = headingLabelSetter("Traversal Techniques", 300, 10, 400, 50);
        add(heading);
        bfsButton = buttonLayout("Breadth First Search",250,80,400,50,Color.GREEN,Color.MAGENTA, Font.SERIF,Font.BOLD,25);
        bfsButton.addActionListener(this);
        add(bfsButton);
        dfsButton = buttonLayout("Depth First Search",250,230,400,50,Color.GREEN,Color.MAGENTA, Font.SERIF,Font.BOLD,25);
        dfsButton.addActionListener(this);
        add(dfsButton);
    }
    public void actionPerformed(ActionEvent event) {
        if(event.getSource() == backButton){
            new Graphs("Data Structures/Trees and Graphs/Graphs");
        }
        if(event.getSource() == bfsButton){
            new BreadthFirstSearch("Data Structures/Trees and Graphs/Graphs/Traversals/Breadth First Search");
        }
        if(event.getSource() == dfsButton){
            new DepthFirstSearch("Data Structures/Trees and Graphs/Graphs/Traversals/Depth First Search");
        }
        dispose();
    }
}

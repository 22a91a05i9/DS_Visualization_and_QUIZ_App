package codes;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import linearDataStructures.LinearDataStructures;
import searchingAlgorithms.Searching;
import sortingAlgorithms.Sorting;
import treesAndGraphs.TreesAndGraphs;

public class DataStructures extends CommonCodes implements ActionListener {
    JButton searchingButton, sortingButton, linearDataStructuresButton,treesGraphsButton;
    public DataStructures(String title)
    {
        super(title);
        searchingButton = CommonCodes.buttonLayout("Searching Algorithms",250,80,400,50,Color.YELLOW,Color.RED, Font.SERIF,Font.BOLD,25);
        searchingButton.addActionListener(this);
        add(searchingButton);
        sortingButton = CommonCodes.buttonLayout("Sorting Algorithms",250,230,400,50,Color.YELLOW,Color.RED, Font.SERIF,Font.BOLD,25);
        sortingButton.addActionListener(this);
        add(sortingButton);
        linearDataStructuresButton = CommonCodes.buttonLayout("Linear Data Structures",250,380,400,50,Color.YELLOW,Color.RED, Font.SERIF,Font.BOLD,25);
        linearDataStructuresButton.addActionListener(this);
        add(linearDataStructuresButton);
        treesGraphsButton = CommonCodes.buttonLayout("Trees and Graphs", 250, 530, 400, 50, Color.YELLOW,Color.RED, Font.SERIF,Font.BOLD,25);
        treesGraphsButton.addActionListener(this);
        add(treesGraphsButton);
    }
    public void actionPerformed(ActionEvent event) {
        if(event.getSource() == searchingButton){
            new Searching("Data Structures/Searching");
        }
        if(event.getSource() == sortingButton){
            new Sorting("Data Structures/Sorting");
        }
        if(event.getSource() == linearDataStructuresButton){
            new LinearDataStructures("Data Structures/Linear Data Structures");
        }
        if(event.getSource() == treesGraphsButton){
            new TreesAndGraphs("Data Structures/Trees and Graphs");
        }
        dispose();
    }

}

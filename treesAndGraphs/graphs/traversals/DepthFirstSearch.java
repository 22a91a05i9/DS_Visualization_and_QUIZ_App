package treesAndGraphs.graphs.traversals;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

import codes.CommonCodes;

public class DepthFirstSearch  extends CommonCodes implements ActionListener{
    JButton backButton,quizButton;
    ImageIcon imageLabel;
    JLabel label,algorithmLabel;
    public DepthFirstSearch(String title)
    {
        super(title);
        backButton = backButtonLayout();
        backButton.addActionListener(this);
        add(backButton);
        JLabel heading = headingLabelSetter("Depth First Search", 370, 10, 400, 50);
        add(heading);
        String[] path = {"Images/Trees and Graphs/Graphs/Traversals/DFS/1.png",
                        "Images/Trees and Graphs/Graphs/Traversals/DFS/2.png",
                        "Images/Trees and Graphs/Graphs/Traversals/DFS/3.png",
                        "Images/Trees and Graphs/Graphs/Traversals/DFS/4.png",
                        "Images/Trees and Graphs/Graphs/Traversals/DFS/5.png",
                        "Images/Trees and Graphs/Graphs/Traversals/DFS/6.png",
                        "Images/Trees and Graphs/Graphs/Traversals/DFS/7.png",
                        "Images/Trees and Graphs/Graphs/Traversals/DFS/8.png",
                        "Images/Trees and Graphs/Graphs/Traversals/DFS/9.png",
                        "Images/Trees and Graphs/Graphs/Traversals/DFS/10.png",
                        "Images/Trees and Graphs/Graphs/Traversals/DFS/11.png",
                        "Images/Trees and Graphs/Graphs/Traversals/DFS/12.png",
                        "Images/Trees and Graphs/Graphs/Traversals/DFS/13.png",
                        "Images/Trees and Graphs/Graphs/Traversals/DFS/14.png",
                        "Images/Trees and Graphs/Graphs/Traversals/DFS/15.png",
                        "Images/Trees and Graphs/Graphs/Traversals/DFS/16.png"};
        cancelTask();
        label = imageSlider(path, 300,60, 550,300);
        add(label);
        algorithmLabel = algorithmSetter("Images/Trees and Graphs/Graphs/Traversals/DFS/Algorithm.jpg", 200, 300, 750, 500);
        add(algorithmLabel);
        quizButton = quizButtonLayout();
        quizButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                quizZone("dfs");
            }
        });
        add(quizButton);
    }
    public void actionPerformed(ActionEvent event) {
        if(event.getSource() == backButton){
            new Traversals("Data Structures/Trees and Graphs/Graphs/Traversals");
        }  
        dispose();
    }
}

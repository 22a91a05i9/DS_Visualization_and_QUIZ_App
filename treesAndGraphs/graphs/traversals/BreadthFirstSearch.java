package treesAndGraphs.graphs.traversals;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

import codes.CommonCodes;

public class BreadthFirstSearch  extends CommonCodes implements ActionListener{
    JButton backButton,quizButton;
    ImageIcon imageLabel;
    JLabel label,algorithmLabel;
    public BreadthFirstSearch(String title)
    {
        super(title);
        backButton = backButtonLayout();
        backButton.addActionListener(this);
        add(backButton);
        JLabel heading = headingLabelSetter("Breadth First Search", 330, 10, 400, 50);
        add(heading);
        String[] path = {"Images/Trees and Graphs/Graphs/Traversals/BFS/1.png",
                        "Images/Trees and Graphs/Graphs/Traversals/BFS/2.png",
                        "Images/Trees and Graphs/Graphs/Traversals/BFS/3.png",
                        "Images/Trees and Graphs/Graphs/Traversals/BFS/4.png",
                        "Images/Trees and Graphs/Graphs/Traversals/BFS/5.png",
                        "Images/Trees and Graphs/Graphs/Traversals/BFS/6.png",
                        "Images/Trees and Graphs/Graphs/Traversals/BFS/7.png",
                        "Images/Trees and Graphs/Graphs/Traversals/BFS/8.png",
                        "Images/Trees and Graphs/Graphs/Traversals/BFS/9.png",
                        "Images/Trees and Graphs/Graphs/Traversals/BFS/10.png",
                        "Images/Trees and Graphs/Graphs/Traversals/BFS/11.png",
                        "Images/Trees and Graphs/Graphs/Traversals/BFS/12.png",
                        "Images/Trees and Graphs/Graphs/Traversals/BFS/13.png",
                        "Images/Trees and Graphs/Graphs/Traversals/BFS/14.png",
                        "Images/Trees and Graphs/Graphs/Traversals/BFS/15.png",
                        "Images/Trees and Graphs/Graphs/Traversals/BFS/16.png",
                        "Images/Trees and Graphs/Graphs/Traversals/BFS/17.png"};
        cancelTask();
        label = imageSlider(path, 300,60, 750,250);
        add(label);
        algorithmLabel = algorithmSetter("Images/Trees and Graphs/Graphs/Traversals/BFS/Algorithm.jpg", 250, 300, 750, 500);
        add(algorithmLabel);
        quizButton = quizButtonLayout();
        quizButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                quizZone("bfs");
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

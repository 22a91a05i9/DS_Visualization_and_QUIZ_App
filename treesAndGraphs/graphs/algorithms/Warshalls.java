package treesAndGraphs.graphs.algorithms;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;

import codes.CommonCodes;

public class Warshalls extends CommonCodes implements ActionListener{
    JButton backButton,quizButton;
    JLabel workingLabel,algorithmLabel;
    public Warshalls(String title)
    {
        super(title);
        backButton = backButtonLayout();
        backButton.addActionListener(this);
        add(backButton);
        JLabel heading = headingLabelSetter("Warshall's Algorithm", 350, 10, 400, 50);
        add(heading);
        workingLabel = algorithmSetter("Images/Trees and Graphs/Graphs/Algorithms/Warshalls/warshall's algorithm1.gif", 170,60, 650,380);
        add(workingLabel);
        algorithmLabel = algorithmSetter("Images/Trees and Graphs/Graphs/Algorithms/Warshalls/Algorithm.jpg", 140, 380, 700, 450);
        add(algorithmLabel);
        quizButton = quizButtonLayout();
        quizButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                quizZone("warshalls");
            }
        });
        add(quizButton);
    }
    public void actionPerformed(ActionEvent event) {
        if(event.getSource() == backButton){
            new Algorithms("Data Structures/Trees and Graphs/Graphs/Algorithms");
        }  
        dispose();
    }
}

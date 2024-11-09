package treesAndGraphs.graphs.algorithms;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;

import codes.CommonCodes;

public class Dijkstras extends CommonCodes implements ActionListener{
    JButton backButton,quizButton;
    JLabel workingLabel,algorithmLabel;
    public Dijkstras(String title)
    {
        super(title);
        backButton = backButtonLayout();
        backButton.addActionListener(this);
        add(backButton);
        JLabel heading = headingLabelSetter("Dijkstra's Algorithm", 350, 10, 400, 50);
        add(heading);
        workingLabel = algorithmSetter("Images/Trees and Graphs/Graphs/Algorithms/Dijkstras/Dijkstras-Algorithm1.gif", 100,60, 850,380);
        add(workingLabel);
        algorithmLabel = algorithmSetter("Images/Trees and Graphs/Graphs/Algorithms/Dijkstras/Algorithm.jpg", 140, 360, 700, 450);
        add(algorithmLabel);
        quizButton = quizButtonLayout();
        quizButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                quizZone("dijkstras");
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

package treesAndGraphs.graphs.algorithms;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;

import codes.CommonCodes;

public class Prims extends CommonCodes implements ActionListener{
    JButton backButton,quizButton;
    JLabel workingLabel,algorithmLabel;
    public Prims(String title)
    {
        super(title);
        backButton = backButtonLayout();
        backButton.addActionListener(this);
        add(backButton);
        JLabel heading = headingLabelSetter("Prim's Algorithm", 350, 10, 400, 50);
        add(heading);
        workingLabel = algorithmSetter("Images/Trees and Graphs/Graphs/Algorithms/Prims/prims2.gif", 350,60, 450,250);
        add(workingLabel);
        algorithmLabel = algorithmSetter("Images/Trees and Graphs/Graphs/Algorithms/Prims/Algorithm.jpg", 160, 300,700, 450);
        add(algorithmLabel);
        quizButton = quizButtonLayout();
        quizButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                quizZone("prims");
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

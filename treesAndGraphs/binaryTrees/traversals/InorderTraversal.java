package treesAndGraphs.binaryTrees.traversals;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;

import codes.CommonCodes;

public class InorderTraversal extends CommonCodes implements ActionListener{
    JButton backButton,quizButton;
    JLabel workingLabel,algorithmLabel;
    public InorderTraversal(String title)
    {
        super(title);
        backButton = backButtonLayout();
        backButton.addActionListener(this);
        add(backButton);
        JLabel heading = headingLabelSetter("Inorder Traversal", 350, 10, 400, 50);
        add(heading);
        
        workingLabel = algorithmSetter("Images/Trees and Graphs/Trees/Binary Trees/Traversals/Inorder/inorder2.gif", 250,70, 450,340);
        add(workingLabel);
        algorithmLabel = algorithmSetter("Images/Trees and Graphs/Trees/Binary Trees/Traversals/Inorder/Algorithm.jpg", 150, 300, 750, 500);
        add(algorithmLabel);
        quizButton = quizButtonLayout();
        quizButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                quizZone("inorder");
            }
        });
        add(quizButton);
    }
    public void actionPerformed(ActionEvent event) {
        if(event.getSource() == backButton){
            new Traversals("Data Structures/Trees and Graphs/Binary Trees/Traversals");
        }  
        dispose();
    }
}

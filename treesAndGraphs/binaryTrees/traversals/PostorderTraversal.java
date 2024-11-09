package treesAndGraphs.binaryTrees.traversals;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;

import codes.CommonCodes;

public class PostorderTraversal extends CommonCodes implements ActionListener{
    JButton backButton,quizButton;
    JLabel workingLabel,algorithmLabel;
    public PostorderTraversal(String title)
    {
        super(title);
        backButton = backButtonLayout();
        backButton.addActionListener(this);
        add(backButton);
        JLabel heading = headingLabelSetter("Postorder Traversal", 350, 10, 400, 50);
        add(heading);
        
        workingLabel = algorithmSetter("Images/Trees and Graphs/Trees/Binary Trees/Traversals/Postorder/postorder2.gif", 250,70, 450,340);
        add(workingLabel);
        algorithmLabel = algorithmSetter("Images/Trees and Graphs/Trees/Binary Trees/Traversals/Postorder/Algorithm.jpg", 150, 300, 750, 500);
        add(algorithmLabel);

        quizButton = quizButtonLayout();
        quizButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                quizZone("postorder");
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

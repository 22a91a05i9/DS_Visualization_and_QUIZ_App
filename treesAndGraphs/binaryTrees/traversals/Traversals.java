package treesAndGraphs.binaryTrees.traversals;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;

import codes.CommonCodes;
import treesAndGraphs.binaryTrees.BinaryTrees;

public class Traversals extends CommonCodes implements ActionListener {
    JButton backButton,inorderTraversalButton, postorderTraversalButton, preorderTraversalButton;
    JLabel heading;
    public Traversals(String title)
    {
        super(title);
        backButton = backButtonLayout();
        backButton.addActionListener(this);
        add(backButton);
        heading = headingLabelSetter("Traversal Techniques", 300, 10, 400, 50);
        add(heading);
        inorderTraversalButton = buttonLayout("Inorder Traversal",250,80,400,50,Color.GREEN,Color.MAGENTA, Font.SERIF,Font.BOLD,25);
        inorderTraversalButton.addActionListener(this);
        add(inorderTraversalButton);
        preorderTraversalButton = buttonLayout("Preorder Traversal",250,230,400,50,Color.GREEN,Color.MAGENTA, Font.SERIF,Font.BOLD,25);
        preorderTraversalButton.addActionListener(this);
        add(preorderTraversalButton);
        postorderTraversalButton = buttonLayout("Postorder Traversal",250,380,400,50,Color.GREEN,Color.MAGENTA, Font.SERIF,Font.BOLD,25);
        postorderTraversalButton.addActionListener(this);
        add(postorderTraversalButton);
    }
    public void actionPerformed(ActionEvent event) {
        if(event.getSource() == backButton){
            new BinaryTrees("Data Structures/Trees and Graphs/Binary Trees");
        }
        if(event.getSource() == inorderTraversalButton){
            new InorderTraversal("Data Structures/Trees and Graphs/Binary Trees/Traversals/Inorder Traversal");
        }
        if(event.getSource() == preorderTraversalButton){
            new PreorderTraversal("Data Structures/Trees and Graphs/Binary Trees/Traversals/Preorder Traversal");
        }
        if(event.getSource() == postorderTraversalButton){
            new PostorderTraversal("Data Structures/Trees and Graphs/Binary Trees/Traversals/Postorder Traversal");
        }
        dispose();
    }
}

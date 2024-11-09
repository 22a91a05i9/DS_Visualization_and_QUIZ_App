package linearDataStructures;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;

import codes.CommonCodes;
import codes.DataStructures;
import linearDataStructures.linkedlists.LinkedLists;
import linearDataStructures.queue.Queues;
import linearDataStructures.stack.Stacks;

public class LinearDataStructures extends CommonCodes implements ActionListener {
    
    JButton backButton,stackButton, queueButton, linkedListButton;
    JLabel heading;
    public LinearDataStructures(String title)
    { 
        super(title);
        backButton = backButtonLayout();
        backButton.addActionListener(this);
        add(backButton);
        heading = headingLabelSetter("Linear Data Structures", 310, 10, 400, 50);
        add(heading);
        stackButton = buttonLayout("Stacks",250,80,400,50,Color.YELLOW,Color.RED, Font.SERIF,Font.BOLD,25);
        stackButton.addActionListener(this);
        add(stackButton);
        queueButton = buttonLayout("Queues",250,230,400,50,Color.YELLOW,Color.RED, Font.SERIF,Font.BOLD,25);
        queueButton.addActionListener(this);
        add(queueButton);
        linkedListButton = buttonLayout("Linked Lists",250,380,400,50,Color.YELLOW,Color.RED, Font.SERIF,Font.BOLD,25);
        linkedListButton.addActionListener(this);
        add(linkedListButton);
    }
    public void actionPerformed(ActionEvent event) {
        if(event.getSource() == backButton){
            new DataStructures("Data Structures");
        }
        if(event.getSource() == stackButton){
            new Stacks("Data Structures/Linear Data Structures/Stacks");
        }
        if(event.getSource() == queueButton){
            new Queues("Data Structures/Linear Data Structures/Queues");
        }
        if(event.getSource() == linkedListButton){
            new LinkedLists("Data Structures/Linear Data Structures/Linked Lists");
        }
        dispose();
    }
}

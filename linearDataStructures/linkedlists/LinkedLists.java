package linearDataStructures.linkedlists;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;

import codes.CommonCodes;
import linearDataStructures.LinearDataStructures;
import linearDataStructures.linkedlists.circularLinkedLists.CircularLinkedLists;
import linearDataStructures.linkedlists.doubleLinkedLists.DoubleLinkedLists;
import linearDataStructures.linkedlists.singleLinkedLists.SingleLinkedLists;

public class LinkedLists extends CommonCodes implements ActionListener{
    JButton backButton,singleLLButton, circularLLButton,doubleLLButton;
    JLabel heading;
    public LinkedLists(String title)
    {
        super(title);
        backButton = CommonCodes.backButtonLayout();
        backButton.addActionListener(this);
        add(backButton);
        heading = headingLabelSetter("Linked Lists", 370, 10, 400, 50);
        add(heading);
        singleLLButton = CommonCodes.buttonLayout("Single Linked Lists",250,80,500,50,Color.YELLOW,Color.RED, Font.SERIF,Font.BOLD,25);
        singleLLButton.addActionListener(this);
        add(singleLLButton);
        circularLLButton = CommonCodes.buttonLayout("Circular Linked Lists",250,230,500,50,Color.YELLOW,Color.RED, Font.SERIF,Font.BOLD,25);
        circularLLButton.addActionListener(this);
        add(circularLLButton);
        doubleLLButton = CommonCodes.buttonLayout("Double Linked Lists",250,380,500,50,Color.YELLOW,Color.RED, Font.SERIF,Font.BOLD,25);
        doubleLLButton.addActionListener(this);
        add(doubleLLButton);
    }
    public void actionPerformed(ActionEvent event) {
        if(event.getSource() == backButton){
            new LinearDataStructures("Data Structures/Linear Data Structures");
        }
        if(event.getSource() == singleLLButton){
            new SingleLinkedLists("Data Structures/Linear Data Structures/Linked Lists/Single Linked Lists");
        }
        if(event.getSource() == circularLLButton){
            new CircularLinkedLists("Data Structures/Linear Data Structures/Queues/Circular Linked Lists");
        }
        if(event.getSource() == doubleLLButton){
            new DoubleLinkedLists("Data Structures/Linear Data Structures/Queues/Double Linked Lists");
        }
        dispose();
    }
}

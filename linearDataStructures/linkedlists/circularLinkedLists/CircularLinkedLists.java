package linearDataStructures.linkedlists.circularLinkedLists;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;

import codes.CommonCodes;
import linearDataStructures.linkedlists.LinkedLists;

public class CircularLinkedLists extends CommonCodes implements ActionListener {
    JButton backButton,insertAtTailButton, deleteAtTailButton, insertAtHeadButton, deleteAtHeadButton, insertAtPositionButton, deleteAtPositionButton;
    JLabel heading;
    public CircularLinkedLists(String title)
    {
        super(title);
        backButton = backButtonLayout();
        backButton.addActionListener(this);
        add(backButton);
        heading = headingLabelSetter("Circular Linked Lists", 310, 10, 400, 50);
        add(heading);
        insertAtTailButton = buttonLayout("Insert At Tail",90,150,320,50,Color.GREEN,Color.MAGENTA, Font.SERIF,Font.BOLD,25);
        insertAtTailButton.addActionListener(this);
        add(insertAtTailButton);
        deleteAtTailButton = buttonLayout("Delete At Tail",550,230,320,50,Color.GREEN,Color.MAGENTA, Font.SERIF,Font.BOLD,25);
        deleteAtTailButton.addActionListener(this);
        add(deleteAtTailButton);
        insertAtHeadButton = buttonLayout("Insert At Head",90,300,320,50,Color.GREEN,Color.MAGENTA, Font.SERIF,Font.BOLD,25);
        insertAtHeadButton.addActionListener(this);
        add(insertAtHeadButton);
        deleteAtHeadButton = buttonLayout("Delete At Head",550,380,320,50,Color.GREEN,Color.MAGENTA, Font.SERIF,Font.BOLD,25);
        deleteAtHeadButton.addActionListener(this);
        add(deleteAtHeadButton);
        insertAtPositionButton = buttonLayout("Insert At Position",90,450,320,50,Color.GREEN,Color.MAGENTA, Font.SERIF,Font.BOLD,25);
        insertAtPositionButton.addActionListener(this);
        add(insertAtPositionButton);
        deleteAtPositionButton = buttonLayout("Delete At Position",550,530,320,50,Color.GREEN,Color.MAGENTA, Font.SERIF,Font.BOLD,25);
        deleteAtPositionButton.addActionListener(this);
        add(deleteAtPositionButton);
        
    }
    public void actionPerformed(ActionEvent event) {
        if(event.getSource() == backButton){
            new LinkedLists("Data Structures/Linear Data Structures/Linked Lists");
        }
        if(event.getSource() == insertAtTailButton){
            new InsertAtTail("Data Structures/Linear Data Structures/Linked Lists/Circular Linked Lists/Insert At Tail");
        }
        if(event.getSource() == deleteAtTailButton){
            new DeleteAtTail("Data Structures/Linear Data Structures/Linked Lists/Circular Linked Lists/Delete At Tail");
        }
        if(event.getSource() == insertAtHeadButton){
            new InsertAtHead("Data Structures/Linear Data Structures/Linked Lists/Circular Linked Lists/Insert At Head");
        }
        if(event.getSource() == deleteAtHeadButton){
            new DeleteAtHead("Data Structures/Linear Data Structures/Linked Lists/Circular Linked Lists/Delete At Head");
        }
        if(event.getSource() == insertAtPositionButton){
            new InsertAtPosition("Data Structures/Linear Data Structures/Linked Lists/Circular Linked Lists/Insert At Position");
        }
        if(event.getSource() == deleteAtPositionButton){
            new DeleteAtPosition("Data Structures/Linear Data Structures/Linked Lists/Circular Linked Lists/Delete At Position");
        }
        dispose();
    }
}


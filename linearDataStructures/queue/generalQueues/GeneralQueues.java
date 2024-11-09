package linearDataStructures.queue.generalQueues;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;

import codes.CommonCodes;
import linearDataStructures.queue.Queues;

public class GeneralQueues extends CommonCodes implements ActionListener {
    JButton backButton,enqueueButton, dequeueButton;
    JLabel heading;
    public GeneralQueues(String title)
    {
        super(title);
        backButton = backButtonLayout();
        backButton.addActionListener(this);
        add(backButton);
        heading = headingLabelSetter("General Queues", 320, 10, 400, 50);
        add(heading);
        enqueueButton = buttonLayout("Enqueue",250,80,400,50,Color.GREEN,Color.MAGENTA, Font.SERIF,Font.BOLD,25);
        enqueueButton.addActionListener(this);
        add(enqueueButton);
        dequeueButton = buttonLayout("Dequeue",250,230,400,50,Color.GREEN,Color.MAGENTA, Font.SERIF,Font.BOLD,25);
        dequeueButton.addActionListener(this);
        add(dequeueButton);
    }
    public void actionPerformed(ActionEvent event) {
        if(event.getSource() == backButton){
            new Queues("Data Structures/Linear Data Structures/Queues");
        }
        if(event.getSource() == enqueueButton){
            new Enqueue("Data Structures/Linear Data Structures/Queues/General Queues/Enqueue");
        }
        if(event.getSource() == dequeueButton){
            new Dequeue("Data Structures/Linear Data Structures/Queues/General Queues/Dequeue");
        }
        dispose();
    }
}

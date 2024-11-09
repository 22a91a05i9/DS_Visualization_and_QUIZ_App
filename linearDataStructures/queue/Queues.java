package linearDataStructures.queue;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;

import codes.CommonCodes;
import linearDataStructures.LinearDataStructures;
import linearDataStructures.queue.circularQueues.CircularQueues;
import linearDataStructures.queue.doubleEndedQueues.DoubleEndedQueues;
import linearDataStructures.queue.generalQueues.GeneralQueues;


public class Queues extends CommonCodes implements ActionListener{
    JButton backButton,generalQueuesButton, circularQueuesButton,doubleEndedQueuesButton;
    JLabel heading;
    public Queues(String title)
    {
        super(title);
        backButton = CommonCodes.backButtonLayout();
        backButton.addActionListener(this);
        add(backButton);
        heading = headingLabelSetter("Queues", 400, 10, 400, 50);
        add(heading);
        generalQueuesButton = CommonCodes.buttonLayout("General Queues",250,80,400,50,Color.YELLOW,Color.RED, Font.SERIF,Font.BOLD,25);
        generalQueuesButton.addActionListener(this);
        add(generalQueuesButton);
        circularQueuesButton = CommonCodes.buttonLayout("Circular Queues",250,230,400,50,Color.YELLOW,Color.RED, Font.SERIF,Font.BOLD,25);
        circularQueuesButton.addActionListener(this);
        add(circularQueuesButton);
        doubleEndedQueuesButton = CommonCodes.buttonLayout("Double Ended Queues",250,380,400,50,Color.YELLOW,Color.RED, Font.SERIF,Font.BOLD,25);
        doubleEndedQueuesButton.addActionListener(this);
        add(doubleEndedQueuesButton);
    }
    public void actionPerformed(ActionEvent event) {
        if(event.getSource() == backButton){
            new LinearDataStructures("Data Structures/Linear Data Structures");
        }
        if(event.getSource() == generalQueuesButton){
            new GeneralQueues("Data Structures/Linear Data Structures/Queues/General Queues");
        }
        if(event.getSource() == circularQueuesButton){
            new CircularQueues("Data Structures/Linear Data Structures/Queues/Circular Queues");
        }
        if(event.getSource() == doubleEndedQueuesButton){
            new DoubleEndedQueues("Data Structures/Linear Data Structures/Queues/Double Ended Queues");
        }
        dispose();
    }
}

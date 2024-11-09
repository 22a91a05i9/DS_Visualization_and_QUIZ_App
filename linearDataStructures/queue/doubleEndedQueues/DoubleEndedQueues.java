package linearDataStructures.queue.doubleEndedQueues;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;

import codes.CommonCodes;
import linearDataStructures.queue.Queues;

public class DoubleEndedQueues extends CommonCodes implements ActionListener{
    JButton backButton,enqueueAtRearButton, enqueueAtFrontButton, dequeueAtFrontButton,dequeueAtRearButton;
    JLabel heading;
    public DoubleEndedQueues(String title)
    {
        super(title);
        backButton = backButtonLayout();
        backButton.addActionListener(this);
        add(backButton);
        heading = headingLabelSetter("Double Ended Queues", 300, 10, 400, 50);
        add(heading);
        enqueueAtRearButton = buttonLayout("Enqueue at Rear",250,80,400,50,Color.GREEN,Color.MAGENTA, Font.SERIF,Font.BOLD,25);
        enqueueAtRearButton.addActionListener(this);
        add(enqueueAtRearButton);
        dequeueAtFrontButton = buttonLayout("Dequeue at Front",250,230,400,50,Color.GREEN,Color.MAGENTA, Font.SERIF,Font.BOLD,25);
        dequeueAtFrontButton.addActionListener(this);
        add(dequeueAtFrontButton);
        enqueueAtFrontButton = buttonLayout("Enqueue at Front",250,380,400,50,Color.GREEN,Color.MAGENTA, Font.SERIF,Font.BOLD,25);
        enqueueAtFrontButton.addActionListener(this);
        add(enqueueAtFrontButton);
        dequeueAtRearButton = buttonLayout("Dequeue at Rear",250,530,400,50,Color.GREEN,Color.MAGENTA, Font.SERIF,Font.BOLD,25);
        dequeueAtRearButton.addActionListener(this);
        add(dequeueAtRearButton);

    }
    public void actionPerformed(ActionEvent event) {
        if(event.getSource() == backButton){
            new Queues("Data Structures/Linear Data Structures/Queues");
        }
        if(event.getSource() == enqueueAtRearButton){
            new EnqueueAtRear("Data Structures/Linear Data Structures/Queues/Double Ended Queues/Enqueue At Rear");
        }
        if(event.getSource() == dequeueAtFrontButton){
            new DequeueAtFront("Data Structures/Linear Data Structures/Queues/Double Ended Queues/Dequeue At Front");
        }
        if(event.getSource() == enqueueAtFrontButton){
            new EnqueueAtFront("Data Structures/Linear Data Structures/Queues/Double Ended Queues/Enqueue At Front");
        }
        if(event.getSource() == dequeueAtRearButton){
            new DequeueAtRear("Data Structures/Linear Data Structures/Queues/Double Ended Queues/Dequeue At Rear");
        }
        dispose();
    }
}

package linearDataStructures.queue.circularQueues;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;

import codes.CommonCodes;
import linearDataStructures.queue.Queues;

public class CircularQueues extends CommonCodes implements ActionListener {
    JButton backButton,enqueueAtRearButton, dequeueAtFrontButton;
    JLabel heading;
    public CircularQueues(String title)
    {
        super(title);
        backButton = backButtonLayout();
        backButton.addActionListener(this);
        add(backButton);
        heading = headingLabelSetter("Circular Queues", 320, 10, 400, 50);
        add(heading);
        enqueueAtRearButton = buttonLayout("Enqueue at Rear",250,80,400,50,Color.GREEN,Color.MAGENTA, Font.SERIF,Font.BOLD,25);
        enqueueAtRearButton.addActionListener(this);
        add(enqueueAtRearButton);
        dequeueAtFrontButton = buttonLayout("Dequeue at Front",250,230,400,50,Color.GREEN,Color.MAGENTA, Font.SERIF,Font.BOLD,25);
        dequeueAtFrontButton.addActionListener(this);
        add(dequeueAtFrontButton);

    }
    public void actionPerformed(ActionEvent event) {
        if(event.getSource() == backButton){
            new Queues("Data Structures/Linear Data Structures/Queues");
        }
        if(event.getSource() == enqueueAtRearButton){
            new EnqueueAtRear("Data Structures/Linear Data Structures/Queues/Circular Queues/Enqueue At Rear");
        }
        if(event.getSource() == dequeueAtFrontButton){
            new DequeueAtFront("Data Structures/Linear Data Structures/Queues/Circular Queues/Dequeue At Front");
        }
        dispose();
    }
}

package linearDataStructures.queue.circularQueues;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

import codes.CommonCodes;

public class DequeueAtFront extends CommonCodes implements ActionListener{
    JButton backButton,quizButton;
    ImageIcon imageLabel;
    JLabel label,algorithmLabel;
    public DequeueAtFront(String title) {
        super(title);
        backButton = backButtonLayout();
        backButton.addActionListener(this);
        add(backButton);
        JLabel heading = headingLabelSetter("Dequeue at Front Operation", 300, 10, 500, 50);
        add(heading);
        String[] path = {"Images/Linear Data Structures/Queues/Circular Queues/Dequeue/1.png",
                        "Images/Linear Data Structures/Queues/Circular Queues/Dequeue/2.png",
                        "Images/Linear Data Structures/Queues/Circular Queues/Dequeue/3.png",
                        "Images/Linear Data Structures/Queues/Circular Queues/Dequeue/4.png",
                        "Images/Linear Data Structures/Queues/Circular Queues/Dequeue/5.png",
                        "Images/Linear Data Structures/Queues/Circular Queues/Dequeue/6.png"};
        cancelTask();
        label = imageSlider(path, 200,80, 750,250);
        add(label);
        algorithmLabel = algorithmSetter("Images/Linear Data Structures/Queues/Circular Queues/Dequeue/Algorithm.jpg", 280, 250, 750, 500);
        add(algorithmLabel);
        quizButton = quizButtonLayout();
        quizButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                quizZone("CQDequeue");
            }
        });
        add(quizButton);
    }
    public void actionPerformed(ActionEvent event) {
        if(event.getSource() == backButton){
            new CircularQueues("Data Structures/Linear Data Structures/Queues/Circular Queues");
        }  
        dispose();
    }

}

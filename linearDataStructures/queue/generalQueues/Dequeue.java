package linearDataStructures.queue.generalQueues;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

import codes.CommonCodes;

public class Dequeue extends CommonCodes implements ActionListener{
    JButton backButton,quizButton;
    ImageIcon imageLabel;
    JLabel label,algorithmLabel;
    public Dequeue(String title)
    {
        super(title);
        backButton = backButtonLayout();
        backButton.addActionListener(this);
        add(backButton);
        JLabel heading = headingLabelSetter("Dequeue Operation", 350, 10, 400, 50);
        add(heading);
        String[] path = {"Images/Linear Data Structures/Queues/General Queues/Dequeue/1.png",
                        "Images/Linear Data Structures/Queues/General Queues/Dequeue/2.png",
                        "Images/Linear Data Structures/Queues/General Queues/Dequeue/3.png",
                        "Images/Linear Data Structures/Queues/General Queues/Dequeue/4.png",
                        "Images/Linear Data Structures/Queues/General Queues/Dequeue/5.png",
                        "Images/Linear Data Structures/Queues/General Queues/Dequeue/6.png"};
        cancelTask();
        label = imageSlider(path, 150,100, 750,200);
        add(label);
        algorithmLabel = algorithmSetter("Images/Linear Data Structures/Queues/General Queues/Dequeue/Algorithm.jpg", 200, 300, 750, 500);
        add(algorithmLabel);
        quizButton = quizButtonLayout();
        quizButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                quizZone("GQDequeue");
            }
        });
        add(quizButton);
    }
    public void actionPerformed(ActionEvent event) {
        if(event.getSource() == backButton){
            new GeneralQueues("Data Structures/Linear Data Structures/Queues/General Queues");
        }  
        dispose();
    }
}

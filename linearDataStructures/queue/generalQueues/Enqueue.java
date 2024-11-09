package linearDataStructures.queue.generalQueues;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

import codes.CommonCodes;

public class Enqueue extends CommonCodes implements ActionListener{
    JButton backButton,quizButton;
    ImageIcon imageLabel;
    JLabel label,algorithmLabel;
    public Enqueue(String title)
    {
        super(title);
        backButton = backButtonLayout();
        backButton.addActionListener(this);
        add(backButton);
        JLabel heading = headingLabelSetter("Enqueue Operation", 350, 10, 400, 50);
        add(heading);
        String[] path = {"Images/Linear Data Structures/Queues/General Queues/Enqueue/1.png",
                        "Images/Linear Data Structures/Queues/General Queues/Enqueue/2.png",
                        "Images/Linear Data Structures/Queues/General Queues/Enqueue/3.png",
                        "Images/Linear Data Structures/Queues/General Queues/Enqueue/4.png",
                        "Images/Linear Data Structures/Queues/General Queues/Enqueue/5.png",
                        "Images/Linear Data Structures/Queues/General Queues/Enqueue/6.png",
                        "Images/Linear Data Structures/Queues/General Queues/Enqueue/7.png"};
        cancelTask();
        label = imageSlider(path, 150,100, 800,200);
        add(label);
        algorithmLabel = algorithmSetter("Images/Linear Data Structures/Queues/General Queues/Enqueue/Algorithm.jpg", 250, 300, 750, 500);
        add(algorithmLabel);
        quizButton = quizButtonLayout();
        quizButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                quizZone("GQEnqueue");
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

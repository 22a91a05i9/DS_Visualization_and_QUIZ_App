package searchingAlgorithms.LinearSearching;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

import codes.CommonCodes;
import searchingAlgorithms.Searching;

public class LinearSearch extends CommonCodes implements ActionListener{
    JButton backButton,quizButton;
    ImageIcon imageLabel;
    JLabel label,algorithmLabel;
    public LinearSearch(String title)
    {
        super(title);
        backButton = backButtonLayout();
        backButton.addActionListener(this);
        add(backButton);
        JLabel heading = headingLabelSetter("Linear Search", 350, 10, 400, 50);
        add(heading);
        String[] path = {"Images/Searching/LinearSearch/1.png",
                        "Images/Searching/LinearSearch/2.png",
                        "Images/Searching/LinearSearch/3.png",
                        "Images/Searching/LinearSearch/4.jpg",
                        "Images/Searching/LinearSearch/5.jpg",
                        "Images/Searching/LinearSearch/6.jpg",
                        "Images/Searching/LinearSearch/7.jpg"};
        cancelTask();
        label = imageSlider(path, 100,100, 750,150);
        add(label);
        algorithmLabel = algorithmSetter("Images/Searching/LinearSearch/linear search algorithm.jpg", 150, 300, 750, 500);
        add(algorithmLabel);
        quizButton = quizButtonLayout();
        quizButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                quizZone("LinearSearch");
            }
        });
        add(quizButton);
    }
    public void actionPerformed(ActionEvent event) {
        if(event.getSource() == backButton){
            new Searching("Data Structures/Searching");
        }
        dispose();
    }
}
